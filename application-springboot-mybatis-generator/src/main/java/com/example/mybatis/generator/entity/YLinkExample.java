package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YLinkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YLinkExample() {
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

        public Criteria andLNameIsNull() {
            addCriterion("l_name is null");
            return (Criteria) this;
        }

        public Criteria andLNameIsNotNull() {
            addCriterion("l_name is not null");
            return (Criteria) this;
        }

        public Criteria andLNameEqualTo(String value) {
            addCriterion("l_name =", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotEqualTo(String value) {
            addCriterion("l_name <>", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThan(String value) {
            addCriterion("l_name >", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameGreaterThanOrEqualTo(String value) {
            addCriterion("l_name >=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThan(String value) {
            addCriterion("l_name <", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLessThanOrEqualTo(String value) {
            addCriterion("l_name <=", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameLike(String value) {
            addCriterion("l_name like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotLike(String value) {
            addCriterion("l_name not like", value, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameIn(List<String> values) {
            addCriterion("l_name in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotIn(List<String> values) {
            addCriterion("l_name not in", values, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameBetween(String value1, String value2) {
            addCriterion("l_name between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLNameNotBetween(String value1, String value2) {
            addCriterion("l_name not between", value1, value2, "lName");
            return (Criteria) this;
        }

        public Criteria andLLogoIsNull() {
            addCriterion("l_logo is null");
            return (Criteria) this;
        }

        public Criteria andLLogoIsNotNull() {
            addCriterion("l_logo is not null");
            return (Criteria) this;
        }

        public Criteria andLLogoEqualTo(String value) {
            addCriterion("l_logo =", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoNotEqualTo(String value) {
            addCriterion("l_logo <>", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoGreaterThan(String value) {
            addCriterion("l_logo >", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoGreaterThanOrEqualTo(String value) {
            addCriterion("l_logo >=", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoLessThan(String value) {
            addCriterion("l_logo <", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoLessThanOrEqualTo(String value) {
            addCriterion("l_logo <=", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoLike(String value) {
            addCriterion("l_logo like", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoNotLike(String value) {
            addCriterion("l_logo not like", value, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoIn(List<String> values) {
            addCriterion("l_logo in", values, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoNotIn(List<String> values) {
            addCriterion("l_logo not in", values, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoBetween(String value1, String value2) {
            addCriterion("l_logo between", value1, value2, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLLogoNotBetween(String value1, String value2) {
            addCriterion("l_logo not between", value1, value2, "lLogo");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNull() {
            addCriterion("l_url is null");
            return (Criteria) this;
        }

        public Criteria andLUrlIsNotNull() {
            addCriterion("l_url is not null");
            return (Criteria) this;
        }

        public Criteria andLUrlEqualTo(String value) {
            addCriterion("l_url =", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotEqualTo(String value) {
            addCriterion("l_url <>", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThan(String value) {
            addCriterion("l_url >", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlGreaterThanOrEqualTo(String value) {
            addCriterion("l_url >=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThan(String value) {
            addCriterion("l_url <", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLessThanOrEqualTo(String value) {
            addCriterion("l_url <=", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlLike(String value) {
            addCriterion("l_url like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotLike(String value) {
            addCriterion("l_url not like", value, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlIn(List<String> values) {
            addCriterion("l_url in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotIn(List<String> values) {
            addCriterion("l_url not in", values, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlBetween(String value1, String value2) {
            addCriterion("l_url between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLUrlNotBetween(String value1, String value2) {
            addCriterion("l_url not between", value1, value2, "lUrl");
            return (Criteria) this;
        }

        public Criteria andLTimeIsNull() {
            addCriterion("l_time is null");
            return (Criteria) this;
        }

        public Criteria andLTimeIsNotNull() {
            addCriterion("l_time is not null");
            return (Criteria) this;
        }

        public Criteria andLTimeEqualTo(Integer value) {
            addCriterion("l_time =", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotEqualTo(Integer value) {
            addCriterion("l_time <>", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeGreaterThan(Integer value) {
            addCriterion("l_time >", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_time >=", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeLessThan(Integer value) {
            addCriterion("l_time <", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeLessThanOrEqualTo(Integer value) {
            addCriterion("l_time <=", value, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeIn(List<Integer> values) {
            addCriterion("l_time in", values, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotIn(List<Integer> values) {
            addCriterion("l_time not in", values, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeBetween(Integer value1, Integer value2) {
            addCriterion("l_time between", value1, value2, "lTime");
            return (Criteria) this;
        }

        public Criteria andLTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("l_time not between", value1, value2, "lTime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeIsNull() {
            addCriterion("l_overtime is null");
            return (Criteria) this;
        }

        public Criteria andLOvertimeIsNotNull() {
            addCriterion("l_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andLOvertimeEqualTo(Integer value) {
            addCriterion("l_overtime =", value, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeNotEqualTo(Integer value) {
            addCriterion("l_overtime <>", value, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeGreaterThan(Integer value) {
            addCriterion("l_overtime >", value, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("l_overtime >=", value, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeLessThan(Integer value) {
            addCriterion("l_overtime <", value, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("l_overtime <=", value, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeIn(List<Integer> values) {
            addCriterion("l_overtime in", values, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeNotIn(List<Integer> values) {
            addCriterion("l_overtime not in", values, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("l_overtime between", value1, value2, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("l_overtime not between", value1, value2, "lOvertime");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNull() {
            addCriterion("l_status is null");
            return (Criteria) this;
        }

        public Criteria andLStatusIsNotNull() {
            addCriterion("l_status is not null");
            return (Criteria) this;
        }

        public Criteria andLStatusEqualTo(Byte value) {
            addCriterion("l_status =", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotEqualTo(Byte value) {
            addCriterion("l_status <>", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThan(Byte value) {
            addCriterion("l_status >", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("l_status >=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThan(Byte value) {
            addCriterion("l_status <", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusLessThanOrEqualTo(Byte value) {
            addCriterion("l_status <=", value, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusIn(List<Byte> values) {
            addCriterion("l_status in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotIn(List<Byte> values) {
            addCriterion("l_status not in", values, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusBetween(Byte value1, Byte value2) {
            addCriterion("l_status between", value1, value2, "lStatus");
            return (Criteria) this;
        }

        public Criteria andLStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("l_status not between", value1, value2, "lStatus");
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