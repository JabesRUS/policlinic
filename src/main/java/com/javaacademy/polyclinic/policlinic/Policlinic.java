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
        treatment(dentist);
    }

    public void seeTherapist() {
        treatment(therapist);
    }

    public void seeJuniorSurgeon() {
        treatment(juniorSurgeon);
    }

    public void seeSeniorSurgeon() {
        treatment(seniorSurgeon);
    }

    private void treatment(Doctor doctor) {
        cashRegister.incomingPayment(doctor.treatPerson());
    }

        public void infoCashRegister() {
        cashRegister.infoCash();
    }

}
