package com.cleam.cleanarchitecture.account.application.service;

import com.cleam.cleanarchitecture.account.application.port.in.GetAccountBalanceQuery;
import com.cleam.cleanarchitecture.account.application.port.out.LoadAccountPort;
import com.cleam.cleanarchitecture.account.domain.Account;
import com.cleam.cleanarchitecture.account.domain.Money;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(Account.AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now())
                .calculateBalance();
    }
}
