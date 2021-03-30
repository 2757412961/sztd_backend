package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class WeathersiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeathersiteExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("RECORD is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(Integer value) {
            addCriterion("RECORD =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(Integer value) {
            addCriterion("RECORD <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(Integer value) {
            addCriterion("RECORD >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(Integer value) {
            addCriterion("RECORD <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<Integer> values) {
            addCriterion("RECORD in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<Integer> values) {
            addCriterion("RECORD not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(Integer value1, Integer value2) {
            addCriterion("RECORD between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andTaAvgIsNull() {
            addCriterion("TA_AVG is null");
            return (Criteria) this;
        }

        public Criteria andTaAvgIsNotNull() {
            addCriterion("TA_AVG is not null");
            return (Criteria) this;
        }

        public Criteria andTaAvgEqualTo(Double value) {
            addCriterion("TA_AVG =", value, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgNotEqualTo(Double value) {
            addCriterion("TA_AVG <>", value, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgGreaterThan(Double value) {
            addCriterion("TA_AVG >", value, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgGreaterThanOrEqualTo(Double value) {
            addCriterion("TA_AVG >=", value, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgLessThan(Double value) {
            addCriterion("TA_AVG <", value, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgLessThanOrEqualTo(Double value) {
            addCriterion("TA_AVG <=", value, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgIn(List<Double> values) {
            addCriterion("TA_AVG in", values, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgNotIn(List<Double> values) {
            addCriterion("TA_AVG not in", values, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgBetween(Double value1, Double value2) {
            addCriterion("TA_AVG between", value1, value2, "taAvg");
            return (Criteria) this;
        }

        public Criteria andTaAvgNotBetween(Double value1, Double value2) {
            addCriterion("TA_AVG not between", value1, value2, "taAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgIsNull() {
            addCriterion("RH_AVG is null");
            return (Criteria) this;
        }

        public Criteria andRhAvgIsNotNull() {
            addCriterion("RH_AVG is not null");
            return (Criteria) this;
        }

        public Criteria andRhAvgEqualTo(Double value) {
            addCriterion("RH_AVG =", value, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgNotEqualTo(Double value) {
            addCriterion("RH_AVG <>", value, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgGreaterThan(Double value) {
            addCriterion("RH_AVG >", value, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgGreaterThanOrEqualTo(Double value) {
            addCriterion("RH_AVG >=", value, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgLessThan(Double value) {
            addCriterion("RH_AVG <", value, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgLessThanOrEqualTo(Double value) {
            addCriterion("RH_AVG <=", value, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgIn(List<Double> values) {
            addCriterion("RH_AVG in", values, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgNotIn(List<Double> values) {
            addCriterion("RH_AVG not in", values, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgBetween(Double value1, Double value2) {
            addCriterion("RH_AVG between", value1, value2, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andRhAvgNotBetween(Double value1, Double value2) {
            addCriterion("RH_AVG not between", value1, value2, "rhAvg");
            return (Criteria) this;
        }

        public Criteria andWsWvc1IsNull() {
            addCriterion("WS_WVC1 is null");
            return (Criteria) this;
        }

        public Criteria andWsWvc1IsNotNull() {
            addCriterion("WS_WVC1 is not null");
            return (Criteria) this;
        }

        public Criteria andWsWvc1EqualTo(Double value) {
            addCriterion("WS_WVC1 =", value, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1NotEqualTo(Double value) {
            addCriterion("WS_WVC1 <>", value, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1GreaterThan(Double value) {
            addCriterion("WS_WVC1 >", value, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1GreaterThanOrEqualTo(Double value) {
            addCriterion("WS_WVC1 >=", value, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1LessThan(Double value) {
            addCriterion("WS_WVC1 <", value, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1LessThanOrEqualTo(Double value) {
            addCriterion("WS_WVC1 <=", value, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1In(List<Double> values) {
            addCriterion("WS_WVC1 in", values, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1NotIn(List<Double> values) {
            addCriterion("WS_WVC1 not in", values, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1Between(Double value1, Double value2) {
            addCriterion("WS_WVC1 between", value1, value2, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc1NotBetween(Double value1, Double value2) {
            addCriterion("WS_WVC1 not between", value1, value2, "wsWvc1");
            return (Criteria) this;
        }

        public Criteria andWsWvc2IsNull() {
            addCriterion("WS_WVC2 is null");
            return (Criteria) this;
        }

        public Criteria andWsWvc2IsNotNull() {
            addCriterion("WS_WVC2 is not null");
            return (Criteria) this;
        }

        public Criteria andWsWvc2EqualTo(Double value) {
            addCriterion("WS_WVC2 =", value, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2NotEqualTo(Double value) {
            addCriterion("WS_WVC2 <>", value, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2GreaterThan(Double value) {
            addCriterion("WS_WVC2 >", value, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2GreaterThanOrEqualTo(Double value) {
            addCriterion("WS_WVC2 >=", value, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2LessThan(Double value) {
            addCriterion("WS_WVC2 <", value, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2LessThanOrEqualTo(Double value) {
            addCriterion("WS_WVC2 <=", value, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2In(List<Double> values) {
            addCriterion("WS_WVC2 in", values, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2NotIn(List<Double> values) {
            addCriterion("WS_WVC2 not in", values, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2Between(Double value1, Double value2) {
            addCriterion("WS_WVC2 between", value1, value2, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andWsWvc2NotBetween(Double value1, Double value2) {
            addCriterion("WS_WVC2 not between", value1, value2, "wsWvc2");
            return (Criteria) this;
        }

        public Criteria andPaAvgIsNull() {
            addCriterion("PA_AVG is null");
            return (Criteria) this;
        }

        public Criteria andPaAvgIsNotNull() {
            addCriterion("PA_AVG is not null");
            return (Criteria) this;
        }

        public Criteria andPaAvgEqualTo(Integer value) {
            addCriterion("PA_AVG =", value, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgNotEqualTo(Integer value) {
            addCriterion("PA_AVG <>", value, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgGreaterThan(Integer value) {
            addCriterion("PA_AVG >", value, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgGreaterThanOrEqualTo(Integer value) {
            addCriterion("PA_AVG >=", value, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgLessThan(Integer value) {
            addCriterion("PA_AVG <", value, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgLessThanOrEqualTo(Integer value) {
            addCriterion("PA_AVG <=", value, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgIn(List<Integer> values) {
            addCriterion("PA_AVG in", values, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgNotIn(List<Integer> values) {
            addCriterion("PA_AVG not in", values, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgBetween(Integer value1, Integer value2) {
            addCriterion("PA_AVG between", value1, value2, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPaAvgNotBetween(Integer value1, Integer value2) {
            addCriterion("PA_AVG not between", value1, value2, "paAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgIsNull() {
            addCriterion("PTEMP_AVG is null");
            return (Criteria) this;
        }

        public Criteria andPtempAvgIsNotNull() {
            addCriterion("PTEMP_AVG is not null");
            return (Criteria) this;
        }

        public Criteria andPtempAvgEqualTo(Double value) {
            addCriterion("PTEMP_AVG =", value, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgNotEqualTo(Double value) {
            addCriterion("PTEMP_AVG <>", value, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgGreaterThan(Double value) {
            addCriterion("PTEMP_AVG >", value, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgGreaterThanOrEqualTo(Double value) {
            addCriterion("PTEMP_AVG >=", value, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgLessThan(Double value) {
            addCriterion("PTEMP_AVG <", value, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgLessThanOrEqualTo(Double value) {
            addCriterion("PTEMP_AVG <=", value, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgIn(List<Double> values) {
            addCriterion("PTEMP_AVG in", values, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgNotIn(List<Double> values) {
            addCriterion("PTEMP_AVG not in", values, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgBetween(Double value1, Double value2) {
            addCriterion("PTEMP_AVG between", value1, value2, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andPtempAvgNotBetween(Double value1, Double value2) {
            addCriterion("PTEMP_AVG not between", value1, value2, "ptempAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgIsNull() {
            addCriterion("BATT_VOLT_AVG is null");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgIsNotNull() {
            addCriterion("BATT_VOLT_AVG is not null");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgEqualTo(Double value) {
            addCriterion("BATT_VOLT_AVG =", value, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgNotEqualTo(Double value) {
            addCriterion("BATT_VOLT_AVG <>", value, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgGreaterThan(Double value) {
            addCriterion("BATT_VOLT_AVG >", value, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgGreaterThanOrEqualTo(Double value) {
            addCriterion("BATT_VOLT_AVG >=", value, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgLessThan(Double value) {
            addCriterion("BATT_VOLT_AVG <", value, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgLessThanOrEqualTo(Double value) {
            addCriterion("BATT_VOLT_AVG <=", value, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgIn(List<Double> values) {
            addCriterion("BATT_VOLT_AVG in", values, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgNotIn(List<Double> values) {
            addCriterion("BATT_VOLT_AVG not in", values, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgBetween(Double value1, Double value2) {
            addCriterion("BATT_VOLT_AVG between", value1, value2, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andBattVoltAvgNotBetween(Double value1, Double value2) {
            addCriterion("BATT_VOLT_AVG not between", value1, value2, "battVoltAvg");
            return (Criteria) this;
        }

        public Criteria andStationIsNull() {
            addCriterion("STATION is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("STATION is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(String value) {
            addCriterion("STATION =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(String value) {
            addCriterion("STATION <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(String value) {
            addCriterion("STATION >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(String value) {
            addCriterion("STATION >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(String value) {
            addCriterion("STATION <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(String value) {
            addCriterion("STATION <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLike(String value) {
            addCriterion("STATION like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotLike(String value) {
            addCriterion("STATION not like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<String> values) {
            addCriterion("STATION in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<String> values) {
            addCriterion("STATION not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(String value1, String value2) {
            addCriterion("STATION between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(String value1, String value2) {
            addCriterion("STATION not between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andRainIsNull() {
            addCriterion("RAIN is null");
            return (Criteria) this;
        }

        public Criteria andRainIsNotNull() {
            addCriterion("RAIN is not null");
            return (Criteria) this;
        }

        public Criteria andRainEqualTo(Double value) {
            addCriterion("RAIN =", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainNotEqualTo(Double value) {
            addCriterion("RAIN <>", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainGreaterThan(Double value) {
            addCriterion("RAIN >", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainGreaterThanOrEqualTo(Double value) {
            addCriterion("RAIN >=", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainLessThan(Double value) {
            addCriterion("RAIN <", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainLessThanOrEqualTo(Double value) {
            addCriterion("RAIN <=", value, "rain");
            return (Criteria) this;
        }

        public Criteria andRainIn(List<Double> values) {
            addCriterion("RAIN in", values, "rain");
            return (Criteria) this;
        }

        public Criteria andRainNotIn(List<Double> values) {
            addCriterion("RAIN not in", values, "rain");
            return (Criteria) this;
        }

        public Criteria andRainBetween(Double value1, Double value2) {
            addCriterion("RAIN between", value1, value2, "rain");
            return (Criteria) this;
        }

        public Criteria andRainNotBetween(Double value1, Double value2) {
            addCriterion("RAIN not between", value1, value2, "rain");
            return (Criteria) this;
        }

        public Criteria andNjdIsNull() {
            addCriterion("NJD is null");
            return (Criteria) this;
        }

        public Criteria andNjdIsNotNull() {
            addCriterion("NJD is not null");
            return (Criteria) this;
        }

        public Criteria andNjdEqualTo(Double value) {
            addCriterion("NJD =", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotEqualTo(Double value) {
            addCriterion("NJD <>", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdGreaterThan(Double value) {
            addCriterion("NJD >", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdGreaterThanOrEqualTo(Double value) {
            addCriterion("NJD >=", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdLessThan(Double value) {
            addCriterion("NJD <", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdLessThanOrEqualTo(Double value) {
            addCriterion("NJD <=", value, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdIn(List<Double> values) {
            addCriterion("NJD in", values, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotIn(List<Double> values) {
            addCriterion("NJD not in", values, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdBetween(Double value1, Double value2) {
            addCriterion("NJD between", value1, value2, "njd");
            return (Criteria) this;
        }

        public Criteria andNjdNotBetween(Double value1, Double value2) {
            addCriterion("NJD not between", value1, value2, "njd");
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