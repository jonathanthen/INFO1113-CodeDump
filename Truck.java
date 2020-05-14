import java.util.LinkedList;

public class Truck {

    private static class Cargo {

        private String description;

        public Cargo(String description) {
            this.description = description;
        }
        
        //NOT NEEDED
        public String getDescription() {
            return description;
        }

        public String toString() {
            return "[" + description + "]";
        }
    }
    private LinkedList<Cargo> cargo;
    public Truck() {
        cargo = new LinkedList<Cargo>();
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Cargo c : cargo) {
            builder.append(c.toString());
        }
        return builder.toString();
    }

    public void addCargo(String str) {
        cargo.add(new Cargo(str));
    }

    public static void main(String[] args) {
        Truck t = new Truck();
        t.addCargo("Food");
        t.addCargo("CDs");
        t.addCargo("TVs");
        Truck.Cargo c = new Truck.Cargo("Separate Cargo");
        System.out.println(t);
        System.out.println(c);
    }
}