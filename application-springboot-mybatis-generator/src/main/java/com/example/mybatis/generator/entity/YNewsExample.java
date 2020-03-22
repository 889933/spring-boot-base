package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YNewsExample() {
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

        public Criteria andNewsTitIsNull() {
            addCriterion("news_tit is null");
            return (Criteria) this;
        }

        public Criteria andNewsTitIsNotNull() {
            addCriterion("news_tit is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTitEqualTo(String value) {
            addCriterion("news_tit =", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitNotEqualTo(String value) {
            addCriterion("news_tit <>", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitGreaterThan(String value) {
            addCriterion("news_tit >", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitGreaterThanOrEqualTo(String value) {
            addCriterion("news_tit >=", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitLessThan(String value) {
            addCriterion("news_tit <", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitLessThanOrEqualTo(String value) {
            addCriterion("news_tit <=", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitLike(String value) {
            addCriterion("news_tit like", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitNotLike(String value) {
            addCriterion("news_tit not like", value, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitIn(List<String> values) {
            addCriterion("news_tit in", values, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitNotIn(List<String> values) {
            addCriterion("news_tit not in", values, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitBetween(String value1, String value2) {
            addCriterion("news_tit between", value1, value2, "newsTit");
            return (Criteria) this;
        }

        public Criteria andNewsTitNotBetween(String value1, String value2) {
            addCriterion("news_tit not between", value1, value2, "newsTit");
            return (Criteria) this;
        }

        public Criteria andTitlepicIsNull() {
            addCriterion("titlepic is null");
            return (Criteria) this;
        }

        public Criteria andTitlepicIsNotNull() {
            addCriterion("titlepic is not null");
            return (Criteria) this;
        }

        public Criteria andTitlepicEqualTo(String value) {
            addCriterion("titlepic =", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotEqualTo(String value) {
            addCriterion("titlepic <>", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicGreaterThan(String value) {
            addCriterion("titlepic >", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicGreaterThanOrEqualTo(String value) {
            addCriterion("titlepic >=", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLessThan(String value) {
            addCriterion("titlepic <", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLessThanOrEqualTo(String value) {
            addCriterion("titlepic <=", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicLike(String value) {
            addCriterion("titlepic like", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotLike(String value) {
            addCriterion("titlepic not like", value, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicIn(List<String> values) {
            addCriterion("titlepic in", values, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotIn(List<String> values) {
            addCriterion("titlepic not in", values, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicBetween(String value1, String value2) {
            addCriterion("titlepic between", value1, value2, "titlepic");
            return (Criteria) this;
        }

        public Criteria andTitlepicNotBetween(String value1, String value2) {
            addCriterion("titlepic not between", value1, value2, "titlepic");
            return (Criteria) this;
        }

        public Criteria andNewsJjIsNull() {
            addCriterion("news_jj is null");
            return (Criteria) this;
        }

        public Criteria andNewsJjIsNotNull() {
            addCriterion("news_jj is not null");
            return (Criteria) this;
        }

        public Criteria andNewsJjEqualTo(String value) {
            addCriterion("news_jj =", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjNotEqualTo(String value) {
            addCriterion("news_jj <>", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjGreaterThan(String value) {
            addCriterion("news_jj >", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjGreaterThanOrEqualTo(String value) {
            addCriterion("news_jj >=", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjLessThan(String value) {
            addCriterion("news_jj <", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjLessThanOrEqualTo(String value) {
            addCriterion("news_jj <=", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjLike(String value) {
            addCriterion("news_jj like", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjNotLike(String value) {
            addCriterion("news_jj not like", value, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjIn(List<String> values) {
            addCriterion("news_jj in", values, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjNotIn(List<String> values) {
            addCriterion("news_jj not in", values, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjBetween(String value1, String value2) {
            addCriterion("news_jj between", value1, value2, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsJjNotBetween(String value1, String value2) {
            addCriterion("news_jj not between", value1, value2, "newsJj");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNull() {
            addCriterion("news_source is null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIsNotNull() {
            addCriterion("news_source is not null");
            return (Criteria) this;
        }

        public Criteria andNewsSourceEqualTo(String value) {
            addCriterion("news_source =", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotEqualTo(String value) {
            addCriterion("news_source <>", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThan(String value) {
            addCriterion("news_source >", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceGreaterThanOrEqualTo(String value) {
            addCriterion("news_source >=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThan(String value) {
            addCriterion("news_source <", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLessThanOrEqualTo(String value) {
            addCriterion("news_source <=", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceLike(String value) {
            addCriterion("news_source like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotLike(String value) {
            addCriterion("news_source not like", value, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceIn(List<String> values) {
            addCriterion("news_source in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotIn(List<String> values) {
            addCriterion("news_source not in", values, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceBetween(String value1, String value2) {
            addCriterion("news_source between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andNewsSourceNotBetween(String value1, String value2) {
            addCriterion("news_source not between", value1, value2, "newsSource");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddIpIsNull() {
            addCriterion("add_ip is null");
            return (Criteria) this;
        }

        public Criteria andAddIpIsNotNull() {
            addCriterion("add_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAddIpEqualTo(String value) {
            addCriterion("add_ip =", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotEqualTo(String value) {
            addCriterion("add_ip <>", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpGreaterThan(String value) {
            addCriterion("add_ip >", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpGreaterThanOrEqualTo(String value) {
            addCriterion("add_ip >=", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLessThan(String value) {
            addCriterion("add_ip <", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLessThanOrEqualTo(String value) {
            addCriterion("add_ip <=", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpLike(String value) {
            addCriterion("add_ip like", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotLike(String value) {
            addCriterion("add_ip not like", value, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpIn(List<String> values) {
            addCriterion("add_ip in", values, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotIn(List<String> values) {
            addCriterion("add_ip not in", values, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpBetween(String value1, String value2) {
            addCriterion("add_ip between", value1, value2, "addIp");
            return (Criteria) this;
        }

        public Criteria andAddIpNotBetween(String value1, String value2) {
            addCriterion("add_ip not between", value1, value2, "addIp");
            return (Criteria) this;
        }

        public Criteria andNewsClassIsNull() {
            addCriterion("news_class is null");
            return (Criteria) this;
        }

        public Criteria andNewsClassIsNotNull() {
            addCriterion("news_class is not null");
            return (Criteria) this;
        }

        public Criteria andNewsClassEqualTo(String value) {
            addCriterion("news_class =", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotEqualTo(String value) {
            addCriterion("news_class <>", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassGreaterThan(String value) {
            addCriterion("news_class >", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassGreaterThanOrEqualTo(String value) {
            addCriterion("news_class >=", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassLessThan(String value) {
            addCriterion("news_class <", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassLessThanOrEqualTo(String value) {
            addCriterion("news_class <=", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassLike(String value) {
            addCriterion("news_class like", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotLike(String value) {
            addCriterion("news_class not like", value, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassIn(List<String> values) {
            addCriterion("news_class in", values, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotIn(List<String> values) {
            addCriterion("news_class not in", values, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassBetween(String value1, String value2) {
            addCriterion("news_class between", value1, value2, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewsClassNotBetween(String value1, String value2) {
            addCriterion("news_class not between", value1, value2, "newsClass");
            return (Criteria) this;
        }

        public Criteria andNewpicsIsNull() {
            addCriterion("newpics is null");
            return (Criteria) this;
        }

        public Criteria andNewpicsIsNotNull() {
            addCriterion("newpics is not null");
            return (Criteria) this;
        }

        public Criteria andNewpicsEqualTo(String value) {
            addCriterion("newpics =", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsNotEqualTo(String value) {
            addCriterion("newpics <>", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsGreaterThan(String value) {
            addCriterion("newpics >", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsGreaterThanOrEqualTo(String value) {
            addCriterion("newpics >=", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsLessThan(String value) {
            addCriterion("newpics <", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsLessThanOrEqualTo(String value) {
            addCriterion("newpics <=", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsLike(String value) {
            addCriterion("newpics like", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsNotLike(String value) {
            addCriterion("newpics not like", value, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsIn(List<String> values) {
            addCriterion("newpics in", values, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsNotIn(List<String> values) {
            addCriterion("newpics not in", values, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsBetween(String value1, String value2) {
            addCriterion("newpics between", value1, value2, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewpicsNotBetween(String value1, String value2) {
            addCriterion("newpics not between", value1, value2, "newpics");
            return (Criteria) this;
        }

        public Criteria andNewsDjsIsNull() {
            addCriterion("news_djs is null");
            return (Criteria) this;
        }

        public Criteria andNewsDjsIsNotNull() {
            addCriterion("news_djs is not null");
            return (Criteria) this;
        }

        public Criteria andNewsDjsEqualTo(Integer value) {
            addCriterion("news_djs =", value, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsNotEqualTo(Integer value) {
            addCriterion("news_djs <>", value, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsGreaterThan(Integer value) {
            addCriterion("news_djs >", value, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_djs >=", value, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsLessThan(Integer value) {
            addCriterion("news_djs <", value, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsLessThanOrEqualTo(Integer value) {
            addCriterion("news_djs <=", value, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsIn(List<Integer> values) {
            addCriterion("news_djs in", values, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsNotIn(List<Integer> values) {
            addCriterion("news_djs not in", values, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsBetween(Integer value1, Integer value2) {
            addCriterion("news_djs between", value1, value2, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andNewsDjsNotBetween(Integer value1, Integer value2) {
            addCriterion("news_djs not between", value1, value2, "newsDjs");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andShIsNull() {
            addCriterion("sh is null");
            return (Criteria) this;
        }

        public Criteria andShIsNotNull() {
            addCriterion("sh is not null");
            return (Criteria) this;
        }

        public Criteria andShEqualTo(Byte value) {
            addCriterion("sh =", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotEqualTo(Byte value) {
            addCriterion("sh <>", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShGreaterThan(Byte value) {
            addCriterion("sh >", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShGreaterThanOrEqualTo(Byte value) {
            addCriterion("sh >=", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLessThan(Byte value) {
            addCriterion("sh <", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShLessThanOrEqualTo(Byte value) {
            addCriterion("sh <=", value, "sh");
            return (Criteria) this;
        }

        public Criteria andShIn(List<Byte> values) {
            addCriterion("sh in", values, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotIn(List<Byte> values) {
            addCriterion("sh not in", values, "sh");
            return (Criteria) this;
        }

        public Criteria andShBetween(Byte value1, Byte value2) {
            addCriterion("sh between", value1, value2, "sh");
            return (Criteria) this;
        }

        public Criteria andShNotBetween(Byte value1, Byte value2) {
            addCriterion("sh not between", value1, value2, "sh");
            return (Criteria) this;
        }

        public Criteria andTuijIsNull() {
            addCriterion("tuij is null");
            return (Criteria) this;
        }

        public Criteria andTuijIsNotNull() {
            addCriterion("tuij is not null");
            return (Criteria) this;
        }

        public Criteria andTuijEqualTo(Byte value) {
            addCriterion("tuij =", value, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijNotEqualTo(Byte value) {
            addCriterion("tuij <>", value, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijGreaterThan(Byte value) {
            addCriterion("tuij >", value, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijGreaterThanOrEqualTo(Byte value) {
            addCriterion("tuij >=", value, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijLessThan(Byte value) {
            addCriterion("tuij <", value, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijLessThanOrEqualTo(Byte value) {
            addCriterion("tuij <=", value, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijIn(List<Byte> values) {
            addCriterion("tuij in", values, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijNotIn(List<Byte> values) {
            addCriterion("tuij not in", values, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijBetween(Byte value1, Byte value2) {
            addCriterion("tuij between", value1, value2, "tuij");
            return (Criteria) this;
        }

        public Criteria andTuijNotBetween(Byte value1, Byte value2) {
            addCriterion("tuij not between", value1, value2, "tuij");
            return (Criteria) this;
        }

        public Criteria andIsboldIsNull() {
            addCriterion("isbold is null");
            return (Criteria) this;
        }

        public Criteria andIsboldIsNotNull() {
            addCriterion("isbold is not null");
            return (Criteria) this;
        }

        public Criteria andIsboldEqualTo(Byte value) {
            addCriterion("isbold =", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldNotEqualTo(Byte value) {
            addCriterion("isbold <>", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldGreaterThan(Byte value) {
            addCriterion("isbold >", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldGreaterThanOrEqualTo(Byte value) {
            addCriterion("isbold >=", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldLessThan(Byte value) {
            addCriterion("isbold <", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldLessThanOrEqualTo(Byte value) {
            addCriterion("isbold <=", value, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldIn(List<Byte> values) {
            addCriterion("isbold in", values, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldNotIn(List<Byte> values) {
            addCriterion("isbold not in", values, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldBetween(Byte value1, Byte value2) {
            addCriterion("isbold between", value1, value2, "isbold");
            return (Criteria) this;
        }

        public Criteria andIsboldNotBetween(Byte value1, Byte value2) {
            addCriterion("isbold not between", value1, value2, "isbold");
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