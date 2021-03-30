package cn.edu.zju.gislab.SZTDService.po;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TideExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TideExample() {
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

        public Criteria andTideidIsNull() {
            addCriterion("TIDEID is null");
            return (Criteria) this;
        }

        public Criteria andTideidIsNotNull() {
            addCriterion("TIDEID is not null");
            return (Criteria) this;
        }

        public Criteria andTideidEqualTo(Integer value) {
            addCriterion("TIDEID =", value, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidNotEqualTo(Integer value) {
            addCriterion("TIDEID <>", value, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidGreaterThan(Integer value) {
            addCriterion("TIDEID >", value, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIDEID >=", value, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidLessThan(Integer value) {
            addCriterion("TIDEID <", value, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidLessThanOrEqualTo(Integer value) {
            addCriterion("TIDEID <=", value, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidIn(List<Integer> values) {
            addCriterion("TIDEID in", values, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidNotIn(List<Integer> values) {
            addCriterion("TIDEID not in", values, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidBetween(Integer value1, Integer value2) {
            addCriterion("TIDEID between", value1, value2, "tideid");
            return (Criteria) this;
        }

        public Criteria andTideidNotBetween(Integer value1, Integer value2) {
            addCriterion("TIDEID not between", value1, value2, "tideid");
            return (Criteria) this;
        }

        public Criteria andDtIsNull() {
            addCriterion("DT is null");
            return (Criteria) this;
        }

        public Criteria andDtIsNotNull() {
            addCriterion("DT is not null");
            return (Criteria) this;
        }

        public Criteria andDtEqualTo(Timestamp value) {
            addCriterion("DT =", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotEqualTo(Timestamp value) {
            addCriterion("DT <>", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThan(Timestamp value) {
            addCriterion("DT >", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("DT >=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThan(Timestamp value) {
            addCriterion("DT <", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtLessThanOrEqualTo(Timestamp value) {
            addCriterion("DT <=", value, "dt");
            return (Criteria) this;
        }

        public Criteria andDtIn(List<Timestamp> values) {
            addCriterion("DT in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotIn(List<Timestamp> values) {
            addCriterion("DT not in", values, "dt");
            return (Criteria) this;
        }

        public Criteria andDtBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DT between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andDtNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("DT not between", value1, value2, "dt");
            return (Criteria) this;
        }

        public Criteria andPrIsNull() {
            addCriterion("PR is null");
            return (Criteria) this;
        }

        public Criteria andPrIsNotNull() {
            addCriterion("PR is not null");
            return (Criteria) this;
        }

        public Criteria andPrEqualTo(Double value) {
            addCriterion("PR =", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotEqualTo(Double value) {
            addCriterion("PR <>", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrGreaterThan(Double value) {
            addCriterion("PR >", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrGreaterThanOrEqualTo(Double value) {
            addCriterion("PR >=", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLessThan(Double value) {
            addCriterion("PR <", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrLessThanOrEqualTo(Double value) {
            addCriterion("PR <=", value, "pr");
            return (Criteria) this;
        }

        public Criteria andPrIn(List<Double> values) {
            addCriterion("PR in", values, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotIn(List<Double> values) {
            addCriterion("PR not in", values, "pr");
            return (Criteria) this;
        }

        public Criteria andPrBetween(Double value1, Double value2) {
            addCriterion("PR between", value1, value2, "pr");
            return (Criteria) this;
        }

        public Criteria andPrNotBetween(Double value1, Double value2) {
            addCriterion("PR not between", value1, value2, "pr");
            return (Criteria) this;
        }

        public Criteria andWlIsNull() {
            addCriterion("WL is null");
            return (Criteria) this;
        }

        public Criteria andWlIsNotNull() {
            addCriterion("WL is not null");
            return (Criteria) this;
        }

        public Criteria andWlEqualTo(Double value) {
            addCriterion("WL =", value, "wl");
            return (Criteria) this;
        }

        public Criteria andWlNotEqualTo(Double value) {
            addCriterion("WL <>", value, "wl");
            return (Criteria) this;
        }

        public Criteria andWlGreaterThan(Double value) {
            addCriterion("WL >", value, "wl");
            return (Criteria) this;
        }

        public Criteria andWlGreaterThanOrEqualTo(Double value) {
            addCriterion("WL >=", value, "wl");
            return (Criteria) this;
        }

        public Criteria andWlLessThan(Double value) {
            addCriterion("WL <", value, "wl");
            return (Criteria) this;
        }

        public Criteria andWlLessThanOrEqualTo(Double value) {
            addCriterion("WL <=", value, "wl");
            return (Criteria) this;
        }

        public Criteria andWlIn(List<Double> values) {
            addCriterion("WL in", values, "wl");
            return (Criteria) this;
        }

        public Criteria andWlNotIn(List<Double> values) {
            addCriterion("WL not in", values, "wl");
            return (Criteria) this;
        }

        public Criteria andWlBetween(Double value1, Double value2) {
            addCriterion("WL between", value1, value2, "wl");
            return (Criteria) this;
        }

        public Criteria andWlNotBetween(Double value1, Double value2) {
            addCriterion("WL not between", value1, value2, "wl");
            return (Criteria) this;
        }

        public Criteria andWlCorrectIsNull() {
            addCriterion("WL_CORRECT is null");
            return (Criteria) this;
        }

        public Criteria andWlCorrectIsNotNull() {
            addCriterion("WL_CORRECT is not null");
            return (Criteria) this;
        }

        public Criteria andWlCorrectEqualTo(BigDecimal value) {
            addCriterion("WL_CORRECT =", value, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectNotEqualTo(BigDecimal value) {
            addCriterion("WL_CORRECT <>", value, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectGreaterThan(BigDecimal value) {
            addCriterion("WL_CORRECT >", value, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WL_CORRECT >=", value, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectLessThan(BigDecimal value) {
            addCriterion("WL_CORRECT <", value, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WL_CORRECT <=", value, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectIn(List<BigDecimal> values) {
            addCriterion("WL_CORRECT in", values, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectNotIn(List<BigDecimal> values) {
            addCriterion("WL_CORRECT not in", values, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WL_CORRECT between", value1, value2, "wlCorrect");
            return (Criteria) this;
        }

        public Criteria andWlCorrectNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WL_CORRECT not between", value1, value2, "wlCorrect");
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