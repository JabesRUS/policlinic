package com.javaacademy.polyclinic.policlinic;

import com.javaacademy.polyclinic.cash_register.CashRegister;
import com.javaacademy.polyclinic.doctor.Doctor;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Policlinic {

    CashRegister cashRegister;
    final List<Doctor> doctorList;

    public Policlinic(CashRegister cashRegister, List<Doctor> doctorList) {
        this.cashRegister = cashRegister;
        this.doctorList = doctorList;
    }

    public void seeDentist() {
        cashRegister.incomingPayment(doctorList.get(0).treatPerson());
    }

    public void seeTherapist() {
        cashRegister.incomingPayment(doctorList.get(1).treatPerson());
    }

    public void seeJuniorSurgeon() {
        cashRegister.incomingPayment(doctorList.get(2).treatPerson());
    }

    public void seeSeniorSurgeon() {
        cashRegister.incomingPayment(doctorList.get(3).treatPerson());
    }

        public void infoCashRegister() {
        cashRegister.infoCash();
    }

}
