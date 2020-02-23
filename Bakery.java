public class Bakery {
    public static void main(String[] args){
    Cupcake choco = new Cupcake(true, "Chocolate Cupcake");
    Cupcake straw = new Cupcake(false, "Strawberry Cupcake");
    System.out.println(choco.delicious);
    System.out.println(straw.name);
    }
}