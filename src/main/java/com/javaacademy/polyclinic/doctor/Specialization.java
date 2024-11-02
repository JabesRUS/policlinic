package com.javaacademy.polyclinic.doctor;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum Specialization {
    Dentist("Стоматолог"),
    Surgeon("Хирург"),
    Therapist("Терапевт");

    String specializationRus;

}
