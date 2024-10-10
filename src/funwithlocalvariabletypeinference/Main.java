package funwithlocalvariabletypeinference;


import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This class contains examples using Java 10's local variable type inference.
 * Using this feature has the potential to simplify and shorten your code.
 * However, teams should strive to be consistent and only use this option if it
 * significantly shortens the code and it is very clear what the data type of
 * the variable is.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Java 10 Local Variable Type Inference Example
         */
        var i = 10;
        var hello = "Hello world!";
        var list = List.of(1, 2, 3, 4, 5);
        var collection = getCollection();


        /*
         * Here's how you would do the same thing without local variable type inference
         */
        int x = 10;
        String helloStandard = "Hello world!";
        List<Integer> listStandard = List.of(1, 2, 3, 4, 5);
        Collection collectionStandard = getCollection();

    }

    public static Collection getCollection() {
        return Collections.unmodifiableList(List.of(1, 2, 3, 4, 5));
    }

}