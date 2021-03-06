package com.gsccs.b2c.plat.task.job;

import java.util.List;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.gsccs.b2c.plat.seller.service.ShopService;
import com.gsccs.b2c.plat.shop.service.GoodsService;
import com.gsccs.b2c.plat.utils.SpringUtils;
import com.gsccs.eb.api.domain.seller.Shop;

/**
 * 商品自动下架任务
 * @author x.d zhang
 *
 */
public class StoreAlertJob extends QuartzJobBean{

	protected static final Logger log=Logger.getLogger(StoreAlertJob.class);  
    
	@Override
	protected void executeInternal(JobExecutionContext arg0)
			throws JobExecutionException {
		 log.info("-----自动下架任务执行-----"); 
		 ShopService storeService =  SpringUtils.getBean("storeService");
		 GoodsService goodsService =  SpringUtils.getBean("goodsService");
		 List<Shop> storeList = storeService.find(null, null);
		 if (null != storeList){
			 for(int i=0;i<storeList.size();i++){
				 Shop storeT = storeList.get(i);
				 try{
					 goodsService.productUnsale(storeT.getId());
				 }catch(Exception e){
					 log.info("自动下架任务执行出错。");  
				 }
			 }
		 }
	}

}
