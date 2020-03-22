package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YConfigExample() {
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

        public Criteria andIdEqualTo(Byte value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Byte value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Byte value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Byte value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Byte value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Byte value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Byte> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Byte> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Byte value1, Byte value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Byte value1, Byte value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWeblogoIsNull() {
            addCriterion("weblogo is null");
            return (Criteria) this;
        }

        public Criteria andWeblogoIsNotNull() {
            addCriterion("weblogo is not null");
            return (Criteria) this;
        }

        public Criteria andWeblogoEqualTo(String value) {
            addCriterion("weblogo =", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoNotEqualTo(String value) {
            addCriterion("weblogo <>", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoGreaterThan(String value) {
            addCriterion("weblogo >", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoGreaterThanOrEqualTo(String value) {
            addCriterion("weblogo >=", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoLessThan(String value) {
            addCriterion("weblogo <", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoLessThanOrEqualTo(String value) {
            addCriterion("weblogo <=", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoLike(String value) {
            addCriterion("weblogo like", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoNotLike(String value) {
            addCriterion("weblogo not like", value, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoIn(List<String> values) {
            addCriterion("weblogo in", values, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoNotIn(List<String> values) {
            addCriterion("weblogo not in", values, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoBetween(String value1, String value2) {
            addCriterion("weblogo between", value1, value2, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWeblogoNotBetween(String value1, String value2) {
            addCriterion("weblogo not between", value1, value2, "weblogo");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNull() {
            addCriterion("webname is null");
            return (Criteria) this;
        }

        public Criteria andWebnameIsNotNull() {
            addCriterion("webname is not null");
            return (Criteria) this;
        }

        public Criteria andWebnameEqualTo(String value) {
            addCriterion("webname =", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotEqualTo(String value) {
            addCriterion("webname <>", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThan(String value) {
            addCriterion("webname >", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameGreaterThanOrEqualTo(String value) {
            addCriterion("webname >=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThan(String value) {
            addCriterion("webname <", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLessThanOrEqualTo(String value) {
            addCriterion("webname <=", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameLike(String value) {
            addCriterion("webname like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotLike(String value) {
            addCriterion("webname not like", value, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameIn(List<String> values) {
            addCriterion("webname in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotIn(List<String> values) {
            addCriterion("webname not in", values, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameBetween(String value1, String value2) {
            addCriterion("webname between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebnameNotBetween(String value1, String value2) {
            addCriterion("webname not between", value1, value2, "webname");
            return (Criteria) this;
        }

        public Criteria andWebtitleIsNull() {
            addCriterion("webtitle is null");
            return (Criteria) this;
        }

        public Criteria andWebtitleIsNotNull() {
            addCriterion("webtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWebtitleEqualTo(String value) {
            addCriterion("webtitle =", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotEqualTo(String value) {
            addCriterion("webtitle <>", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleGreaterThan(String value) {
            addCriterion("webtitle >", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleGreaterThanOrEqualTo(String value) {
            addCriterion("webtitle >=", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLessThan(String value) {
            addCriterion("webtitle <", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLessThanOrEqualTo(String value) {
            addCriterion("webtitle <=", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleLike(String value) {
            addCriterion("webtitle like", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotLike(String value) {
            addCriterion("webtitle not like", value, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleIn(List<String> values) {
            addCriterion("webtitle in", values, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotIn(List<String> values) {
            addCriterion("webtitle not in", values, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleBetween(String value1, String value2) {
            addCriterion("webtitle between", value1, value2, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebtitleNotBetween(String value1, String value2) {
            addCriterion("webtitle not between", value1, value2, "webtitle");
            return (Criteria) this;
        }

        public Criteria andWebkeysIsNull() {
            addCriterion("webkeys is null");
            return (Criteria) this;
        }

        public Criteria andWebkeysIsNotNull() {
            addCriterion("webkeys is not null");
            return (Criteria) this;
        }

        public Criteria andWebkeysEqualTo(String value) {
            addCriterion("webkeys =", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysNotEqualTo(String value) {
            addCriterion("webkeys <>", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysGreaterThan(String value) {
            addCriterion("webkeys >", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysGreaterThanOrEqualTo(String value) {
            addCriterion("webkeys >=", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysLessThan(String value) {
            addCriterion("webkeys <", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysLessThanOrEqualTo(String value) {
            addCriterion("webkeys <=", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysLike(String value) {
            addCriterion("webkeys like", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysNotLike(String value) {
            addCriterion("webkeys not like", value, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysIn(List<String> values) {
            addCriterion("webkeys in", values, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysNotIn(List<String> values) {
            addCriterion("webkeys not in", values, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysBetween(String value1, String value2) {
            addCriterion("webkeys between", value1, value2, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebkeysNotBetween(String value1, String value2) {
            addCriterion("webkeys not between", value1, value2, "webkeys");
            return (Criteria) this;
        }

        public Criteria andWebdescIsNull() {
            addCriterion("webdesc is null");
            return (Criteria) this;
        }

        public Criteria andWebdescIsNotNull() {
            addCriterion("webdesc is not null");
            return (Criteria) this;
        }

        public Criteria andWebdescEqualTo(String value) {
            addCriterion("webdesc =", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescNotEqualTo(String value) {
            addCriterion("webdesc <>", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescGreaterThan(String value) {
            addCriterion("webdesc >", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescGreaterThanOrEqualTo(String value) {
            addCriterion("webdesc >=", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescLessThan(String value) {
            addCriterion("webdesc <", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescLessThanOrEqualTo(String value) {
            addCriterion("webdesc <=", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescLike(String value) {
            addCriterion("webdesc like", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescNotLike(String value) {
            addCriterion("webdesc not like", value, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescIn(List<String> values) {
            addCriterion("webdesc in", values, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescNotIn(List<String> values) {
            addCriterion("webdesc not in", values, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescBetween(String value1, String value2) {
            addCriterion("webdesc between", value1, value2, "webdesc");
            return (Criteria) this;
        }

        public Criteria andWebdescNotBetween(String value1, String value2) {
            addCriterion("webdesc not between", value1, value2, "webdesc");
            return (Criteria) this;
        }

        public Criteria andDredgetimeIsNull() {
            addCriterion("dredgetime is null");
            return (Criteria) this;
        }

        public Criteria andDredgetimeIsNotNull() {
            addCriterion("dredgetime is not null");
            return (Criteria) this;
        }

        public Criteria andDredgetimeEqualTo(Integer value) {
            addCriterion("dredgetime =", value, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeNotEqualTo(Integer value) {
            addCriterion("dredgetime <>", value, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeGreaterThan(Integer value) {
            addCriterion("dredgetime >", value, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dredgetime >=", value, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeLessThan(Integer value) {
            addCriterion("dredgetime <", value, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeLessThanOrEqualTo(Integer value) {
            addCriterion("dredgetime <=", value, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeIn(List<Integer> values) {
            addCriterion("dredgetime in", values, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeNotIn(List<Integer> values) {
            addCriterion("dredgetime not in", values, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeBetween(Integer value1, Integer value2) {
            addCriterion("dredgetime between", value1, value2, "dredgetime");
            return (Criteria) this;
        }

        public Criteria andDredgetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("dredgetime not between", value1, value2, "dredgetime");
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