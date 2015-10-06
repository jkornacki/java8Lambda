import domain.FunctionalInterfaceTest;

/**
 * Created by P on 2015-10-05.
 */
public class Example1 {

    public static void main(String[] args) {
        FunctionalInterfaceTest newInterface = () -> {
            System.out.println("abc");
        };
    }
}
