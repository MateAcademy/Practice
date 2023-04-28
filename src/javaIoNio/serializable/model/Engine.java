package javaIoNio.serializable.model;

import java.io.Serializable;

/**
 * @author Serhii Klunniy
 */
public class Engine implements Serializable {
    private int id;
    private String name;

    public Engine() {
    }

    public Engine(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
