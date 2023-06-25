package hillel_shaytan.lesson24;

/**
 * @author Serhii Klunniy
 */
public class Interapter {
    private static String string = "hello";

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {

            try {
                System.out.println("sleep start " + string);

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("sleep interrupted");
            }

            System.out.println("sleep moving on");

            new Thread(() -> System.out.println("3 thread")).start();

        });

        thread.start();
        System.out.println("try to interrupt the sleep in thread ");
        // thread.interrupt();
         thread.join();
    }
}
