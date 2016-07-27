package com.gsccs.b2c.plat.shop.service;

import java.io.IOException;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.gsccs.b2c.plat.shop.model.CategoryT;
import com.gsccs.b2c.plat.shop.model.StoreCate;

/**
 * 类目服务
 * 
 * @author x.d zhang
 * @version 1.0
 */
public interface CategoryService {

	/**
	 * 下降
	 */
	public void down(CategoryT category);

	/**
	 * 上升
	 */
	public void up(CategoryT category);

	/**
	 * 分页查询
	 */
	public List<CategoryT> find(CategoryT category, String order, int currPage,
			int pageSize);

	public int count(CategoryT category);

	/**
	 * 查询所有类目
	 * 
	 * @return
	 */
	public JSONArray findAll(String state);

	/**
	 * 查询是否有子数据
	 * 
	 * @param parId
	 * @return
	 */
	public boolean hasChildren(Long parId);

	/**
	 * 根据父id查询
	 * 
	 * @param siteid
	 * @param parid
	 * @return
	 */
	public List<CategoryT> findByPar(Long parid);

	/**
	 * 根据父id查询
	 * 
	 * @param parid
	 * @param state
	 * @return
	 */
	public List<CategoryT> findByPar(Long parid, String state);

	/**
	 * 根据id查询
	 * 
	 * @param id
	 * @return
	 */
	public CategoryT findById(Long id);

	/**
	 * 更新
	 * 
	 * @param category
	 */
	public void update(CategoryT category);

	/**
	 * 添加
	 * 
	 * @param category
	 */
	public Long insert(CategoryT category);

	/**
	 * 删除
	 * 
	 * @param categoryId
	 */
	public void del(Long id);

	/**
	 * 递归删除
	 * 
	 * @param parId
	 * @throws TemplateException
	 * @throws IOException
	 */
	public void delPar(Long parId);

	/**
	 * 查询所有父栏目（递归）
	 * 
	 * @param id
	 * @return
	 */
	public String findParPro(Long id);

	public void addStoreCate(Long siteid, String cateids);

	public StoreCate findStoreCateIds(Long siteid);

	/**
	 * 商城站点类目列表
	 * 
	 * @param siteid
	 * @return
	 */
	public JSONArray findBySite(Long siteid);

	/**
	 * 商城管理类目列表
	 * 
	 * @param siteid
	 * @return
	 */
	public JSONArray findByStore(Long storeid);
	
	/**
	 * 商城管理类目列表
	 * 
	 * @param siteid
	 * @return
	 */
	public JSONArray findByStore(Long storeid,Long parid);

}
