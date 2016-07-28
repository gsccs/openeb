package com.gsccs.b2c.plat.site.service;

import java.util.List;

import com.gsccs.b2c.plat.site.model.AreaT;

/**
 */
public interface AreaService {

	
	List<AreaT> getByParId(Integer parentid);
	
	/**
	 * 分页查询
	 */
	public List<AreaT> find(AreaT area, String order, int currPage,
			int pageSize);
	
	public int count(AreaT area);
	
}



