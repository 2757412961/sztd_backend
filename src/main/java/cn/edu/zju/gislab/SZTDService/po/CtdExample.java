package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CtdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CtdExample() {
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

        public Criteria andCtdidIsNull() {
            addCriterion("CTDID is null");
            return (Criteria) this;
        }

        public Criteria andCtdidIsNotNull() {
            addCriterion("CTDID is not null");
            return (Criteria) this;
        }

        public Criteria andCtdidEqualTo(Integer value) {
            addCriterion("CTDID =", value, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidNotEqualTo(Integer value) {
            addCriterion("CTDID <>", value, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidGreaterThan(Integer value) {
            addCriterion("CTDID >", value, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CTDID >=", value, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidLessThan(Integer value) {
            addCriterion("CTDID <", value, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidLessThanOrEqualTo(Integer value) {
            addCriterion("CTDID <=", value, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidIn(List<Integer> values) {
            addCriterion("CTDID in", values, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidNotIn(List<Integer> values) {
            addCriterion("CTDID not in", values, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidBetween(Integer value1, Integer value2) {
            addCriterion("CTDID between", value1, value2, "ctdid");
            return (Criteria) this;
        }

        public Criteria andCtdidNotBetween(Integer value1, Integer value2) {
            addCriterion("CTDID not between", value1, value2, "ctdid");
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

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andWpIsNull() {
            addCriterion("WP is null");
            return (Criteria) this;
        }

        public Criteria andWpIsNotNull() {
            addCriterion("WP is not null");
            return (Criteria) this;
        }

        public Criteria andWpEqualTo(Double value) {
            addCriterion("WP =", value, "wp");
            return (Criteria) this;
        }

        public Criteria andWpNotEqualTo(Double value) {
            addCriterion("WP <>", value, "wp");
            return (Criteria) this;
        }

        public Criteria andWpGreaterThan(Double value) {
            addCriterion("WP >", value, "wp");
            return (Criteria) this;
        }

        public Criteria andWpGreaterThanOrEqualTo(Double value) {
            addCriterion("WP >=", value, "wp");
            return (Criteria) this;
        }

        public Criteria andWpLessThan(Double value) {
            addCriterion("WP <", value, "wp");
            return (Criteria) this;
        }

        public Criteria andWpLessThanOrEqualTo(Double value) {
            addCriterion("WP <=", value, "wp");
            return (Criteria) this;
        }

        public Criteria andWpIn(List<Double> values) {
            addCriterion("WP in", values, "wp");
            return (Criteria) this;
        }

        public Criteria andWpNotIn(List<Double> values) {
            addCriterion("WP not in", values, "wp");
            return (Criteria) this;
        }

        public Criteria andWpBetween(Double value1, Double value2) {
            addCriterion("WP between", value1, value2, "wp");
            return (Criteria) this;
        }

        public Criteria andWpNotBetween(Double value1, Double value2) {
            addCriterion("WP not between", value1, value2, "wp");
            return (Criteria) this;
        }

        public Criteria andWtIsNull() {
            addCriterion("WT is null");
            return (Criteria) this;
        }

        public Criteria andWtIsNotNull() {
            addCriterion("WT is not null");
            return (Criteria) this;
        }

        public Criteria andWtEqualTo(Double value) {
            addCriterion("WT =", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotEqualTo(Double value) {
            addCriterion("WT <>", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThan(Double value) {
            addCriterion("WT >", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtGreaterThanOrEqualTo(Double value) {
            addCriterion("WT >=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThan(Double value) {
            addCriterion("WT <", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtLessThanOrEqualTo(Double value) {
            addCriterion("WT <=", value, "wt");
            return (Criteria) this;
        }

        public Criteria andWtIn(List<Double> values) {
            addCriterion("WT in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotIn(List<Double> values) {
            addCriterion("WT not in", values, "wt");
            return (Criteria) this;
        }

        public Criteria andWtBetween(Double value1, Double value2) {
            addCriterion("WT between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andWtNotBetween(Double value1, Double value2) {
            addCriterion("WT not between", value1, value2, "wt");
            return (Criteria) this;
        }

        public Criteria andEcIsNull() {
            addCriterion("EC is null");
            return (Criteria) this;
        }

        public Criteria andEcIsNotNull() {
            addCriterion("EC is not null");
            return (Criteria) this;
        }

        public Criteria andEcEqualTo(Double value) {
            addCriterion("EC =", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotEqualTo(Double value) {
            addCriterion("EC <>", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThan(Double value) {
            addCriterion("EC >", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThanOrEqualTo(Double value) {
            addCriterion("EC >=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThan(Double value) {
            addCriterion("EC <", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThanOrEqualTo(Double value) {
            addCriterion("EC <=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcIn(List<Double> values) {
            addCriterion("EC in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotIn(List<Double> values) {
            addCriterion("EC not in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcBetween(Double value1, Double value2) {
            addCriterion("EC between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotBetween(Double value1, Double value2) {
            addCriterion("EC not between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andSlIsNull() {
            addCriterion("SL is null");
            return (Criteria) this;
        }

        public Criteria andSlIsNotNull() {
            addCriterion("SL is not null");
            return (Criteria) this;
        }

        public Criteria andSlEqualTo(Double value) {
            addCriterion("SL =", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotEqualTo(Double value) {
            addCriterion("SL <>", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThan(Double value) {
            addCriterion("SL >", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlGreaterThanOrEqualTo(Double value) {
            addCriterion("SL >=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThan(Double value) {
            addCriterion("SL <", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlLessThanOrEqualTo(Double value) {
            addCriterion("SL <=", value, "sl");
            return (Criteria) this;
        }

        public Criteria andSlIn(List<Double> values) {
            addCriterion("SL in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotIn(List<Double> values) {
            addCriterion("SL not in", values, "sl");
            return (Criteria) this;
        }

        public Criteria andSlBetween(Double value1, Double value2) {
            addCriterion("SL between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andSlNotBetween(Double value1, Double value2) {
            addCriterion("SL not between", value1, value2, "sl");
            return (Criteria) this;
        }

        public Criteria andDensityIsNull() {
            addCriterion("DENSITY is null");
            return (Criteria) this;
        }

        public Criteria andDensityIsNotNull() {
            addCriterion("DENSITY is not null");
            return (Criteria) this;
        }

        public Criteria andDensityEqualTo(Double value) {
            addCriterion("DENSITY =", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotEqualTo(Double value) {
            addCriterion("DENSITY <>", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThan(Double value) {
            addCriterion("DENSITY >", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThanOrEqualTo(Double value) {
            addCriterion("DENSITY >=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThan(Double value) {
            addCriterion("DENSITY <", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThanOrEqualTo(Double value) {
            addCriterion("DENSITY <=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityIn(List<Double> values) {
            addCriterion("DENSITY in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotIn(List<Double> values) {
            addCriterion("DENSITY not in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityBetween(Double value1, Double value2) {
            addCriterion("DENSITY between", value1, value2, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotBetween(Double value1, Double value2) {
            addCriterion("DENSITY not between", value1, value2, "density");
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