package jassi.demo.student;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class StudentService {
	private final StudentRepository studentDb;

	public List<Student> getStudents() {
		List<Student> students = studentDb.findAll();
		return students;
	}

	public Student addStudent(Student student) {
		Optional<Student> studentExist = studentDb.findStudentByEmail(student.getEmail());
		if (studentExist.isPresent()) {
			throw new IllegalStateException("Email already exists");
		}
		Student s = studentDb.save(student);
		return s;
	}
}
