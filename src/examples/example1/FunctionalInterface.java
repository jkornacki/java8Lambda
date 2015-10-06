package examples.example1;

import domain.FunctionalInterfaceTest;

/**
 * Created by P on 2015-10-05.
 */
public class FunctionalInterface {
    static class Test implements FunctionalInterfaceTest {

        @Override
        public void dispaly() {
            System.out.println("DUPA");
        }
    }

    public static void main(String[] args) {
        FunctionalInterfaceTest newInterface = () -> {
            System.out.println("ABC");
        };
        newInterface.dispaly();

        Test test = new Test();
        test.dispaly();
    }
}
