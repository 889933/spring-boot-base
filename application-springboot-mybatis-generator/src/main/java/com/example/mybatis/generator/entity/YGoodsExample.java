package com.example.mybatis.generator.entity;

import java.util.ArrayList;
import java.util.List;

public class YGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YGoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Float value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Float value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Float value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Float value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Float value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Float> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Float> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Float value1, Float value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Float value1, Float value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(String value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(String value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(String value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(String value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(String value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(String value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLike(String value) {
            addCriterion("goods_num like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotLike(String value) {
            addCriterion("goods_num not like", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<String> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<String> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(String value1, String value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(String value1, String value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNull() {
            addCriterion("shop_price is null");
            return (Criteria) this;
        }

        public Criteria andShopPriceIsNotNull() {
            addCriterion("shop_price is not null");
            return (Criteria) this;
        }

        public Criteria andShopPriceEqualTo(Float value) {
            addCriterion("shop_price =", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotEqualTo(Float value) {
            addCriterion("shop_price <>", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThan(Float value) {
            addCriterion("shop_price >", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("shop_price >=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThan(Float value) {
            addCriterion("shop_price <", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceLessThanOrEqualTo(Float value) {
            addCriterion("shop_price <=", value, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceIn(List<Float> values) {
            addCriterion("shop_price in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotIn(List<Float> values) {
            addCriterion("shop_price not in", values, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceBetween(Float value1, Float value2) {
            addCriterion("shop_price between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andShopPriceNotBetween(Float value1, Float value2) {
            addCriterion("shop_price not between", value1, value2, "shopPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsDzIsNull() {
            addCriterion("goods_dz is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDzIsNotNull() {
            addCriterion("goods_dz is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDzEqualTo(String value) {
            addCriterion("goods_dz =", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzNotEqualTo(String value) {
            addCriterion("goods_dz <>", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzGreaterThan(String value) {
            addCriterion("goods_dz >", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzGreaterThanOrEqualTo(String value) {
            addCriterion("goods_dz >=", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzLessThan(String value) {
            addCriterion("goods_dz <", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzLessThanOrEqualTo(String value) {
            addCriterion("goods_dz <=", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzLike(String value) {
            addCriterion("goods_dz like", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzNotLike(String value) {
            addCriterion("goods_dz not like", value, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzIn(List<String> values) {
            addCriterion("goods_dz in", values, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzNotIn(List<String> values) {
            addCriterion("goods_dz not in", values, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzBetween(String value1, String value2) {
            addCriterion("goods_dz between", value1, value2, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzNotBetween(String value1, String value2) {
            addCriterion("goods_dz not between", value1, value2, "goodsDz");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhIsNull() {
            addCriterion("goods_dzh is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhIsNotNull() {
            addCriterion("goods_dzh is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhEqualTo(Float value) {
            addCriterion("goods_dzh =", value, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhNotEqualTo(Float value) {
            addCriterion("goods_dzh <>", value, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhGreaterThan(Float value) {
            addCriterion("goods_dzh >", value, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhGreaterThanOrEqualTo(Float value) {
            addCriterion("goods_dzh >=", value, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhLessThan(Float value) {
            addCriterion("goods_dzh <", value, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhLessThanOrEqualTo(Float value) {
            addCriterion("goods_dzh <=", value, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhIn(List<Float> values) {
            addCriterion("goods_dzh in", values, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhNotIn(List<Float> values) {
            addCriterion("goods_dzh not in", values, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhBetween(Float value1, Float value2) {
            addCriterion("goods_dzh between", value1, value2, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsDzhNotBetween(Float value1, Float value2) {
            addCriterion("goods_dzh not between", value1, value2, "goodsDzh");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIsNull() {
            addCriterion("goods_class is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIsNotNull() {
            addCriterion("goods_class is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClassEqualTo(String value) {
            addCriterion("goods_class =", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassNotEqualTo(String value) {
            addCriterion("goods_class <>", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassGreaterThan(String value) {
            addCriterion("goods_class >", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassGreaterThanOrEqualTo(String value) {
            addCriterion("goods_class >=", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassLessThan(String value) {
            addCriterion("goods_class <", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassLessThanOrEqualTo(String value) {
            addCriterion("goods_class <=", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassLike(String value) {
            addCriterion("goods_class like", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassNotLike(String value) {
            addCriterion("goods_class not like", value, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassIn(List<String> values) {
            addCriterion("goods_class in", values, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassNotIn(List<String> values) {
            addCriterion("goods_class not in", values, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassBetween(String value1, String value2) {
            addCriterion("goods_class between", value1, value2, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsClassNotBetween(String value1, String value2) {
            addCriterion("goods_class not between", value1, value2, "goodsClass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassIsNull() {
            addCriterion("goods_eclass is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassIsNotNull() {
            addCriterion("goods_eclass is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassEqualTo(String value) {
            addCriterion("goods_eclass =", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassNotEqualTo(String value) {
            addCriterion("goods_eclass <>", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassGreaterThan(String value) {
            addCriterion("goods_eclass >", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassGreaterThanOrEqualTo(String value) {
            addCriterion("goods_eclass >=", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassLessThan(String value) {
            addCriterion("goods_eclass <", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassLessThanOrEqualTo(String value) {
            addCriterion("goods_eclass <=", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassLike(String value) {
            addCriterion("goods_eclass like", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassNotLike(String value) {
            addCriterion("goods_eclass not like", value, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassIn(List<String> values) {
            addCriterion("goods_eclass in", values, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassNotIn(List<String> values) {
            addCriterion("goods_eclass not in", values, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassBetween(String value1, String value2) {
            addCriterion("goods_eclass between", value1, value2, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsEclassNotBetween(String value1, String value2) {
            addCriterion("goods_eclass not between", value1, value2, "goodsEclass");
            return (Criteria) this;
        }

        public Criteria andGoodsXhIsNull() {
            addCriterion("goods_xh is null");
            return (Criteria) this;
        }

        public Criteria andGoodsXhIsNotNull() {
            addCriterion("goods_xh is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsXhEqualTo(String value) {
            addCriterion("goods_xh =", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhNotEqualTo(String value) {
            addCriterion("goods_xh <>", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhGreaterThan(String value) {
            addCriterion("goods_xh >", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhGreaterThanOrEqualTo(String value) {
            addCriterion("goods_xh >=", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhLessThan(String value) {
            addCriterion("goods_xh <", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhLessThanOrEqualTo(String value) {
            addCriterion("goods_xh <=", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhLike(String value) {
            addCriterion("goods_xh like", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhNotLike(String value) {
            addCriterion("goods_xh not like", value, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhIn(List<String> values) {
            addCriterion("goods_xh in", values, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhNotIn(List<String> values) {
            addCriterion("goods_xh not in", values, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhBetween(String value1, String value2) {
            addCriterion("goods_xh between", value1, value2, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsXhNotBetween(String value1, String value2) {
            addCriterion("goods_xh not between", value1, value2, "goodsXh");
            return (Criteria) this;
        }

        public Criteria andGoodsCzIsNull() {
            addCriterion("goods_cz is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCzIsNotNull() {
            addCriterion("goods_cz is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCzEqualTo(String value) {
            addCriterion("goods_cz =", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzNotEqualTo(String value) {
            addCriterion("goods_cz <>", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzGreaterThan(String value) {
            addCriterion("goods_cz >", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzGreaterThanOrEqualTo(String value) {
            addCriterion("goods_cz >=", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzLessThan(String value) {
            addCriterion("goods_cz <", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzLessThanOrEqualTo(String value) {
            addCriterion("goods_cz <=", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzLike(String value) {
            addCriterion("goods_cz like", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzNotLike(String value) {
            addCriterion("goods_cz not like", value, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzIn(List<String> values) {
            addCriterion("goods_cz in", values, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzNotIn(List<String> values) {
            addCriterion("goods_cz not in", values, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzBetween(String value1, String value2) {
            addCriterion("goods_cz between", value1, value2, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsCzNotBetween(String value1, String value2) {
            addCriterion("goods_cz not between", value1, value2, "goodsCz");
            return (Criteria) this;
        }

        public Criteria andGoodsTmIsNull() {
            addCriterion("goods_tm is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTmIsNotNull() {
            addCriterion("goods_tm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTmEqualTo(String value) {
            addCriterion("goods_tm =", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmNotEqualTo(String value) {
            addCriterion("goods_tm <>", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmGreaterThan(String value) {
            addCriterion("goods_tm >", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmGreaterThanOrEqualTo(String value) {
            addCriterion("goods_tm >=", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmLessThan(String value) {
            addCriterion("goods_tm <", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmLessThanOrEqualTo(String value) {
            addCriterion("goods_tm <=", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmLike(String value) {
            addCriterion("goods_tm like", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmNotLike(String value) {
            addCriterion("goods_tm not like", value, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmIn(List<String> values) {
            addCriterion("goods_tm in", values, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmNotIn(List<String> values) {
            addCriterion("goods_tm not in", values, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmBetween(String value1, String value2) {
            addCriterion("goods_tm between", value1, value2, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsTmNotBetween(String value1, String value2) {
            addCriterion("goods_tm not between", value1, value2, "goodsTm");
            return (Criteria) this;
        }

        public Criteria andGoodsGgIsNull() {
            addCriterion("goods_gg is null");
            return (Criteria) this;
        }

        public Criteria andGoodsGgIsNotNull() {
            addCriterion("goods_gg is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsGgEqualTo(String value) {
            addCriterion("goods_gg =", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgNotEqualTo(String value) {
            addCriterion("goods_gg <>", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgGreaterThan(String value) {
            addCriterion("goods_gg >", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_gg >=", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgLessThan(String value) {
            addCriterion("goods_gg <", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgLessThanOrEqualTo(String value) {
            addCriterion("goods_gg <=", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgLike(String value) {
            addCriterion("goods_gg like", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgNotLike(String value) {
            addCriterion("goods_gg not like", value, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgIn(List<String> values) {
            addCriterion("goods_gg in", values, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgNotIn(List<String> values) {
            addCriterion("goods_gg not in", values, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgBetween(String value1, String value2) {
            addCriterion("goods_gg between", value1, value2, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsGgNotBetween(String value1, String value2) {
            addCriterion("goods_gg not between", value1, value2, "goodsGg");
            return (Criteria) this;
        }

        public Criteria andGoodsBhIsNull() {
            addCriterion("goods_bh is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBhIsNotNull() {
            addCriterion("goods_bh is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBhEqualTo(String value) {
            addCriterion("goods_bh =", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhNotEqualTo(String value) {
            addCriterion("goods_bh <>", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhGreaterThan(String value) {
            addCriterion("goods_bh >", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhGreaterThanOrEqualTo(String value) {
            addCriterion("goods_bh >=", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhLessThan(String value) {
            addCriterion("goods_bh <", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhLessThanOrEqualTo(String value) {
            addCriterion("goods_bh <=", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhLike(String value) {
            addCriterion("goods_bh like", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhNotLike(String value) {
            addCriterion("goods_bh not like", value, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhIn(List<String> values) {
            addCriterion("goods_bh in", values, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhNotIn(List<String> values) {
            addCriterion("goods_bh not in", values, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhBetween(String value1, String value2) {
            addCriterion("goods_bh between", value1, value2, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsBhNotBetween(String value1, String value2) {
            addCriterion("goods_bh not between", value1, value2, "goodsBh");
            return (Criteria) this;
        }

        public Criteria andGoodsZlIsNull() {
            addCriterion("goods_zl is null");
            return (Criteria) this;
        }

        public Criteria andGoodsZlIsNotNull() {
            addCriterion("goods_zl is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsZlEqualTo(String value) {
            addCriterion("goods_zl =", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlNotEqualTo(String value) {
            addCriterion("goods_zl <>", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlGreaterThan(String value) {
            addCriterion("goods_zl >", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlGreaterThanOrEqualTo(String value) {
            addCriterion("goods_zl >=", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlLessThan(String value) {
            addCriterion("goods_zl <", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlLessThanOrEqualTo(String value) {
            addCriterion("goods_zl <=", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlLike(String value) {
            addCriterion("goods_zl like", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlNotLike(String value) {
            addCriterion("goods_zl not like", value, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlIn(List<String> values) {
            addCriterion("goods_zl in", values, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlNotIn(List<String> values) {
            addCriterion("goods_zl not in", values, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlBetween(String value1, String value2) {
            addCriterion("goods_zl between", value1, value2, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsZlNotBetween(String value1, String value2) {
            addCriterion("goods_zl not between", value1, value2, "goodsZl");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsIsNull() {
            addCriterion("goods_pics is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsIsNotNull() {
            addCriterion("goods_pics is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsEqualTo(String value) {
            addCriterion("goods_pics =", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotEqualTo(String value) {
            addCriterion("goods_pics <>", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsGreaterThan(String value) {
            addCriterion("goods_pics >", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_pics >=", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsLessThan(String value) {
            addCriterion("goods_pics <", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsLessThanOrEqualTo(String value) {
            addCriterion("goods_pics <=", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsLike(String value) {
            addCriterion("goods_pics like", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotLike(String value) {
            addCriterion("goods_pics not like", value, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsIn(List<String> values) {
            addCriterion("goods_pics in", values, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotIn(List<String> values) {
            addCriterion("goods_pics not in", values, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsBetween(String value1, String value2) {
            addCriterion("goods_pics between", value1, value2, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsPicsNotBetween(String value1, String value2) {
            addCriterion("goods_pics not between", value1, value2, "goodsPics");
            return (Criteria) this;
        }

        public Criteria andGoodsRmIsNull() {
            addCriterion("goods_rm is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRmIsNotNull() {
            addCriterion("goods_rm is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRmEqualTo(Integer value) {
            addCriterion("goods_rm =", value, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmNotEqualTo(Integer value) {
            addCriterion("goods_rm <>", value, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmGreaterThan(Integer value) {
            addCriterion("goods_rm >", value, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_rm >=", value, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmLessThan(Integer value) {
            addCriterion("goods_rm <", value, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmLessThanOrEqualTo(Integer value) {
            addCriterion("goods_rm <=", value, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmIn(List<Integer> values) {
            addCriterion("goods_rm in", values, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmNotIn(List<Integer> values) {
            addCriterion("goods_rm not in", values, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmBetween(Integer value1, Integer value2) {
            addCriterion("goods_rm between", value1, value2, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsRmNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_rm not between", value1, value2, "goodsRm");
            return (Criteria) this;
        }

        public Criteria andGoodsNewIsNull() {
            addCriterion("goods_new is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNewIsNotNull() {
            addCriterion("goods_new is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNewEqualTo(Integer value) {
            addCriterion("goods_new =", value, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewNotEqualTo(Integer value) {
            addCriterion("goods_new <>", value, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewGreaterThan(Integer value) {
            addCriterion("goods_new >", value, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_new >=", value, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewLessThan(Integer value) {
            addCriterion("goods_new <", value, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewLessThanOrEqualTo(Integer value) {
            addCriterion("goods_new <=", value, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewIn(List<Integer> values) {
            addCriterion("goods_new in", values, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewNotIn(List<Integer> values) {
            addCriterion("goods_new not in", values, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewBetween(Integer value1, Integer value2) {
            addCriterion("goods_new between", value1, value2, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsNewNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_new not between", value1, value2, "goodsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsIsNull() {
            addCriterion("goods_djs is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsIsNotNull() {
            addCriterion("goods_djs is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsEqualTo(Integer value) {
            addCriterion("goods_djs =", value, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsNotEqualTo(Integer value) {
            addCriterion("goods_djs <>", value, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsGreaterThan(Integer value) {
            addCriterion("goods_djs >", value, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_djs >=", value, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsLessThan(Integer value) {
            addCriterion("goods_djs <", value, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsLessThanOrEqualTo(Integer value) {
            addCriterion("goods_djs <=", value, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsIn(List<Integer> values) {
            addCriterion("goods_djs in", values, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsNotIn(List<Integer> values) {
            addCriterion("goods_djs not in", values, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsBetween(Integer value1, Integer value2) {
            addCriterion("goods_djs between", value1, value2, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsDjsNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_djs not between", value1, value2, "goodsDjs");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIsNull() {
            addCriterion("goods_addtime is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIsNotNull() {
            addCriterion("goods_addtime is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeEqualTo(Integer value) {
            addCriterion("goods_addtime =", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotEqualTo(Integer value) {
            addCriterion("goods_addtime <>", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeGreaterThan(Integer value) {
            addCriterion("goods_addtime >", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_addtime >=", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeLessThan(Integer value) {
            addCriterion("goods_addtime <", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeLessThanOrEqualTo(Integer value) {
            addCriterion("goods_addtime <=", value, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeIn(List<Integer> values) {
            addCriterion("goods_addtime in", values, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotIn(List<Integer> values) {
            addCriterion("goods_addtime not in", values, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeBetween(Integer value1, Integer value2) {
            addCriterion("goods_addtime between", value1, value2, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsAddtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_addtime not between", value1, value2, "goodsAddtime");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsIsNull() {
            addCriterion("goods_nums is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsIsNotNull() {
            addCriterion("goods_nums is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsEqualTo(Integer value) {
            addCriterion("goods_nums =", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsNotEqualTo(Integer value) {
            addCriterion("goods_nums <>", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsGreaterThan(Integer value) {
            addCriterion("goods_nums >", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_nums >=", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsLessThan(Integer value) {
            addCriterion("goods_nums <", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsLessThanOrEqualTo(Integer value) {
            addCriterion("goods_nums <=", value, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsIn(List<Integer> values) {
            addCriterion("goods_nums in", values, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsNotIn(List<Integer> values) {
            addCriterion("goods_nums not in", values, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsBetween(Integer value1, Integer value2) {
            addCriterion("goods_nums between", value1, value2, "goodsNums");
            return (Criteria) this;
        }

        public Criteria andGoodsNumsNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_nums not between", value1, value2, "goodsNums");
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