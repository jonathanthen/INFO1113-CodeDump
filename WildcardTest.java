import java.util.*;

public class WildcardTest {
    // LOWER BOUND TESTING
	public static void testing(List<? super Integer> list) {
		Integer a = 1;
		list.add(a);
	}
	
	public static void main(String[] args) {
		List<Object> o = new ArrayList<Object>();
		testing(o);
		Object a = o.get(0);
        System.out.println(a);
        
		List<Number> n = new ArrayList<Number>();
		testing(n);
		Number b = n.get(0);
        System.out.println(b);
        
		List<Integer> i = new ArrayList<Integer>();
		testing(i);
        Integer c = i.get(0);
        System.out.println(c);
	}
}