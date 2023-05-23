package com.cleam.cleanarchitecture.account.application.port.in;


//유스케이스는 각각의 전용 모델을 사용해야한다.
//만약 동일 모델을 사용할 경우 변경시에도 동일하게 변경될 떄이다.
public interface SendMoneyUseCase {
    boolean sendMoney(SendMoneyCommand command);
}
