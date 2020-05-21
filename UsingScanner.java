import java.util.Scanner;
public class UsingScanner {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.print("Hi, What's your name? ");
		System.out.println(line);
		System.out.print("Hello ");
		System.out.print(line);
		System.out.println("!");
	}
	
}