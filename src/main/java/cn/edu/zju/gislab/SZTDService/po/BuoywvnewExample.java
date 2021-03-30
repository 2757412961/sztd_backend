package cn.edu.zju.gislab.SZTDService.po;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class BuoywvnewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuoywvnewExample() {
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

        public Criteria andTenwhIsNull() {
            addCriterion("TENWH is null");
            return (Criteria) this;
        }

        public Criteria andTenwhIsNotNull() {
            addCriterion("TENWH is not null");
            return (Criteria) this;
        }

        public Criteria andTenwhEqualTo(Double value) {
            addCriterion("TENWH =", value, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhNotEqualTo(Double value) {
            addCriterion("TENWH <>", value, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhGreaterThan(Double value) {
            addCriterion("TENWH >", value, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhGreaterThanOrEqualTo(Double value) {
            addCriterion("TENWH >=", value, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhLessThan(Double value) {
            addCriterion("TENWH <", value, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhLessThanOrEqualTo(Double value) {
            addCriterion("TENWH <=", value, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhIn(List<Double> values) {
            addCriterion("TENWH in", values, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhNotIn(List<Double> values) {
            addCriterion("TENWH not in", values, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhBetween(Double value1, Double value2) {
            addCriterion("TENWH between", value1, value2, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhNotBetween(Double value1, Double value2) {
            addCriterion("TENWH not between", value1, value2, "tenwh");
            return (Criteria) this;
        }

        public Criteria andTenwhtIsNull() {
            addCriterion("TENWHT is null");
            return (Criteria) this;
        }

        public Criteria andTenwhtIsNotNull() {
            addCriterion("TENWHT is not null");
            return (Criteria) this;
        }

        public Criteria andTenwhtEqualTo(Double value) {
            addCriterion("TENWHT =", value, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtNotEqualTo(Double value) {
            addCriterion("TENWHT <>", value, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtGreaterThan(Double value) {
            addCriterion("TENWHT >", value, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtGreaterThanOrEqualTo(Double value) {
            addCriterion("TENWHT >=", value, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtLessThan(Double value) {
            addCriterion("TENWHT <", value, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtLessThanOrEqualTo(Double value) {
            addCriterion("TENWHT <=", value, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtIn(List<Double> values) {
            addCriterion("TENWHT in", values, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtNotIn(List<Double> values) {
            addCriterion("TENWHT not in", values, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtBetween(Double value1, Double value2) {
            addCriterion("TENWHT between", value1, value2, "tenwht");
            return (Criteria) this;
        }

        public Criteria andTenwhtNotBetween(Double value1, Double value2) {
            addCriterion("TENWHT not between", value1, value2, "tenwht");
            return (Criteria) this;
        }

        public Criteria andAverwhIsNull() {
            addCriterion("AVERWH is null");
            return (Criteria) this;
        }

        public Criteria andAverwhIsNotNull() {
            addCriterion("AVERWH is not null");
            return (Criteria) this;
        }

        public Criteria andAverwhEqualTo(Double value) {
            addCriterion("AVERWH =", value, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhNotEqualTo(Double value) {
            addCriterion("AVERWH <>", value, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhGreaterThan(Double value) {
            addCriterion("AVERWH >", value, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhGreaterThanOrEqualTo(Double value) {
            addCriterion("AVERWH >=", value, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhLessThan(Double value) {
            addCriterion("AVERWH <", value, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhLessThanOrEqualTo(Double value) {
            addCriterion("AVERWH <=", value, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhIn(List<Double> values) {
            addCriterion("AVERWH in", values, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhNotIn(List<Double> values) {
            addCriterion("AVERWH not in", values, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhBetween(Double value1, Double value2) {
            addCriterion("AVERWH between", value1, value2, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhNotBetween(Double value1, Double value2) {
            addCriterion("AVERWH not between", value1, value2, "averwh");
            return (Criteria) this;
        }

        public Criteria andAverwhtIsNull() {
            addCriterion("AVERWHT is null");
            return (Criteria) this;
        }

        public Criteria andAverwhtIsNotNull() {
            addCriterion("AVERWHT is not null");
            return (Criteria) this;
        }

        public Criteria andAverwhtEqualTo(Double value) {
            addCriterion("AVERWHT =", value, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtNotEqualTo(Double value) {
            addCriterion("AVERWHT <>", value, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtGreaterThan(Double value) {
            addCriterion("AVERWHT >", value, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtGreaterThanOrEqualTo(Double value) {
            addCriterion("AVERWHT >=", value, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtLessThan(Double value) {
            addCriterion("AVERWHT <", value, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtLessThanOrEqualTo(Double value) {
            addCriterion("AVERWHT <=", value, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtIn(List<Double> values) {
            addCriterion("AVERWHT in", values, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtNotIn(List<Double> values) {
            addCriterion("AVERWHT not in", values, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtBetween(Double value1, Double value2) {
            addCriterion("AVERWHT between", value1, value2, "averwht");
            return (Criteria) this;
        }

        public Criteria andAverwhtNotBetween(Double value1, Double value2) {
            addCriterion("AVERWHT not between", value1, value2, "averwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhIsNull() {
            addCriterion("MAXWH is null");
            return (Criteria) this;
        }

        public Criteria andMaxwhIsNotNull() {
            addCriterion("MAXWH is not null");
            return (Criteria) this;
        }

        public Criteria andMaxwhEqualTo(Double value) {
            addCriterion("MAXWH =", value, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhNotEqualTo(Double value) {
            addCriterion("MAXWH <>", value, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhGreaterThan(Double value) {
            addCriterion("MAXWH >", value, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhGreaterThanOrEqualTo(Double value) {
            addCriterion("MAXWH >=", value, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhLessThan(Double value) {
            addCriterion("MAXWH <", value, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhLessThanOrEqualTo(Double value) {
            addCriterion("MAXWH <=", value, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhIn(List<Double> values) {
            addCriterion("MAXWH in", values, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhNotIn(List<Double> values) {
            addCriterion("MAXWH not in", values, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhBetween(Double value1, Double value2) {
            addCriterion("MAXWH between", value1, value2, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhNotBetween(Double value1, Double value2) {
            addCriterion("MAXWH not between", value1, value2, "maxwh");
            return (Criteria) this;
        }

        public Criteria andMaxwhtIsNull() {
            addCriterion("MAXWHT is null");
            return (Criteria) this;
        }

        public Criteria andMaxwhtIsNotNull() {
            addCriterion("MAXWHT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxwhtEqualTo(Double value) {
            addCriterion("MAXWHT =", value, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtNotEqualTo(Double value) {
            addCriterion("MAXWHT <>", value, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtGreaterThan(Double value) {
            addCriterion("MAXWHT >", value, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtGreaterThanOrEqualTo(Double value) {
            addCriterion("MAXWHT >=", value, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtLessThan(Double value) {
            addCriterion("MAXWHT <", value, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtLessThanOrEqualTo(Double value) {
            addCriterion("MAXWHT <=", value, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtIn(List<Double> values) {
            addCriterion("MAXWHT in", values, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtNotIn(List<Double> values) {
            addCriterion("MAXWHT not in", values, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtBetween(Double value1, Double value2) {
            addCriterion("MAXWHT between", value1, value2, "maxwht");
            return (Criteria) this;
        }

        public Criteria andMaxwhtNotBetween(Double value1, Double value2) {
            addCriterion("MAXWHT not between", value1, value2, "maxwht");
            return (Criteria) this;
        }

        public Criteria andSigwhIsNull() {
            addCriterion("SIGWH is null");
            return (Criteria) this;
        }

        public Criteria andSigwhIsNotNull() {
            addCriterion("SIGWH is not null");
            return (Criteria) this;
        }

        public Criteria andSigwhEqualTo(Double value) {
            addCriterion("SIGWH =", value, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhNotEqualTo(Double value) {
            addCriterion("SIGWH <>", value, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhGreaterThan(Double value) {
            addCriterion("SIGWH >", value, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhGreaterThanOrEqualTo(Double value) {
            addCriterion("SIGWH >=", value, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhLessThan(Double value) {
            addCriterion("SIGWH <", value, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhLessThanOrEqualTo(Double value) {
            addCriterion("SIGWH <=", value, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhIn(List<Double> values) {
            addCriterion("SIGWH in", values, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhNotIn(List<Double> values) {
            addCriterion("SIGWH not in", values, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhBetween(Double value1, Double value2) {
            addCriterion("SIGWH between", value1, value2, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhNotBetween(Double value1, Double value2) {
            addCriterion("SIGWH not between", value1, value2, "sigwh");
            return (Criteria) this;
        }

        public Criteria andSigwhtIsNull() {
            addCriterion("SIGWHT is null");
            return (Criteria) this;
        }

        public Criteria andSigwhtIsNotNull() {
            addCriterion("SIGWHT is not null");
            return (Criteria) this;
        }

        public Criteria andSigwhtEqualTo(Double value) {
            addCriterion("SIGWHT =", value, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtNotEqualTo(Double value) {
            addCriterion("SIGWHT <>", value, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtGreaterThan(Double value) {
            addCriterion("SIGWHT >", value, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtGreaterThanOrEqualTo(Double value) {
            addCriterion("SIGWHT >=", value, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtLessThan(Double value) {
            addCriterion("SIGWHT <", value, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtLessThanOrEqualTo(Double value) {
            addCriterion("SIGWHT <=", value, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtIn(List<Double> values) {
            addCriterion("SIGWHT in", values, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtNotIn(List<Double> values) {
            addCriterion("SIGWHT not in", values, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtBetween(Double value1, Double value2) {
            addCriterion("SIGWHT between", value1, value2, "sigwht");
            return (Criteria) this;
        }

        public Criteria andSigwhtNotBetween(Double value1, Double value2) {
            addCriterion("SIGWHT not between", value1, value2, "sigwht");
            return (Criteria) this;
        }

        public Criteria andMaindireIsNull() {
            addCriterion("MAINDIRE is null");
            return (Criteria) this;
        }

        public Criteria andMaindireIsNotNull() {
            addCriterion("MAINDIRE is not null");
            return (Criteria) this;
        }

        public Criteria andMaindireEqualTo(Integer value) {
            addCriterion("MAINDIRE =", value, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireNotEqualTo(Integer value) {
            addCriterion("MAINDIRE <>", value, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireGreaterThan(Integer value) {
            addCriterion("MAINDIRE >", value, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAINDIRE >=", value, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireLessThan(Integer value) {
            addCriterion("MAINDIRE <", value, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireLessThanOrEqualTo(Integer value) {
            addCriterion("MAINDIRE <=", value, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireIn(List<Integer> values) {
            addCriterion("MAINDIRE in", values, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireNotIn(List<Integer> values) {
            addCriterion("MAINDIRE not in", values, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireBetween(Integer value1, Integer value2) {
            addCriterion("MAINDIRE between", value1, value2, "maindire");
            return (Criteria) this;
        }

        public Criteria andMaindireNotBetween(Integer value1, Integer value2) {
            addCriterion("MAINDIRE not between", value1, value2, "maindire");
            return (Criteria) this;
        }

        public Criteria andWavenumIsNull() {
            addCriterion("WAVENUM is null");
            return (Criteria) this;
        }

        public Criteria andWavenumIsNotNull() {
            addCriterion("WAVENUM is not null");
            return (Criteria) this;
        }

        public Criteria andWavenumEqualTo(Integer value) {
            addCriterion("WAVENUM =", value, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumNotEqualTo(Integer value) {
            addCriterion("WAVENUM <>", value, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumGreaterThan(Integer value) {
            addCriterion("WAVENUM >", value, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAVENUM >=", value, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumLessThan(Integer value) {
            addCriterion("WAVENUM <", value, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumLessThanOrEqualTo(Integer value) {
            addCriterion("WAVENUM <=", value, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumIn(List<Integer> values) {
            addCriterion("WAVENUM in", values, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumNotIn(List<Integer> values) {
            addCriterion("WAVENUM not in", values, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumBetween(Integer value1, Integer value2) {
            addCriterion("WAVENUM between", value1, value2, "wavenum");
            return (Criteria) this;
        }

        public Criteria andWavenumNotBetween(Integer value1, Integer value2) {
            addCriterion("WAVENUM not between", value1, value2, "wavenum");
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