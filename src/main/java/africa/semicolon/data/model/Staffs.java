package africa.semicolon.data.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staffs {
    private String name;
    private String phoneNumber;
    private String address;
    private String email;
    private String gender;
    private int age;
    private StaffType type;
    @Id
    private String id;
}
