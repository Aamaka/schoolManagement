package africa.semicolon.services;

import africa.semicolon.dtos.Requests.*;
import africa.semicolon.dtos.Responses.*;

public interface StudentService {

    RegisterResponse register(RegisterRequest request);
    LoginResponse login(LoginRequest request);
    CheckScoreResponse checkScore(CheckScoreRequest request);
    WriteExamResponse writeExam(WriteExamRequest request);
    SubmitAssignmentResponse submit(SubmitAssignmentRequest request);
}
