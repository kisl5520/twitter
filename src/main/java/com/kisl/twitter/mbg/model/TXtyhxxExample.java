package com.kisl.twitter.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class TXtyhxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TXtyhxxExample() {
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

        public Criteria andGidIsNull() {
            addCriterion("GID is null");
            return (Criteria) this;
        }

        public Criteria andGidIsNotNull() {
            addCriterion("GID is not null");
            return (Criteria) this;
        }

        public Criteria andGidEqualTo(String value) {
            addCriterion("GID =", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotEqualTo(String value) {
            addCriterion("GID <>", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThan(String value) {
            addCriterion("GID >", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidGreaterThanOrEqualTo(String value) {
            addCriterion("GID >=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThan(String value) {
            addCriterion("GID <", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLessThanOrEqualTo(String value) {
            addCriterion("GID <=", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidLike(String value) {
            addCriterion("GID like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotLike(String value) {
            addCriterion("GID not like", value, "gid");
            return (Criteria) this;
        }

        public Criteria andGidIn(List<String> values) {
            addCriterion("GID in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotIn(List<String> values) {
            addCriterion("GID not in", values, "gid");
            return (Criteria) this;
        }

        public Criteria andGidBetween(String value1, String value2) {
            addCriterion("GID between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andGidNotBetween(String value1, String value2) {
            addCriterion("GID not between", value1, value2, "gid");
            return (Criteria) this;
        }

        public Criteria andYhdmIsNull() {
            addCriterion("YHDM is null");
            return (Criteria) this;
        }

        public Criteria andYhdmIsNotNull() {
            addCriterion("YHDM is not null");
            return (Criteria) this;
        }

        public Criteria andYhdmEqualTo(Integer value) {
            addCriterion("YHDM =", value, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmNotEqualTo(Integer value) {
            addCriterion("YHDM <>", value, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmGreaterThan(Integer value) {
            addCriterion("YHDM >", value, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmGreaterThanOrEqualTo(Integer value) {
            addCriterion("YHDM >=", value, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmLessThan(Integer value) {
            addCriterion("YHDM <", value, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmLessThanOrEqualTo(Integer value) {
            addCriterion("YHDM <=", value, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmIn(List<Integer> values) {
            addCriterion("YHDM in", values, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmNotIn(List<Integer> values) {
            addCriterion("YHDM not in", values, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmBetween(Integer value1, Integer value2) {
            addCriterion("YHDM between", value1, value2, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhdmNotBetween(Integer value1, Integer value2) {
            addCriterion("YHDM not between", value1, value2, "yhdm");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNull() {
            addCriterion("YHMC is null");
            return (Criteria) this;
        }

        public Criteria andYhmcIsNotNull() {
            addCriterion("YHMC is not null");
            return (Criteria) this;
        }

        public Criteria andYhmcEqualTo(String value) {
            addCriterion("YHMC =", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotEqualTo(String value) {
            addCriterion("YHMC <>", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThan(String value) {
            addCriterion("YHMC >", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcGreaterThanOrEqualTo(String value) {
            addCriterion("YHMC >=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThan(String value) {
            addCriterion("YHMC <", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLessThanOrEqualTo(String value) {
            addCriterion("YHMC <=", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcLike(String value) {
            addCriterion("YHMC like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotLike(String value) {
            addCriterion("YHMC not like", value, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcIn(List<String> values) {
            addCriterion("YHMC in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotIn(List<String> values) {
            addCriterion("YHMC not in", values, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcBetween(String value1, String value2) {
            addCriterion("YHMC between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andYhmcNotBetween(String value1, String value2) {
            addCriterion("YHMC not between", value1, value2, "yhmc");
            return (Criteria) this;
        }

        public Criteria andXsmcIsNull() {
            addCriterion("XSMC is null");
            return (Criteria) this;
        }

        public Criteria andXsmcIsNotNull() {
            addCriterion("XSMC is not null");
            return (Criteria) this;
        }

        public Criteria andXsmcEqualTo(String value) {
            addCriterion("XSMC =", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotEqualTo(String value) {
            addCriterion("XSMC <>", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcGreaterThan(String value) {
            addCriterion("XSMC >", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcGreaterThanOrEqualTo(String value) {
            addCriterion("XSMC >=", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcLessThan(String value) {
            addCriterion("XSMC <", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcLessThanOrEqualTo(String value) {
            addCriterion("XSMC <=", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcLike(String value) {
            addCriterion("XSMC like", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotLike(String value) {
            addCriterion("XSMC not like", value, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcIn(List<String> values) {
            addCriterion("XSMC in", values, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotIn(List<String> values) {
            addCriterion("XSMC not in", values, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcBetween(String value1, String value2) {
            addCriterion("XSMC between", value1, value2, "xsmc");
            return (Criteria) this;
        }

        public Criteria andXsmcNotBetween(String value1, String value2) {
            addCriterion("XSMC not between", value1, value2, "xsmc");
            return (Criteria) this;
        }

        public Criteria andYhmmIsNull() {
            addCriterion("YHMM is null");
            return (Criteria) this;
        }

        public Criteria andYhmmIsNotNull() {
            addCriterion("YHMM is not null");
            return (Criteria) this;
        }

        public Criteria andYhmmEqualTo(String value) {
            addCriterion("YHMM =", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotEqualTo(String value) {
            addCriterion("YHMM <>", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmGreaterThan(String value) {
            addCriterion("YHMM >", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmGreaterThanOrEqualTo(String value) {
            addCriterion("YHMM >=", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLessThan(String value) {
            addCriterion("YHMM <", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLessThanOrEqualTo(String value) {
            addCriterion("YHMM <=", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmLike(String value) {
            addCriterion("YHMM like", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotLike(String value) {
            addCriterion("YHMM not like", value, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmIn(List<String> values) {
            addCriterion("YHMM in", values, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotIn(List<String> values) {
            addCriterion("YHMM not in", values, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmBetween(String value1, String value2) {
            addCriterion("YHMM between", value1, value2, "yhmm");
            return (Criteria) this;
        }

        public Criteria andYhmmNotBetween(String value1, String value2) {
            addCriterion("YHMM not between", value1, value2, "yhmm");
            return (Criteria) this;
        }

        public Criteria andJavammIsNull() {
            addCriterion("JAVAMM is null");
            return (Criteria) this;
        }

        public Criteria andJavammIsNotNull() {
            addCriterion("JAVAMM is not null");
            return (Criteria) this;
        }

        public Criteria andJavammEqualTo(String value) {
            addCriterion("JAVAMM =", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammNotEqualTo(String value) {
            addCriterion("JAVAMM <>", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammGreaterThan(String value) {
            addCriterion("JAVAMM >", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammGreaterThanOrEqualTo(String value) {
            addCriterion("JAVAMM >=", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammLessThan(String value) {
            addCriterion("JAVAMM <", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammLessThanOrEqualTo(String value) {
            addCriterion("JAVAMM <=", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammLike(String value) {
            addCriterion("JAVAMM like", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammNotLike(String value) {
            addCriterion("JAVAMM not like", value, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammIn(List<String> values) {
            addCriterion("JAVAMM in", values, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammNotIn(List<String> values) {
            addCriterion("JAVAMM not in", values, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammBetween(String value1, String value2) {
            addCriterion("JAVAMM between", value1, value2, "javamm");
            return (Criteria) this;
        }

        public Criteria andJavammNotBetween(String value1, String value2) {
            addCriterion("JAVAMM not between", value1, value2, "javamm");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNull() {
            addCriterion("CZLX is null");
            return (Criteria) this;
        }

        public Criteria andCzlxIsNotNull() {
            addCriterion("CZLX is not null");
            return (Criteria) this;
        }

        public Criteria andCzlxEqualTo(Integer value) {
            addCriterion("CZLX =", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotEqualTo(Integer value) {
            addCriterion("CZLX <>", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThan(Integer value) {
            addCriterion("CZLX >", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxGreaterThanOrEqualTo(Integer value) {
            addCriterion("CZLX >=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThan(Integer value) {
            addCriterion("CZLX <", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxLessThanOrEqualTo(Integer value) {
            addCriterion("CZLX <=", value, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxIn(List<Integer> values) {
            addCriterion("CZLX in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotIn(List<Integer> values) {
            addCriterion("CZLX not in", values, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxBetween(Integer value1, Integer value2) {
            addCriterion("CZLX between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andCzlxNotBetween(Integer value1, Integer value2) {
            addCriterion("CZLX not between", value1, value2, "czlx");
            return (Criteria) this;
        }

        public Criteria andStopedIsNull() {
            addCriterion("STOPED is null");
            return (Criteria) this;
        }

        public Criteria andStopedIsNotNull() {
            addCriterion("STOPED is not null");
            return (Criteria) this;
        }

        public Criteria andStopedEqualTo(Integer value) {
            addCriterion("STOPED =", value, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedNotEqualTo(Integer value) {
            addCriterion("STOPED <>", value, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedGreaterThan(Integer value) {
            addCriterion("STOPED >", value, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOPED >=", value, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedLessThan(Integer value) {
            addCriterion("STOPED <", value, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedLessThanOrEqualTo(Integer value) {
            addCriterion("STOPED <=", value, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedIn(List<Integer> values) {
            addCriterion("STOPED in", values, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedNotIn(List<Integer> values) {
            addCriterion("STOPED not in", values, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedBetween(Integer value1, Integer value2) {
            addCriterion("STOPED between", value1, value2, "stoped");
            return (Criteria) this;
        }

        public Criteria andStopedNotBetween(Integer value1, Integer value2) {
            addCriterion("STOPED not between", value1, value2, "stoped");
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