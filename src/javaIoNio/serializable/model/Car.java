package javaIoNio.serializable.model;

import java.io.*;

/**
 * @author Serhii Klunniy
 */
public class Car implements Serializable {


    private transient int per = 70;
    private Integer id;
    private String name;
    private String color;
    private Engine engine;

    public Car() {
    }

    public Car(String name, String color, Engine engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public Car(int id, String name, String color, Engine engine) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "per=" + per +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(name);
//        out.writeObject(color);
//        out.writeObject(engine);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        name = (String) in.readObject();
//        color = (String) in.readObject();
//        engine = (Engine) in.readObject();
//    }
}
