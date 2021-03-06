package com.gsccs.b2c.plat.site.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gsccs.b2c.plat.site.model.NavigationExample;
import com.gsccs.eb.api.domain.site.Navigation;

public interface NavigationMapper {
	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table plat_site_menu
	 * 
	 * @mbggenerated Fri Jun 05 14:28:33 CST 2015
	 */
	int countByExample(NavigationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table plat_site_menu
	 * 
	 * @mbggenerated Fri Jun 05 14:28:33 CST 2015
	 */
	int deleteByExample(NavigationExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table plat_site_menu
	 * 
	 * @mbggenerated Fri Jun 05 14:28:33 CST 2015
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table plat_site_menu
	 * 
	 * @mbggenerated Fri Jun 05 14:28:33 CST 2015
	 */
	int insert(Navigation record);

	int insertSelective(Navigation record);

	List<Navigation> selectByExample(NavigationExample example);

	Navigation selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") Navigation record,
			@Param("example") NavigationExample example);

	int updateByExample(@Param("record") Navigation record,
			@Param("example") NavigationExample example);

	int updateByPrimaryKeySelective(Navigation record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table plat_site_menu
	 * 
	 * @mbggenerated Fri Jun 05 14:28:33 CST 2015
	 */
	int updateByPrimaryKey(Navigation record);
}