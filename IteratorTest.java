import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add(list.get(0));
        list.add("C");
        list.add(list.get(2));
        list.add("D");
        list.add(list.get(list.size() - 1));

        Iterator<String> itr = list.descendingIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        //D D A C A B A
    }
}