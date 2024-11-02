package com.javaacademy.polyclinic;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Slf4j
@Component
public class CashRegister {

    private final static String INFO_MESSAGE = "Доход кассы: %s";

    BigDecimal incomeCash = BigDecimal.ZERO;

    public void incomingPayment(BigDecimal payment) {
        incomeCash = incomeCash.add(payment);
    }

    public void infoCash() {
        log.info(String.format(INFO_MESSAGE, incomeCash.toString()));
    }
}
