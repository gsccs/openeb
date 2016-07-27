package com.gsccs.b2c.plat.shop.model;

public class BrandT {

	private Long id;
	private String name;
	private String parid;
	private String state;
	private Integer ordernum;
	private Integer clicknum;
	private String description;
	private String templet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	
	public String getTemplet() {
		return templet;
	}

	public void setTemplet(String templet) {
		this.templet = templet == null ? null : templet.trim();
	}

	
	public String getParid() {
		return parid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column shop_brand.parId
	 * 
	 * @param parid
	 *            the value for shop_brand.parId
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public void setParid(String parid) {
		this.parid = parid == null ? null : parid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column shop_brand.state
	 * 
	 * @return the value of shop_brand.state
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column shop_brand.state
	 * 
	 * @param state
	 *            the value for shop_brand.state
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column shop_brand.orderNum
	 * 
	 * @return the value of shop_brand.orderNum
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public Integer getOrdernum() {
		return ordernum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column shop_brand.orderNum
	 * 
	 * @param ordernum
	 *            the value for shop_brand.orderNum
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column shop_brand.clickNum
	 * 
	 * @return the value of shop_brand.clickNum
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public Integer getClicknum() {
		return clicknum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column shop_brand.clickNum
	 * 
	 * @param clicknum
	 *            the value for shop_brand.clickNum
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column shop_brand.description
	 * 
	 * @return the value of shop_brand.description
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column shop_brand.description
	 * 
	 * @param description
	 *            the value for shop_brand.description
	 * 
	 * @mbggenerated Mon Mar 16 15:17:19 CST 2015
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}