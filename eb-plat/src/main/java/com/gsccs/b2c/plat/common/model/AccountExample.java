package com.gsccs.b2c.plat.common.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 */
public class AccountExample {

	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public AccountExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

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

		public Criteria andAccountIsNull() {
			addCriterion("account is null");
			return (Criteria) this;
		}

		public Criteria andAccountIsNotNull() {
			addCriterion("account is not null");
			return (Criteria) this;
		}

		public Criteria andAccountEqualTo(String value) {
			addCriterion("account =", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotEqualTo(String value) {
			addCriterion("account <>", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountLike(String value) {
			addCriterion("account like", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotLike(String value) {
			addCriterion("account not like", value, "account");
			return (Criteria) this;
		}

		public Criteria andAccountIn(List<String> values) {
			addCriterion("account in", values, "account");
			return (Criteria) this;
		}

		public Criteria andAccountNotIn(List<String> values) {
			addCriterion("account not in", values, "account");
			return (Criteria) this;
		}

		public Criteria andPwdIsNull() {
			addCriterion("pwd is null");
			return (Criteria) this;
		}

		public Criteria andPwdIsNotNull() {
			addCriterion("pwd is not null");
			return (Criteria) this;
		}

		public Criteria andPwdEqualTo(String value) {
			addCriterion("pwd =", value, "pwd");
			return (Criteria) this;
		}

		public Criteria andPwdNotEqualTo(String value) {
			addCriterion("pwd <>", value, "pwd");
			return (Criteria) this;
		}


		public Criteria andRegtimeIsNull() {
			addCriterion("regtime is null");
			return (Criteria) this;
		}

		public Criteria andRegtimeIsNotNull() {
			addCriterion("regtime is not null");
			return (Criteria) this;
		}

		public Criteria andRegtimeEqualTo(Date value) {
			addCriterion("regtime =", value, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeNotEqualTo(Date value) {
			addCriterion("regtime <>", value, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeGreaterThan(Date value) {
			addCriterion("regtime >", value, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
			addCriterion("regtime >=", value, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeLessThan(Date value) {
			addCriterion("regtime <", value, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeLessThanOrEqualTo(Date value) {
			addCriterion("regtime <=", value, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeIn(List<Date> values) {
			addCriterion("regtime in", values, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeNotIn(List<Date> values) {
			addCriterion("regtime not in", values, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeBetween(Date value1, Date value2) {
			addCriterion("regtime between", value1, value2, "addDate");
			return (Criteria) this;
		}

		public Criteria andRegtimeNotBetween(Date value1, Date value2) {
			addCriterion("regtime not between", value1, value2, "addDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeIsNull() {
			addCriterion("lasttime is null");
			return (Criteria) this;
		}

		public Criteria andLasttimeIsNotNull() {
			addCriterion("lasttime is not null");
			return (Criteria) this;
		}

		public Criteria andLasttimeEqualTo(Date value) {
			addCriterion("lasttime =", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeNotEqualTo(Date value) {
			addCriterion("lasttime <>", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeGreaterThan(Date value) {
			addCriterion("lasttime >", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeGreaterThanOrEqualTo(Date value) {
			addCriterion("lasttime >=", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeLessThan(Date value) {
			addCriterion("lasttime <", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeLessThanOrEqualTo(Date value) {
			addCriterion("lasttime <=", value, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeIn(List<Date> values) {
			addCriterion("lasttime in", values, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeNotIn(List<Date> values) {
			addCriterion("lasttime not in", values, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeBetween(Date value1, Date value2) {
			addCriterion("lasttime between", value1, value2, "loginDate");
			return (Criteria) this;
		}

		public Criteria andLasttimeNotBetween(Date value1, Date value2) {
			addCriterion("lasttime not between", value1, value2, "loginDate");
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

		public Criteria andIslockIsNull() {
			addCriterion("islock is null");
			return (Criteria) this;
		}

		public Criteria andIslockIsNotNull() {
			addCriterion("islock is not null");
			return (Criteria) this;
		}

		public Criteria andIslockEqualTo(String value) {
			addCriterion("islock =", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotEqualTo(String value) {
			addCriterion("islock <>", value, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockIn(List<String> values) {
			addCriterion("islock in", values, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotIn(List<String> values) {
			addCriterion("islock not in", values, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockBetween(String value1, String value2) {
			addCriterion("islock between", value1, value2, "islock");
			return (Criteria) this;
		}

		public Criteria andIslockNotBetween(String value1, String value2) {
			addCriterion("islock not between", value1, value2, "islock");
			return (Criteria) this;
		}

		public Criteria andSaltIsNull() {
			addCriterion("salt is null");
			return (Criteria) this;
		}

		public Criteria andSaltIsNotNull() {
			addCriterion("salt is not null");
			return (Criteria) this;
		}

		public Criteria andSaltEqualTo(String value) {
			addCriterion("salt =", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotEqualTo(String value) {
			addCriterion("salt <>", value, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltIn(List<String> values) {
			addCriterion("salt in", values, "salt");
			return (Criteria) this;
		}

		public Criteria andSaltNotIn(List<String> values) {
			addCriterion("salt not in", values, "salt");
			return (Criteria) this;
		}

	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

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