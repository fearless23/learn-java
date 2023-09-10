package jassi.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentCofig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentDb) {
    return args -> {
      Student jassi = new Student(
          "Jaspreet Singh",
          "jassi02412@gmail.com",
          LocalDate.of(1989, Month.SEPTEMBER, 29));
      Student sushil = new Student(
          "Sushil Singh",
          "sushilsingh8853@gmail.com",
          LocalDate.of(1992, Month.AUGUST, 16));
      Student happy = new Student(
          "Harpreet Kaur",
          "hrkdha@gmail.com",
          LocalDate.of(1993, Month.OCTOBER, 18));
      studentDb.saveAll(List.of(jassi, sushil, happy));
    };
  }

}
