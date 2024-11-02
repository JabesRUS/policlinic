package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.policlinic.Policlinic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Policlinic policlinic = context.getBean(Policlinic.class);
        policlinic.seeDentist();
        policlinic.seeTherapist();
        policlinic.seeJuniorSurgeon();
        policlinic.seeSeniorSurgeon();

        policlinic.infoCashRegister();
    }

}
