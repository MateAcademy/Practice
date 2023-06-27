package hillel.lesson9;


public class Test {
    public static void main(String[] args) {
        Container<? extends Aircraft> container = new Container<>();
    }
}


 class Container<T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Aircraft {
}

class Planner extends Aircraft {
}

class Boeing extends Planner {
}
