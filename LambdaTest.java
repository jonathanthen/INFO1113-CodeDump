import java.util.HashMap;

interface IntegerBinaryOperation {
    int apply(int x, int y);
}

public class LambdaTest {
    public static void main(String[] args) {
        HashMap<String, IntegerBinaryOperation> operations = new HashMap<>();
        operations.put("ADD", (x, y) -> x + y);
        operations.put("SUB", (int x, int y) -> x - y);
        operations.put("MUL", (x, y) -> x * y);
        operations.put("DIV", (x, y) -> x / y);

        System.out.println(operations.get("ADD").apply(3,3));
        System.out.println(operations.get("SUB").apply(3,3));
        System.out.println(operations.get("MUL").apply(3,3));
        System.out.println(operations.get("DIV").apply(3,3));
    }
}