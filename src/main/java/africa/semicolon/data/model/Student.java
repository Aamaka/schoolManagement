package africa.semicolon.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Document("School")
public class Student {


    @Id
    private String id;
    @NonNull
    private String name;

    @NonNull
    private String grade;

    private double totalFees;

    @NonNull
    private double amountPaid;

    private String studentId;

    @NonNull
    private Gender gender;

    @NonNull
    private StudentType student;

    @NonNull
    private int age;

    @NonNull
    private String email;

    @NonNull
    private String stateOfOrigin;

    @NonNull
    private String dob;

    private String password;
}
