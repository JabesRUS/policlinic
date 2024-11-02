package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.Specialization;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister();
        Doctor dentist = new Doctor(BigDecimal.valueOf(1500), Specialization.Dentist);
        Doctor therapist = new Doctor(BigDecimal.valueOf(500), Specialization.Therapist);
        Doctor juniorSurgeon = new Doctor(BigDecimal.valueOf(700), Specialization.Surgeon);
        Doctor seniorSurgeon = new Doctor(BigDecimal.valueOf(2000), Specialization.Surgeon);
        Policlinic policlinic = new Policlinic(cashRegister, dentist, therapist, juniorSurgeon, seniorSurgeon);

        policlinic.seeDentist();
        policlinic.seeTherapist();
        policlinic.seeJuniorSurgeon();
        policlinic.seeSeniorSurgeon();

        cashRegister.infoCash();
    }
}
