public class Dog {
    private boolean isGoodBoy = true;
    public String name;
    private int age;

    public Dog(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;

    }
    public void bark() {
        System.out.println("Woof!");
    }
    public boolean isGoodBoy() {
        return isGoodBoy;
    }
    public void chewThings() {
        isGoodBoy = false;
    }
}