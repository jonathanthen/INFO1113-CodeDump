public class Person2 {
    private static int DEFAULT_AGE = 21;
    private String name;
    private int age;
    public Person2() {
        this("Jeff", DEFAULT_AGE);
    }
    public Person2(String name) {
        this(name, DEFAULT_AGE);
    }
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}