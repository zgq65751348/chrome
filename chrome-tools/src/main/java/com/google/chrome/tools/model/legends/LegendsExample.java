package com.google.chrome.tools.model.legends;

import java.util.ArrayList;
import java.util.List;

public class LegendsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart;

    protected int limitEnd;

    protected String groupByClause;

    public LegendsExample() {
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

        public Criteria andDesignationIsNull() {
            addCriterion("designation is null");
            return (Criteria) this;
        }

        public Criteria andDesignationIsNotNull() {
            addCriterion("designation is not null");
            return (Criteria) this;
        }

        public Criteria andDesignationEqualTo(String value) {
            addCriterion("designation =", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotEqualTo(String value) {
            addCriterion("designation <>", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationGreaterThan(String value) {
            addCriterion("designation >", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationGreaterThanOrEqualTo(String value) {
            addCriterion("designation >=", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationLessThan(String value) {
            addCriterion("designation <", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationLessThanOrEqualTo(String value) {
            addCriterion("designation <=", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationLike(String value) {
            addCriterion("designation like", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotLike(String value) {
            addCriterion("designation not like", value, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationIn(List<String> values) {
            addCriterion("designation in", values, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotIn(List<String> values) {
            addCriterion("designation not in", values, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationBetween(String value1, String value2) {
            addCriterion("designation between", value1, value2, "designation");
            return (Criteria) this;
        }

        public Criteria andDesignationNotBetween(String value1, String value2) {
            addCriterion("designation not between", value1, value2, "designation");
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

        public Criteria andPassiveSkillIsNull() {
            addCriterion("passive_skill is null");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillIsNotNull() {
            addCriterion("passive_skill is not null");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillEqualTo(String value) {
            addCriterion("passive_skill =", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillNotEqualTo(String value) {
            addCriterion("passive_skill <>", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillGreaterThan(String value) {
            addCriterion("passive_skill >", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillGreaterThanOrEqualTo(String value) {
            addCriterion("passive_skill >=", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillLessThan(String value) {
            addCriterion("passive_skill <", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillLessThanOrEqualTo(String value) {
            addCriterion("passive_skill <=", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillLike(String value) {
            addCriterion("passive_skill like", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillNotLike(String value) {
            addCriterion("passive_skill not like", value, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillIn(List<String> values) {
            addCriterion("passive_skill in", values, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillNotIn(List<String> values) {
            addCriterion("passive_skill not in", values, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillBetween(String value1, String value2) {
            addCriterion("passive_skill between", value1, value2, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andPassiveSkillNotBetween(String value1, String value2) {
            addCriterion("passive_skill not between", value1, value2, "passiveSkill");
            return (Criteria) this;
        }

        public Criteria andSkillQIsNull() {
            addCriterion("skill_Q is null");
            return (Criteria) this;
        }

        public Criteria andSkillQIsNotNull() {
            addCriterion("skill_Q is not null");
            return (Criteria) this;
        }

        public Criteria andSkillQEqualTo(String value) {
            addCriterion("skill_Q =", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQNotEqualTo(String value) {
            addCriterion("skill_Q <>", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQGreaterThan(String value) {
            addCriterion("skill_Q >", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQGreaterThanOrEqualTo(String value) {
            addCriterion("skill_Q >=", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQLessThan(String value) {
            addCriterion("skill_Q <", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQLessThanOrEqualTo(String value) {
            addCriterion("skill_Q <=", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQLike(String value) {
            addCriterion("skill_Q like", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQNotLike(String value) {
            addCriterion("skill_Q not like", value, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQIn(List<String> values) {
            addCriterion("skill_Q in", values, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQNotIn(List<String> values) {
            addCriterion("skill_Q not in", values, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQBetween(String value1, String value2) {
            addCriterion("skill_Q between", value1, value2, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillQNotBetween(String value1, String value2) {
            addCriterion("skill_Q not between", value1, value2, "skillQ");
            return (Criteria) this;
        }

        public Criteria andSkillWIsNull() {
            addCriterion("skill_W is null");
            return (Criteria) this;
        }

        public Criteria andSkillWIsNotNull() {
            addCriterion("skill_W is not null");
            return (Criteria) this;
        }

        public Criteria andSkillWEqualTo(String value) {
            addCriterion("skill_W =", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWNotEqualTo(String value) {
            addCriterion("skill_W <>", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWGreaterThan(String value) {
            addCriterion("skill_W >", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWGreaterThanOrEqualTo(String value) {
            addCriterion("skill_W >=", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWLessThan(String value) {
            addCriterion("skill_W <", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWLessThanOrEqualTo(String value) {
            addCriterion("skill_W <=", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWLike(String value) {
            addCriterion("skill_W like", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWNotLike(String value) {
            addCriterion("skill_W not like", value, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWIn(List<String> values) {
            addCriterion("skill_W in", values, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWNotIn(List<String> values) {
            addCriterion("skill_W not in", values, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWBetween(String value1, String value2) {
            addCriterion("skill_W between", value1, value2, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillWNotBetween(String value1, String value2) {
            addCriterion("skill_W not between", value1, value2, "skillW");
            return (Criteria) this;
        }

        public Criteria andSkillEIsNull() {
            addCriterion("skill_E is null");
            return (Criteria) this;
        }

        public Criteria andSkillEIsNotNull() {
            addCriterion("skill_E is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEEqualTo(String value) {
            addCriterion("skill_E =", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillENotEqualTo(String value) {
            addCriterion("skill_E <>", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillEGreaterThan(String value) {
            addCriterion("skill_E >", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillEGreaterThanOrEqualTo(String value) {
            addCriterion("skill_E >=", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillELessThan(String value) {
            addCriterion("skill_E <", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillELessThanOrEqualTo(String value) {
            addCriterion("skill_E <=", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillELike(String value) {
            addCriterion("skill_E like", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillENotLike(String value) {
            addCriterion("skill_E not like", value, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillEIn(List<String> values) {
            addCriterion("skill_E in", values, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillENotIn(List<String> values) {
            addCriterion("skill_E not in", values, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillEBetween(String value1, String value2) {
            addCriterion("skill_E between", value1, value2, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillENotBetween(String value1, String value2) {
            addCriterion("skill_E not between", value1, value2, "skillE");
            return (Criteria) this;
        }

        public Criteria andSkillRIsNull() {
            addCriterion("skill_R is null");
            return (Criteria) this;
        }

        public Criteria andSkillRIsNotNull() {
            addCriterion("skill_R is not null");
            return (Criteria) this;
        }

        public Criteria andSkillREqualTo(String value) {
            addCriterion("skill_R =", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRNotEqualTo(String value) {
            addCriterion("skill_R <>", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRGreaterThan(String value) {
            addCriterion("skill_R >", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRGreaterThanOrEqualTo(String value) {
            addCriterion("skill_R >=", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRLessThan(String value) {
            addCriterion("skill_R <", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRLessThanOrEqualTo(String value) {
            addCriterion("skill_R <=", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRLike(String value) {
            addCriterion("skill_R like", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRNotLike(String value) {
            addCriterion("skill_R not like", value, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRIn(List<String> values) {
            addCriterion("skill_R in", values, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRNotIn(List<String> values) {
            addCriterion("skill_R not in", values, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRBetween(String value1, String value2) {
            addCriterion("skill_R between", value1, value2, "skillR");
            return (Criteria) this;
        }

        public Criteria andSkillRNotBetween(String value1, String value2) {
            addCriterion("skill_R not between", value1, value2, "skillR");
            return (Criteria) this;
        }

        public Criteria andLifeValueIsNull() {
            addCriterion("life_value is null");
            return (Criteria) this;
        }

        public Criteria andLifeValueIsNotNull() {
            addCriterion("life_value is not null");
            return (Criteria) this;
        }

        public Criteria andLifeValueEqualTo(Integer value) {
            addCriterion("life_value =", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueNotEqualTo(Integer value) {
            addCriterion("life_value <>", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueGreaterThan(Integer value) {
            addCriterion("life_value >", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("life_value >=", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueLessThan(Integer value) {
            addCriterion("life_value <", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueLessThanOrEqualTo(Integer value) {
            addCriterion("life_value <=", value, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueIn(List<Integer> values) {
            addCriterion("life_value in", values, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueNotIn(List<Integer> values) {
            addCriterion("life_value not in", values, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueBetween(Integer value1, Integer value2) {
            addCriterion("life_value between", value1, value2, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andLifeValueNotBetween(Integer value1, Integer value2) {
            addCriterion("life_value not between", value1, value2, "lifeValue");
            return (Criteria) this;
        }

        public Criteria andHurtIsNull() {
            addCriterion("hurt is null");
            return (Criteria) this;
        }

        public Criteria andHurtIsNotNull() {
            addCriterion("hurt is not null");
            return (Criteria) this;
        }

        public Criteria andHurtEqualTo(Integer value) {
            addCriterion("hurt =", value, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtNotEqualTo(Integer value) {
            addCriterion("hurt <>", value, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtGreaterThan(Integer value) {
            addCriterion("hurt >", value, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtGreaterThanOrEqualTo(Integer value) {
            addCriterion("hurt >=", value, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtLessThan(Integer value) {
            addCriterion("hurt <", value, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtLessThanOrEqualTo(Integer value) {
            addCriterion("hurt <=", value, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtIn(List<Integer> values) {
            addCriterion("hurt in", values, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtNotIn(List<Integer> values) {
            addCriterion("hurt not in", values, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtBetween(Integer value1, Integer value2) {
            addCriterion("hurt between", value1, value2, "hurt");
            return (Criteria) this;
        }

        public Criteria andHurtNotBetween(Integer value1, Integer value2) {
            addCriterion("hurt not between", value1, value2, "hurt");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeIsNull() {
            addCriterion("energy_type is null");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeIsNotNull() {
            addCriterion("energy_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeEqualTo(Byte value) {
            addCriterion("energy_type =", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotEqualTo(Byte value) {
            addCriterion("energy_type <>", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeGreaterThan(Byte value) {
            addCriterion("energy_type >", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("energy_type >=", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeLessThan(Byte value) {
            addCriterion("energy_type <", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeLessThanOrEqualTo(Byte value) {
            addCriterion("energy_type <=", value, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeIn(List<Byte> values) {
            addCriterion("energy_type in", values, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotIn(List<Byte> values) {
            addCriterion("energy_type not in", values, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeBetween(Byte value1, Byte value2) {
            addCriterion("energy_type between", value1, value2, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("energy_type not between", value1, value2, "energyType");
            return (Criteria) this;
        }

        public Criteria andEnergyValueIsNull() {
            addCriterion("energy_value is null");
            return (Criteria) this;
        }

        public Criteria andEnergyValueIsNotNull() {
            addCriterion("energy_value is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyValueEqualTo(Integer value) {
            addCriterion("energy_value =", value, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueNotEqualTo(Integer value) {
            addCriterion("energy_value <>", value, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueGreaterThan(Integer value) {
            addCriterion("energy_value >", value, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("energy_value >=", value, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueLessThan(Integer value) {
            addCriterion("energy_value <", value, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueLessThanOrEqualTo(Integer value) {
            addCriterion("energy_value <=", value, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueIn(List<Integer> values) {
            addCriterion("energy_value in", values, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueNotIn(List<Integer> values) {
            addCriterion("energy_value not in", values, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueBetween(Integer value1, Integer value2) {
            addCriterion("energy_value between", value1, value2, "energyValue");
            return (Criteria) this;
        }

        public Criteria andEnergyValueNotBetween(Integer value1, Integer value2) {
            addCriterion("energy_value not between", value1, value2, "energyValue");
            return (Criteria) this;
        }

        public Criteria andArmorIsNull() {
            addCriterion("armor is null");
            return (Criteria) this;
        }

        public Criteria andArmorIsNotNull() {
            addCriterion("armor is not null");
            return (Criteria) this;
        }

        public Criteria andArmorEqualTo(Integer value) {
            addCriterion("armor =", value, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorNotEqualTo(Integer value) {
            addCriterion("armor <>", value, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorGreaterThan(Integer value) {
            addCriterion("armor >", value, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorGreaterThanOrEqualTo(Integer value) {
            addCriterion("armor >=", value, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorLessThan(Integer value) {
            addCriterion("armor <", value, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorLessThanOrEqualTo(Integer value) {
            addCriterion("armor <=", value, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorIn(List<Integer> values) {
            addCriterion("armor in", values, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorNotIn(List<Integer> values) {
            addCriterion("armor not in", values, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorBetween(Integer value1, Integer value2) {
            addCriterion("armor between", value1, value2, "armor");
            return (Criteria) this;
        }

        public Criteria andArmorNotBetween(Integer value1, Integer value2) {
            addCriterion("armor not between", value1, value2, "armor");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceIsNull() {
            addCriterion("magic_resistance is null");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceIsNotNull() {
            addCriterion("magic_resistance is not null");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceEqualTo(Integer value) {
            addCriterion("magic_resistance =", value, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceNotEqualTo(Integer value) {
            addCriterion("magic_resistance <>", value, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceGreaterThan(Integer value) {
            addCriterion("magic_resistance >", value, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("magic_resistance >=", value, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceLessThan(Integer value) {
            addCriterion("magic_resistance <", value, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceLessThanOrEqualTo(Integer value) {
            addCriterion("magic_resistance <=", value, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceIn(List<Integer> values) {
            addCriterion("magic_resistance in", values, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceNotIn(List<Integer> values) {
            addCriterion("magic_resistance not in", values, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceBetween(Integer value1, Integer value2) {
            addCriterion("magic_resistance between", value1, value2, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andMagicResistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("magic_resistance not between", value1, value2, "magicResistance");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryIsNull() {
            addCriterion("life_recovery is null");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryIsNotNull() {
            addCriterion("life_recovery is not null");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryEqualTo(Integer value) {
            addCriterion("life_recovery =", value, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryNotEqualTo(Integer value) {
            addCriterion("life_recovery <>", value, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryGreaterThan(Integer value) {
            addCriterion("life_recovery >", value, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryGreaterThanOrEqualTo(Integer value) {
            addCriterion("life_recovery >=", value, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryLessThan(Integer value) {
            addCriterion("life_recovery <", value, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryLessThanOrEqualTo(Integer value) {
            addCriterion("life_recovery <=", value, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryIn(List<Integer> values) {
            addCriterion("life_recovery in", values, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryNotIn(List<Integer> values) {
            addCriterion("life_recovery not in", values, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryBetween(Integer value1, Integer value2) {
            addCriterion("life_recovery between", value1, value2, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andLifeRecoveryNotBetween(Integer value1, Integer value2) {
            addCriterion("life_recovery not between", value1, value2, "lifeRecovery");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedIsNull() {
            addCriterion("moving_speed is null");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedIsNotNull() {
            addCriterion("moving_speed is not null");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedEqualTo(Integer value) {
            addCriterion("moving_speed =", value, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedNotEqualTo(Integer value) {
            addCriterion("moving_speed <>", value, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedGreaterThan(Integer value) {
            addCriterion("moving_speed >", value, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("moving_speed >=", value, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedLessThan(Integer value) {
            addCriterion("moving_speed <", value, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("moving_speed <=", value, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedIn(List<Integer> values) {
            addCriterion("moving_speed in", values, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedNotIn(List<Integer> values) {
            addCriterion("moving_speed not in", values, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedBetween(Integer value1, Integer value2) {
            addCriterion("moving_speed between", value1, value2, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andMovingSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("moving_speed not between", value1, value2, "movingSpeed");
            return (Criteria) this;
        }

        public Criteria andPointCouponIsNull() {
            addCriterion("point_coupon is null");
            return (Criteria) this;
        }

        public Criteria andPointCouponIsNotNull() {
            addCriterion("point_coupon is not null");
            return (Criteria) this;
        }

        public Criteria andPointCouponEqualTo(Integer value) {
            addCriterion("point_coupon =", value, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponNotEqualTo(Integer value) {
            addCriterion("point_coupon <>", value, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponGreaterThan(Integer value) {
            addCriterion("point_coupon >", value, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponGreaterThanOrEqualTo(Integer value) {
            addCriterion("point_coupon >=", value, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponLessThan(Integer value) {
            addCriterion("point_coupon <", value, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponLessThanOrEqualTo(Integer value) {
            addCriterion("point_coupon <=", value, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponIn(List<Integer> values) {
            addCriterion("point_coupon in", values, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponNotIn(List<Integer> values) {
            addCriterion("point_coupon not in", values, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponBetween(Integer value1, Integer value2) {
            addCriterion("point_coupon between", value1, value2, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andPointCouponNotBetween(Integer value1, Integer value2) {
            addCriterion("point_coupon not between", value1, value2, "pointCoupon");
            return (Criteria) this;
        }

        public Criteria andGoldIsNull() {
            addCriterion("gold is null");
            return (Criteria) this;
        }

        public Criteria andGoldIsNotNull() {
            addCriterion("gold is not null");
            return (Criteria) this;
        }

        public Criteria andGoldEqualTo(Integer value) {
            addCriterion("gold =", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotEqualTo(Integer value) {
            addCriterion("gold <>", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThan(Integer value) {
            addCriterion("gold >", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldGreaterThanOrEqualTo(Integer value) {
            addCriterion("gold >=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThan(Integer value) {
            addCriterion("gold <", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldLessThanOrEqualTo(Integer value) {
            addCriterion("gold <=", value, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldIn(List<Integer> values) {
            addCriterion("gold in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotIn(List<Integer> values) {
            addCriterion("gold not in", values, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldBetween(Integer value1, Integer value2) {
            addCriterion("gold between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andGoldNotBetween(Integer value1, Integer value2) {
            addCriterion("gold not between", value1, value2, "gold");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
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