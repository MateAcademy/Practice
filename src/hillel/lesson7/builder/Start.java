package hillel.lesson7.builder;

import hillel.lesson7.builder.Car;

//У нас задача создать машину? Этих значений 40 или 30, их нужно вычислить, есть такой паттерн Билдер для создания обьекта
public class Start {
    public static void main(String[] args) {
        Car.Builder carBuilder = new Car.Builder("audi");

        Car car = carBuilder.build();
        System.out.println(car);

        Car audi = carBuilder.setColor("read").setMaxSpeed(200).build();
        System.out.println(audi);

        Car audi_250 = carBuilder.setColor("read").setMaxSpeed(250).build();
        Car audi3 = carBuilder.setColor("yellow").setMaxSpeed(175).build();

//у тебя есть разные комплектации, турбированные или нет
        Car.Builder redAudiBuilder = new Car.Builder("audi").setColor("red");
        Car car100 = redAudiBuilder.setMaxSpeed(100).build();
        Car car150 = redAudiBuilder.setMaxSpeed(150).build();
        Car car200 = redAudiBuilder.setMaxSpeed(200).build();

        System.out.println(car100);
        System.out.println(car150);
        System.out.println(car200);

        Car car1 = new Car.Builder("audi").setColor("red").setMaxSpeed(200).build();
    }
}
