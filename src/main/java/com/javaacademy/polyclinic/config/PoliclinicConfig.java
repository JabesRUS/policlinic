package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.cash_register.CashRegister;
import com.javaacademy.polyclinic.doctor.Doctor;
import com.javaacademy.polyclinic.doctor.Specialization;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PoliclinicConfig {

    @Value("${doctor.rate.dentist}")
    String dentistRate;
    @Value("${doctor.rate.therapist}")
    String therapistRate;
    @Value("${doctor.rate.junior-surgeon}")
    String juniorSurgeonRate;
    @Value("${doctor.rate.senior-surgeon}")
    String seniorSurgeonRate;

    @Bean
    public CashRegister cashRegister() {
        return new CashRegister();
    }

    @Bean
    public Doctor dentist() {
        return new Doctor(BigDecimal.valueOf(Integer.parseInt(dentistRate)), Specialization.Dentist);
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(BigDecimal.valueOf(Integer.parseInt(therapistRate)), Specialization.Therapist);
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(BigDecimal.valueOf(Integer.parseInt(juniorSurgeonRate)), Specialization.Surgeon);
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(BigDecimal.valueOf(Integer.parseInt(seniorSurgeonRate)), Specialization.Surgeon);
    }

}
