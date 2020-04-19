public class MovingAnimals {
    public static void main(String[] args) {
        Cat cat = new Cat("land");
        Dolphin dolphin = new Dolphin("land");
        Move[] movingAnimals = {cat, dolphin};

    for(Move m : movingAnimals) {
        m.move(1.0);
    }
    System.out.println(cat.getKMTravelled());
    System.out.println(dolphin.getKMTravelled());
    }   
}