package africa.semicolon.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Document("School")
public class Student {
    @NonNull
    private String name;

    @Id
    private String id;

    @NonNull
    private String grade;

    private double totalFees;

    @NonNull
    private double feesPaid;

    private String studentId;

    @NonNull
    private Gender gender;

    @NonNull
    private StudentType student;

}
