import java.util.Scanner;
public class Barcode {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		String[] strarray = string.split("");

		int sum = 0;
		int add = 0;
		int check = 0;
		
		for (int i = 1; i < (strarray.length+1); i++) {
			int num = Integer.parseInt(strarray[i-1]);
			if (i == strarray.length) {
				check = num;
				break;
			}
			if (i%2 == 0) {
				add += num;
			} else {
				sum += num;
			}
		}
		//System.out.println(sum);
		//System.out.println(add);
		//System.out.println(check);
		
		int check2 = 0;
		int total = (sum*3) + add;
		if (total % 10 == 0) {
			check2 = 0;
		} else {
			check2 = 10 - (total%10);
		}
		if (check == check2) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}
}