package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YCompanyExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andClassIsNull() {
            addCriterion("class is null");
            return (Criteria) this;
        }

        public Criteria andClassIsNotNull() {
            addCriterion("class is not null");
            return (Criteria) this;
        }

        public Criteria andClassEqualTo(String value) {
            addCriterion("class =", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotEqualTo(String value) {
            addCriterion("class <>", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThan(String value) {
            addCriterion("class >", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassGreaterThanOrEqualTo(String value) {
            addCriterion("class >=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThan(String value) {
            addCriterion("class <", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLessThanOrEqualTo(String value) {
            addCriterion("class <=", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassLike(String value) {
            addCriterion("class like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotLike(String value) {
            addCriterion("class not like", value, "class");
            return (Criteria) this;
        }

        public Criteria andClassIn(List<String> values) {
            addCriterion("class in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotIn(List<String> values) {
            addCriterion("class not in", values, "class");
            return (Criteria) this;
        }

        public Criteria andClassBetween(String value1, String value2) {
            addCriterion("class between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andClassNotBetween(String value1, String value2) {
            addCriterion("class not between", value1, value2, "class");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlIsNull() {
            addCriterion("pinpaiurl is null");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlIsNotNull() {
            addCriterion("pinpaiurl is not null");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlEqualTo(String value) {
            addCriterion("pinpaiurl =", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlNotEqualTo(String value) {
            addCriterion("pinpaiurl <>", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlGreaterThan(String value) {
            addCriterion("pinpaiurl >", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlGreaterThanOrEqualTo(String value) {
            addCriterion("pinpaiurl >=", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlLessThan(String value) {
            addCriterion("pinpaiurl <", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlLessThanOrEqualTo(String value) {
            addCriterion("pinpaiurl <=", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlLike(String value) {
            addCriterion("pinpaiurl like", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlNotLike(String value) {
            addCriterion("pinpaiurl not like", value, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlIn(List<String> values) {
            addCriterion("pinpaiurl in", values, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlNotIn(List<String> values) {
            addCriterion("pinpaiurl not in", values, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlBetween(String value1, String value2) {
            addCriterion("pinpaiurl between", value1, value2, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andPinpaiurlNotBetween(String value1, String value2) {
            addCriterion("pinpaiurl not between", value1, value2, "pinpaiurl");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNull() {
            addCriterion("copyright is null");
            return (Criteria) this;
        }

        public Criteria andCopyrightIsNotNull() {
            addCriterion("copyright is not null");
            return (Criteria) this;
        }

        public Criteria andCopyrightEqualTo(String value) {
            addCriterion("copyright =", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotEqualTo(String value) {
            addCriterion("copyright <>", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThan(String value) {
            addCriterion("copyright >", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightGreaterThanOrEqualTo(String value) {
            addCriterion("copyright >=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThan(String value) {
            addCriterion("copyright <", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLessThanOrEqualTo(String value) {
            addCriterion("copyright <=", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightLike(String value) {
            addCriterion("copyright like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotLike(String value) {
            addCriterion("copyright not like", value, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightIn(List<String> values) {
            addCriterion("copyright in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotIn(List<String> values) {
            addCriterion("copyright not in", values, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightBetween(String value1, String value2) {
            addCriterion("copyright between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andCopyrightNotBetween(String value1, String value2) {
            addCriterion("copyright not between", value1, value2, "copyright");
            return (Criteria) this;
        }

        public Criteria andGspicIsNull() {
            addCriterion("gspic is null");
            return (Criteria) this;
        }

        public Criteria andGspicIsNotNull() {
            addCriterion("gspic is not null");
            return (Criteria) this;
        }

        public Criteria andGspicEqualTo(String value) {
            addCriterion("gspic =", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicNotEqualTo(String value) {
            addCriterion("gspic <>", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicGreaterThan(String value) {
            addCriterion("gspic >", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicGreaterThanOrEqualTo(String value) {
            addCriterion("gspic >=", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicLessThan(String value) {
            addCriterion("gspic <", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicLessThanOrEqualTo(String value) {
            addCriterion("gspic <=", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicLike(String value) {
            addCriterion("gspic like", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicNotLike(String value) {
            addCriterion("gspic not like", value, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicIn(List<String> values) {
            addCriterion("gspic in", values, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicNotIn(List<String> values) {
            addCriterion("gspic not in", values, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicBetween(String value1, String value2) {
            addCriterion("gspic between", value1, value2, "gspic");
            return (Criteria) this;
        }

        public Criteria andGspicNotBetween(String value1, String value2) {
            addCriterion("gspic not between", value1, value2, "gspic");
            return (Criteria) this;
        }

        public Criteria andYgpicIsNull() {
            addCriterion("ygpic is null");
            return (Criteria) this;
        }

        public Criteria andYgpicIsNotNull() {
            addCriterion("ygpic is not null");
            return (Criteria) this;
        }

        public Criteria andYgpicEqualTo(String value) {
            addCriterion("ygpic =", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicNotEqualTo(String value) {
            addCriterion("ygpic <>", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicGreaterThan(String value) {
            addCriterion("ygpic >", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicGreaterThanOrEqualTo(String value) {
            addCriterion("ygpic >=", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicLessThan(String value) {
            addCriterion("ygpic <", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicLessThanOrEqualTo(String value) {
            addCriterion("ygpic <=", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicLike(String value) {
            addCriterion("ygpic like", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicNotLike(String value) {
            addCriterion("ygpic not like", value, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicIn(List<String> values) {
            addCriterion("ygpic in", values, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicNotIn(List<String> values) {
            addCriterion("ygpic not in", values, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicBetween(String value1, String value2) {
            addCriterion("ygpic between", value1, value2, "ygpic");
            return (Criteria) this;
        }

        public Criteria andYgpicNotBetween(String value1, String value2) {
            addCriterion("ygpic not between", value1, value2, "ygpic");
            return (Criteria) this;
        }

        public Criteria andHonourIsNull() {
            addCriterion("honour is null");
            return (Criteria) this;
        }

        public Criteria andHonourIsNotNull() {
            addCriterion("honour is not null");
            return (Criteria) this;
        }

        public Criteria andHonourEqualTo(String value) {
            addCriterion("honour =", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourNotEqualTo(String value) {
            addCriterion("honour <>", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourGreaterThan(String value) {
            addCriterion("honour >", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourGreaterThanOrEqualTo(String value) {
            addCriterion("honour >=", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourLessThan(String value) {
            addCriterion("honour <", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourLessThanOrEqualTo(String value) {
            addCriterion("honour <=", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourLike(String value) {
            addCriterion("honour like", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourNotLike(String value) {
            addCriterion("honour not like", value, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourIn(List<String> values) {
            addCriterion("honour in", values, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourNotIn(List<String> values) {
            addCriterion("honour not in", values, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourBetween(String value1, String value2) {
            addCriterion("honour between", value1, value2, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourNotBetween(String value1, String value2) {
            addCriterion("honour not between", value1, value2, "honour");
            return (Criteria) this;
        }

        public Criteria andHonourTitleIsNull() {
            addCriterion("honour_title is null");
            return (Criteria) this;
        }

        public Criteria andHonourTitleIsNotNull() {
            addCriterion("honour_title is not null");
            return (Criteria) this;
        }

        public Criteria andHonourTitleEqualTo(String value) {
            addCriterion("honour_title =", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleNotEqualTo(String value) {
            addCriterion("honour_title <>", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleGreaterThan(String value) {
            addCriterion("honour_title >", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleGreaterThanOrEqualTo(String value) {
            addCriterion("honour_title >=", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleLessThan(String value) {
            addCriterion("honour_title <", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleLessThanOrEqualTo(String value) {
            addCriterion("honour_title <=", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleLike(String value) {
            addCriterion("honour_title like", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleNotLike(String value) {
            addCriterion("honour_title not like", value, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleIn(List<String> values) {
            addCriterion("honour_title in", values, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleNotIn(List<String> values) {
            addCriterion("honour_title not in", values, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleBetween(String value1, String value2) {
            addCriterion("honour_title between", value1, value2, "honourTitle");
            return (Criteria) this;
        }

        public Criteria andHonourTitleNotBetween(String value1, String value2) {
            addCriterion("honour_title not between", value1, value2, "honourTitle");
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