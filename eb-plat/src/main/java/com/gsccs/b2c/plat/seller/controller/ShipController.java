package com.gsccs.b2c.plat.seller.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gsccs.b2c.plat.bass.JsonMsg;
import com.gsccs.b2c.plat.seller.service.ShopService;
import com.gsccs.eb.api.domain.seller.Grade;

/**
 * 发货设置
 * @author x.d zhang
 *
 */
@Controller
@RequestMapping("/shipset")
public class ShipController {

	@Resource
	private ShopService storeService;

	
	/**
	 * 店铺等级列表
	 * @param param
	 * @param currPage
	 * @param pageSize
	 * @param map
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String transportList(Grade param,
			@RequestParam(defaultValue = "1") int currPage,
			@RequestParam(defaultValue = "10") int pageSize, ModelMap map) {
		
		return "seller/shipset-list";
	}

	/**
	 * 店铺等级表单
	 * 
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String gradeForm(Long id, ModelMap map) {
		String view = "seller/shipset-add";
		if (null != id) {
			view = "seller/shipset-edit";
		}
		return view;
	}

	
	/**
	 * 店铺信息保存
	 * @param map
	 * @param shop
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public JsonMsg saveGrade(ModelMap map, Grade grade) {
		JsonMsg json = new JsonMsg();
		try {
			if (null == grade) {
				json.setMsg("保存失败");
				json.setSuccess(false);
				return json;
			}
			storeService.saveGrade(grade);
			json.setSuccess(true);
			json.setMsg("保存成功！");
		} catch (Exception e) {
			json.setSuccess(false);
			json.setMsg("保存失败");
			e.printStackTrace();
		}
		return json;
	}
}
