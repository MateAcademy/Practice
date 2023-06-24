package hillel_shaytan.lesson24;

/**
 * @author Serhii Klunniy
 */
public class ThreadEx {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("hello from 2 thread");

        Thread second = new Thread(runnable);
        second.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("__main__");

    }
}
