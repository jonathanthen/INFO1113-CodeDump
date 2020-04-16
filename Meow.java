public class Meow {
    public static void main(String[] args) {
        String cat = "Meow";
        cat += ", says the cat.";
        System.out.println(cat);
        String cat2 = "Meow, says the cat.";
        System.out.println(cat == cat2); //false ; Two diff ref types
        String meow1 = "Meow";
        String meow2 = "Meow";
        System.out.println(meow1 == meow2); //true

    }
}