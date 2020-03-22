package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YMsgsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YMsgsExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMTelIsNull() {
            addCriterion("m_tel is null");
            return (Criteria) this;
        }

        public Criteria andMTelIsNotNull() {
            addCriterion("m_tel is not null");
            return (Criteria) this;
        }

        public Criteria andMTelEqualTo(String value) {
            addCriterion("m_tel =", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotEqualTo(String value) {
            addCriterion("m_tel <>", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelGreaterThan(String value) {
            addCriterion("m_tel >", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelGreaterThanOrEqualTo(String value) {
            addCriterion("m_tel >=", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLessThan(String value) {
            addCriterion("m_tel <", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLessThanOrEqualTo(String value) {
            addCriterion("m_tel <=", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelLike(String value) {
            addCriterion("m_tel like", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotLike(String value) {
            addCriterion("m_tel not like", value, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelIn(List<String> values) {
            addCriterion("m_tel in", values, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotIn(List<String> values) {
            addCriterion("m_tel not in", values, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelBetween(String value1, String value2) {
            addCriterion("m_tel between", value1, value2, "mTel");
            return (Criteria) this;
        }

        public Criteria andMTelNotBetween(String value1, String value2) {
            addCriterion("m_tel not between", value1, value2, "mTel");
            return (Criteria) this;
        }

        public Criteria andMEmailIsNull() {
            addCriterion("m_email is null");
            return (Criteria) this;
        }

        public Criteria andMEmailIsNotNull() {
            addCriterion("m_email is not null");
            return (Criteria) this;
        }

        public Criteria andMEmailEqualTo(String value) {
            addCriterion("m_email =", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailNotEqualTo(String value) {
            addCriterion("m_email <>", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailGreaterThan(String value) {
            addCriterion("m_email >", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailGreaterThanOrEqualTo(String value) {
            addCriterion("m_email >=", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailLessThan(String value) {
            addCriterion("m_email <", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailLessThanOrEqualTo(String value) {
            addCriterion("m_email <=", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailLike(String value) {
            addCriterion("m_email like", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailNotLike(String value) {
            addCriterion("m_email not like", value, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailIn(List<String> values) {
            addCriterion("m_email in", values, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailNotIn(List<String> values) {
            addCriterion("m_email not in", values, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailBetween(String value1, String value2) {
            addCriterion("m_email between", value1, value2, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMEmailNotBetween(String value1, String value2) {
            addCriterion("m_email not between", value1, value2, "mEmail");
            return (Criteria) this;
        }

        public Criteria andMTitIsNull() {
            addCriterion("m_tit is null");
            return (Criteria) this;
        }

        public Criteria andMTitIsNotNull() {
            addCriterion("m_tit is not null");
            return (Criteria) this;
        }

        public Criteria andMTitEqualTo(String value) {
            addCriterion("m_tit =", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitNotEqualTo(String value) {
            addCriterion("m_tit <>", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitGreaterThan(String value) {
            addCriterion("m_tit >", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitGreaterThanOrEqualTo(String value) {
            addCriterion("m_tit >=", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitLessThan(String value) {
            addCriterion("m_tit <", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitLessThanOrEqualTo(String value) {
            addCriterion("m_tit <=", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitLike(String value) {
            addCriterion("m_tit like", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitNotLike(String value) {
            addCriterion("m_tit not like", value, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitIn(List<String> values) {
            addCriterion("m_tit in", values, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitNotIn(List<String> values) {
            addCriterion("m_tit not in", values, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitBetween(String value1, String value2) {
            addCriterion("m_tit between", value1, value2, "mTit");
            return (Criteria) this;
        }

        public Criteria andMTitNotBetween(String value1, String value2) {
            addCriterion("m_tit not between", value1, value2, "mTit");
            return (Criteria) this;
        }

        public Criteria andMConIsNull() {
            addCriterion("m_con is null");
            return (Criteria) this;
        }

        public Criteria andMConIsNotNull() {
            addCriterion("m_con is not null");
            return (Criteria) this;
        }

        public Criteria andMConEqualTo(String value) {
            addCriterion("m_con =", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConNotEqualTo(String value) {
            addCriterion("m_con <>", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConGreaterThan(String value) {
            addCriterion("m_con >", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConGreaterThanOrEqualTo(String value) {
            addCriterion("m_con >=", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConLessThan(String value) {
            addCriterion("m_con <", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConLessThanOrEqualTo(String value) {
            addCriterion("m_con <=", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConLike(String value) {
            addCriterion("m_con like", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConNotLike(String value) {
            addCriterion("m_con not like", value, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConIn(List<String> values) {
            addCriterion("m_con in", values, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConNotIn(List<String> values) {
            addCriterion("m_con not in", values, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConBetween(String value1, String value2) {
            addCriterion("m_con between", value1, value2, "mCon");
            return (Criteria) this;
        }

        public Criteria andMConNotBetween(String value1, String value2) {
            addCriterion("m_con not between", value1, value2, "mCon");
            return (Criteria) this;
        }

        public Criteria andMIpIsNull() {
            addCriterion("m_ip is null");
            return (Criteria) this;
        }

        public Criteria andMIpIsNotNull() {
            addCriterion("m_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMIpEqualTo(String value) {
            addCriterion("m_ip =", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpNotEqualTo(String value) {
            addCriterion("m_ip <>", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpGreaterThan(String value) {
            addCriterion("m_ip >", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpGreaterThanOrEqualTo(String value) {
            addCriterion("m_ip >=", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpLessThan(String value) {
            addCriterion("m_ip <", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpLessThanOrEqualTo(String value) {
            addCriterion("m_ip <=", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpLike(String value) {
            addCriterion("m_ip like", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpNotLike(String value) {
            addCriterion("m_ip not like", value, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpIn(List<String> values) {
            addCriterion("m_ip in", values, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpNotIn(List<String> values) {
            addCriterion("m_ip not in", values, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpBetween(String value1, String value2) {
            addCriterion("m_ip between", value1, value2, "mIp");
            return (Criteria) this;
        }

        public Criteria andMIpNotBetween(String value1, String value2) {
            addCriterion("m_ip not between", value1, value2, "mIp");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNull() {
            addCriterion("m_time is null");
            return (Criteria) this;
        }

        public Criteria andMTimeIsNotNull() {
            addCriterion("m_time is not null");
            return (Criteria) this;
        }

        public Criteria andMTimeEqualTo(Integer value) {
            addCriterion("m_time =", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotEqualTo(Integer value) {
            addCriterion("m_time <>", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThan(Integer value) {
            addCriterion("m_time >", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_time >=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThan(Integer value) {
            addCriterion("m_time <", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeLessThanOrEqualTo(Integer value) {
            addCriterion("m_time <=", value, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeIn(List<Integer> values) {
            addCriterion("m_time in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotIn(List<Integer> values) {
            addCriterion("m_time not in", values, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeBetween(Integer value1, Integer value2) {
            addCriterion("m_time between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("m_time not between", value1, value2, "mTime");
            return (Criteria) this;
        }

        public Criteria andMStatusIsNull() {
            addCriterion("m_status is null");
            return (Criteria) this;
        }

        public Criteria andMStatusIsNotNull() {
            addCriterion("m_status is not null");
            return (Criteria) this;
        }

        public Criteria andMStatusEqualTo(Byte value) {
            addCriterion("m_status =", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotEqualTo(Byte value) {
            addCriterion("m_status <>", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusGreaterThan(Byte value) {
            addCriterion("m_status >", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("m_status >=", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLessThan(Byte value) {
            addCriterion("m_status <", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusLessThanOrEqualTo(Byte value) {
            addCriterion("m_status <=", value, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusIn(List<Byte> values) {
            addCriterion("m_status in", values, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotIn(List<Byte> values) {
            addCriterion("m_status not in", values, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusBetween(Byte value1, Byte value2) {
            addCriterion("m_status between", value1, value2, "mStatus");
            return (Criteria) this;
        }

        public Criteria andMStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("m_status not between", value1, value2, "mStatus");
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