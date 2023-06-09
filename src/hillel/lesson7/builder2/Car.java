package hillel.lesson7.builder2;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Car {

    String name;
    String color;
    int maxSpeed;
    public String id;

//    private Car(Builder builder) {
//        this.name = builder.name;
//        this.color = builder.color;
//        this.maxSpeed = builder.maxSpeed;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" + "name=" + name + ", color=" + color + ", maxSpeed=" + maxSpeed + '}';
//    }
//
//    static class Builder {
//        private String name;
//        private String color;
//        private int maxSpeed;
//
//        public Builder(String name) {
//            this.name = name;
//        }
//
//        public Builder setColor(String color) {
//            this.color = color;
//            return this;
//        }
//
//        public Builder setMaxSpeed(int maxSpeed) {
//            this.maxSpeed = maxSpeed;
//            return this;
//        }
//
//        public Car build() {
//            return new Car(this);
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
}
