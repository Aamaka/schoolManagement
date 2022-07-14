package africa.semicolon.controller;

import africa.semicolon.dtos.Requests.RegisterRequest;
import africa.semicolon.dtos.Responses.RegisterResponse;
import africa.semicolon.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("student/register")
    public RegisterResponse register(@RequestBody RegisterRequest request){
        return service.register(request);
    }
}
