package com.gsccs.eb.api.domain.goods;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.eb.api.domain.base.Domain;

/**
 * 规格
 * 
 * @author x.d zhang
 * 
 */
public class Specific extends Domain {

	private Long id;
	private String title;
	private String memo;
	private String alias;
	private String showType;
	private String showModel;
	private String state;
	private Integer ordernum;
	// 规格值列表
	private List<SpecVal> specVals = new ArrayList<SpecVal>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getShowType() {
		return showType;
	}

	public void setShowType(String showType) {
		this.showType = showType;
	}

	public String getShowModel() {
		return showModel;
	}

	public void setShowModel(String showModel) {
		this.showModel = showModel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public List<SpecVal> getSpecVals() {
		return specVals;
	}

	public void setSpecVals(List<SpecVal> specVals) {
		this.specVals = specVals;
	}

}