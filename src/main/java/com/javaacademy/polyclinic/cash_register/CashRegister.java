package com.javaacademy.polyclinic.cash_register;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Component
public class CashRegister {

    static final String INFO_MESSAGE = "Доход кассы: {}";

    BigDecimal incomeCash = BigDecimal.ZERO;

    public void incomingPayment(BigDecimal payment) {
        incomeCash = incomeCash.add(payment);
    }

    public void infoCash() {
        log.info(INFO_MESSAGE, incomeCash);
    }
}
