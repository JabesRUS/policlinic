package com.javaacademy.polyclinic.policlinic;

import com.javaacademy.polyclinic.cash_register.CashRegister;
import com.javaacademy.polyclinic.doctor.Doctor;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Policlinic {
    CashRegister cashRegister;
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

        public void infoCashRegister() {
        cashRegister.infoCash();
    }

}
