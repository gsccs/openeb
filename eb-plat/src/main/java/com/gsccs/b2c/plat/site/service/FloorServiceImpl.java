package com.gsccs.b2c.plat.site.service;

import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.b2c.plat.site.dao.BannerMapper;
import com.gsccs.b2c.plat.site.dao.FloorMapper;
import com.gsccs.b2c.plat.site.model.BannerExample;
import com.gsccs.b2c.plat.site.model.FloorExample;
import com.gsccs.eb.api.domain.goods.Category;
import com.gsccs.eb.api.domain.goods.Goods;
import com.gsccs.eb.api.domain.site.Banner;
import com.gsccs.eb.api.domain.site.Floor;

@Service
public class FloorServiceImpl implements FloorService {

	@Autowired
	private FloorMapper floorMapper;
	@Autowired
	private BannerMapper bannerMapper;

	@Override
	public void saveFloor(Floor floor) {
		if (null == floor) {
			return;
		}
		if (StringUtils.isNotEmpty(floor.getId())) {
			floorMapper.updateByPrimaryKey(floor);
		} else {
			floor.setId(UUID.randomUUID().toString());
			floorMapper.insert(floor);
		}
	}

	@Override
	public Floor getFloor(String id) {
		return floorMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Floor> findFloorList(Long shopid) {
		FloorExample example = new FloorExample();
		FloorExample.Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(shopid);
		return floorMapper.selectByExample(example);
	}

	@Override
	public List<Banner> findBannerList(Long siteid) {
		BannerExample example = new BannerExample();
		BannerExample.Criteria criteria = example.createCriteria();
		criteria.andSiteidEqualTo(siteid);
		return bannerMapper.selectByExample(example);
	}

	@Override
	public boolean deleteFloor(String id) {
		boolean result = true;
		try {
			floorMapper.deleteByPrimaryKey(id);
		} catch (Exception e) {
			result = false;
		}
		return result;
	}

	@Override
	public void addBanners(Long siteId, List<Banner> items) {
		try {
			if (null != items) {
				for (Banner banner : items) {
					bannerMapper.insert(banner);
				}
			}
		} catch (Exception e) {
		}
	}

	@Override
	public List<Goods> findFloorGoodList(Long shopid, String floorid) {
		if (shopid==null){
			shopid = 0l;
		}
		
		if (StringUtils.isEmpty(floorid)){
			return null;
		}
		Floor floor = this.getFloor(floorid);
		if (null != floor){
			
		}
		return null;
	}

	@Override
	public List<Category> findFloorCateList(Long shopid, String floorid) {
		if (shopid==null){
			shopid = 0l;
		}
		return null;
	}

}
