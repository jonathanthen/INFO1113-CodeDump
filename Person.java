public class Person {
    private String name;
    public int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}