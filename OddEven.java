import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = n.nextInt();
		if ((num % 2) == 0 ) {
			System.out.println("The number " + num + " is even.");
		} else {
			System.out.println("The number " + num + " is odd.");
		}
	}
}