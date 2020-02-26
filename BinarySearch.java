import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BinarySearch {
	
	public static int[] readFile(String filename) {
		File f = new File(filename);
		
		try {
			Scanner read = new Scanner(f);
			String s = read.nextLine();
			String[] strarray = s.split(" ");
			int[] arr = new int[strarray.length];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(strarray[i]);
			}
			return arr;
		} catch (FileNotFoundException e) {
			System.err.println("File not Found!");
		}
		return null;
	}

	
	public static Integer binarySearch(int low, int high, int search, int[] array) {
		int mid = (low + high)/2;
		if (low > high) {
		return null;	
		}
		if (array[mid] == search) {
			return array[mid];
		} else if (array[mid] < search) {
			return binarySearch(mid+1, high, search, array);
		} else {
			return binarySearch(low, mid-1, search, array);
		}
	}
	
	public static void main(String[] args) {
		int find = Integer.parseInt(args[0]);
		String f = args[1];
		int[] array = readFile(f);
		int lowest = array[0];
		int highest = array[array.length - 1];
		Integer result = binarySearch(lowest, highest, find, array);
		if (result == null) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found");
		}
	}
}