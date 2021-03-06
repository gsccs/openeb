package com.gsccs.b2c.plat.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.b2c.plat.site.model.FloorExample;
import com.gsccs.eb.api.domain.site.Floor;

public interface FloorMapper {

	int countByExample(FloorExample example);

	int deleteByExample(FloorExample example);

	int deleteByPrimaryKey(String id);

	int insert(Floor record);

	int insertSelective(Floor record);

	List<Floor> selectByExample(FloorExample example);

	Floor selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Floor record,
			@Param("example") FloorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_storey_item
	 * 
	 * @mbggenerated Sun Nov 15 17:49:02 CST 2015
	 */
	int updateByExample(@Param("record") Floor record,
			@Param("example") FloorExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_storey_item
	 * 
	 * @mbggenerated Sun Nov 15 17:49:02 CST 2015
	 */
	int updateByPrimaryKeySelective(Floor record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_storey_item
	 * 
	 * @mbggenerated Sun Nov 15 17:49:02 CST 2015
	 */
	int updateByPrimaryKey(Floor record);
}