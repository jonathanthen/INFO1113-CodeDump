import java.util.Scanner;

public class Greetings {
	public static void main(String[] args) {
		Scanner line = new Scanner(System.in); // Read in line from Std Input
		System.out.print("Enter your name: " );
		String s = line.nextLine();
		System.out.println("Hello, " + s + "!");
	}
}