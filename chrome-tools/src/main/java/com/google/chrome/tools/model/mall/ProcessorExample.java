package com.google.chrome.tools.model.mall;

import java.util.ArrayList;
import java.util.List;

public class ProcessorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart;

    protected int limitEnd;

    protected String groupByClause;

    public ProcessorExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
    }

    public void setGroupByClause(String groupByClause) {
        this.groupByClause=groupByClause;
    }

    public String getGroupByClause() {
        return groupByClause;
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

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNull() {
            addCriterion("gross_weight is null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIsNotNull() {
            addCriterion("gross_weight is not null");
            return (Criteria) this;
        }

        public Criteria andGrossWeightEqualTo(Double value) {
            addCriterion("gross_weight =", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotEqualTo(Double value) {
            addCriterion("gross_weight <>", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThan(Double value) {
            addCriterion("gross_weight >", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("gross_weight >=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThan(Double value) {
            addCriterion("gross_weight <", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightLessThanOrEqualTo(Double value) {
            addCriterion("gross_weight <=", value, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightIn(List<Double> values) {
            addCriterion("gross_weight in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotIn(List<Double> values) {
            addCriterion("gross_weight not in", values, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightBetween(Double value1, Double value2) {
            addCriterion("gross_weight between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andGrossWeightNotBetween(Double value1, Double value2) {
            addCriterion("gross_weight not between", value1, value2, "grossWeight");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyIsNull() {
            addCriterion("process_technology is null");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyIsNotNull() {
            addCriterion("process_technology is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyEqualTo(String value) {
            addCriterion("process_technology =", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyNotEqualTo(String value) {
            addCriterion("process_technology <>", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyGreaterThan(String value) {
            addCriterion("process_technology >", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("process_technology >=", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyLessThan(String value) {
            addCriterion("process_technology <", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyLessThanOrEqualTo(String value) {
            addCriterion("process_technology <=", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyLike(String value) {
            addCriterion("process_technology like", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyNotLike(String value) {
            addCriterion("process_technology not like", value, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyIn(List<String> values) {
            addCriterion("process_technology in", values, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyNotIn(List<String> values) {
            addCriterion("process_technology not in", values, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyBetween(String value1, String value2) {
            addCriterion("process_technology between", value1, value2, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andProcessTechnologyNotBetween(String value1, String value2) {
            addCriterion("process_technology not between", value1, value2, "processTechnology");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNull() {
            addCriterion("place_of_origin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIsNotNull() {
            addCriterion("place_of_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginEqualTo(String value) {
            addCriterion("place_of_origin =", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotEqualTo(String value) {
            addCriterion("place_of_origin <>", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThan(String value) {
            addCriterion("place_of_origin >", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginGreaterThanOrEqualTo(String value) {
            addCriterion("place_of_origin >=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThan(String value) {
            addCriterion("place_of_origin <", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLessThanOrEqualTo(String value) {
            addCriterion("place_of_origin <=", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginLike(String value) {
            addCriterion("place_of_origin like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotLike(String value) {
            addCriterion("place_of_origin not like", value, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginIn(List<String> values) {
            addCriterion("place_of_origin in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotIn(List<String> values) {
            addCriterion("place_of_origin not in", values, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginBetween(String value1, String value2) {
            addCriterion("place_of_origin between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOfOriginNotBetween(String value1, String value2) {
            addCriterion("place_of_origin not between", value1, value2, "placeOfOrigin");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityIsNull() {
            addCriterion("core_quantity is null");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityIsNotNull() {
            addCriterion("core_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityEqualTo(String value) {
            addCriterion("core_quantity =", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityNotEqualTo(String value) {
            addCriterion("core_quantity <>", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityGreaterThan(String value) {
            addCriterion("core_quantity >", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("core_quantity >=", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityLessThan(String value) {
            addCriterion("core_quantity <", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityLessThanOrEqualTo(String value) {
            addCriterion("core_quantity <=", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityLike(String value) {
            addCriterion("core_quantity like", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityNotLike(String value) {
            addCriterion("core_quantity not like", value, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityIn(List<String> values) {
            addCriterion("core_quantity in", values, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityNotIn(List<String> values) {
            addCriterion("core_quantity not in", values, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityBetween(String value1, String value2) {
            addCriterion("core_quantity between", value1, value2, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andCoreQuantityNotBetween(String value1, String value2) {
            addCriterion("core_quantity not between", value1, value2, "coreQuantity");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosIsNull() {
            addCriterion("applicable_scenarios is null");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosIsNotNull() {
            addCriterion("applicable_scenarios is not null");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosEqualTo(String value) {
            addCriterion("applicable_scenarios =", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosNotEqualTo(String value) {
            addCriterion("applicable_scenarios <>", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosGreaterThan(String value) {
            addCriterion("applicable_scenarios >", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosGreaterThanOrEqualTo(String value) {
            addCriterion("applicable_scenarios >=", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosLessThan(String value) {
            addCriterion("applicable_scenarios <", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosLessThanOrEqualTo(String value) {
            addCriterion("applicable_scenarios <=", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosLike(String value) {
            addCriterion("applicable_scenarios like", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosNotLike(String value) {
            addCriterion("applicable_scenarios not like", value, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosIn(List<String> values) {
            addCriterion("applicable_scenarios in", values, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosNotIn(List<String> values) {
            addCriterion("applicable_scenarios not in", values, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosBetween(String value1, String value2) {
            addCriterion("applicable_scenarios between", value1, value2, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andApplicableScenariosNotBetween(String value1, String value2) {
            addCriterion("applicable_scenarios not between", value1, value2, "applicableScenarios");
            return (Criteria) this;
        }

        public Criteria andInterfacesIsNull() {
            addCriterion("interfaces is null");
            return (Criteria) this;
        }

        public Criteria andInterfacesIsNotNull() {
            addCriterion("interfaces is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacesEqualTo(String value) {
            addCriterion("interfaces =", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesNotEqualTo(String value) {
            addCriterion("interfaces <>", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesGreaterThan(String value) {
            addCriterion("interfaces >", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesGreaterThanOrEqualTo(String value) {
            addCriterion("interfaces >=", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesLessThan(String value) {
            addCriterion("interfaces <", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesLessThanOrEqualTo(String value) {
            addCriterion("interfaces <=", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesLike(String value) {
            addCriterion("interfaces like", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesNotLike(String value) {
            addCriterion("interfaces not like", value, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesIn(List<String> values) {
            addCriterion("interfaces in", values, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesNotIn(List<String> values) {
            addCriterion("interfaces not in", values, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesBetween(String value1, String value2) {
            addCriterion("interfaces between", value1, value2, "interfaces");
            return (Criteria) this;
        }

        public Criteria andInterfacesNotBetween(String value1, String value2) {
            addCriterion("interfaces not between", value1, value2, "interfaces");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodIsNull() {
            addCriterion("warranty_period is null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodIsNotNull() {
            addCriterion("warranty_period is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodEqualTo(String value) {
            addCriterion("warranty_period =", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotEqualTo(String value) {
            addCriterion("warranty_period <>", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodGreaterThan(String value) {
            addCriterion("warranty_period >", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("warranty_period >=", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodLessThan(String value) {
            addCriterion("warranty_period <", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodLessThanOrEqualTo(String value) {
            addCriterion("warranty_period <=", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodLike(String value) {
            addCriterion("warranty_period like", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotLike(String value) {
            addCriterion("warranty_period not like", value, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodIn(List<String> values) {
            addCriterion("warranty_period in", values, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotIn(List<String> values) {
            addCriterion("warranty_period not in", values, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodBetween(String value1, String value2) {
            addCriterion("warranty_period between", value1, value2, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andWarrantyPeriodNotBetween(String value1, String value2) {
            addCriterion("warranty_period not between", value1, value2, "warrantyPeriod");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyIsNull() {
            addCriterion("main_frequency is null");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyIsNotNull() {
            addCriterion("main_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyEqualTo(String value) {
            addCriterion("main_frequency =", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyNotEqualTo(String value) {
            addCriterion("main_frequency <>", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyGreaterThan(String value) {
            addCriterion("main_frequency >", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("main_frequency >=", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyLessThan(String value) {
            addCriterion("main_frequency <", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyLessThanOrEqualTo(String value) {
            addCriterion("main_frequency <=", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyLike(String value) {
            addCriterion("main_frequency like", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyNotLike(String value) {
            addCriterion("main_frequency not like", value, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyIn(List<String> values) {
            addCriterion("main_frequency in", values, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyNotIn(List<String> values) {
            addCriterion("main_frequency not in", values, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyBetween(String value1, String value2) {
            addCriterion("main_frequency between", value1, value2, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andMainFrequencyNotBetween(String value1, String value2) {
            addCriterion("main_frequency not between", value1, value2, "mainFrequency");
            return (Criteria) this;
        }

        public Criteria andCacheIsNull() {
            addCriterion("cache is null");
            return (Criteria) this;
        }

        public Criteria andCacheIsNotNull() {
            addCriterion("cache is not null");
            return (Criteria) this;
        }

        public Criteria andCacheEqualTo(String value) {
            addCriterion("cache =", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotEqualTo(String value) {
            addCriterion("cache <>", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheGreaterThan(String value) {
            addCriterion("cache >", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheGreaterThanOrEqualTo(String value) {
            addCriterion("cache >=", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheLessThan(String value) {
            addCriterion("cache <", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheLessThanOrEqualTo(String value) {
            addCriterion("cache <=", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheLike(String value) {
            addCriterion("cache like", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotLike(String value) {
            addCriterion("cache not like", value, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheIn(List<String> values) {
            addCriterion("cache in", values, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotIn(List<String> values) {
            addCriterion("cache not in", values, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheBetween(String value1, String value2) {
            addCriterion("cache between", value1, value2, "cache");
            return (Criteria) this;
        }

        public Criteria andCacheNotBetween(String value1, String value2) {
            addCriterion("cache not between", value1, value2, "cache");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
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