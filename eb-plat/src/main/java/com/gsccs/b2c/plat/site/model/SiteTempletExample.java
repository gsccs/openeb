package com.gsccs.b2c.plat.site.model;

import java.util.ArrayList;
import java.util.List;

import com.gsccs.b2c.plat.bass.BaseExample;

public class SiteTempletExample  extends BaseExample{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteTempletExample() {
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

        public Criteria andStoreidIsNull() {
            addCriterion("storeId is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeId is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(Long value) {
            addCriterion("storeId =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(Long value) {
            addCriterion("storeId <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(Long value) {
            addCriterion("storeId >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(Long value) {
            addCriterion("storeId >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(Long value) {
            addCriterion("storeId <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(Long value) {
            addCriterion("storeId <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<Long> values) {
            addCriterion("storeId in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<Long> values) {
            addCriterion("storeId not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(Long value1, Long value2) {
            addCriterion("storeId between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(Long value1, Long value2) {
            addCriterion("storeId not between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andTempletidIsNull() {
            addCriterion("templetId is null");
            return (Criteria) this;
        }

        public Criteria andTempletidIsNotNull() {
            addCriterion("templetId is not null");
            return (Criteria) this;
        }

        public Criteria andTempletidEqualTo(Long value) {
            addCriterion("templetId =", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotEqualTo(Long value) {
            addCriterion("templetId <>", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidGreaterThan(Long value) {
            addCriterion("templetId >", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidGreaterThanOrEqualTo(Long value) {
            addCriterion("templetId >=", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLessThan(Long value) {
            addCriterion("templetId <", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidLessThanOrEqualTo(Long value) {
            addCriterion("templetId <=", value, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidIn(List<Long> values) {
            addCriterion("templetId in", values, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotIn(List<Long> values) {
            addCriterion("templetId not in", values, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidBetween(Long value1, Long value2) {
            addCriterion("templetId between", value1, value2, "templetid");
            return (Criteria) this;
        }

        public Criteria andTempletidNotBetween(Long value1, Long value2) {
            addCriterion("templetId not between", value1, value2, "templetid");
            return (Criteria) this;
        }

        public Criteria andKeyIsNull() {
            addCriterion("key is null");
            return (Criteria) this;
        }

        public Criteria andKeyIsNotNull() {
            addCriterion("key is not null");
            return (Criteria) this;
        }

        public Criteria andKeyEqualTo(String value) {
            addCriterion("key =", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotEqualTo(String value) {
            addCriterion("key <>", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThan(String value) {
            addCriterion("key >", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyGreaterThanOrEqualTo(String value) {
            addCriterion("key >=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThan(String value) {
            addCriterion("key <", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLessThanOrEqualTo(String value) {
            addCriterion("key <=", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyLike(String value) {
            addCriterion("key like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotLike(String value) {
            addCriterion("key not like", value, "key");
            return (Criteria) this;
        }

        public Criteria andKeyIn(List<String> values) {
            addCriterion("key in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotIn(List<String> values) {
            addCriterion("key not in", values, "key");
            return (Criteria) this;
        }

        public Criteria andKeyBetween(String value1, String value2) {
            addCriterion("key between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andKeyNotBetween(String value1, String value2) {
            addCriterion("key not between", value1, value2, "key");
            return (Criteria) this;
        }

        public Criteria andUsepageIsNull() {
            addCriterion("usePage is null");
            return (Criteria) this;
        }

        public Criteria andUsepageIsNotNull() {
            addCriterion("usePage is not null");
            return (Criteria) this;
        }

        public Criteria andUsepageEqualTo(String value) {
            addCriterion("usePage =", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageNotEqualTo(String value) {
            addCriterion("usePage <>", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageGreaterThan(String value) {
            addCriterion("usePage >", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageGreaterThanOrEqualTo(String value) {
            addCriterion("usePage >=", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageLessThan(String value) {
            addCriterion("usePage <", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageLessThanOrEqualTo(String value) {
            addCriterion("usePage <=", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageLike(String value) {
            addCriterion("usePage like", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageNotLike(String value) {
            addCriterion("usePage not like", value, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageIn(List<String> values) {
            addCriterion("usePage in", values, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageNotIn(List<String> values) {
            addCriterion("usePage not in", values, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageBetween(String value1, String value2) {
            addCriterion("usePage between", value1, value2, "usepage");
            return (Criteria) this;
        }

        public Criteria andUsepageNotBetween(String value1, String value2) {
            addCriterion("usePage not between", value1, value2, "usepage");
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