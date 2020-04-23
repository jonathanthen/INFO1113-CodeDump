interface IntegerBinaryOperation {
    int apply(int x, int y);
}

public class NumberFunctions {
    public static void main(String[] args) {
        IntegerBinaryOperation add = new IntegerBinaryOperation() {
            public int apply(int x, int y) {
                return x + y;
            }
        };
        
        IntegerBinaryOperation subtract = new IntegerBinaryOperation() {
            public int apply(int x, int y) {
                return x - y;
            }
        };

        IntegerBinaryOperation multiply = new IntegerBinaryOperation() {
            public int apply(int x, int y) {
                return x * y;
            }
        };

        IntegerBinaryOperation divide = new IntegerBinaryOperation() {
            public int apply(int x, int y) {
                return x / y;
            }
        };

        System.out.println("Values: 3, 3");
        System.out.println("Add: " + add.apply(3, 3));
        System.out.println("Subtract: " + subtract.apply(3, 3));
        System.out.println("Multiply: " + multiply.apply(3, 3));
        System.out.println("Divide: " + divide.apply(3, 3));
    }
}