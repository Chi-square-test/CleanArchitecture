package com.cleam.cleanarchitecture.account.application.port.out;

import com.cleam.cleanarchitecture.account.domain.Account;

public interface UpdateAccountStatePort {

    void updateActivities(Account account);

}
