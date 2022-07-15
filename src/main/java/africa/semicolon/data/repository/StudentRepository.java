package africa.semicolon.data.repository;

import africa.semicolon.data.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {


    Optional<Student> findStudentBySchoolId(String schoolId);
}
