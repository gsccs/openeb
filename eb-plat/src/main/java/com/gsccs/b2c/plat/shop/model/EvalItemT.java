package com.gsccs.b2c.plat.shop.model;

public class EvalItemT {
    
    private Long id;
    private Long typeid;
    private Long siteid;
    private Integer score;
    private String content;
    private String isdefault;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_eval_item.typeid
     *
     * @return the value of shop_eval_item.typeid
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public Long getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_eval_item.typeid
     *
     * @param typeid the value for shop_eval_item.typeid
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_eval_item.siteid
     *
     * @return the value of shop_eval_item.siteid
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public Long getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_eval_item.siteid
     *
     * @param siteid the value for shop_eval_item.siteid
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public void setSiteid(Long siteid) {
        this.siteid = siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_eval_item.score
     *
     * @return the value of shop_eval_item.score
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_eval_item.score
     *
     * @param score the value for shop_eval_item.score
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_eval_item.content
     *
     * @return the value of shop_eval_item.content
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_eval_item.content
     *
     * @param content the value for shop_eval_item.content
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_eval_item.isdefault
     *
     * @return the value of shop_eval_item.isdefault
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public String getIsdefault() {
        return isdefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_eval_item.isdefault
     *
     * @param isdefault the value for shop_eval_item.isdefault
     *
     * @mbggenerated Wed Jun 24 16:46:49 CST 2015
     */
    public void setIsdefault(String isdefault) {
        this.isdefault = isdefault == null ? null : isdefault.trim();
    }
}