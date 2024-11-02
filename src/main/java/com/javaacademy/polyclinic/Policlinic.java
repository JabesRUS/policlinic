package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.Specialization;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class Policlinic {

    private CashRegister cashRegister;
    Doctor dentist;
    Doctor therapist;
    Doctor juniorSurgeon;
    Doctor seniorSurgeon;

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
}
