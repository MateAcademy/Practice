package exceptions;

/**
 * @author Serhii Klunniy
 */
public class Start {
    public static void main(String[] args) {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw new ArrayIndexOutOfBoundsException();
        } finally {
            throw new IndexOutOfBoundsException();  //вылетело
        }
    }
}
