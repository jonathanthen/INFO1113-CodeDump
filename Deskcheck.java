public class Deskcheck {

    public static void main(String[] args) {
        int x,y,z;
        y = 0;
        System.out.println("y is " + y);
        x = y;
        System.out.println("x is " + x + " and y is " + y);
        y = x + 1;
        System.out.println("x is " + x + " and y is " + y);
        z = x + y - 1;
        System.out.println("x is " + x + " and y is " + y + " and z is " + z);
        {
            int a = x + 1;
            System.out.println("a is " + a);
            System.out.print(y + " a");
        }
        x = y + 1;
        System.out.println(x);



    }
}
