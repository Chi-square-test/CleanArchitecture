package com.cleam.cleanarchitecture.account.adapter.in.web;

import com.cleam.cleanarchitecture.account.application.port.in.SendMoneyCommand;
import com.cleam.cleanarchitecture.account.application.port.in.SendMoneyUseCase;
import com.cleam.cleanarchitecture.account.domain.Account;
import com.cleam.cleanarchitecture.account.domain.Money;
import com.cleam.cleanarchitecture.common.WebAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@WebAdapter
@RestController
@RequiredArgsConstructor
class SendMoneyController {

    private final SendMoneyUseCase sendMoneyUseCase;

    @PostMapping(path = "/accounts/send/{sourceAccountId}/{targetAccountId}/{amount}")
    void sendMoney(
            @PathVariable("sourceAccountId") Long sourceAccountId,
            @PathVariable("targetAccountId") Long targetAccountId,
            @PathVariable("amount") Long amount) {

        SendMoneyCommand command = new SendMoneyCommand(
                new Account.AccountId(sourceAccountId),
                new Account.AccountId(targetAccountId),
                Money.of(amount));

        sendMoneyUseCase.sendMoney(command);
    }

}
