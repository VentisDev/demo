package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
                Student mariam = new Student(
                        1L,
                        "Mariam",
                        "mariam.jama@gamil.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                );
                Student reaf = new Student(
                        2L,
                        "Reaf",
                        "Reaf.isplat@gmail.com",
                        LocalDate.of(1994, Month.JANUARY, 14),
                        23
                );
                Student vellez = new Student(
                        3L,
                        "Vellez",
                        "Goonand1jon.dontlogout@gmail.com",
                        LocalDate.of(1997, Month.MARCH, 23),
                        26
                );
            repository.saveAll(List.of(mariam,reaf,vellez));
        };
    }
}



