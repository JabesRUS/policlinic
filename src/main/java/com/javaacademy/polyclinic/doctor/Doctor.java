package com.javaacademy.polyclinic.doctor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Doctor {

    private static final String DOCTOR_INFO_MESSAGE = "{} вылечил человека.";

    BigDecimal costOfAdmission;
    Specialization doctorSpecialization;

    public BigDecimal treatPerson() {
        log.info(DOCTOR_INFO_MESSAGE, doctorSpecialization.getSpecializationRus());
        return costOfAdmission;
    }
}
