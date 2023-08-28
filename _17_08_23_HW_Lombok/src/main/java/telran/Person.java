package telran;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Person {
    @Getter private int id;
    @Getter private String name;
    @Getter private String lastName;
    @Getter @Setter private String address;


}
