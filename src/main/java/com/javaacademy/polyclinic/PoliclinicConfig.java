package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.Specialization;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class PoliclinicConfig {

    @Bean
    public CashRegister cashRegister() {
        return new CashRegister();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(BigDecimal.valueOf(1500), Specialization.Dentist);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(BigDecimal.valueOf(500), Specialization.Therapist);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(BigDecimal.valueOf(700), Specialization.Surgeon);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(BigDecimal.valueOf(2000), Specialization.Surgeon);
    }

}
