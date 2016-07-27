package com.gsccs.b2c.plat.shop.dao;

import com.gsccs.b2c.plat.shop.model.RequirInfo;
import com.gsccs.b2c.plat.shop.model.RequirInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RequirInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int countByExample(RequirInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int deleteByExample(RequirInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int insert(RequirInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int insertSelective(RequirInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    List<RequirInfo> selectByExample(RequirInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    RequirInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int updateByExampleSelective(@Param("record") RequirInfo record, @Param("example") RequirInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int updateByExample(@Param("record") RequirInfo record, @Param("example") RequirInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int updateByPrimaryKeySelective(RequirInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_reqinfo
     *
     * @mbggenerated Tue Mar 31 10:51:57 CST 2015
     */
    int updateByPrimaryKey(RequirInfo record);
}