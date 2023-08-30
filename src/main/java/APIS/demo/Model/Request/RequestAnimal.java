package APIS.demo.Model.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestAnimal {
    private int age;
    private String category;
    private String name;
    private int id;
    private String location;
}
