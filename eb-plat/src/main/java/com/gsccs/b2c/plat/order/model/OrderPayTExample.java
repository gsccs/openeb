package com.gsccs.b2c.plat.order.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderPayTExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public OrderPayTExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
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

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrdersnIsNull() {
            addCriterion("ordersn is null");
            return (Criteria) this;
        }

        public Criteria andOrdersnIsNotNull() {
            addCriterion("ordersn is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersnEqualTo(String value) {
            addCriterion("ordersn =", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotEqualTo(String value) {
            addCriterion("ordersn <>", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnGreaterThan(String value) {
            addCriterion("ordersn >", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnGreaterThanOrEqualTo(String value) {
            addCriterion("ordersn >=", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLessThan(String value) {
            addCriterion("ordersn <", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLessThanOrEqualTo(String value) {
            addCriterion("ordersn <=", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnLike(String value) {
            addCriterion("ordersn like", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotLike(String value) {
            addCriterion("ordersn not like", value, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnIn(List<String> values) {
            addCriterion("ordersn in", values, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotIn(List<String> values) {
            addCriterion("ordersn not in", values, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnBetween(String value1, String value2) {
            addCriterion("ordersn between", value1, value2, "ordersn");
            return (Criteria) this;
        }

        public Criteria andOrdersnNotBetween(String value1, String value2) {
            addCriterion("ordersn not between", value1, value2, "ordersn");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Long value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Long value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Long value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Long value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Long value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Long value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Long> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Long> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Long value1, Long value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Long value1, Long value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andPayfeeIsNull() {
            addCriterion("payfee is null");
            return (Criteria) this;
        }

        public Criteria andPayfeeIsNotNull() {
            addCriterion("payfee is not null");
            return (Criteria) this;
        }

        public Criteria andPayfeeEqualTo(BigDecimal value) {
            addCriterion("payfee =", value, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeNotEqualTo(BigDecimal value) {
            addCriterion("payfee <>", value, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeGreaterThan(BigDecimal value) {
            addCriterion("payfee >", value, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payfee >=", value, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeLessThan(BigDecimal value) {
            addCriterion("payfee <", value, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payfee <=", value, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeIn(List<BigDecimal> values) {
            addCriterion("payfee in", values, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeNotIn(List<BigDecimal> values) {
            addCriterion("payfee not in", values, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payfee between", value1, value2, "payfee");
            return (Criteria) this;
        }

        public Criteria andPayfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payfee not between", value1, value2, "payfee");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNull() {
            addCriterion("tradeno is null");
            return (Criteria) this;
        }

        public Criteria andTradenoIsNotNull() {
            addCriterion("tradeno is not null");
            return (Criteria) this;
        }

        public Criteria andTradenoEqualTo(String value) {
            addCriterion("tradeno =", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotEqualTo(String value) {
            addCriterion("tradeno <>", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThan(String value) {
            addCriterion("tradeno >", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoGreaterThanOrEqualTo(String value) {
            addCriterion("tradeno >=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThan(String value) {
            addCriterion("tradeno <", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLessThanOrEqualTo(String value) {
            addCriterion("tradeno <=", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoLike(String value) {
            addCriterion("tradeno like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotLike(String value) {
            addCriterion("tradeno not like", value, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoIn(List<String> values) {
            addCriterion("tradeno in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotIn(List<String> values) {
            addCriterion("tradeno not in", values, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoBetween(String value1, String value2) {
            addCriterion("tradeno between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradenoNotBetween(String value1, String value2) {
            addCriterion("tradeno not between", value1, value2, "tradeno");
            return (Criteria) this;
        }

        public Criteria andTradestatusIsNull() {
            addCriterion("tradestatus is null");
            return (Criteria) this;
        }

        public Criteria andTradestatusIsNotNull() {
            addCriterion("tradestatus is not null");
            return (Criteria) this;
        }

        public Criteria andTradestatusEqualTo(String value) {
            addCriterion("tradestatus =", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotEqualTo(String value) {
            addCriterion("tradestatus <>", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusGreaterThan(String value) {
            addCriterion("tradestatus >", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusGreaterThanOrEqualTo(String value) {
            addCriterion("tradestatus >=", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusLessThan(String value) {
            addCriterion("tradestatus <", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusLessThanOrEqualTo(String value) {
            addCriterion("tradestatus <=", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusLike(String value) {
            addCriterion("tradestatus like", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotLike(String value) {
            addCriterion("tradestatus not like", value, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusIn(List<String> values) {
            addCriterion("tradestatus in", values, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotIn(List<String> values) {
            addCriterion("tradestatus not in", values, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusBetween(String value1, String value2) {
            addCriterion("tradestatus between", value1, value2, "tradestatus");
            return (Criteria) this;
        }

        public Criteria andTradestatusNotBetween(String value1, String value2) {
            addCriterion("tradestatus not between", value1, value2, "tradestatus");
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
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plat_order_pay
     *
     * @mbggenerated do_not_delete_during_merge Wed Nov 25 15:03:31 CST 2015
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table plat_order_pay
     *
     * @mbggenerated Wed Nov 25 15:03:31 CST 2015
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

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
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