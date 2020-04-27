import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class Optionals {
    // GETS VALUE AT INDEX i
    public static Optional<Integer> retrieveElement(List<Integer> list, int i) {
        Optional<Integer> result = Optional.empty();
        if (i >= 0 && i < list.size()) {
            result = Optional.of(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8} );
        Optional<Integer> item1 = retrieveElement(list, 0);
        Optional<Integer> item2 = retrieveElement(list, 5);
        Optional<Integer> item3 = retrieveElement(list, 10);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

        System.out.println("-------------------------");

        if (item1.isPresent()) {
            Integer i = item1.get(); // USING OPTIONALS GET
            System.out.println(i);
        }
        if (item2.isPresent()) {
            System.out.println(item2);
        }
        if (item3.isPresent()) {
            System.out.println(item3); // ITEM 3 WONT PRINT
        }


        }

}