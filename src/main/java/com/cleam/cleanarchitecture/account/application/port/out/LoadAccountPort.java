package com.cleam.cleanarchitecture.account.application.port.out;

import com.cleam.cleanarchitecture.account.domain.Account;

import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(Account.AccountId accountId, LocalDateTime baselineDate);
}
