package hillel.lesson9;


import java.util.Collection;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //я хочу что бы мы могли параметризовывать любым наследником Planner
        Container<? extends Planner> container = new Container<>(new Boeing());

        Container<? super  Planner> container2 = new Container<Aircraft>();
        container2.setValue(new Boeing());
       // container2.setValue(new Aircraft());
        // принцип PECS

        //Collections.copy();
    }
}


 class Container<T extends Object & Cloneable> {
    T value;

     public Container() {
     }

     public Container(T value) {
         this.value = value;
     }

     public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Aircraft implements Cloneable {
}

class Planner extends Aircraft implements Cloneable {
}

class Boeing extends Planner implements Cloneable {
}
