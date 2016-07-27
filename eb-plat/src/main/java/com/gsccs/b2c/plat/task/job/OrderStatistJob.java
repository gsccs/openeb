package com.gsccs.b2c.plat.task.job;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.gsccs.b2c.plat.order.service.OrderService;
import com.gsccs.b2c.plat.seller.service.StoreService;
import com.gsccs.b2c.plat.shop.model.StoreT;
import com.gsccs.b2c.plat.utils.SpringUtils;

/**
 * 订单统计作业
 * @author x.d zhang
 *
 */
public class OrderStatistJob extends QuartzJobBean{

	protected static final Logger log=Logger.getLogger(OrderStatistJob.class);  
    
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		 log.info("-----订单汇总任务执行-----"); 
		 StoreService storeService =  SpringUtils.getBean("storeService");
		 OrderService orderService =  SpringUtils.getBean("orderService");
		 List<StoreT> storeList = storeService.find(null, null);
		 if (null != storeList){
			 for(int i=0;i<storeList.size();i++){
				 StoreT storeT = storeList.get(i);
				 orderService.orderStoreStatist(storeT.getId());
			 }
		 }
	}

}
