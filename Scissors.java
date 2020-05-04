import java.util.*;
import java.io.*;

public class Scissors {
	
	public static void main(String[] args) {
		if (args.length < 1 || args.length > 3) {
			return;
		}
		int field = Integer.parseInt(args[0]);
		String filename = args[1];
		File f = new File(filename);
		try {
			Scanner scan = new Scanner(f);
				while (scan.hasNextLine()) {
					String line = scan.nextLine();
					String[] parts = line.split(" ");
					for (int i = 0; i < parts.length; i++) {
						if (i == (field - 1)) {
							System.out.println(parts[i]);
						}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}