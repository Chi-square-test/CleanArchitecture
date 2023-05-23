package com.cleam.cleanarchitecture.account.application.port.out;

import com.cleam.cleanarchitecture.account.domain.Account;

public interface AccountLock {

    void lockAccount(Account.AccountId accountId);

    void releaseAccount(Account.AccountId accountId);

}