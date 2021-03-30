package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BuoygpsnewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuoygpsnewExample() {
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

        public Criteria andLongtIsNull() {
            addCriterion("LONGT is null");
            return (Criteria) this;
        }

        public Criteria andLongtIsNotNull() {
            addCriterion("LONGT is not null");
            return (Criteria) this;
        }

        public Criteria andLongtEqualTo(Double value) {
            addCriterion("LONGT =", value, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtNotEqualTo(Double value) {
            addCriterion("LONGT <>", value, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtGreaterThan(Double value) {
            addCriterion("LONGT >", value, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGT >=", value, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtLessThan(Double value) {
            addCriterion("LONGT <", value, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtLessThanOrEqualTo(Double value) {
            addCriterion("LONGT <=", value, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtIn(List<Double> values) {
            addCriterion("LONGT in", values, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtNotIn(List<Double> values) {
            addCriterion("LONGT not in", values, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtBetween(Double value1, Double value2) {
            addCriterion("LONGT between", value1, value2, "longt");
            return (Criteria) this;
        }

        public Criteria andLongtNotBetween(Double value1, Double value2) {
            addCriterion("LONGT not between", value1, value2, "longt");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("LAT is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("LAT is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(Double value) {
            addCriterion("LAT =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(Double value) {
            addCriterion("LAT <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(Double value) {
            addCriterion("LAT >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(Double value) {
            addCriterion("LAT >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(Double value) {
            addCriterion("LAT <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(Double value) {
            addCriterion("LAT <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<Double> values) {
            addCriterion("LAT in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<Double> values) {
            addCriterion("LAT not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(Double value1, Double value2) {
            addCriterion("LAT between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(Double value1, Double value2) {
            addCriterion("LAT not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andPitchIsNull() {
            addCriterion("PITCH is null");
            return (Criteria) this;
        }

        public Criteria andPitchIsNotNull() {
            addCriterion("PITCH is not null");
            return (Criteria) this;
        }

        public Criteria andPitchEqualTo(Double value) {
            addCriterion("PITCH =", value, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchNotEqualTo(Double value) {
            addCriterion("PITCH <>", value, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchGreaterThan(Double value) {
            addCriterion("PITCH >", value, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchGreaterThanOrEqualTo(Double value) {
            addCriterion("PITCH >=", value, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchLessThan(Double value) {
            addCriterion("PITCH <", value, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchLessThanOrEqualTo(Double value) {
            addCriterion("PITCH <=", value, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchIn(List<Double> values) {
            addCriterion("PITCH in", values, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchNotIn(List<Double> values) {
            addCriterion("PITCH not in", values, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchBetween(Double value1, Double value2) {
            addCriterion("PITCH between", value1, value2, "pitch");
            return (Criteria) this;
        }

        public Criteria andPitchNotBetween(Double value1, Double value2) {
            addCriterion("PITCH not between", value1, value2, "pitch");
            return (Criteria) this;
        }

        public Criteria andRollIsNull() {
            addCriterion("ROLL is null");
            return (Criteria) this;
        }

        public Criteria andRollIsNotNull() {
            addCriterion("ROLL is not null");
            return (Criteria) this;
        }

        public Criteria andRollEqualTo(Double value) {
            addCriterion("ROLL =", value, "roll");
            return (Criteria) this;
        }

        public Criteria andRollNotEqualTo(Double value) {
            addCriterion("ROLL <>", value, "roll");
            return (Criteria) this;
        }

        public Criteria andRollGreaterThan(Double value) {
            addCriterion("ROLL >", value, "roll");
            return (Criteria) this;
        }

        public Criteria andRollGreaterThanOrEqualTo(Double value) {
            addCriterion("ROLL >=", value, "roll");
            return (Criteria) this;
        }

        public Criteria andRollLessThan(Double value) {
            addCriterion("ROLL <", value, "roll");
            return (Criteria) this;
        }

        public Criteria andRollLessThanOrEqualTo(Double value) {
            addCriterion("ROLL <=", value, "roll");
            return (Criteria) this;
        }

        public Criteria andRollIn(List<Double> values) {
            addCriterion("ROLL in", values, "roll");
            return (Criteria) this;
        }

        public Criteria andRollNotIn(List<Double> values) {
            addCriterion("ROLL not in", values, "roll");
            return (Criteria) this;
        }

        public Criteria andRollBetween(Double value1, Double value2) {
            addCriterion("ROLL between", value1, value2, "roll");
            return (Criteria) this;
        }

        public Criteria andRollNotBetween(Double value1, Double value2) {
            addCriterion("ROLL not between", value1, value2, "roll");
            return (Criteria) this;
        }

        public Criteria andWatertemIsNull() {
            addCriterion("WATERTEM is null");
            return (Criteria) this;
        }

        public Criteria andWatertemIsNotNull() {
            addCriterion("WATERTEM is not null");
            return (Criteria) this;
        }

        public Criteria andWatertemEqualTo(Double value) {
            addCriterion("WATERTEM =", value, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemNotEqualTo(Double value) {
            addCriterion("WATERTEM <>", value, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemGreaterThan(Double value) {
            addCriterion("WATERTEM >", value, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemGreaterThanOrEqualTo(Double value) {
            addCriterion("WATERTEM >=", value, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemLessThan(Double value) {
            addCriterion("WATERTEM <", value, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemLessThanOrEqualTo(Double value) {
            addCriterion("WATERTEM <=", value, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemIn(List<Double> values) {
            addCriterion("WATERTEM in", values, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemNotIn(List<Double> values) {
            addCriterion("WATERTEM not in", values, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemBetween(Double value1, Double value2) {
            addCriterion("WATERTEM between", value1, value2, "watertem");
            return (Criteria) this;
        }

        public Criteria andWatertemNotBetween(Double value1, Double value2) {
            addCriterion("WATERTEM not between", value1, value2, "watertem");
            return (Criteria) this;
        }

        public Criteria andLightaIsNull() {
            addCriterion("LIGHTA is null");
            return (Criteria) this;
        }

        public Criteria andLightaIsNotNull() {
            addCriterion("LIGHTA is not null");
            return (Criteria) this;
        }

        public Criteria andLightaEqualTo(Integer value) {
            addCriterion("LIGHTA =", value, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaNotEqualTo(Integer value) {
            addCriterion("LIGHTA <>", value, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaGreaterThan(Integer value) {
            addCriterion("LIGHTA >", value, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIGHTA >=", value, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaLessThan(Integer value) {
            addCriterion("LIGHTA <", value, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaLessThanOrEqualTo(Integer value) {
            addCriterion("LIGHTA <=", value, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaIn(List<Integer> values) {
            addCriterion("LIGHTA in", values, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaNotIn(List<Integer> values) {
            addCriterion("LIGHTA not in", values, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaBetween(Integer value1, Integer value2) {
            addCriterion("LIGHTA between", value1, value2, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightaNotBetween(Integer value1, Integer value2) {
            addCriterion("LIGHTA not between", value1, value2, "lighta");
            return (Criteria) this;
        }

        public Criteria andLightbIsNull() {
            addCriterion("LIGHTB is null");
            return (Criteria) this;
        }

        public Criteria andLightbIsNotNull() {
            addCriterion("LIGHTB is not null");
            return (Criteria) this;
        }

        public Criteria andLightbEqualTo(Integer value) {
            addCriterion("LIGHTB =", value, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbNotEqualTo(Integer value) {
            addCriterion("LIGHTB <>", value, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbGreaterThan(Integer value) {
            addCriterion("LIGHTB >", value, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIGHTB >=", value, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbLessThan(Integer value) {
            addCriterion("LIGHTB <", value, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbLessThanOrEqualTo(Integer value) {
            addCriterion("LIGHTB <=", value, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbIn(List<Integer> values) {
            addCriterion("LIGHTB in", values, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbNotIn(List<Integer> values) {
            addCriterion("LIGHTB not in", values, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbBetween(Integer value1, Integer value2) {
            addCriterion("LIGHTB between", value1, value2, "lightb");
            return (Criteria) this;
        }

        public Criteria andLightbNotBetween(Integer value1, Integer value2) {
            addCriterion("LIGHTB not between", value1, value2, "lightb");
            return (Criteria) this;
        }

        public Criteria andAisIsNull() {
            addCriterion("AIS is null");
            return (Criteria) this;
        }

        public Criteria andAisIsNotNull() {
            addCriterion("AIS is not null");
            return (Criteria) this;
        }

        public Criteria andAisEqualTo(Double value) {
            addCriterion("AIS =", value, "ais");
            return (Criteria) this;
        }

        public Criteria andAisNotEqualTo(Double value) {
            addCriterion("AIS <>", value, "ais");
            return (Criteria) this;
        }

        public Criteria andAisGreaterThan(Double value) {
            addCriterion("AIS >", value, "ais");
            return (Criteria) this;
        }

        public Criteria andAisGreaterThanOrEqualTo(Double value) {
            addCriterion("AIS >=", value, "ais");
            return (Criteria) this;
        }

        public Criteria andAisLessThan(Double value) {
            addCriterion("AIS <", value, "ais");
            return (Criteria) this;
        }

        public Criteria andAisLessThanOrEqualTo(Double value) {
            addCriterion("AIS <=", value, "ais");
            return (Criteria) this;
        }

        public Criteria andAisIn(List<Double> values) {
            addCriterion("AIS in", values, "ais");
            return (Criteria) this;
        }

        public Criteria andAisNotIn(List<Double> values) {
            addCriterion("AIS not in", values, "ais");
            return (Criteria) this;
        }

        public Criteria andAisBetween(Double value1, Double value2) {
            addCriterion("AIS between", value1, value2, "ais");
            return (Criteria) this;
        }

        public Criteria andAisNotBetween(Double value1, Double value2) {
            addCriterion("AIS not between", value1, value2, "ais");
            return (Criteria) this;
        }

        public Criteria andWaterpoIsNull() {
            addCriterion("WATERPO is null");
            return (Criteria) this;
        }

        public Criteria andWaterpoIsNotNull() {
            addCriterion("WATERPO is not null");
            return (Criteria) this;
        }

        public Criteria andWaterpoEqualTo(Integer value) {
            addCriterion("WATERPO =", value, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoNotEqualTo(Integer value) {
            addCriterion("WATERPO <>", value, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoGreaterThan(Integer value) {
            addCriterion("WATERPO >", value, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATERPO >=", value, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoLessThan(Integer value) {
            addCriterion("WATERPO <", value, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoLessThanOrEqualTo(Integer value) {
            addCriterion("WATERPO <=", value, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoIn(List<Integer> values) {
            addCriterion("WATERPO in", values, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoNotIn(List<Integer> values) {
            addCriterion("WATERPO not in", values, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoBetween(Integer value1, Integer value2) {
            addCriterion("WATERPO between", value1, value2, "waterpo");
            return (Criteria) this;
        }

        public Criteria andWaterpoNotBetween(Integer value1, Integer value2) {
            addCriterion("WATERPO not between", value1, value2, "waterpo");
            return (Criteria) this;
        }

        public Criteria andCurrpreIsNull() {
            addCriterion("CURRPRE is null");
            return (Criteria) this;
        }

        public Criteria andCurrpreIsNotNull() {
            addCriterion("CURRPRE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrpreEqualTo(Double value) {
            addCriterion("CURRPRE =", value, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreNotEqualTo(Double value) {
            addCriterion("CURRPRE <>", value, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreGreaterThan(Double value) {
            addCriterion("CURRPRE >", value, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreGreaterThanOrEqualTo(Double value) {
            addCriterion("CURRPRE >=", value, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreLessThan(Double value) {
            addCriterion("CURRPRE <", value, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreLessThanOrEqualTo(Double value) {
            addCriterion("CURRPRE <=", value, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreIn(List<Double> values) {
            addCriterion("CURRPRE in", values, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreNotIn(List<Double> values) {
            addCriterion("CURRPRE not in", values, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreBetween(Double value1, Double value2) {
            addCriterion("CURRPRE between", value1, value2, "currpre");
            return (Criteria) this;
        }

        public Criteria andCurrpreNotBetween(Double value1, Double value2) {
            addCriterion("CURRPRE not between", value1, value2, "currpre");
            return (Criteria) this;
        }

        public Criteria andCr1000IsNull() {
            addCriterion("CR1000 is null");
            return (Criteria) this;
        }

        public Criteria andCr1000IsNotNull() {
            addCriterion("CR1000 is not null");
            return (Criteria) this;
        }

        public Criteria andCr1000EqualTo(Double value) {
            addCriterion("CR1000 =", value, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000NotEqualTo(Double value) {
            addCriterion("CR1000 <>", value, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000GreaterThan(Double value) {
            addCriterion("CR1000 >", value, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000GreaterThanOrEqualTo(Double value) {
            addCriterion("CR1000 >=", value, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000LessThan(Double value) {
            addCriterion("CR1000 <", value, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000LessThanOrEqualTo(Double value) {
            addCriterion("CR1000 <=", value, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000In(List<Double> values) {
            addCriterion("CR1000 in", values, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000NotIn(List<Double> values) {
            addCriterion("CR1000 not in", values, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000Between(Double value1, Double value2) {
            addCriterion("CR1000 between", value1, value2, "cr1000");
            return (Criteria) this;
        }

        public Criteria andCr1000NotBetween(Double value1, Double value2) {
            addCriterion("CR1000 not between", value1, value2, "cr1000");
            return (Criteria) this;
        }

        public Criteria andBattepreIsNull() {
            addCriterion("BATTEPRE is null");
            return (Criteria) this;
        }

        public Criteria andBattepreIsNotNull() {
            addCriterion("BATTEPRE is not null");
            return (Criteria) this;
        }

        public Criteria andBattepreEqualTo(Double value) {
            addCriterion("BATTEPRE =", value, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreNotEqualTo(Double value) {
            addCriterion("BATTEPRE <>", value, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreGreaterThan(Double value) {
            addCriterion("BATTEPRE >", value, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreGreaterThanOrEqualTo(Double value) {
            addCriterion("BATTEPRE >=", value, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreLessThan(Double value) {
            addCriterion("BATTEPRE <", value, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreLessThanOrEqualTo(Double value) {
            addCriterion("BATTEPRE <=", value, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreIn(List<Double> values) {
            addCriterion("BATTEPRE in", values, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreNotIn(List<Double> values) {
            addCriterion("BATTEPRE not in", values, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreBetween(Double value1, Double value2) {
            addCriterion("BATTEPRE between", value1, value2, "battepre");
            return (Criteria) this;
        }

        public Criteria andBattepreNotBetween(Double value1, Double value2) {
            addCriterion("BATTEPRE not between", value1, value2, "battepre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreIsNull() {
            addCriterion("SUNBATPRE is null");
            return (Criteria) this;
        }

        public Criteria andSunbatpreIsNotNull() {
            addCriterion("SUNBATPRE is not null");
            return (Criteria) this;
        }

        public Criteria andSunbatpreEqualTo(Double value) {
            addCriterion("SUNBATPRE =", value, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreNotEqualTo(Double value) {
            addCriterion("SUNBATPRE <>", value, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreGreaterThan(Double value) {
            addCriterion("SUNBATPRE >", value, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreGreaterThanOrEqualTo(Double value) {
            addCriterion("SUNBATPRE >=", value, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreLessThan(Double value) {
            addCriterion("SUNBATPRE <", value, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreLessThanOrEqualTo(Double value) {
            addCriterion("SUNBATPRE <=", value, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreIn(List<Double> values) {
            addCriterion("SUNBATPRE in", values, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreNotIn(List<Double> values) {
            addCriterion("SUNBATPRE not in", values, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreBetween(Double value1, Double value2) {
            addCriterion("SUNBATPRE between", value1, value2, "sunbatpre");
            return (Criteria) this;
        }

        public Criteria andSunbatpreNotBetween(Double value1, Double value2) {
            addCriterion("SUNBATPRE not between", value1, value2, "sunbatpre");
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