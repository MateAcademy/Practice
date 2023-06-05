package exceptions;

/**
 * @author Serhii Klunniy
 */
public class Start2 {
    public static void main(String[] args) {

//        try {
//            throw new NullPointerException();
//        } catch (NullPointerException e) {
//            throw new ArrayIndexOutOfBoundsException();
//        } finally {
//            throw new IndexOutOfBoundsException();  //вылетело
//        }

        try (MyResources myResources = new MyResources()){ //это исключение менее важно
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw new ArrayIndexOutOfBoundsException(); //вылетело
        }
    }
}


class MyResources implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Close resources!");
        throw new IndexOutOfBoundsException();  //это исключение менее важно чем то что вылетает из блока catch
    }
}