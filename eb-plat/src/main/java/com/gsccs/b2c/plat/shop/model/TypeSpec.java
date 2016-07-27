package com.gsccs.b2c.plat.shop.model;


/**
 * 类型规格
 * @author x.d zhang
 *
 */
public class TypeSpec {
	
    private Long id;
    private Long typeId;
    private Long specId;
    private String showModel;
    private Integer ordernum;

    
    public Long getId() {
        return id;
    }

  
    public void setId(Long id) {
        this.id = id;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_type_spec.spec_id
     *
     * @return the value of shop_type_spec.spec_id
     *
     * @mbggenerated Mon Mar 16 15:17:19 CST 2015
     */
    public Long getSpecId() {
        return specId;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

 
    public String getShowModel() {
        return showModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_type_spec.show_model
     *
     * @param showModel the value for shop_type_spec.show_model
     *
     * @mbggenerated Mon Mar 16 15:17:19 CST 2015
     */
    public void setShowModel(String showModel) {
        this.showModel = showModel == null ? null : showModel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_type_spec.orderNum
     *
     * @return the value of shop_type_spec.orderNum
     *
     * @mbggenerated Mon Mar 16 15:17:19 CST 2015
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_type_spec.orderNum
     *
     * @param ordernum the value for shop_type_spec.orderNum
     *
     * @mbggenerated Mon Mar 16 15:17:19 CST 2015
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }
}