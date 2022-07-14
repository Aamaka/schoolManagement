package africa.semicolon.dtos.Requests;

import africa.semicolon.data.model.Gender;
import africa.semicolon.data.model.StudentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private String name;
    private String stateOfOrigin;
    private String dob;
    private String grade;
    private int age;
    private Gender gender;
    private String email;
    private String password;
    private double amountPaid;
    private StudentType studentType;

}
