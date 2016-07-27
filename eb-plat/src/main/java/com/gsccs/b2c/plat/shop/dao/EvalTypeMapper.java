package com.gsccs.b2c.plat.shop.dao;

import com.gsccs.b2c.plat.shop.model.EvalTypeT;
import com.gsccs.b2c.plat.shop.model.EvalTypeTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvalTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int countByExample(EvalTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int deleteByExample(EvalTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int insert(EvalTypeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int insertSelective(EvalTypeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    List<EvalTypeT> selectByExample(EvalTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    EvalTypeT selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int updateByExampleSelective(@Param("record") EvalTypeT record, @Param("example") EvalTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int updateByExample(@Param("record") EvalTypeT record, @Param("example") EvalTypeTExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int updateByPrimaryKeySelective(EvalTypeT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_eval_type
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    int updateByPrimaryKey(EvalTypeT record);
}