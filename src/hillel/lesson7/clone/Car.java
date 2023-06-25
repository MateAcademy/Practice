package hillel.lesson7.clone;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
//@NoArgsConstructor
//@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car implements Cloneable {

    String name;

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return new Car(name);
    }

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    //
}
