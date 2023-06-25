package hillel_shaytan.lesson24;

import java.util.Random;

/**
 * @author Serhii Klunniy
 */
public class Counter {

    public volatile int days;
    public volatile int half;

    public synchronized void mix() {
        half++;
        try {
            Thread.sleep(new Random().nextInt(20));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        days += 1;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) counter.mix();
        };

        Thread thread = new Thread(runnable);
        thread.start();

        for (int i = 0; i < 100; i++) counter.mix();

        thread.join();

        System.out.println(counter.half); //198
        System.out.println(counter.days); //199
    }
}
