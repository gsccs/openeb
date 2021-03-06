package com.gsccs.b2c.plat.order.dao;

import com.gsccs.b2c.plat.order.model.OrderTrace;
import com.gsccs.b2c.plat.order.model.OrderTraceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderTraceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int countByExample(OrderTraceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int deleteByExample(OrderTraceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int insert(OrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int insertSelective(OrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    List<OrderTrace> selectByExample(OrderTraceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    OrderTrace selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int updateByExampleSelective(@Param("record") OrderTrace record, @Param("example") OrderTraceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int updateByExample(@Param("record") OrderTrace record, @Param("example") OrderTraceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int updateByPrimaryKeySelective(OrderTrace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_trace
     *
     * @mbggenerated Mon Nov 16 16:53:48 CST 2015
     */
    int updateByPrimaryKey(OrderTrace record);
}