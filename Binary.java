import java.util.Scanner;

public class Binary {

	// Returns decimal representation of given binary number.
	public static int toDecimal(String b) {

		char[] numbers = b.toCharArray();
		int total = 0;
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (numbers[i] == '1') {
				total += Math.pow(2, numbers.length - i - 1);
			}
		}
		return total;
	}

	// Returns whether or not given string is a binary number.
	public static boolean isBinary(String b) {
		char[] numbers = b.toCharArray();
		
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] == '1' || numbers[i] == '0') {
				//Do nothing
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner number = new Scanner(System.in);
		System.out.print("Enter binary: ");
		String b = number.nextLine();
		boolean binornot = isBinary(b);
		System.out.println();
		if(binornot) {
			int binarynumber = toDecimal(b);
			System.out.println(binarynumber + " in decimal");
		} else {
			System.out.println("Not binary!");
		}
	}
}