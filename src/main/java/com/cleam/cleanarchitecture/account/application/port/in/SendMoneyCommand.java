package com.cleam.cleanarchitecture.account.application.port.in;

import com.cleam.cleanarchitecture.account.domain.Account;
import com.cleam.cleanarchitecture.account.domain.Money;
import com.cleam.cleanarchitecture.common.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Value;


//컨트롤러로 들어오는 요청 객체
@Value
@EqualsAndHashCode(callSuper = false)
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull Account.AccountId sourceAccountId;

    @NotNull Account.AccountId targetAccountId;

    @NotNull Money money;

    public SendMoneyCommand(
            Account.@NotNull AccountId sourceAccountId,
            Account.@NotNull AccountId targetAccountId,
            @NotNull Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}
