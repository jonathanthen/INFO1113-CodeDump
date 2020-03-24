import java.util.ArrayList;

public class ExampleList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("First String!");
        list.add("Second String!");
        list.add("Woof!!");

        list.remove(1);
        list.set(1, "Meow");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    
    }
}