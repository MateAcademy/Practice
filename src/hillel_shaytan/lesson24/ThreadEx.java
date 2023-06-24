package hillel_shaytan.lesson24;

/**
 * @author Serhii Klunniy
 */
public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> System.out.println("hello from 2 thread");

        Thread second = new Thread(runnable);
        second.start();

        Thread.sleep(2000);

    }
}
