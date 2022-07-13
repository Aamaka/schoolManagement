package africa.semicolon.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String id;
}
