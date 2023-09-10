package jassi.demo.student;

import java.time.*;
import jakarta.persistence.*;
import lombok.*;

// Student represent both database class and class used for response or in other classes.
// By, default when this class is used by JPA, all field are added to Database except ones annotated with @Transient
// So, using student class give all fields, but when used with JPA excludes @Transient fields

@Entity
@Table
@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @Transient
  private Integer age;
  private LocalDate dob;
  private String email;

  public Student(String name, String email, LocalDate dob) {
    this.name = name;
    this.email = email;
    this.dob = dob;
  }

  public Integer getAge() {
    return Period.between(dob, LocalDate.now()).getYears();
  }
}
