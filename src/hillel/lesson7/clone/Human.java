//package hillel.lesson7.clone;
//
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class Human implements Cloneable {
//
//    int age;
//    String name;
//    Car car;
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Human human = new Human(20, "Herman", new Car("audi"));
// //       human.setCar(new Car("bmw"));
//        System.out.println("Оригинал:");
//        System.out.println(human);
//
//        Human cloneHuman = (Human) human.clone();
//        System.out.println("\nКлонированный человек:");
//        System.out.println(cloneHuman);
//
//        human.getCar().setName("bmw");
//        human.setName("Ava");
//
//        System.out.println("\nПосле изменений:");
//        System.out.println(human);
//        System.out.println(cloneHuman);
//    }
//
//    @Override
//    protected Human clone() throws CloneNotSupportedException {
//        return new Human(age, name, car.clone());
//    }
//}
