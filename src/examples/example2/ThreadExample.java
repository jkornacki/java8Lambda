package examples.example2;

/**
 * Simple thread example
 *
 * @author toto
 *
 */
public class ThreadExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ave oldschool");
            }
        });

        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("Lambdas are cool"));

        thread2.start();
    }
}
