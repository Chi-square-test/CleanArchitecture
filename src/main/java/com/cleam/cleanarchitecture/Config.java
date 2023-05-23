package com.cleam.cleanarchitecture;

import com.cleam.cleanarchitecture.account.application.service.MoneyTransferProperties;
import com.cleam.cleanarchitecture.account.domain.Money;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ConfigProperties.class)
public class Config {
    @Bean
    public MoneyTransferProperties moneyTransferProperties(ConfigProperties configProperties){
        return new MoneyTransferProperties(Money.of(configProperties.getTransferThreshold()));
    }
}
