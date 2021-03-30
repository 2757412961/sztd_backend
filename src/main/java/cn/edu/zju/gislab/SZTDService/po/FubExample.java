package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class FubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FubExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("FID is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("FID is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("FID =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("FID <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("FID >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FID >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("FID <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("FID <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("FID in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("FID not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("FID between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("FID not between", value1, value2, "fid");
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

        public Criteria andWavelevIsNull() {
            addCriterion("WAVELEV is null");
            return (Criteria) this;
        }

        public Criteria andWavelevIsNotNull() {
            addCriterion("WAVELEV is not null");
            return (Criteria) this;
        }

        public Criteria andWavelevEqualTo(Integer value) {
            addCriterion("WAVELEV =", value, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevNotEqualTo(Integer value) {
            addCriterion("WAVELEV <>", value, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevGreaterThan(Integer value) {
            addCriterion("WAVELEV >", value, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAVELEV >=", value, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevLessThan(Integer value) {
            addCriterion("WAVELEV <", value, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevLessThanOrEqualTo(Integer value) {
            addCriterion("WAVELEV <=", value, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevIn(List<Integer> values) {
            addCriterion("WAVELEV in", values, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevNotIn(List<Integer> values) {
            addCriterion("WAVELEV not in", values, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevBetween(Integer value1, Integer value2) {
            addCriterion("WAVELEV between", value1, value2, "wavelev");
            return (Criteria) this;
        }

        public Criteria andWavelevNotBetween(Integer value1, Integer value2) {
            addCriterion("WAVELEV not between", value1, value2, "wavelev");
            return (Criteria) this;
        }

        public Criteria andFlowvIsNull() {
            addCriterion("FLOWV is null");
            return (Criteria) this;
        }

        public Criteria andFlowvIsNotNull() {
            addCriterion("FLOWV is not null");
            return (Criteria) this;
        }

        public Criteria andFlowvEqualTo(Double value) {
            addCriterion("FLOWV =", value, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvNotEqualTo(Double value) {
            addCriterion("FLOWV <>", value, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvGreaterThan(Double value) {
            addCriterion("FLOWV >", value, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvGreaterThanOrEqualTo(Double value) {
            addCriterion("FLOWV >=", value, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvLessThan(Double value) {
            addCriterion("FLOWV <", value, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvLessThanOrEqualTo(Double value) {
            addCriterion("FLOWV <=", value, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvIn(List<Double> values) {
            addCriterion("FLOWV in", values, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvNotIn(List<Double> values) {
            addCriterion("FLOWV not in", values, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvBetween(Double value1, Double value2) {
            addCriterion("FLOWV between", value1, value2, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowvNotBetween(Double value1, Double value2) {
            addCriterion("FLOWV not between", value1, value2, "flowv");
            return (Criteria) this;
        }

        public Criteria andFlowdireIsNull() {
            addCriterion("FLOWDIRE is null");
            return (Criteria) this;
        }

        public Criteria andFlowdireIsNotNull() {
            addCriterion("FLOWDIRE is not null");
            return (Criteria) this;
        }

        public Criteria andFlowdireEqualTo(Integer value) {
            addCriterion("FLOWDIRE =", value, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireNotEqualTo(Integer value) {
            addCriterion("FLOWDIRE <>", value, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireGreaterThan(Integer value) {
            addCriterion("FLOWDIRE >", value, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOWDIRE >=", value, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireLessThan(Integer value) {
            addCriterion("FLOWDIRE <", value, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireLessThanOrEqualTo(Integer value) {
            addCriterion("FLOWDIRE <=", value, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireIn(List<Integer> values) {
            addCriterion("FLOWDIRE in", values, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireNotIn(List<Integer> values) {
            addCriterion("FLOWDIRE not in", values, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireBetween(Integer value1, Integer value2) {
            addCriterion("FLOWDIRE between", value1, value2, "flowdire");
            return (Criteria) this;
        }

        public Criteria andFlowdireNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOWDIRE not between", value1, value2, "flowdire");
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