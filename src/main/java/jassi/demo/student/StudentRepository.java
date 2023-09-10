package jassi.demo.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// Links Database and Student - gives by default some standard queries

// @Repository // unnessary
public interface StudentRepository extends JpaRepository<Student, Long> {

  @Query(nativeQuery = true, value = "SELECT * FROM student WHERE email = ?1")
  Optional<Student> findStudentByEmail(String email);
}
