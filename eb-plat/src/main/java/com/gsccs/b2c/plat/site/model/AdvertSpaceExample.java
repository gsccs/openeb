package com.gsccs.b2c.plat.site.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.b2c.plat.bass.BaseExample;

public class AdvertSpaceExample extends BaseExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AdvertSpaceExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds
	 * to the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}

		public Criteria andTitleIsNotNull() {
			addCriterion("title is not null");
			return (Criteria) this;
		}

		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}

		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}

		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}

		public Criteria andApclassIsNull() {
			addCriterion("apclass is null");
			return (Criteria) this;
		}

		public Criteria andApclassIsNotNull() {
			addCriterion("apclass is not null");
			return (Criteria) this;
		}

		public Criteria andApclassEqualTo(String value) {
			addCriterion("apclass =", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassNotEqualTo(String value) {
			addCriterion("apclass <>", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassGreaterThan(String value) {
			addCriterion("apclass >", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassGreaterThanOrEqualTo(String value) {
			addCriterion("apclass >=", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassLessThan(String value) {
			addCriterion("apclass <", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassLessThanOrEqualTo(String value) {
			addCriterion("apclass <=", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassLike(String value) {
			addCriterion("apclass like", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassNotLike(String value) {
			addCriterion("apclass not like", value, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassIn(List<String> values) {
			addCriterion("apclass in", values, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassNotIn(List<String> values) {
			addCriterion("apclass not in", values, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassBetween(String value1, String value2) {
			addCriterion("apclass between", value1, value2, "apclass");
			return (Criteria) this;
		}

		public Criteria andApclassNotBetween(String value1, String value2) {
			addCriterion("apclass not between", value1, value2, "apclass");
			return (Criteria) this;
		}

		public Criteria andApdisplayIsNull() {
			addCriterion("apdisplay is null");
			return (Criteria) this;
		}

		public Criteria andApdisplayIsNotNull() {
			addCriterion("apdisplay is not null");
			return (Criteria) this;
		}

		public Criteria andApdisplayEqualTo(String value) {
			addCriterion("apdisplay =", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayNotEqualTo(String value) {
			addCriterion("apdisplay <>", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayGreaterThan(String value) {
			addCriterion("apdisplay >", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayGreaterThanOrEqualTo(String value) {
			addCriterion("apdisplay >=", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayLessThan(String value) {
			addCriterion("apdisplay <", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayLessThanOrEqualTo(String value) {
			addCriterion("apdisplay <=", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayLike(String value) {
			addCriterion("apdisplay like", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayNotLike(String value) {
			addCriterion("apdisplay not like", value, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayIn(List<String> values) {
			addCriterion("apdisplay in", values, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayNotIn(List<String> values) {
			addCriterion("apdisplay not in", values, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayBetween(String value1, String value2) {
			addCriterion("apdisplay between", value1, value2, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApdisplayNotBetween(String value1, String value2) {
			addCriterion("apdisplay not between", value1, value2, "apdisplay");
			return (Criteria) this;
		}

		public Criteria andApcodeIsNull() {
			addCriterion("apcode is null");
			return (Criteria) this;
		}

		public Criteria andApcodeIsNotNull() {
			addCriterion("apcode is not null");
			return (Criteria) this;
		}

		public Criteria andApcodeEqualTo(String value) {
			addCriterion("apcode =", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeNotEqualTo(String value) {
			addCriterion("apcode <>", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeGreaterThan(String value) {
			addCriterion("apcode >", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeGreaterThanOrEqualTo(String value) {
			addCriterion("apcode >=", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeLessThan(String value) {
			addCriterion("apcode <", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeLessThanOrEqualTo(String value) {
			addCriterion("apcode <=", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeLike(String value) {
			addCriterion("apcode like", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeNotLike(String value) {
			addCriterion("apcode not like", value, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeIn(List<String> values) {
			addCriterion("apcode in", values, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeNotIn(List<String> values) {
			addCriterion("apcode not in", values, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeBetween(String value1, String value2) {
			addCriterion("apcode between", value1, value2, "apcode");
			return (Criteria) this;
		}

		public Criteria andApcodeNotBetween(String value1, String value2) {
			addCriterion("apcode not between", value1, value2, "apcode");
			return (Criteria) this;
		}

		public Criteria andApwidthIsNull() {
			addCriterion("apwidth is null");
			return (Criteria) this;
		}

		public Criteria andApwidthIsNotNull() {
			addCriterion("apwidth is not null");
			return (Criteria) this;
		}

		public Criteria andApwidthEqualTo(Float value) {
			addCriterion("apwidth =", value, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthNotEqualTo(Float value) {
			addCriterion("apwidth <>", value, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthGreaterThan(Float value) {
			addCriterion("apwidth >", value, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthGreaterThanOrEqualTo(Float value) {
			addCriterion("apwidth >=", value, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthLessThan(Float value) {
			addCriterion("apwidth <", value, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthLessThanOrEqualTo(Float value) {
			addCriterion("apwidth <=", value, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthIn(List<Float> values) {
			addCriterion("apwidth in", values, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthNotIn(List<Float> values) {
			addCriterion("apwidth not in", values, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthBetween(Float value1, Float value2) {
			addCriterion("apwidth between", value1, value2, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApwidthNotBetween(Float value1, Float value2) {
			addCriterion("apwidth not between", value1, value2, "apwidth");
			return (Criteria) this;
		}

		public Criteria andApheightIsNull() {
			addCriterion("apheight is null");
			return (Criteria) this;
		}

		public Criteria andApheightIsNotNull() {
			addCriterion("apheight is not null");
			return (Criteria) this;
		}

		public Criteria andApheightEqualTo(Float value) {
			addCriterion("apheight =", value, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightNotEqualTo(Float value) {
			addCriterion("apheight <>", value, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightGreaterThan(Float value) {
			addCriterion("apheight >", value, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightGreaterThanOrEqualTo(Float value) {
			addCriterion("apheight >=", value, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightLessThan(Float value) {
			addCriterion("apheight <", value, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightLessThanOrEqualTo(Float value) {
			addCriterion("apheight <=", value, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightIn(List<Float> values) {
			addCriterion("apheight in", values, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightNotIn(List<Float> values) {
			addCriterion("apheight not in", values, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightBetween(Float value1, Float value2) {
			addCriterion("apheight between", value1, value2, "apheight");
			return (Criteria) this;
		}

		public Criteria andApheightNotBetween(Float value1, Float value2) {
			addCriterion("apheight not between", value1, value2, "apheight");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("state is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("state is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("state =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("state <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("state >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("state >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("state <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("state <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("state like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("state not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("state in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("state not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("state between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("state not between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andShopidIsNull() {
			addCriterion("shopid is null");
			return (Criteria) this;
		}

		public Criteria andShopidIsNotNull() {
			addCriterion("shopid is not null");
			return (Criteria) this;
		}

		public Criteria andShopidEqualTo(Long value) {
			addCriterion("shopid =", value, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidNotEqualTo(Long value) {
			addCriterion("shopid <>", value, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidGreaterThan(Long value) {
			addCriterion("shopid >", value, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidGreaterThanOrEqualTo(Long value) {
			addCriterion("shopid >=", value, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidLessThan(Long value) {
			addCriterion("shopid <", value, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidLessThanOrEqualTo(Long value) {
			addCriterion("shopid <=", value, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidIn(List<Long> values) {
			addCriterion("shopid in", values, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidNotIn(List<Long> values) {
			addCriterion("shopid not in", values, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidBetween(Long value1, Long value2) {
			addCriterion("shopid between", value1, value2, "shopid");
			return (Criteria) this;
		}

		public Criteria andShopidNotBetween(Long value1, Long value2) {
			addCriterion("shopid not between", value1, value2, "shopid");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("remark is not null");
			return (Criteria) this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table site_advert_space
	 * 
	 * @mbggenerated do_not_delete_during_merge Sat Aug 13 11:29:58 CST 2016
	 */
	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to
	 * the database table site_advert_space
	 * 
	 * @mbggenerated Sat Aug 13 11:29:58 CST 2016
	 */
	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}