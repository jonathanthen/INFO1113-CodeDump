import java.util.Scanner;

public class Occurrence {
	
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		String s = str.nextLine();
		String[] strarray = s.split("");
		int[] ch = new int [strarray.length];
		for (int i = 0; i < s.length(); i++) {
			ch[i] = Integer.parseInt(strarray[i]);
		}
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		for (int j = 0; j < array.length; j++) {
			int count = 0;
			for (int k = 0; k < ch.length; k++) {
				if (array[j] == (ch[k])) {
					count += 1;
				}
			}
			System.out.println(array[j] + ": " + count);
		}
	}
	
}