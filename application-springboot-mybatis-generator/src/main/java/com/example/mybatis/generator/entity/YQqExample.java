package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YQqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YQqExample() {
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

        public Criteria andKf1IsNull() {
            addCriterion("kf1 is null");
            return (Criteria) this;
        }

        public Criteria andKf1IsNotNull() {
            addCriterion("kf1 is not null");
            return (Criteria) this;
        }

        public Criteria andKf1EqualTo(String value) {
            addCriterion("kf1 =", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1NotEqualTo(String value) {
            addCriterion("kf1 <>", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1GreaterThan(String value) {
            addCriterion("kf1 >", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1GreaterThanOrEqualTo(String value) {
            addCriterion("kf1 >=", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1LessThan(String value) {
            addCriterion("kf1 <", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1LessThanOrEqualTo(String value) {
            addCriterion("kf1 <=", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1Like(String value) {
            addCriterion("kf1 like", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1NotLike(String value) {
            addCriterion("kf1 not like", value, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1In(List<String> values) {
            addCriterion("kf1 in", values, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1NotIn(List<String> values) {
            addCriterion("kf1 not in", values, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1Between(String value1, String value2) {
            addCriterion("kf1 between", value1, value2, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf1NotBetween(String value1, String value2) {
            addCriterion("kf1 not between", value1, value2, "kf1");
            return (Criteria) this;
        }

        public Criteria andKf11IsNull() {
            addCriterion("kf11 is null");
            return (Criteria) this;
        }

        public Criteria andKf11IsNotNull() {
            addCriterion("kf11 is not null");
            return (Criteria) this;
        }

        public Criteria andKf11EqualTo(String value) {
            addCriterion("kf11 =", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11NotEqualTo(String value) {
            addCriterion("kf11 <>", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11GreaterThan(String value) {
            addCriterion("kf11 >", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11GreaterThanOrEqualTo(String value) {
            addCriterion("kf11 >=", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11LessThan(String value) {
            addCriterion("kf11 <", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11LessThanOrEqualTo(String value) {
            addCriterion("kf11 <=", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11Like(String value) {
            addCriterion("kf11 like", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11NotLike(String value) {
            addCriterion("kf11 not like", value, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11In(List<String> values) {
            addCriterion("kf11 in", values, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11NotIn(List<String> values) {
            addCriterion("kf11 not in", values, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11Between(String value1, String value2) {
            addCriterion("kf11 between", value1, value2, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf11NotBetween(String value1, String value2) {
            addCriterion("kf11 not between", value1, value2, "kf11");
            return (Criteria) this;
        }

        public Criteria andKf2IsNull() {
            addCriterion("kf2 is null");
            return (Criteria) this;
        }

        public Criteria andKf2IsNotNull() {
            addCriterion("kf2 is not null");
            return (Criteria) this;
        }

        public Criteria andKf2EqualTo(String value) {
            addCriterion("kf2 =", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2NotEqualTo(String value) {
            addCriterion("kf2 <>", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2GreaterThan(String value) {
            addCriterion("kf2 >", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2GreaterThanOrEqualTo(String value) {
            addCriterion("kf2 >=", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2LessThan(String value) {
            addCriterion("kf2 <", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2LessThanOrEqualTo(String value) {
            addCriterion("kf2 <=", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2Like(String value) {
            addCriterion("kf2 like", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2NotLike(String value) {
            addCriterion("kf2 not like", value, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2In(List<String> values) {
            addCriterion("kf2 in", values, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2NotIn(List<String> values) {
            addCriterion("kf2 not in", values, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2Between(String value1, String value2) {
            addCriterion("kf2 between", value1, value2, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf2NotBetween(String value1, String value2) {
            addCriterion("kf2 not between", value1, value2, "kf2");
            return (Criteria) this;
        }

        public Criteria andKf22IsNull() {
            addCriterion("kf22 is null");
            return (Criteria) this;
        }

        public Criteria andKf22IsNotNull() {
            addCriterion("kf22 is not null");
            return (Criteria) this;
        }

        public Criteria andKf22EqualTo(String value) {
            addCriterion("kf22 =", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22NotEqualTo(String value) {
            addCriterion("kf22 <>", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22GreaterThan(String value) {
            addCriterion("kf22 >", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22GreaterThanOrEqualTo(String value) {
            addCriterion("kf22 >=", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22LessThan(String value) {
            addCriterion("kf22 <", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22LessThanOrEqualTo(String value) {
            addCriterion("kf22 <=", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22Like(String value) {
            addCriterion("kf22 like", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22NotLike(String value) {
            addCriterion("kf22 not like", value, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22In(List<String> values) {
            addCriterion("kf22 in", values, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22NotIn(List<String> values) {
            addCriterion("kf22 not in", values, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22Between(String value1, String value2) {
            addCriterion("kf22 between", value1, value2, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf22NotBetween(String value1, String value2) {
            addCriterion("kf22 not between", value1, value2, "kf22");
            return (Criteria) this;
        }

        public Criteria andKf3IsNull() {
            addCriterion("kf3 is null");
            return (Criteria) this;
        }

        public Criteria andKf3IsNotNull() {
            addCriterion("kf3 is not null");
            return (Criteria) this;
        }

        public Criteria andKf3EqualTo(String value) {
            addCriterion("kf3 =", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3NotEqualTo(String value) {
            addCriterion("kf3 <>", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3GreaterThan(String value) {
            addCriterion("kf3 >", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3GreaterThanOrEqualTo(String value) {
            addCriterion("kf3 >=", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3LessThan(String value) {
            addCriterion("kf3 <", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3LessThanOrEqualTo(String value) {
            addCriterion("kf3 <=", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3Like(String value) {
            addCriterion("kf3 like", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3NotLike(String value) {
            addCriterion("kf3 not like", value, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3In(List<String> values) {
            addCriterion("kf3 in", values, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3NotIn(List<String> values) {
            addCriterion("kf3 not in", values, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3Between(String value1, String value2) {
            addCriterion("kf3 between", value1, value2, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf3NotBetween(String value1, String value2) {
            addCriterion("kf3 not between", value1, value2, "kf3");
            return (Criteria) this;
        }

        public Criteria andKf33IsNull() {
            addCriterion("kf33 is null");
            return (Criteria) this;
        }

        public Criteria andKf33IsNotNull() {
            addCriterion("kf33 is not null");
            return (Criteria) this;
        }

        public Criteria andKf33EqualTo(String value) {
            addCriterion("kf33 =", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33NotEqualTo(String value) {
            addCriterion("kf33 <>", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33GreaterThan(String value) {
            addCriterion("kf33 >", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33GreaterThanOrEqualTo(String value) {
            addCriterion("kf33 >=", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33LessThan(String value) {
            addCriterion("kf33 <", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33LessThanOrEqualTo(String value) {
            addCriterion("kf33 <=", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33Like(String value) {
            addCriterion("kf33 like", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33NotLike(String value) {
            addCriterion("kf33 not like", value, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33In(List<String> values) {
            addCriterion("kf33 in", values, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33NotIn(List<String> values) {
            addCriterion("kf33 not in", values, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33Between(String value1, String value2) {
            addCriterion("kf33 between", value1, value2, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf33NotBetween(String value1, String value2) {
            addCriterion("kf33 not between", value1, value2, "kf33");
            return (Criteria) this;
        }

        public Criteria andKf4IsNull() {
            addCriterion("kf4 is null");
            return (Criteria) this;
        }

        public Criteria andKf4IsNotNull() {
            addCriterion("kf4 is not null");
            return (Criteria) this;
        }

        public Criteria andKf4EqualTo(String value) {
            addCriterion("kf4 =", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4NotEqualTo(String value) {
            addCriterion("kf4 <>", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4GreaterThan(String value) {
            addCriterion("kf4 >", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4GreaterThanOrEqualTo(String value) {
            addCriterion("kf4 >=", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4LessThan(String value) {
            addCriterion("kf4 <", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4LessThanOrEqualTo(String value) {
            addCriterion("kf4 <=", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4Like(String value) {
            addCriterion("kf4 like", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4NotLike(String value) {
            addCriterion("kf4 not like", value, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4In(List<String> values) {
            addCriterion("kf4 in", values, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4NotIn(List<String> values) {
            addCriterion("kf4 not in", values, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4Between(String value1, String value2) {
            addCriterion("kf4 between", value1, value2, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf4NotBetween(String value1, String value2) {
            addCriterion("kf4 not between", value1, value2, "kf4");
            return (Criteria) this;
        }

        public Criteria andKf44IsNull() {
            addCriterion("kf44 is null");
            return (Criteria) this;
        }

        public Criteria andKf44IsNotNull() {
            addCriterion("kf44 is not null");
            return (Criteria) this;
        }

        public Criteria andKf44EqualTo(String value) {
            addCriterion("kf44 =", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44NotEqualTo(String value) {
            addCriterion("kf44 <>", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44GreaterThan(String value) {
            addCriterion("kf44 >", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44GreaterThanOrEqualTo(String value) {
            addCriterion("kf44 >=", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44LessThan(String value) {
            addCriterion("kf44 <", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44LessThanOrEqualTo(String value) {
            addCriterion("kf44 <=", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44Like(String value) {
            addCriterion("kf44 like", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44NotLike(String value) {
            addCriterion("kf44 not like", value, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44In(List<String> values) {
            addCriterion("kf44 in", values, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44NotIn(List<String> values) {
            addCriterion("kf44 not in", values, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44Between(String value1, String value2) {
            addCriterion("kf44 between", value1, value2, "kf44");
            return (Criteria) this;
        }

        public Criteria andKf44NotBetween(String value1, String value2) {
            addCriterion("kf44 not between", value1, value2, "kf44");
            return (Criteria) this;
        }

        public Criteria andTs1IsNull() {
            addCriterion("ts1 is null");
            return (Criteria) this;
        }

        public Criteria andTs1IsNotNull() {
            addCriterion("ts1 is not null");
            return (Criteria) this;
        }

        public Criteria andTs1EqualTo(String value) {
            addCriterion("ts1 =", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1NotEqualTo(String value) {
            addCriterion("ts1 <>", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1GreaterThan(String value) {
            addCriterion("ts1 >", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1GreaterThanOrEqualTo(String value) {
            addCriterion("ts1 >=", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1LessThan(String value) {
            addCriterion("ts1 <", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1LessThanOrEqualTo(String value) {
            addCriterion("ts1 <=", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1Like(String value) {
            addCriterion("ts1 like", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1NotLike(String value) {
            addCriterion("ts1 not like", value, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1In(List<String> values) {
            addCriterion("ts1 in", values, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1NotIn(List<String> values) {
            addCriterion("ts1 not in", values, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1Between(String value1, String value2) {
            addCriterion("ts1 between", value1, value2, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs1NotBetween(String value1, String value2) {
            addCriterion("ts1 not between", value1, value2, "ts1");
            return (Criteria) this;
        }

        public Criteria andTs11IsNull() {
            addCriterion("ts11 is null");
            return (Criteria) this;
        }

        public Criteria andTs11IsNotNull() {
            addCriterion("ts11 is not null");
            return (Criteria) this;
        }

        public Criteria andTs11EqualTo(String value) {
            addCriterion("ts11 =", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11NotEqualTo(String value) {
            addCriterion("ts11 <>", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11GreaterThan(String value) {
            addCriterion("ts11 >", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11GreaterThanOrEqualTo(String value) {
            addCriterion("ts11 >=", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11LessThan(String value) {
            addCriterion("ts11 <", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11LessThanOrEqualTo(String value) {
            addCriterion("ts11 <=", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11Like(String value) {
            addCriterion("ts11 like", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11NotLike(String value) {
            addCriterion("ts11 not like", value, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11In(List<String> values) {
            addCriterion("ts11 in", values, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11NotIn(List<String> values) {
            addCriterion("ts11 not in", values, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11Between(String value1, String value2) {
            addCriterion("ts11 between", value1, value2, "ts11");
            return (Criteria) this;
        }

        public Criteria andTs11NotBetween(String value1, String value2) {
            addCriterion("ts11 not between", value1, value2, "ts11");
            return (Criteria) this;
        }

        public Criteria andJy1IsNull() {
            addCriterion("jy1 is null");
            return (Criteria) this;
        }

        public Criteria andJy1IsNotNull() {
            addCriterion("jy1 is not null");
            return (Criteria) this;
        }

        public Criteria andJy1EqualTo(String value) {
            addCriterion("jy1 =", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1NotEqualTo(String value) {
            addCriterion("jy1 <>", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1GreaterThan(String value) {
            addCriterion("jy1 >", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1GreaterThanOrEqualTo(String value) {
            addCriterion("jy1 >=", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1LessThan(String value) {
            addCriterion("jy1 <", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1LessThanOrEqualTo(String value) {
            addCriterion("jy1 <=", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1Like(String value) {
            addCriterion("jy1 like", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1NotLike(String value) {
            addCriterion("jy1 not like", value, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1In(List<String> values) {
            addCriterion("jy1 in", values, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1NotIn(List<String> values) {
            addCriterion("jy1 not in", values, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1Between(String value1, String value2) {
            addCriterion("jy1 between", value1, value2, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy1NotBetween(String value1, String value2) {
            addCriterion("jy1 not between", value1, value2, "jy1");
            return (Criteria) this;
        }

        public Criteria andJy11IsNull() {
            addCriterion("jy11 is null");
            return (Criteria) this;
        }

        public Criteria andJy11IsNotNull() {
            addCriterion("jy11 is not null");
            return (Criteria) this;
        }

        public Criteria andJy11EqualTo(String value) {
            addCriterion("jy11 =", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11NotEqualTo(String value) {
            addCriterion("jy11 <>", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11GreaterThan(String value) {
            addCriterion("jy11 >", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11GreaterThanOrEqualTo(String value) {
            addCriterion("jy11 >=", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11LessThan(String value) {
            addCriterion("jy11 <", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11LessThanOrEqualTo(String value) {
            addCriterion("jy11 <=", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11Like(String value) {
            addCriterion("jy11 like", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11NotLike(String value) {
            addCriterion("jy11 not like", value, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11In(List<String> values) {
            addCriterion("jy11 in", values, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11NotIn(List<String> values) {
            addCriterion("jy11 not in", values, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11Between(String value1, String value2) {
            addCriterion("jy11 between", value1, value2, "jy11");
            return (Criteria) this;
        }

        public Criteria andJy11NotBetween(String value1, String value2) {
            addCriterion("jy11 not between", value1, value2, "jy11");
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