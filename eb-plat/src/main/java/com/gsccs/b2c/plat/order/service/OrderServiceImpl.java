package com.gsccs.b2c.plat.order.service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.b2c.plat.order.dao.OrderItemMapper;
import com.gsccs.b2c.plat.order.dao.OrderMapper;
import com.gsccs.b2c.plat.order.dao.OrderTraceMapper;
import com.gsccs.b2c.plat.order.model.OrderExample;
import com.gsccs.b2c.plat.order.model.OrderExample.Criteria;
import com.gsccs.b2c.plat.order.model.OrderItemExample;
import com.gsccs.b2c.plat.order.model.OrderStatist;
import com.gsccs.b2c.plat.order.model.OrderTrace;
import com.gsccs.b2c.plat.order.model.OrderTraceExample;
import com.gsccs.b2c.plat.shop.dao.GoodsMapper;
import com.gsccs.b2c.plat.utils.DateUtil;
import com.gsccs.eb.api.domain.goods.Goods;
import com.gsccs.eb.api.domain.trade.Order;
import com.gsccs.eb.api.domain.trade.OrderItem;

@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;
	@Autowired
	private OrderTraceMapper orderTraceMapper;
	@Autowired
	private OrderItemMapper orderItemMapper;
	@Autowired
	private GoodsMapper productMapper;

	@Override
	public List<Order> queryOrderBySeller(Order param, String order,
			int currPage, int pageSize) {
		OrderExample example = new OrderExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(param, criteria);

		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		if (StringUtils.isNotEmpty(order)) {
			example.setOrderByClause(order);
		}
		return orderMapper.selectPageByExample(example);
	}

	@Override
	public String insert(Long sid, Order order, List<OrderItem> items) {
		Date date = new Date();
		String ordersn = DateUtil.getOrderNum(date);
		order.setSerial(ordersn);
		order.setAddtime(new Date());
		orderMapper.insert(sid, order);
		for (int i = 0; i < items.size(); i++) {
			items.get(i).setId(UUID.randomUUID().toString());
			items.get(i).setOrderid(ordersn);
			orderItemMapper.insert(sid, items.get(i));
			// 锁定产品数量
			Goods productT = productMapper.selectByPrimaryKey(
					items.get(i).getGoodsid());
			if (null != productT) {
				if (null == productT.getLocknum()) {
					productT.setLocknum(items.get(i).getNum());
				} else {
					productT.setLocknum(productT.getLocknum()
							+ items.get(i).getNum());
				}
				productT.setStorenum(productT.getStorenum()
						- items.get(i).getNum());
				productMapper.updateByPrimaryKey(sid, productT);
			}
		}
		return ordersn;
	}

	@Override
	public void update(Order order, Long sid) {
		if (null != order) {
			orderMapper.updateByPrimaryKey(sid, order);
		}
	}

	@Override
	public Order findById(Long id) {
		return orderMapper.selectByPrimaryKey(id);
	}

	@Override
	public int count(Long sid, Order order) {
		OrderExample example = new OrderExample();
		Criteria criteria = example.createCriteria();
		proSearchParam(order, criteria);
		return orderMapper.countByExample(sid, example);
	}

	/**
	 * 查询条件
	 * 
	 * @param orders
	 * @param sid
	 * @param criteria
	 */
	private void proSearchParam(Order order, Criteria criteria) {
		if (order != null) {
			if (order.getStatus() != null) {
				criteria.andStatusEqualTo(order.getStatus());
			}

			if (order.getSerial() != null) {
				criteria.andSerialnumEqualTo(order.getSerial());
			}

			if (order.getBuyerid() != null) {
				criteria.andBuyeridEqualTo(order.getBuyerid());
			}

			if (order.getShopid() != null) {
				criteria.andShopidEqualTo(order.getShopid());
			}
		}
	}

	@Override
	public List<OrderItem> findOItems(Long sid, Long oid) {
		return orderItemMapper.selectOrderItems(sid, oid);
	}

	@Override
	public List<OrderItem> findGoodsSaleItems(Long sid, Long pid) {
		return orderItemMapper.selectGoodsItems(sid, pid);
	}

	@Override
	public int countGoodsSaleItems(Long sid, Long pid) {
		return orderItemMapper.countGoodsItems(sid, pid);
	}

	@Override
	public List<OrderItem> findIsNotEvalItems(Long sid, Long uid, int page,
			int pageSize) {
		OrderItemExample example = new OrderItemExample();
		example.setCurrPage(page);
		example.setPageSize(pageSize);
		return orderItemMapper.selectIsNotEvalItems(sid, uid, example);
	}

	@Override
	public List<OrderStatist> orderBuyerStatist(Long sid, Long buyerid) {
		return orderMapper.orderStatistGroupState(sid, buyerid);
	}

	@Override
	public List<OrderStatist> orderStoreStatist(Long sid) {

		return null;
	}

	@Override
	public Order findByOrdersn(Long sid, String ordersn) {
		return orderMapper.selectByOrdersn(sid, ordersn);
	}

	@Override
	public List<OrderTrace> findOrderTraces(Long sid, String orderid) {
		OrderTraceExample example = new OrderTraceExample();
		OrderTraceExample.Criteria c = example.createCriteria();
		c.andSiteidEqualTo(sid);
		c.andOrderidEqualTo(orderid);
		example.setOrderByClause(" opttime desc");
		return orderTraceMapper.selectByExample(example);
	}

	@Override
	public void addTrace(Long sid, OrderTrace trace) {
		if (null != trace) {
			trace.setId(UUID.randomUUID().toString());
			trace.setOpttime(new Date());
			trace.setSiteid(sid);
			orderTraceMapper.insert(trace);
		}
	}

	@Override
	public void deleteOrder(Long sid, String ordersn) {
		OrderItemExample example = new OrderItemExample();
		OrderItemExample.Criteria criteria = example.createCriteria();
		// criteria.andOrderidEqualTo(ordersn);
		// criteria.andSellerEqualTo(sid);
		// orderItemMapper.u

	}

	@Override
	public List<Order> queryOrderByBuyer(Order orders, String order,
			int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

}
