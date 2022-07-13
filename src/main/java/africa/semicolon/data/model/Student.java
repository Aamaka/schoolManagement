package africa.semicolon.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {

    private String name;
    private int id;
    private String grade;
    private double totalFees;
    private double feesPaid;

}
