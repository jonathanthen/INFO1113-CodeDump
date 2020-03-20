import java.util.Random;
public class DieRoll {
    public static void main(String[] args){
        int x = new Random().nextInt(5 + 1) + 1;
        System.out.println(x);
    }
}