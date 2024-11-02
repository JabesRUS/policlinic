package com.javaacademy.polyclinic.doctor;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
public class Doctor {

    private final static String DOCTOR_INFO_MESSAGE = "{} вылечил человека.";

    private BigDecimal costOfAdmission;
    private Specialization doctorSpecialization;

    public BigDecimal treatPerson() {
        log.info(DOCTOR_INFO_MESSAGE, doctorSpecialization.getSpecializationRus());
        return costOfAdmission;
    }
}
