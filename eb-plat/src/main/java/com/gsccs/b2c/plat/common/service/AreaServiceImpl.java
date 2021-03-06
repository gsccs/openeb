package com.gsccs.b2c.plat.common.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gsccs.b2c.plat.common.dao.AreaMapper;
import com.gsccs.b2c.plat.common.model.AreaExample;
import com.gsccs.eb.api.domain.base.Area;

/**
 * 
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Resource
	private AreaMapper areaMapper;

	@Override
	public List<Area> queryByParId(Integer parid) {
		return areaMapper.selectByParId(parid);
	}

	@Override
	public List<Area> find(Area area, String order, int currPage, int pageSize) {
		AreaExample example = new AreaExample();
		AreaExample.Criteria c = example.createCriteria();
		List<Integer> pids = new ArrayList<Integer>();

		pids.add(0);
		pids.add(area.getId());
		c.andPcodeIn(pids);
		/*
		 * Area area_ = areaMapper.selectByPrimaryKey(area.getId()); if (null !=
		 * area_){ if (area_.getLevel()!=1){ getsubs(area_.getId()); } }
		 */
		example.setCurrPage(currPage);
		example.setPageSize(pageSize);
		return areaMapper.selectPageByExample(example);
	}

	public List<Area> getsubs(Integer pid) {
		AreaExample example = new AreaExample();
		AreaExample.Criteria c = example.createCriteria();
		c.andPcodeEqualTo(pid);
		return areaMapper.selectByExample(example);
	}

	@Override
	public int count(Area area) {
		AreaExample example = new AreaExample();
		AreaExample.Criteria c = example.createCriteria();
		proSearchParam(area, c);
		return areaMapper.countByExample(example);
	}

	public void proSearchParam(Area area, AreaExample.Criteria criteria) {
		if (null != area) {
			if (null == area.getPcode()) {
				criteria.andPcodeEqualTo(0);
			} else {
				criteria.andPcodeEqualTo(area.getPcode());
			}
		}
	}

}
