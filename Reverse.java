import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int count = 0;
		String[] lines = new String[3];
		Scanner input = new Scanner(System.in);
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (count >= lines.length) {
				String[] temp = new String[lines.length + 1];
				for (int i = 0; i < lines.length; i++) {
					temp[i] = lines[i];
				}
				lines = temp;
			}
				lines[count] = line;
				count++;
		}
		for (int j = 0; j < lines.length; j++) {
			for (int k = lines[j].length() - 1; k >=0; k--) {
				char last = lines[j].charAt(k);
				System.out.print(last);
			}
			System.out.println();
		}
	}
}