package com.gsccs.b2c.plat.order.dao;

import com.gsccs.b2c.plat.order.model.OrderPayT;
import com.gsccs.b2c.plat.order.model.OrderPayTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderPayTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int countByExample(OrderPayTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int deleteByExample(OrderPayTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int insert(OrderPayT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int insertSelective(OrderPayT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    List<OrderPayT> selectByExample(OrderPayTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    OrderPayT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int updateByExampleSelective(@Param("record") OrderPayT record, @Param("example") OrderPayTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int updateByExample(@Param("record") OrderPayT record, @Param("example") OrderPayTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int updateByPrimaryKeySelective(OrderPayT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    int updateByPrimaryKey(OrderPayT record);
}