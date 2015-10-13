package examples.example2;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by kornaja.
 */
public class OptionalExample {

    public static String getVal(String str) {
        Optional<String> optional = Optional.ofNullable(str);
        if(optional.isPresent()) {
            return optional.get();
        } else {
            return "Default";
        }
    }

    public static void main(String[] args) {
        String str = getVal(null);

        System.out.println(str);
    }



}
