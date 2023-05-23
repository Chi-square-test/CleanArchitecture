package com.cleam.cleanarchitecture.account.application.port.in;

import com.cleam.cleanarchitecture.account.domain.Account;
import com.cleam.cleanarchitecture.account.domain.Money;

//읽기 전용 유스케이스(=쿼리)
public interface GetAccountBalanceQuery {

    Money getAccountBalance(Account.AccountId accountId);

}
