import java.util.Scanner;
import java.lang.Math;

public class GoldenRatio {
	public static void main(String[] args) {

		double num1 = 0;
		double num2 = 0;
		double num = 0;
		
		Scanner n = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		if (n.hasNextFloat()) {
			num1 = n.nextFloat();
		} else {
			System.out.println();
			System.out.println("Invalid input.");
			return;
		}
		if (n.hasNextFloat()) {
			num2 = n.nextFloat();
		} else {
			System.out.println();
			System.out.println("Invalid input.");
			return;
		}
		if (Math.round((num1/num2)*1000) == 1618) {
			System.out.println();
			System.out.println("Golden ratio!");
		} else if (Math.round((num2/num1)*1000) == 1618) {
			System.out.println();
			System.out.println("Golden ratio!");
		} else {
			System.out.println();
			System.out.println("Maybe next time.");
		}
		
	}
}