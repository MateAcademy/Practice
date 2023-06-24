package hillel_shaytan.lesson24;

import lombok.SneakyThrows;

/**
 * @author Serhii Klunniy
 */
public class ThreadEx {
    public static void main(String[] args) throws InterruptedException {
//        Runnable runnable = () -> System.out.println("hello from 2 thread");
//
//        Thread second = new Thread(runnable);
//        second.start();
//
//        //этот метод выкидывает в потоке second InterruptedException и останавливает метод sleep
//        second.interrupt();

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        Thread thread = new Thread(new Car());
        thread.start();

        thread.join();
        System.out.println("__main__");
        //Thread.sleep(5000);
        thread.interrupt(); // таким случаем могу пробудить поток который уснул
    }
}


class Car implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("start: " + i);
           // Thread.sleep(2000);
        }
       // Thread.sleep(10000);
    }
}