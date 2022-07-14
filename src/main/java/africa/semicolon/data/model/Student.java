package africa.semicolon.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Student {
    @NonNull
    private String name;
    @Id
    private String id;
    @NonNull
    private String grade;
    private double totalFees;
    private double feesPaid;
    private String studentId;
    private Gender gender;
    private StudentType student;

}
