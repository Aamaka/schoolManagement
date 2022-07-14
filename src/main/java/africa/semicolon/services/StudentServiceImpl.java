package africa.semicolon.services;

import africa.semicolon.data.model.Student;
import africa.semicolon.dtos.Requests.*;
import africa.semicolon.dtos.Responses.*;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Override
    public RegisterResponse register(RegisterRequest request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setStateOfOrigin(request.getStateOfOrigin());
        student.setDob(request.getDob());

        return null;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
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
