package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Policlinic {

    private CashRegister cashRegister;
    Doctor dentist;
    Doctor therapist;
    Doctor juniorSurgeon;
    Doctor seniorSurgeon;

    public Policlinic(@Qualifier("cashRegister") CashRegister cashRegister, @Qualifier("dentist") Doctor dentist,
                      @Qualifier("therapist") Doctor therapist, @Qualifier("juniorSurgeon") Doctor juniorSurgeon,
                      @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
        this.cashRegister = cashRegister;
        this.dentist = dentist;
        this.therapist = therapist;
        this.juniorSurgeon = juniorSurgeon;
        this.seniorSurgeon = seniorSurgeon;
    }

    public void seeDentist() {
        cashRegister.incomingPayment(dentist.treatPerson());
    }

    public void seeTherapist() {
        cashRegister.incomingPayment(therapist.treatPerson());
    }

    public void seeJuniorSurgeon() {
        cashRegister.incomingPayment(juniorSurgeon.treatPerson());
    }

    public void seeSeniorSurgeon() {
        cashRegister.incomingPayment(seniorSurgeon.treatPerson());
    }

    public void infoCashRegister() {
        cashRegister.infoCash();
    }
}
