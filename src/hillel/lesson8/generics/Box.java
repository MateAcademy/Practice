package hillel.lesson8.generics;

/**
 * @author Serhii Klunniy
 */
public class Box<T> {
    T item;


    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }
}
