package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YAdvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YAdvExample() {
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

        public Criteria andIdEqualTo(Short value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdvNameIsNull() {
            addCriterion("adv_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvNameIsNotNull() {
            addCriterion("adv_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvNameEqualTo(String value) {
            addCriterion("adv_name =", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameNotEqualTo(String value) {
            addCriterion("adv_name <>", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameGreaterThan(String value) {
            addCriterion("adv_name >", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameGreaterThanOrEqualTo(String value) {
            addCriterion("adv_name >=", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameLessThan(String value) {
            addCriterion("adv_name <", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameLessThanOrEqualTo(String value) {
            addCriterion("adv_name <=", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameLike(String value) {
            addCriterion("adv_name like", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameNotLike(String value) {
            addCriterion("adv_name not like", value, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameIn(List<String> values) {
            addCriterion("adv_name in", values, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameNotIn(List<String> values) {
            addCriterion("adv_name not in", values, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameBetween(String value1, String value2) {
            addCriterion("adv_name between", value1, value2, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvNameNotBetween(String value1, String value2) {
            addCriterion("adv_name not between", value1, value2, "advName");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIsNull() {
            addCriterion("adv_title is null");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIsNotNull() {
            addCriterion("adv_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTitleEqualTo(String value) {
            addCriterion("adv_title =", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotEqualTo(String value) {
            addCriterion("adv_title <>", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleGreaterThan(String value) {
            addCriterion("adv_title >", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleGreaterThanOrEqualTo(String value) {
            addCriterion("adv_title >=", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLessThan(String value) {
            addCriterion("adv_title <", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLessThanOrEqualTo(String value) {
            addCriterion("adv_title <=", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleLike(String value) {
            addCriterion("adv_title like", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotLike(String value) {
            addCriterion("adv_title not like", value, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleIn(List<String> values) {
            addCriterion("adv_title in", values, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotIn(List<String> values) {
            addCriterion("adv_title not in", values, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleBetween(String value1, String value2) {
            addCriterion("adv_title between", value1, value2, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvTitleNotBetween(String value1, String value2) {
            addCriterion("adv_title not between", value1, value2, "advTitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleIsNull() {
            addCriterion("adv_ftitle is null");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleIsNotNull() {
            addCriterion("adv_ftitle is not null");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleEqualTo(String value) {
            addCriterion("adv_ftitle =", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleNotEqualTo(String value) {
            addCriterion("adv_ftitle <>", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleGreaterThan(String value) {
            addCriterion("adv_ftitle >", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleGreaterThanOrEqualTo(String value) {
            addCriterion("adv_ftitle >=", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleLessThan(String value) {
            addCriterion("adv_ftitle <", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleLessThanOrEqualTo(String value) {
            addCriterion("adv_ftitle <=", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleLike(String value) {
            addCriterion("adv_ftitle like", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleNotLike(String value) {
            addCriterion("adv_ftitle not like", value, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleIn(List<String> values) {
            addCriterion("adv_ftitle in", values, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleNotIn(List<String> values) {
            addCriterion("adv_ftitle not in", values, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleBetween(String value1, String value2) {
            addCriterion("adv_ftitle between", value1, value2, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvFtitleNotBetween(String value1, String value2) {
            addCriterion("adv_ftitle not between", value1, value2, "advFtitle");
            return (Criteria) this;
        }

        public Criteria andAdvPicIsNull() {
            addCriterion("adv_pic is null");
            return (Criteria) this;
        }

        public Criteria andAdvPicIsNotNull() {
            addCriterion("adv_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAdvPicEqualTo(String value) {
            addCriterion("adv_pic =", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotEqualTo(String value) {
            addCriterion("adv_pic <>", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicGreaterThan(String value) {
            addCriterion("adv_pic >", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicGreaterThanOrEqualTo(String value) {
            addCriterion("adv_pic >=", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicLessThan(String value) {
            addCriterion("adv_pic <", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicLessThanOrEqualTo(String value) {
            addCriterion("adv_pic <=", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicLike(String value) {
            addCriterion("adv_pic like", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotLike(String value) {
            addCriterion("adv_pic not like", value, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicIn(List<String> values) {
            addCriterion("adv_pic in", values, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotIn(List<String> values) {
            addCriterion("adv_pic not in", values, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicBetween(String value1, String value2) {
            addCriterion("adv_pic between", value1, value2, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvPicNotBetween(String value1, String value2) {
            addCriterion("adv_pic not between", value1, value2, "advPic");
            return (Criteria) this;
        }

        public Criteria andAdvDescIsNull() {
            addCriterion("adv_desc is null");
            return (Criteria) this;
        }

        public Criteria andAdvDescIsNotNull() {
            addCriterion("adv_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAdvDescEqualTo(String value) {
            addCriterion("adv_desc =", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescNotEqualTo(String value) {
            addCriterion("adv_desc <>", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescGreaterThan(String value) {
            addCriterion("adv_desc >", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescGreaterThanOrEqualTo(String value) {
            addCriterion("adv_desc >=", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescLessThan(String value) {
            addCriterion("adv_desc <", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescLessThanOrEqualTo(String value) {
            addCriterion("adv_desc <=", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescLike(String value) {
            addCriterion("adv_desc like", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescNotLike(String value) {
            addCriterion("adv_desc not like", value, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescIn(List<String> values) {
            addCriterion("adv_desc in", values, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescNotIn(List<String> values) {
            addCriterion("adv_desc not in", values, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescBetween(String value1, String value2) {
            addCriterion("adv_desc between", value1, value2, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvDescNotBetween(String value1, String value2) {
            addCriterion("adv_desc not between", value1, value2, "advDesc");
            return (Criteria) this;
        }

        public Criteria andAdvUrlIsNull() {
            addCriterion("adv_url is null");
            return (Criteria) this;
        }

        public Criteria andAdvUrlIsNotNull() {
            addCriterion("adv_url is not null");
            return (Criteria) this;
        }

        public Criteria andAdvUrlEqualTo(String value) {
            addCriterion("adv_url =", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotEqualTo(String value) {
            addCriterion("adv_url <>", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlGreaterThan(String value) {
            addCriterion("adv_url >", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlGreaterThanOrEqualTo(String value) {
            addCriterion("adv_url >=", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlLessThan(String value) {
            addCriterion("adv_url <", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlLessThanOrEqualTo(String value) {
            addCriterion("adv_url <=", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlLike(String value) {
            addCriterion("adv_url like", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotLike(String value) {
            addCriterion("adv_url not like", value, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlIn(List<String> values) {
            addCriterion("adv_url in", values, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotIn(List<String> values) {
            addCriterion("adv_url not in", values, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlBetween(String value1, String value2) {
            addCriterion("adv_url between", value1, value2, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvUrlNotBetween(String value1, String value2) {
            addCriterion("adv_url not between", value1, value2, "advUrl");
            return (Criteria) this;
        }

        public Criteria andAdvTimeIsNull() {
            addCriterion("adv_time is null");
            return (Criteria) this;
        }

        public Criteria andAdvTimeIsNotNull() {
            addCriterion("adv_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdvTimeEqualTo(Integer value) {
            addCriterion("adv_time =", value, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeNotEqualTo(Integer value) {
            addCriterion("adv_time <>", value, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeGreaterThan(Integer value) {
            addCriterion("adv_time >", value, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_time >=", value, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeLessThan(Integer value) {
            addCriterion("adv_time <", value, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeLessThanOrEqualTo(Integer value) {
            addCriterion("adv_time <=", value, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeIn(List<Integer> values) {
            addCriterion("adv_time in", values, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeNotIn(List<Integer> values) {
            addCriterion("adv_time not in", values, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeBetween(Integer value1, Integer value2) {
            addCriterion("adv_time between", value1, value2, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_time not between", value1, value2, "advTime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeIsNull() {
            addCriterion("adv_overtime is null");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeIsNotNull() {
            addCriterion("adv_overtime is not null");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeEqualTo(Integer value) {
            addCriterion("adv_overtime =", value, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeNotEqualTo(Integer value) {
            addCriterion("adv_overtime <>", value, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeGreaterThan(Integer value) {
            addCriterion("adv_overtime >", value, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("adv_overtime >=", value, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeLessThan(Integer value) {
            addCriterion("adv_overtime <", value, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("adv_overtime <=", value, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeIn(List<Integer> values) {
            addCriterion("adv_overtime in", values, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeNotIn(List<Integer> values) {
            addCriterion("adv_overtime not in", values, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("adv_overtime between", value1, value2, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("adv_overtime not between", value1, value2, "advOvertime");
            return (Criteria) this;
        }

        public Criteria andAdvPriceIsNull() {
            addCriterion("adv_price is null");
            return (Criteria) this;
        }

        public Criteria andAdvPriceIsNotNull() {
            addCriterion("adv_price is not null");
            return (Criteria) this;
        }

        public Criteria andAdvPriceEqualTo(Float value) {
            addCriterion("adv_price =", value, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceNotEqualTo(Float value) {
            addCriterion("adv_price <>", value, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceGreaterThan(Float value) {
            addCriterion("adv_price >", value, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("adv_price >=", value, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceLessThan(Float value) {
            addCriterion("adv_price <", value, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceLessThanOrEqualTo(Float value) {
            addCriterion("adv_price <=", value, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceIn(List<Float> values) {
            addCriterion("adv_price in", values, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceNotIn(List<Float> values) {
            addCriterion("adv_price not in", values, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceBetween(Float value1, Float value2) {
            addCriterion("adv_price between", value1, value2, "advPrice");
            return (Criteria) this;
        }

        public Criteria andAdvPriceNotBetween(Float value1, Float value2) {
            addCriterion("adv_price not between", value1, value2, "advPrice");
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