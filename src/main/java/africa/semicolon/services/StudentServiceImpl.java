package africa.semicolon.services;

import africa.semicolon.data.model.Student;
import africa.semicolon.data.repository.StudentRepository;
import africa.semicolon.dtos.Requests.*;
import africa.semicolon.dtos.Responses.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public RegisterResponse register(RegisterRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setStateOfOrigin(request.getStateOfOrigin());
        student.setDob(request.getDob());
        student.setGrade(request.getGrade());
        student.setAge(request.getAge());
        student.setGender(request.getGender());
        student.setEmail(request.getEmail());
        student.setPassword(request.getPassword());
        student.setAmountPaid(request.getAmountPaid());

        String studentId = String.valueOf(UUID.randomUUID().getMostSignificantBits());
        studentId = "ST"+ studentId.substring(1, 4);

        student.setStudentId(studentId);

        Student saved = studentRepository.save(student);

        RegisterResponse response = new RegisterResponse();
        response.setMessage(saved.getName() + " registration was successful!!!");
        response.setStudentId(saved.getStudentId());


        return response;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        Optional<Student> student = studentRepository.findById(request.getSchoolId());
        if(student.isPresent()){
            if(student.get().getPassword().equals(request.getPassword())){
                LoginResponse response = new LoginResponse();
                response.setMessage("Welcome back " + student.get().getName());
            }throw new IllegalArgumentException("wrong detail");
        }

        throw new IllegalArgumentException("Student does not exist");
    }

    @Override
    public CheckScoreResponse checkScore(CheckScoreRequest request) {
        return null;
    }

    @Override
    public WriteExamResponse writeExam(WriteExamRequest request) {
        return null;
    }

    @Override
    public SubmitAssignmentResponse submit(SubmitAssignmentRequest request) {
        return null;
    }
}
