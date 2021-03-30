package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class AdcplevnewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdcplevnewExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("AID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andLevIsNull() {
            addCriterion("LEV is null");
            return (Criteria) this;
        }

        public Criteria andLevIsNotNull() {
            addCriterion("LEV is not null");
            return (Criteria) this;
        }

        public Criteria andLevEqualTo(Integer value) {
            addCriterion("LEV =", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotEqualTo(Integer value) {
            addCriterion("LEV <>", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThan(Integer value) {
            addCriterion("LEV >", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEV >=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThan(Integer value) {
            addCriterion("LEV <", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevLessThanOrEqualTo(Integer value) {
            addCriterion("LEV <=", value, "lev");
            return (Criteria) this;
        }

        public Criteria andLevIn(List<Integer> values) {
            addCriterion("LEV in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotIn(List<Integer> values) {
            addCriterion("LEV not in", values, "lev");
            return (Criteria) this;
        }

        public Criteria andLevBetween(Integer value1, Integer value2) {
            addCriterion("LEV between", value1, value2, "lev");
            return (Criteria) this;
        }

        public Criteria andLevNotBetween(Integer value1, Integer value2) {
            addCriterion("LEV not between", value1, value2, "lev");
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

        public Criteria andUIsNull() {
            addCriterion("U is null");
            return (Criteria) this;
        }

        public Criteria andUIsNotNull() {
            addCriterion("U is not null");
            return (Criteria) this;
        }

        public Criteria andUEqualTo(Double value) {
            addCriterion("U =", value, "u");
            return (Criteria) this;
        }

        public Criteria andUNotEqualTo(Double value) {
            addCriterion("U <>", value, "u");
            return (Criteria) this;
        }

        public Criteria andUGreaterThan(Double value) {
            addCriterion("U >", value, "u");
            return (Criteria) this;
        }

        public Criteria andUGreaterThanOrEqualTo(Double value) {
            addCriterion("U >=", value, "u");
            return (Criteria) this;
        }

        public Criteria andULessThan(Double value) {
            addCriterion("U <", value, "u");
            return (Criteria) this;
        }

        public Criteria andULessThanOrEqualTo(Double value) {
            addCriterion("U <=", value, "u");
            return (Criteria) this;
        }

        public Criteria andUIn(List<Double> values) {
            addCriterion("U in", values, "u");
            return (Criteria) this;
        }

        public Criteria andUNotIn(List<Double> values) {
            addCriterion("U not in", values, "u");
            return (Criteria) this;
        }

        public Criteria andUBetween(Double value1, Double value2) {
            addCriterion("U between", value1, value2, "u");
            return (Criteria) this;
        }

        public Criteria andUNotBetween(Double value1, Double value2) {
            addCriterion("U not between", value1, value2, "u");
            return (Criteria) this;
        }

        public Criteria andVIsNull() {
            addCriterion("V is null");
            return (Criteria) this;
        }

        public Criteria andVIsNotNull() {
            addCriterion("V is not null");
            return (Criteria) this;
        }

        public Criteria andVEqualTo(Double value) {
            addCriterion("V =", value, "v");
            return (Criteria) this;
        }

        public Criteria andVNotEqualTo(Double value) {
            addCriterion("V <>", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThan(Double value) {
            addCriterion("V >", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThanOrEqualTo(Double value) {
            addCriterion("V >=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThan(Double value) {
            addCriterion("V <", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThanOrEqualTo(Double value) {
            addCriterion("V <=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVIn(List<Double> values) {
            addCriterion("V in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVNotIn(List<Double> values) {
            addCriterion("V not in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVBetween(Double value1, Double value2) {
            addCriterion("V between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andVNotBetween(Double value1, Double value2) {
            addCriterion("V not between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andVelocIsNull() {
            addCriterion("VELOC is null");
            return (Criteria) this;
        }

        public Criteria andVelocIsNotNull() {
            addCriterion("VELOC is not null");
            return (Criteria) this;
        }

        public Criteria andVelocEqualTo(Double value) {
            addCriterion("VELOC =", value, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocNotEqualTo(Double value) {
            addCriterion("VELOC <>", value, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocGreaterThan(Double value) {
            addCriterion("VELOC >", value, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocGreaterThanOrEqualTo(Double value) {
            addCriterion("VELOC >=", value, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocLessThan(Double value) {
            addCriterion("VELOC <", value, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocLessThanOrEqualTo(Double value) {
            addCriterion("VELOC <=", value, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocIn(List<Double> values) {
            addCriterion("VELOC in", values, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocNotIn(List<Double> values) {
            addCriterion("VELOC not in", values, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocBetween(Double value1, Double value2) {
            addCriterion("VELOC between", value1, value2, "veloc");
            return (Criteria) this;
        }

        public Criteria andVelocNotBetween(Double value1, Double value2) {
            addCriterion("VELOC not between", value1, value2, "veloc");
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