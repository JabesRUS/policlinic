package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class Policlinic {
    CashRegister cashRegister;
//    Doctor dentist;
//    Doctor therapist;
//    Doctor juniorSurgeon;
//    Doctor seniorSurgeon;

    private final List<Doctor> doctorList;

    public Policlinic(CashRegister cashRegister, List<Doctor> doctorList) {
        this.cashRegister = cashRegister;
        this.doctorList = doctorList;
    }
//
//    public Policlinic(@Qualifier("dentist") Doctor dentist,
//                      @Qualifier("therapist") Doctor therapist, @Qualifier("juniorSurgeon") Doctor juniorSurgeon,
//                      @Qualifier("seniorSurgeon") Doctor seniorSurgeon) {
//        this.dentist = dentist;
//        this.therapist = therapist;
//        this.juniorSurgeon = juniorSurgeon;
//        this.seniorSurgeon = seniorSurgeon;
//    }

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
