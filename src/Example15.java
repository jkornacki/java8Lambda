import java.util.Optional;

/**
 * Created by P on 2015-10-05.
 */
public class Example15 {

    public static void testNull(Optional<String> str) {
        str.ifPresent((p) -> {System.out.println(p);});
    }

    public static void main(String[] args) {
        testNull(Optional.ofNullable("str"));
        testNull(Optional.ofNullable(null));
    }
}
