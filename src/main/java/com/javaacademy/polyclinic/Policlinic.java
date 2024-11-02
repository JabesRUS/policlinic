package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Policlinic {

    private CashRegister cashRegister;

    public void seeDentist(Doctor dentist) {
        cashRegister.incomingPayment(dentist.treatPerson());
    }

    public void seeTherapist(Doctor therapist) {
        cashRegister.incomingPayment(therapist.treatPerson());
    }

    public void seeJuniorSurgeon(Doctor juniorSurgeon) {
        cashRegister.incomingPayment(juniorSurgeon.treatPerson());
    }

    public void seeSeniorSurgeon(Doctor seniorSurgeon) {
        cashRegister.incomingPayment(seniorSurgeon.treatPerson());
    }
}
