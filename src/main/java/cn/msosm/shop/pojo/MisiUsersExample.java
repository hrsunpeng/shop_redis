package cn.msosm.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MisiUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MisiUsersExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andOldUseridIsNull() {
            addCriterion("old_userid is null");
            return (Criteria) this;
        }

        public Criteria andOldUseridIsNotNull() {
            addCriterion("old_userid is not null");
            return (Criteria) this;
        }

        public Criteria andOldUseridEqualTo(String value) {
            addCriterion("old_userid =", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridNotEqualTo(String value) {
            addCriterion("old_userid <>", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridGreaterThan(String value) {
            addCriterion("old_userid >", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridGreaterThanOrEqualTo(String value) {
            addCriterion("old_userid >=", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridLessThan(String value) {
            addCriterion("old_userid <", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridLessThanOrEqualTo(String value) {
            addCriterion("old_userid <=", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridLike(String value) {
            addCriterion("old_userid like", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridNotLike(String value) {
            addCriterion("old_userid not like", value, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridIn(List<String> values) {
            addCriterion("old_userid in", values, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridNotIn(List<String> values) {
            addCriterion("old_userid not in", values, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridBetween(String value1, String value2) {
            addCriterion("old_userid between", value1, value2, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andOldUseridNotBetween(String value1, String value2) {
            addCriterion("old_userid not between", value1, value2, "oldUserid");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNull() {
            addCriterion("paypwd is null");
            return (Criteria) this;
        }

        public Criteria andPaypwdIsNotNull() {
            addCriterion("paypwd is not null");
            return (Criteria) this;
        }

        public Criteria andPaypwdEqualTo(String value) {
            addCriterion("paypwd =", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotEqualTo(String value) {
            addCriterion("paypwd <>", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThan(String value) {
            addCriterion("paypwd >", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdGreaterThanOrEqualTo(String value) {
            addCriterion("paypwd >=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThan(String value) {
            addCriterion("paypwd <", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLessThanOrEqualTo(String value) {
            addCriterion("paypwd <=", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdLike(String value) {
            addCriterion("paypwd like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotLike(String value) {
            addCriterion("paypwd not like", value, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdIn(List<String> values) {
            addCriterion("paypwd in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotIn(List<String> values) {
            addCriterion("paypwd not in", values, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdBetween(String value1, String value2) {
            addCriterion("paypwd between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andPaypwdNotBetween(String value1, String value2) {
            addCriterion("paypwd not between", value1, value2, "paypwd");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Boolean value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Boolean value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Boolean value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Boolean value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Boolean value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Boolean> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Boolean> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Boolean value1, Boolean value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNull() {
            addCriterion("user_money is null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIsNotNull() {
            addCriterion("user_money is not null");
            return (Criteria) this;
        }

        public Criteria andUserMoneyEqualTo(BigDecimal value) {
            addCriterion("user_money =", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotEqualTo(BigDecimal value) {
            addCriterion("user_money <>", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThan(BigDecimal value) {
            addCriterion("user_money >", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_money >=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThan(BigDecimal value) {
            addCriterion("user_money <", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_money <=", value, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyIn(List<BigDecimal> values) {
            addCriterion("user_money in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotIn(List<BigDecimal> values) {
            addCriterion("user_money not in", values, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_money between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andUserMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_money not between", value1, value2, "userMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNull() {
            addCriterion("frozen_money is null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIsNotNull() {
            addCriterion("frozen_money is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyEqualTo(BigDecimal value) {
            addCriterion("frozen_money =", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotEqualTo(BigDecimal value) {
            addCriterion("frozen_money <>", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThan(BigDecimal value) {
            addCriterion("frozen_money >", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_money >=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThan(BigDecimal value) {
            addCriterion("frozen_money <", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_money <=", value, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyIn(List<BigDecimal> values) {
            addCriterion("frozen_money in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotIn(List<BigDecimal> values) {
            addCriterion("frozen_money not in", values, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_money between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_money not between", value1, value2, "frozenMoney");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsIsNull() {
            addCriterion("frozen_withdrawals is null");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsIsNotNull() {
            addCriterion("frozen_withdrawals is not null");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsEqualTo(BigDecimal value) {
            addCriterion("frozen_withdrawals =", value, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsNotEqualTo(BigDecimal value) {
            addCriterion("frozen_withdrawals <>", value, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsGreaterThan(BigDecimal value) {
            addCriterion("frozen_withdrawals >", value, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_withdrawals >=", value, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsLessThan(BigDecimal value) {
            addCriterion("frozen_withdrawals <", value, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("frozen_withdrawals <=", value, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsIn(List<BigDecimal> values) {
            addCriterion("frozen_withdrawals in", values, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsNotIn(List<BigDecimal> values) {
            addCriterion("frozen_withdrawals not in", values, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_withdrawals between", value1, value2, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andFrozenWithdrawalsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("frozen_withdrawals not between", value1, value2, "frozenWithdrawals");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberIsNull() {
            addCriterion("underling_number is null");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberIsNotNull() {
            addCriterion("underling_number is not null");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberEqualTo(Integer value) {
            addCriterion("underling_number =", value, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberNotEqualTo(Integer value) {
            addCriterion("underling_number <>", value, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberGreaterThan(Integer value) {
            addCriterion("underling_number >", value, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("underling_number >=", value, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberLessThan(Integer value) {
            addCriterion("underling_number <", value, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberLessThanOrEqualTo(Integer value) {
            addCriterion("underling_number <=", value, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberIn(List<Integer> values) {
            addCriterion("underling_number in", values, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberNotIn(List<Integer> values) {
            addCriterion("underling_number not in", values, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberBetween(Integer value1, Integer value2) {
            addCriterion("underling_number between", value1, value2, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andUnderlingNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("underling_number not between", value1, value2, "underlingNumber");
            return (Criteria) this;
        }

        public Criteria andWhitePointsIsNull() {
            addCriterion("white_points is null");
            return (Criteria) this;
        }

        public Criteria andWhitePointsIsNotNull() {
            addCriterion("white_points is not null");
            return (Criteria) this;
        }

        public Criteria andWhitePointsEqualTo(Integer value) {
            addCriterion("white_points =", value, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsNotEqualTo(Integer value) {
            addCriterion("white_points <>", value, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsGreaterThan(Integer value) {
            addCriterion("white_points >", value, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("white_points >=", value, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsLessThan(Integer value) {
            addCriterion("white_points <", value, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsLessThanOrEqualTo(Integer value) {
            addCriterion("white_points <=", value, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsIn(List<Integer> values) {
            addCriterion("white_points in", values, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsNotIn(List<Integer> values) {
            addCriterion("white_points not in", values, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsBetween(Integer value1, Integer value2) {
            addCriterion("white_points between", value1, value2, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andWhitePointsNotBetween(Integer value1, Integer value2) {
            addCriterion("white_points not between", value1, value2, "whitePoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsIsNull() {
            addCriterion("red_points is null");
            return (Criteria) this;
        }

        public Criteria andRedPointsIsNotNull() {
            addCriterion("red_points is not null");
            return (Criteria) this;
        }

        public Criteria andRedPointsEqualTo(Integer value) {
            addCriterion("red_points =", value, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsNotEqualTo(Integer value) {
            addCriterion("red_points <>", value, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsGreaterThan(Integer value) {
            addCriterion("red_points >", value, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("red_points >=", value, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsLessThan(Integer value) {
            addCriterion("red_points <", value, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsLessThanOrEqualTo(Integer value) {
            addCriterion("red_points <=", value, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsIn(List<Integer> values) {
            addCriterion("red_points in", values, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsNotIn(List<Integer> values) {
            addCriterion("red_points not in", values, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsBetween(Integer value1, Integer value2) {
            addCriterion("red_points between", value1, value2, "redPoints");
            return (Criteria) this;
        }

        public Criteria andRedPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("red_points not between", value1, value2, "redPoints");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andOldPhoneIsNull() {
            addCriterion("old_phone is null");
            return (Criteria) this;
        }

        public Criteria andOldPhoneIsNotNull() {
            addCriterion("old_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOldPhoneEqualTo(String value) {
            addCriterion("old_phone =", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneNotEqualTo(String value) {
            addCriterion("old_phone <>", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneGreaterThan(String value) {
            addCriterion("old_phone >", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("old_phone >=", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneLessThan(String value) {
            addCriterion("old_phone <", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneLessThanOrEqualTo(String value) {
            addCriterion("old_phone <=", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneLike(String value) {
            addCriterion("old_phone like", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneNotLike(String value) {
            addCriterion("old_phone not like", value, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneIn(List<String> values) {
            addCriterion("old_phone in", values, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneNotIn(List<String> values) {
            addCriterion("old_phone not in", values, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneBetween(String value1, String value2) {
            addCriterion("old_phone between", value1, value2, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andOldPhoneNotBetween(String value1, String value2) {
            addCriterion("old_phone not between", value1, value2, "oldPhone");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedIsNull() {
            addCriterion("mobile_validated is null");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedIsNotNull() {
            addCriterion("mobile_validated is not null");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedEqualTo(Byte value) {
            addCriterion("mobile_validated =", value, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedNotEqualTo(Byte value) {
            addCriterion("mobile_validated <>", value, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedGreaterThan(Byte value) {
            addCriterion("mobile_validated >", value, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedGreaterThanOrEqualTo(Byte value) {
            addCriterion("mobile_validated >=", value, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedLessThan(Byte value) {
            addCriterion("mobile_validated <", value, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedLessThanOrEqualTo(Byte value) {
            addCriterion("mobile_validated <=", value, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedIn(List<Byte> values) {
            addCriterion("mobile_validated in", values, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedNotIn(List<Byte> values) {
            addCriterion("mobile_validated not in", values, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedBetween(Byte value1, Byte value2) {
            addCriterion("mobile_validated between", value1, value2, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andMobileValidatedNotBetween(Byte value1, Byte value2) {
            addCriterion("mobile_validated not between", value1, value2, "mobileValidated");
            return (Criteria) this;
        }

        public Criteria andOauthTypeIsNull() {
            addCriterion("oauth_type is null");
            return (Criteria) this;
        }

        public Criteria andOauthTypeIsNotNull() {
            addCriterion("oauth_type is not null");
            return (Criteria) this;
        }

        public Criteria andOauthTypeEqualTo(String value) {
            addCriterion("oauth_type =", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotEqualTo(String value) {
            addCriterion("oauth_type <>", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeGreaterThan(String value) {
            addCriterion("oauth_type >", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("oauth_type >=", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeLessThan(String value) {
            addCriterion("oauth_type <", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeLessThanOrEqualTo(String value) {
            addCriterion("oauth_type <=", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeLike(String value) {
            addCriterion("oauth_type like", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotLike(String value) {
            addCriterion("oauth_type not like", value, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeIn(List<String> values) {
            addCriterion("oauth_type in", values, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotIn(List<String> values) {
            addCriterion("oauth_type not in", values, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeBetween(String value1, String value2) {
            addCriterion("oauth_type between", value1, value2, "oauthType");
            return (Criteria) this;
        }

        public Criteria andOauthTypeNotBetween(String value1, String value2) {
            addCriterion("oauth_type not between", value1, value2, "oauthType");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidIsNull() {
            addCriterion("wxp_openid is null");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidIsNotNull() {
            addCriterion("wxp_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidEqualTo(String value) {
            addCriterion("wxp_openid =", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidNotEqualTo(String value) {
            addCriterion("wxp_openid <>", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidGreaterThan(String value) {
            addCriterion("wxp_openid >", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("wxp_openid >=", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidLessThan(String value) {
            addCriterion("wxp_openid <", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidLessThanOrEqualTo(String value) {
            addCriterion("wxp_openid <=", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidLike(String value) {
            addCriterion("wxp_openid like", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidNotLike(String value) {
            addCriterion("wxp_openid not like", value, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidIn(List<String> values) {
            addCriterion("wxp_openid in", values, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidNotIn(List<String> values) {
            addCriterion("wxp_openid not in", values, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidBetween(String value1, String value2) {
            addCriterion("wxp_openid between", value1, value2, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andWxpOpenidNotBetween(String value1, String value2) {
            addCriterion("wxp_openid not between", value1, value2, "wxpOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIsNull() {
            addCriterion("app_openid is null");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIsNotNull() {
            addCriterion("app_openid is not null");
            return (Criteria) this;
        }

        public Criteria andAppOpenidEqualTo(String value) {
            addCriterion("app_openid =", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotEqualTo(String value) {
            addCriterion("app_openid <>", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidGreaterThan(String value) {
            addCriterion("app_openid >", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("app_openid >=", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLessThan(String value) {
            addCriterion("app_openid <", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLessThanOrEqualTo(String value) {
            addCriterion("app_openid <=", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidLike(String value) {
            addCriterion("app_openid like", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotLike(String value) {
            addCriterion("app_openid not like", value, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidIn(List<String> values) {
            addCriterion("app_openid in", values, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotIn(List<String> values) {
            addCriterion("app_openid not in", values, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidBetween(String value1, String value2) {
            addCriterion("app_openid between", value1, value2, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andAppOpenidNotBetween(String value1, String value2) {
            addCriterion("app_openid not between", value1, value2, "appOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidIsNull() {
            addCriterion("pc_openid is null");
            return (Criteria) this;
        }

        public Criteria andPcOpenidIsNotNull() {
            addCriterion("pc_openid is not null");
            return (Criteria) this;
        }

        public Criteria andPcOpenidEqualTo(String value) {
            addCriterion("pc_openid =", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidNotEqualTo(String value) {
            addCriterion("pc_openid <>", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidGreaterThan(String value) {
            addCriterion("pc_openid >", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("pc_openid >=", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidLessThan(String value) {
            addCriterion("pc_openid <", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidLessThanOrEqualTo(String value) {
            addCriterion("pc_openid <=", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidLike(String value) {
            addCriterion("pc_openid like", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidNotLike(String value) {
            addCriterion("pc_openid not like", value, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidIn(List<String> values) {
            addCriterion("pc_openid in", values, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidNotIn(List<String> values) {
            addCriterion("pc_openid not in", values, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidBetween(String value1, String value2) {
            addCriterion("pc_openid between", value1, value2, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andPcOpenidNotBetween(String value1, String value2) {
            addCriterion("pc_openid not between", value1, value2, "pcOpenid");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNull() {
            addCriterion("unionid is null");
            return (Criteria) this;
        }

        public Criteria andUnionidIsNotNull() {
            addCriterion("unionid is not null");
            return (Criteria) this;
        }

        public Criteria andUnionidEqualTo(String value) {
            addCriterion("unionid =", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotEqualTo(String value) {
            addCriterion("unionid <>", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThan(String value) {
            addCriterion("unionid >", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidGreaterThanOrEqualTo(String value) {
            addCriterion("unionid >=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThan(String value) {
            addCriterion("unionid <", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLessThanOrEqualTo(String value) {
            addCriterion("unionid <=", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidLike(String value) {
            addCriterion("unionid like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotLike(String value) {
            addCriterion("unionid not like", value, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidIn(List<String> values) {
            addCriterion("unionid in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotIn(List<String> values) {
            addCriterion("unionid not in", values, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidBetween(String value1, String value2) {
            addCriterion("unionid between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andUnionidNotBetween(String value1, String value2) {
            addCriterion("unionid not between", value1, value2, "unionid");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNull() {
            addCriterion("head_pic is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicIsNotNull() {
            addCriterion("head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicEqualTo(String value) {
            addCriterion("head_pic =", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotEqualTo(String value) {
            addCriterion("head_pic <>", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThan(String value) {
            addCriterion("head_pic >", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic >=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThan(String value) {
            addCriterion("head_pic <", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLessThanOrEqualTo(String value) {
            addCriterion("head_pic <=", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicLike(String value) {
            addCriterion("head_pic like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotLike(String value) {
            addCriterion("head_pic not like", value, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicIn(List<String> values) {
            addCriterion("head_pic in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotIn(List<String> values) {
            addCriterion("head_pic not in", values, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicBetween(String value1, String value2) {
            addCriterion("head_pic between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andHeadPicNotBetween(String value1, String value2) {
            addCriterion("head_pic not between", value1, value2, "headPic");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedIsNull() {
            addCriterion("email_validated is null");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedIsNotNull() {
            addCriterion("email_validated is not null");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedEqualTo(Boolean value) {
            addCriterion("email_validated =", value, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedNotEqualTo(Boolean value) {
            addCriterion("email_validated <>", value, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedGreaterThan(Boolean value) {
            addCriterion("email_validated >", value, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("email_validated >=", value, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedLessThan(Boolean value) {
            addCriterion("email_validated <", value, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedLessThanOrEqualTo(Boolean value) {
            addCriterion("email_validated <=", value, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedIn(List<Boolean> values) {
            addCriterion("email_validated in", values, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedNotIn(List<Boolean> values) {
            addCriterion("email_validated not in", values, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedBetween(Boolean value1, Boolean value2) {
            addCriterion("email_validated between", value1, value2, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andEmailValidatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("email_validated not between", value1, value2, "emailValidated");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Byte value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Byte value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Byte value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Byte value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Byte value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Byte> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Byte> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Byte value1, Byte value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andBlacknameIsNull() {
            addCriterion("blackname is null");
            return (Criteria) this;
        }

        public Criteria andBlacknameIsNotNull() {
            addCriterion("blackname is not null");
            return (Criteria) this;
        }

        public Criteria andBlacknameEqualTo(Boolean value) {
            addCriterion("blackname =", value, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameNotEqualTo(Boolean value) {
            addCriterion("blackname <>", value, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameGreaterThan(Boolean value) {
            addCriterion("blackname >", value, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameGreaterThanOrEqualTo(Boolean value) {
            addCriterion("blackname >=", value, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameLessThan(Boolean value) {
            addCriterion("blackname <", value, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameLessThanOrEqualTo(Boolean value) {
            addCriterion("blackname <=", value, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameIn(List<Boolean> values) {
            addCriterion("blackname in", values, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameNotIn(List<Boolean> values) {
            addCriterion("blackname not in", values, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameBetween(Boolean value1, Boolean value2) {
            addCriterion("blackname between", value1, value2, "blackname");
            return (Criteria) this;
        }

        public Criteria andBlacknameNotBetween(Boolean value1, Boolean value2) {
            addCriterion("blackname not between", value1, value2, "blackname");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderIsNull() {
            addCriterion("first_leader is null");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderIsNotNull() {
            addCriterion("first_leader is not null");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderEqualTo(String value) {
            addCriterion("first_leader =", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderNotEqualTo(String value) {
            addCriterion("first_leader <>", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderGreaterThan(String value) {
            addCriterion("first_leader >", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("first_leader >=", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderLessThan(String value) {
            addCriterion("first_leader <", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderLessThanOrEqualTo(String value) {
            addCriterion("first_leader <=", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderLike(String value) {
            addCriterion("first_leader like", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderNotLike(String value) {
            addCriterion("first_leader not like", value, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderIn(List<String> values) {
            addCriterion("first_leader in", values, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderNotIn(List<String> values) {
            addCriterion("first_leader not in", values, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderBetween(String value1, String value2) {
            addCriterion("first_leader between", value1, value2, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andFirstLeaderNotBetween(String value1, String value2) {
            addCriterion("first_leader not between", value1, value2, "firstLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderIsNull() {
            addCriterion("second_leader is null");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderIsNotNull() {
            addCriterion("second_leader is not null");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderEqualTo(String value) {
            addCriterion("second_leader =", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderNotEqualTo(String value) {
            addCriterion("second_leader <>", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderGreaterThan(String value) {
            addCriterion("second_leader >", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("second_leader >=", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderLessThan(String value) {
            addCriterion("second_leader <", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderLessThanOrEqualTo(String value) {
            addCriterion("second_leader <=", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderLike(String value) {
            addCriterion("second_leader like", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderNotLike(String value) {
            addCriterion("second_leader not like", value, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderIn(List<String> values) {
            addCriterion("second_leader in", values, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderNotIn(List<String> values) {
            addCriterion("second_leader not in", values, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderBetween(String value1, String value2) {
            addCriterion("second_leader between", value1, value2, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andSecondLeaderNotBetween(String value1, String value2) {
            addCriterion("second_leader not between", value1, value2, "secondLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderIsNull() {
            addCriterion("third_leader is null");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderIsNotNull() {
            addCriterion("third_leader is not null");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderEqualTo(String value) {
            addCriterion("third_leader =", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderNotEqualTo(String value) {
            addCriterion("third_leader <>", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderGreaterThan(String value) {
            addCriterion("third_leader >", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("third_leader >=", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderLessThan(String value) {
            addCriterion("third_leader <", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderLessThanOrEqualTo(String value) {
            addCriterion("third_leader <=", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderLike(String value) {
            addCriterion("third_leader like", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderNotLike(String value) {
            addCriterion("third_leader not like", value, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderIn(List<String> values) {
            addCriterion("third_leader in", values, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderNotIn(List<String> values) {
            addCriterion("third_leader not in", values, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderBetween(String value1, String value2) {
            addCriterion("third_leader between", value1, value2, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andThirdLeaderNotBetween(String value1, String value2) {
            addCriterion("third_leader not between", value1, value2, "thirdLeader");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNull() {
            addCriterion("reg_time is null");
            return (Criteria) this;
        }

        public Criteria andRegTimeIsNotNull() {
            addCriterion("reg_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegTimeEqualTo(Integer value) {
            addCriterion("reg_time =", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotEqualTo(Integer value) {
            addCriterion("reg_time <>", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThan(Integer value) {
            addCriterion("reg_time >", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reg_time >=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThan(Integer value) {
            addCriterion("reg_time <", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeLessThanOrEqualTo(Integer value) {
            addCriterion("reg_time <=", value, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeIn(List<Integer> values) {
            addCriterion("reg_time in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotIn(List<Integer> values) {
            addCriterion("reg_time not in", values, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeBetween(Integer value1, Integer value2) {
            addCriterion("reg_time between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andRegTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("reg_time not between", value1, value2, "regTime");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNull() {
            addCriterion("last_ip is null");
            return (Criteria) this;
        }

        public Criteria andLastIpIsNotNull() {
            addCriterion("last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andLastIpEqualTo(String value) {
            addCriterion("last_ip =", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotEqualTo(String value) {
            addCriterion("last_ip <>", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThan(String value) {
            addCriterion("last_ip >", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("last_ip >=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThan(String value) {
            addCriterion("last_ip <", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLessThanOrEqualTo(String value) {
            addCriterion("last_ip <=", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpLike(String value) {
            addCriterion("last_ip like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotLike(String value) {
            addCriterion("last_ip not like", value, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpIn(List<String> values) {
            addCriterion("last_ip in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotIn(List<String> values) {
            addCriterion("last_ip not in", values, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpBetween(String value1, String value2) {
            addCriterion("last_ip between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastIpNotBetween(String value1, String value2) {
            addCriterion("last_ip not between", value1, value2, "lastIp");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNull() {
            addCriterion("last_login is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginIsNotNull() {
            addCriterion("last_login is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginEqualTo(Integer value) {
            addCriterion("last_login =", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotEqualTo(Integer value) {
            addCriterion("last_login <>", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThan(Integer value) {
            addCriterion("last_login >", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_login >=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThan(Integer value) {
            addCriterion("last_login <", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginLessThanOrEqualTo(Integer value) {
            addCriterion("last_login <=", value, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginIn(List<Integer> values) {
            addCriterion("last_login in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotIn(List<Integer> values) {
            addCriterion("last_login not in", values, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginBetween(Integer value1, Integer value2) {
            addCriterion("last_login between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andLastLoginNotBetween(Integer value1, Integer value2) {
            addCriterion("last_login not between", value1, value2, "lastLogin");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNull() {
            addCriterion("time_out is null");
            return (Criteria) this;
        }

        public Criteria andTimeOutIsNotNull() {
            addCriterion("time_out is not null");
            return (Criteria) this;
        }

        public Criteria andTimeOutEqualTo(Integer value) {
            addCriterion("time_out =", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotEqualTo(Integer value) {
            addCriterion("time_out <>", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThan(Integer value) {
            addCriterion("time_out >", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_out >=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThan(Integer value) {
            addCriterion("time_out <", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutLessThanOrEqualTo(Integer value) {
            addCriterion("time_out <=", value, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutIn(List<Integer> values) {
            addCriterion("time_out in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotIn(List<Integer> values) {
            addCriterion("time_out not in", values, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutBetween(Integer value1, Integer value2) {
            addCriterion("time_out between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andTimeOutNotBetween(Integer value1, Integer value2) {
            addCriterion("time_out not between", value1, value2, "timeOut");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesIsNull() {
            addCriterion("join_places is null");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesIsNotNull() {
            addCriterion("join_places is not null");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesEqualTo(Integer value) {
            addCriterion("join_places =", value, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesNotEqualTo(Integer value) {
            addCriterion("join_places <>", value, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesGreaterThan(Integer value) {
            addCriterion("join_places >", value, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_places >=", value, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesLessThan(Integer value) {
            addCriterion("join_places <", value, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesLessThanOrEqualTo(Integer value) {
            addCriterion("join_places <=", value, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesIn(List<Integer> values) {
            addCriterion("join_places in", values, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesNotIn(List<Integer> values) {
            addCriterion("join_places not in", values, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesBetween(Integer value1, Integer value2) {
            addCriterion("join_places between", value1, value2, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andJoinPlacesNotBetween(Integer value1, Integer value2) {
            addCriterion("join_places not between", value1, value2, "joinPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesIsNull() {
            addCriterion("history_count_places is null");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesIsNotNull() {
            addCriterion("history_count_places is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesEqualTo(Integer value) {
            addCriterion("history_count_places =", value, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesNotEqualTo(Integer value) {
            addCriterion("history_count_places <>", value, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesGreaterThan(Integer value) {
            addCriterion("history_count_places >", value, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_count_places >=", value, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesLessThan(Integer value) {
            addCriterion("history_count_places <", value, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesLessThanOrEqualTo(Integer value) {
            addCriterion("history_count_places <=", value, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesIn(List<Integer> values) {
            addCriterion("history_count_places in", values, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesNotIn(List<Integer> values) {
            addCriterion("history_count_places not in", values, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesBetween(Integer value1, Integer value2) {
            addCriterion("history_count_places between", value1, value2, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryCountPlacesNotBetween(Integer value1, Integer value2) {
            addCriterion("history_count_places not between", value1, value2, "historyCountPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesIsNull() {
            addCriterion("history_left_places is null");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesIsNotNull() {
            addCriterion("history_left_places is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesEqualTo(Integer value) {
            addCriterion("history_left_places =", value, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesNotEqualTo(Integer value) {
            addCriterion("history_left_places <>", value, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesGreaterThan(Integer value) {
            addCriterion("history_left_places >", value, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("history_left_places >=", value, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesLessThan(Integer value) {
            addCriterion("history_left_places <", value, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesLessThanOrEqualTo(Integer value) {
            addCriterion("history_left_places <=", value, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesIn(List<Integer> values) {
            addCriterion("history_left_places in", values, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesNotIn(List<Integer> values) {
            addCriterion("history_left_places not in", values, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesBetween(Integer value1, Integer value2) {
            addCriterion("history_left_places between", value1, value2, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andHistoryLeftPlacesNotBetween(Integer value1, Integer value2) {
            addCriterion("history_left_places not between", value1, value2, "historyLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesIsNull() {
            addCriterion("reward_count_places is null");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesIsNotNull() {
            addCriterion("reward_count_places is not null");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesEqualTo(Integer value) {
            addCriterion("reward_count_places =", value, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesNotEqualTo(Integer value) {
            addCriterion("reward_count_places <>", value, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesGreaterThan(Integer value) {
            addCriterion("reward_count_places >", value, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_count_places >=", value, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesLessThan(Integer value) {
            addCriterion("reward_count_places <", value, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesLessThanOrEqualTo(Integer value) {
            addCriterion("reward_count_places <=", value, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesIn(List<Integer> values) {
            addCriterion("reward_count_places in", values, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesNotIn(List<Integer> values) {
            addCriterion("reward_count_places not in", values, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesBetween(Integer value1, Integer value2) {
            addCriterion("reward_count_places between", value1, value2, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardCountPlacesNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_count_places not between", value1, value2, "rewardCountPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesIsNull() {
            addCriterion("reward_left_places is null");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesIsNotNull() {
            addCriterion("reward_left_places is not null");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesEqualTo(Integer value) {
            addCriterion("reward_left_places =", value, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesNotEqualTo(Integer value) {
            addCriterion("reward_left_places <>", value, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesGreaterThan(Integer value) {
            addCriterion("reward_left_places >", value, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("reward_left_places >=", value, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesLessThan(Integer value) {
            addCriterion("reward_left_places <", value, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesLessThanOrEqualTo(Integer value) {
            addCriterion("reward_left_places <=", value, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesIn(List<Integer> values) {
            addCriterion("reward_left_places in", values, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesNotIn(List<Integer> values) {
            addCriterion("reward_left_places not in", values, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesBetween(Integer value1, Integer value2) {
            addCriterion("reward_left_places between", value1, value2, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andRewardLeftPlacesNotBetween(Integer value1, Integer value2) {
            addCriterion("reward_left_places not between", value1, value2, "rewardLeftPlaces");
            return (Criteria) this;
        }

        public Criteria andStrtopassIsNull() {
            addCriterion("strtopass is null");
            return (Criteria) this;
        }

        public Criteria andStrtopassIsNotNull() {
            addCriterion("strtopass is not null");
            return (Criteria) this;
        }

        public Criteria andStrtopassEqualTo(String value) {
            addCriterion("strtopass =", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassNotEqualTo(String value) {
            addCriterion("strtopass <>", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassGreaterThan(String value) {
            addCriterion("strtopass >", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassGreaterThanOrEqualTo(String value) {
            addCriterion("strtopass >=", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassLessThan(String value) {
            addCriterion("strtopass <", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassLessThanOrEqualTo(String value) {
            addCriterion("strtopass <=", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassLike(String value) {
            addCriterion("strtopass like", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassNotLike(String value) {
            addCriterion("strtopass not like", value, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassIn(List<String> values) {
            addCriterion("strtopass in", values, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassNotIn(List<String> values) {
            addCriterion("strtopass not in", values, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassBetween(String value1, String value2) {
            addCriterion("strtopass between", value1, value2, "strtopass");
            return (Criteria) this;
        }

        public Criteria andStrtopassNotBetween(String value1, String value2) {
            addCriterion("strtopass not between", value1, value2, "strtopass");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDetailedIsNull() {
            addCriterion("detailed is null");
            return (Criteria) this;
        }

        public Criteria andDetailedIsNotNull() {
            addCriterion("detailed is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedEqualTo(String value) {
            addCriterion("detailed =", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotEqualTo(String value) {
            addCriterion("detailed <>", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedGreaterThan(String value) {
            addCriterion("detailed >", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedGreaterThanOrEqualTo(String value) {
            addCriterion("detailed >=", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedLessThan(String value) {
            addCriterion("detailed <", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedLessThanOrEqualTo(String value) {
            addCriterion("detailed <=", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedLike(String value) {
            addCriterion("detailed like", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotLike(String value) {
            addCriterion("detailed not like", value, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedIn(List<String> values) {
            addCriterion("detailed in", values, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotIn(List<String> values) {
            addCriterion("detailed not in", values, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedBetween(String value1, String value2) {
            addCriterion("detailed between", value1, value2, "detailed");
            return (Criteria) this;
        }

        public Criteria andDetailedNotBetween(String value1, String value2) {
            addCriterion("detailed not between", value1, value2, "detailed");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(Integer value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(Integer value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(Integer value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(Integer value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(Integer value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(Integer value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<Integer> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<Integer> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(Integer value1, Integer value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(Integer value1, Integer value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andRecBussinesIsNull() {
            addCriterion("rec_bussines is null");
            return (Criteria) this;
        }

        public Criteria andRecBussinesIsNotNull() {
            addCriterion("rec_bussines is not null");
            return (Criteria) this;
        }

        public Criteria andRecBussinesEqualTo(String value) {
            addCriterion("rec_bussines =", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesNotEqualTo(String value) {
            addCriterion("rec_bussines <>", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesGreaterThan(String value) {
            addCriterion("rec_bussines >", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesGreaterThanOrEqualTo(String value) {
            addCriterion("rec_bussines >=", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesLessThan(String value) {
            addCriterion("rec_bussines <", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesLessThanOrEqualTo(String value) {
            addCriterion("rec_bussines <=", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesLike(String value) {
            addCriterion("rec_bussines like", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesNotLike(String value) {
            addCriterion("rec_bussines not like", value, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesIn(List<String> values) {
            addCriterion("rec_bussines in", values, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesNotIn(List<String> values) {
            addCriterion("rec_bussines not in", values, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesBetween(String value1, String value2) {
            addCriterion("rec_bussines between", value1, value2, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecBussinesNotBetween(String value1, String value2) {
            addCriterion("rec_bussines not between", value1, value2, "recBussines");
            return (Criteria) this;
        }

        public Criteria andRecUseridIsNull() {
            addCriterion("rec_userid is null");
            return (Criteria) this;
        }

        public Criteria andRecUseridIsNotNull() {
            addCriterion("rec_userid is not null");
            return (Criteria) this;
        }

        public Criteria andRecUseridEqualTo(String value) {
            addCriterion("rec_userid =", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridNotEqualTo(String value) {
            addCriterion("rec_userid <>", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridGreaterThan(String value) {
            addCriterion("rec_userid >", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridGreaterThanOrEqualTo(String value) {
            addCriterion("rec_userid >=", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridLessThan(String value) {
            addCriterion("rec_userid <", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridLessThanOrEqualTo(String value) {
            addCriterion("rec_userid <=", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridLike(String value) {
            addCriterion("rec_userid like", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridNotLike(String value) {
            addCriterion("rec_userid not like", value, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridIn(List<String> values) {
            addCriterion("rec_userid in", values, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridNotIn(List<String> values) {
            addCriterion("rec_userid not in", values, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridBetween(String value1, String value2) {
            addCriterion("rec_userid between", value1, value2, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecUseridNotBetween(String value1, String value2) {
            addCriterion("rec_userid not between", value1, value2, "recUserid");
            return (Criteria) this;
        }

        public Criteria andRecVipIsNull() {
            addCriterion("rec_vip is null");
            return (Criteria) this;
        }

        public Criteria andRecVipIsNotNull() {
            addCriterion("rec_vip is not null");
            return (Criteria) this;
        }

        public Criteria andRecVipEqualTo(String value) {
            addCriterion("rec_vip =", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipNotEqualTo(String value) {
            addCriterion("rec_vip <>", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipGreaterThan(String value) {
            addCriterion("rec_vip >", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipGreaterThanOrEqualTo(String value) {
            addCriterion("rec_vip >=", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipLessThan(String value) {
            addCriterion("rec_vip <", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipLessThanOrEqualTo(String value) {
            addCriterion("rec_vip <=", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipLike(String value) {
            addCriterion("rec_vip like", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipNotLike(String value) {
            addCriterion("rec_vip not like", value, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipIn(List<String> values) {
            addCriterion("rec_vip in", values, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipNotIn(List<String> values) {
            addCriterion("rec_vip not in", values, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipBetween(String value1, String value2) {
            addCriterion("rec_vip between", value1, value2, "recVip");
            return (Criteria) this;
        }

        public Criteria andRecVipNotBetween(String value1, String value2) {
            addCriterion("rec_vip not between", value1, value2, "recVip");
            return (Criteria) this;
        }

        public Criteria andPlacesIsNull() {
            addCriterion("places is null");
            return (Criteria) this;
        }

        public Criteria andPlacesIsNotNull() {
            addCriterion("places is not null");
            return (Criteria) this;
        }

        public Criteria andPlacesEqualTo(Integer value) {
            addCriterion("places =", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesNotEqualTo(Integer value) {
            addCriterion("places <>", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesGreaterThan(Integer value) {
            addCriterion("places >", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesGreaterThanOrEqualTo(Integer value) {
            addCriterion("places >=", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesLessThan(Integer value) {
            addCriterion("places <", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesLessThanOrEqualTo(Integer value) {
            addCriterion("places <=", value, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesIn(List<Integer> values) {
            addCriterion("places in", values, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesNotIn(List<Integer> values) {
            addCriterion("places not in", values, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesBetween(Integer value1, Integer value2) {
            addCriterion("places between", value1, value2, "places");
            return (Criteria) this;
        }

        public Criteria andPlacesNotBetween(Integer value1, Integer value2) {
            addCriterion("places not between", value1, value2, "places");
            return (Criteria) this;
        }

        public Criteria andHolderIsNull() {
            addCriterion("holder is null");
            return (Criteria) this;
        }

        public Criteria andHolderIsNotNull() {
            addCriterion("holder is not null");
            return (Criteria) this;
        }

        public Criteria andHolderEqualTo(String value) {
            addCriterion("holder =", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderNotEqualTo(String value) {
            addCriterion("holder <>", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderGreaterThan(String value) {
            addCriterion("holder >", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderGreaterThanOrEqualTo(String value) {
            addCriterion("holder >=", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderLessThan(String value) {
            addCriterion("holder <", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderLessThanOrEqualTo(String value) {
            addCriterion("holder <=", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderLike(String value) {
            addCriterion("holder like", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderNotLike(String value) {
            addCriterion("holder not like", value, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderIn(List<String> values) {
            addCriterion("holder in", values, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderNotIn(List<String> values) {
            addCriterion("holder not in", values, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderBetween(String value1, String value2) {
            addCriterion("holder between", value1, value2, "holder");
            return (Criteria) this;
        }

        public Criteria andHolderNotBetween(String value1, String value2) {
            addCriterion("holder not between", value1, value2, "holder");
            return (Criteria) this;
        }

        public Criteria andBankNumbreIsNull() {
            addCriterion("bank_numbre is null");
            return (Criteria) this;
        }

        public Criteria andBankNumbreIsNotNull() {
            addCriterion("bank_numbre is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumbreEqualTo(String value) {
            addCriterion("bank_numbre =", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreNotEqualTo(String value) {
            addCriterion("bank_numbre <>", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreGreaterThan(String value) {
            addCriterion("bank_numbre >", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreGreaterThanOrEqualTo(String value) {
            addCriterion("bank_numbre >=", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreLessThan(String value) {
            addCriterion("bank_numbre <", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreLessThanOrEqualTo(String value) {
            addCriterion("bank_numbre <=", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreLike(String value) {
            addCriterion("bank_numbre like", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreNotLike(String value) {
            addCriterion("bank_numbre not like", value, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreIn(List<String> values) {
            addCriterion("bank_numbre in", values, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreNotIn(List<String> values) {
            addCriterion("bank_numbre not in", values, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreBetween(String value1, String value2) {
            addCriterion("bank_numbre between", value1, value2, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankNumbreNotBetween(String value1, String value2) {
            addCriterion("bank_numbre not between", value1, value2, "bankNumbre");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressIsNull() {
            addCriterion("bank_card_address is null");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressIsNotNull() {
            addCriterion("bank_card_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressEqualTo(String value) {
            addCriterion("bank_card_address =", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotEqualTo(String value) {
            addCriterion("bank_card_address <>", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressGreaterThan(String value) {
            addCriterion("bank_card_address >", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_address >=", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressLessThan(String value) {
            addCriterion("bank_card_address <", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_card_address <=", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressLike(String value) {
            addCriterion("bank_card_address like", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotLike(String value) {
            addCriterion("bank_card_address not like", value, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressIn(List<String> values) {
            addCriterion("bank_card_address in", values, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotIn(List<String> values) {
            addCriterion("bank_card_address not in", values, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressBetween(String value1, String value2) {
            addCriterion("bank_card_address between", value1, value2, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andBankCardAddressNotBetween(String value1, String value2) {
            addCriterion("bank_card_address not between", value1, value2, "bankCardAddress");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNull() {
            addCriterion("is_free is null");
            return (Criteria) this;
        }

        public Criteria andIsFreeIsNotNull() {
            addCriterion("is_free is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreeEqualTo(Boolean value) {
            addCriterion("is_free =", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotEqualTo(Boolean value) {
            addCriterion("is_free <>", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThan(Boolean value) {
            addCriterion("is_free >", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_free >=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThan(Boolean value) {
            addCriterion("is_free <", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_free <=", value, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeIn(List<Boolean> values) {
            addCriterion("is_free in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotIn(List<Boolean> values) {
            addCriterion("is_free not in", values, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andIsFreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_free not between", value1, value2, "isFree");
            return (Criteria) this;
        }

        public Criteria andOauthIsNull() {
            addCriterion("oauth is null");
            return (Criteria) this;
        }

        public Criteria andOauthIsNotNull() {
            addCriterion("oauth is not null");
            return (Criteria) this;
        }

        public Criteria andOauthEqualTo(String value) {
            addCriterion("oauth =", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotEqualTo(String value) {
            addCriterion("oauth <>", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthGreaterThan(String value) {
            addCriterion("oauth >", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthGreaterThanOrEqualTo(String value) {
            addCriterion("oauth >=", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthLessThan(String value) {
            addCriterion("oauth <", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthLessThanOrEqualTo(String value) {
            addCriterion("oauth <=", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthLike(String value) {
            addCriterion("oauth like", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotLike(String value) {
            addCriterion("oauth not like", value, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthIn(List<String> values) {
            addCriterion("oauth in", values, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotIn(List<String> values) {
            addCriterion("oauth not in", values, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthBetween(String value1, String value2) {
            addCriterion("oauth between", value1, value2, "oauth");
            return (Criteria) this;
        }

        public Criteria andOauthNotBetween(String value1, String value2) {
            addCriterion("oauth not between", value1, value2, "oauth");
            return (Criteria) this;
        }

        public Criteria andWxTokenIsNull() {
            addCriterion("wx_token is null");
            return (Criteria) this;
        }

        public Criteria andWxTokenIsNotNull() {
            addCriterion("wx_token is not null");
            return (Criteria) this;
        }

        public Criteria andWxTokenEqualTo(String value) {
            addCriterion("wx_token =", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotEqualTo(String value) {
            addCriterion("wx_token <>", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenGreaterThan(String value) {
            addCriterion("wx_token >", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenGreaterThanOrEqualTo(String value) {
            addCriterion("wx_token >=", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLessThan(String value) {
            addCriterion("wx_token <", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLessThanOrEqualTo(String value) {
            addCriterion("wx_token <=", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenLike(String value) {
            addCriterion("wx_token like", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotLike(String value) {
            addCriterion("wx_token not like", value, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenIn(List<String> values) {
            addCriterion("wx_token in", values, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotIn(List<String> values) {
            addCriterion("wx_token not in", values, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenBetween(String value1, String value2) {
            addCriterion("wx_token between", value1, value2, "wxToken");
            return (Criteria) this;
        }

        public Criteria andWxTokenNotBetween(String value1, String value2) {
            addCriterion("wx_token not between", value1, value2, "wxToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNull() {
            addCriterion("access_token is null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIsNotNull() {
            addCriterion("access_token is not null");
            return (Criteria) this;
        }

        public Criteria andAccessTokenEqualTo(String value) {
            addCriterion("access_token =", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotEqualTo(String value) {
            addCriterion("access_token <>", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThan(String value) {
            addCriterion("access_token >", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenGreaterThanOrEqualTo(String value) {
            addCriterion("access_token >=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThan(String value) {
            addCriterion("access_token <", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLessThanOrEqualTo(String value) {
            addCriterion("access_token <=", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenLike(String value) {
            addCriterion("access_token like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotLike(String value) {
            addCriterion("access_token not like", value, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenIn(List<String> values) {
            addCriterion("access_token in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotIn(List<String> values) {
            addCriterion("access_token not in", values, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenBetween(String value1, String value2) {
            addCriterion("access_token between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andAccessTokenNotBetween(String value1, String value2) {
            addCriterion("access_token not between", value1, value2, "accessToken");
            return (Criteria) this;
        }

        public Criteria andWxEwmIsNull() {
            addCriterion("wx_ewm is null");
            return (Criteria) this;
        }

        public Criteria andWxEwmIsNotNull() {
            addCriterion("wx_ewm is not null");
            return (Criteria) this;
        }

        public Criteria andWxEwmEqualTo(String value) {
            addCriterion("wx_ewm =", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmNotEqualTo(String value) {
            addCriterion("wx_ewm <>", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmGreaterThan(String value) {
            addCriterion("wx_ewm >", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmGreaterThanOrEqualTo(String value) {
            addCriterion("wx_ewm >=", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmLessThan(String value) {
            addCriterion("wx_ewm <", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmLessThanOrEqualTo(String value) {
            addCriterion("wx_ewm <=", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmLike(String value) {
            addCriterion("wx_ewm like", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmNotLike(String value) {
            addCriterion("wx_ewm not like", value, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmIn(List<String> values) {
            addCriterion("wx_ewm in", values, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmNotIn(List<String> values) {
            addCriterion("wx_ewm not in", values, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmBetween(String value1, String value2) {
            addCriterion("wx_ewm between", value1, value2, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmNotBetween(String value1, String value2) {
            addCriterion("wx_ewm not between", value1, value2, "wxEwm");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeIsNull() {
            addCriterion("wx_ewm_time is null");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeIsNotNull() {
            addCriterion("wx_ewm_time is not null");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeEqualTo(Integer value) {
            addCriterion("wx_ewm_time =", value, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeNotEqualTo(Integer value) {
            addCriterion("wx_ewm_time <>", value, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeGreaterThan(Integer value) {
            addCriterion("wx_ewm_time >", value, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wx_ewm_time >=", value, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeLessThan(Integer value) {
            addCriterion("wx_ewm_time <", value, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeLessThanOrEqualTo(Integer value) {
            addCriterion("wx_ewm_time <=", value, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeIn(List<Integer> values) {
            addCriterion("wx_ewm_time in", values, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeNotIn(List<Integer> values) {
            addCriterion("wx_ewm_time not in", values, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeBetween(Integer value1, Integer value2) {
            addCriterion("wx_ewm_time between", value1, value2, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andWxEwmTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("wx_ewm_time not between", value1, value2, "wxEwmTime");
            return (Criteria) this;
        }

        public Criteria andHoderIsNull() {
            addCriterion("hoder is null");
            return (Criteria) this;
        }

        public Criteria andHoderIsNotNull() {
            addCriterion("hoder is not null");
            return (Criteria) this;
        }

        public Criteria andHoderEqualTo(String value) {
            addCriterion("hoder =", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderNotEqualTo(String value) {
            addCriterion("hoder <>", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderGreaterThan(String value) {
            addCriterion("hoder >", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderGreaterThanOrEqualTo(String value) {
            addCriterion("hoder >=", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderLessThan(String value) {
            addCriterion("hoder <", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderLessThanOrEqualTo(String value) {
            addCriterion("hoder <=", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderLike(String value) {
            addCriterion("hoder like", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderNotLike(String value) {
            addCriterion("hoder not like", value, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderIn(List<String> values) {
            addCriterion("hoder in", values, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderNotIn(List<String> values) {
            addCriterion("hoder not in", values, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderBetween(String value1, String value2) {
            addCriterion("hoder between", value1, value2, "hoder");
            return (Criteria) this;
        }

        public Criteria andHoderNotBetween(String value1, String value2) {
            addCriterion("hoder not between", value1, value2, "hoder");
            return (Criteria) this;
        }

        public Criteria andBankimgIsNull() {
            addCriterion("bankimg is null");
            return (Criteria) this;
        }

        public Criteria andBankimgIsNotNull() {
            addCriterion("bankimg is not null");
            return (Criteria) this;
        }

        public Criteria andBankimgEqualTo(String value) {
            addCriterion("bankimg =", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgNotEqualTo(String value) {
            addCriterion("bankimg <>", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgGreaterThan(String value) {
            addCriterion("bankimg >", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgGreaterThanOrEqualTo(String value) {
            addCriterion("bankimg >=", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgLessThan(String value) {
            addCriterion("bankimg <", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgLessThanOrEqualTo(String value) {
            addCriterion("bankimg <=", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgLike(String value) {
            addCriterion("bankimg like", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgNotLike(String value) {
            addCriterion("bankimg not like", value, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgIn(List<String> values) {
            addCriterion("bankimg in", values, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgNotIn(List<String> values) {
            addCriterion("bankimg not in", values, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgBetween(String value1, String value2) {
            addCriterion("bankimg between", value1, value2, "bankimg");
            return (Criteria) this;
        }

        public Criteria andBankimgNotBetween(String value1, String value2) {
            addCriterion("bankimg not between", value1, value2, "bankimg");
            return (Criteria) this;
        }

        public Criteria andSubbranchesIsNull() {
            addCriterion("subbranches is null");
            return (Criteria) this;
        }

        public Criteria andSubbranchesIsNotNull() {
            addCriterion("subbranches is not null");
            return (Criteria) this;
        }

        public Criteria andSubbranchesEqualTo(String value) {
            addCriterion("subbranches =", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesNotEqualTo(String value) {
            addCriterion("subbranches <>", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesGreaterThan(String value) {
            addCriterion("subbranches >", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesGreaterThanOrEqualTo(String value) {
            addCriterion("subbranches >=", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesLessThan(String value) {
            addCriterion("subbranches <", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesLessThanOrEqualTo(String value) {
            addCriterion("subbranches <=", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesLike(String value) {
            addCriterion("subbranches like", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesNotLike(String value) {
            addCriterion("subbranches not like", value, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesIn(List<String> values) {
            addCriterion("subbranches in", values, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesNotIn(List<String> values) {
            addCriterion("subbranches not in", values, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesBetween(String value1, String value2) {
            addCriterion("subbranches between", value1, value2, "subbranches");
            return (Criteria) this;
        }

        public Criteria andSubbranchesNotBetween(String value1, String value2) {
            addCriterion("subbranches not between", value1, value2, "subbranches");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNull() {
            addCriterion("bank_number is null");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNotNull() {
            addCriterion("bank_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumberEqualTo(String value) {
            addCriterion("bank_number =", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotEqualTo(String value) {
            addCriterion("bank_number <>", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThan(String value) {
            addCriterion("bank_number >", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_number >=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThan(String value) {
            addCriterion("bank_number <", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_number <=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLike(String value) {
            addCriterion("bank_number like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotLike(String value) {
            addCriterion("bank_number not like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberIn(List<String> values) {
            addCriterion("bank_number in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotIn(List<String> values) {
            addCriterion("bank_number not in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberBetween(String value1, String value2) {
            addCriterion("bank_number between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotBetween(String value1, String value2) {
            addCriterion("bank_number not between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("card is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("card is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("card =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("card <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("card >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("card >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("card <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("card <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("card like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("card not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("card in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("card not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("card between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("card not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersIsNull() {
            addCriterion("is_headquarters is null");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersIsNotNull() {
            addCriterion("is_headquarters is not null");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersEqualTo(Boolean value) {
            addCriterion("is_headquarters =", value, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersNotEqualTo(Boolean value) {
            addCriterion("is_headquarters <>", value, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersGreaterThan(Boolean value) {
            addCriterion("is_headquarters >", value, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_headquarters >=", value, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersLessThan(Boolean value) {
            addCriterion("is_headquarters <", value, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersLessThanOrEqualTo(Boolean value) {
            addCriterion("is_headquarters <=", value, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersIn(List<Boolean> values) {
            addCriterion("is_headquarters in", values, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersNotIn(List<Boolean> values) {
            addCriterion("is_headquarters not in", values, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersBetween(Boolean value1, Boolean value2) {
            addCriterion("is_headquarters between", value1, value2, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsHeadquartersNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_headquarters not between", value1, value2, "isHeadquarters");
            return (Criteria) this;
        }

        public Criteria andIsRecuidIsNull() {
            addCriterion("is_recuid is null");
            return (Criteria) this;
        }

        public Criteria andIsRecuidIsNotNull() {
            addCriterion("is_recuid is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecuidEqualTo(Boolean value) {
            addCriterion("is_recuid =", value, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidNotEqualTo(Boolean value) {
            addCriterion("is_recuid <>", value, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidGreaterThan(Boolean value) {
            addCriterion("is_recuid >", value, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recuid >=", value, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidLessThan(Boolean value) {
            addCriterion("is_recuid <", value, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recuid <=", value, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidIn(List<Boolean> values) {
            addCriterion("is_recuid in", values, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidNotIn(List<Boolean> values) {
            addCriterion("is_recuid not in", values, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recuid between", value1, value2, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andIsRecuidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recuid not between", value1, value2, "isRecuid");
            return (Criteria) this;
        }

        public Criteria andRecNobleIsNull() {
            addCriterion("rec_noble is null");
            return (Criteria) this;
        }

        public Criteria andRecNobleIsNotNull() {
            addCriterion("rec_noble is not null");
            return (Criteria) this;
        }

        public Criteria andRecNobleEqualTo(String value) {
            addCriterion("rec_noble =", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleNotEqualTo(String value) {
            addCriterion("rec_noble <>", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleGreaterThan(String value) {
            addCriterion("rec_noble >", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleGreaterThanOrEqualTo(String value) {
            addCriterion("rec_noble >=", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleLessThan(String value) {
            addCriterion("rec_noble <", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleLessThanOrEqualTo(String value) {
            addCriterion("rec_noble <=", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleLike(String value) {
            addCriterion("rec_noble like", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleNotLike(String value) {
            addCriterion("rec_noble not like", value, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleIn(List<String> values) {
            addCriterion("rec_noble in", values, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleNotIn(List<String> values) {
            addCriterion("rec_noble not in", values, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleBetween(String value1, String value2) {
            addCriterion("rec_noble between", value1, value2, "recNoble");
            return (Criteria) this;
        }

        public Criteria andRecNobleNotBetween(String value1, String value2) {
            addCriterion("rec_noble not between", value1, value2, "recNoble");
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