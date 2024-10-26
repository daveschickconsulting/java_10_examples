package funwithimmutablecollectioncopies;


import java.util.*;

/**
 * This class contains examples using Java 10's static methods for creating
 * immutable copies of an underlying collection.  These methods include
 * List.copyOf(), Set.copyOf(), and Map.copyOf().
 *
 * Please keep in mind that changes to the underlying collection will NOT be
 * reflected in the copy once it's created.  Attempts to modify the immutable
 * collection copy will result in a java.lang.UnsupportedOperationException.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Let's start by creating a source collection we want to
         * eventually copy.
         */
        List<String> sourceCollection = new ArrayList<String>(
                Arrays.asList("one",
                        "two",
                        "three"));

        /*
         * Now let's create an immutable copy of this collection
         */
        List<String> copiedCollection = List.copyOf(sourceCollection);

        /*
         * Attempt to modify the copied collection. You will get an
         * UnsupportedOperationException
         */
        copiedCollection.add("four");

        /*
         * Modify the source collection. Note that the changes are not reflected
         * in the copied collection (because it is immutable).
         */
        sourceCollection.add("four");

        /*
         * Now let's confirm that copiedCollection does NOT contain "four"
         * and sourceCollection DOES contain "four"
         */
        assert(!copiedCollection.stream().anyMatch("four"::equals));
        assert(sourceCollection.stream().anyMatch("four"::equals));

    }


}