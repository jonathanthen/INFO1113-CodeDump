public class Conditionals {
	
	public static void main(String[] args) {
		int x = 2;
		int y = 3;
		int r = 1;
		
		if (x<y && x<r) {
			System.out.println(x);
		} else if (y<x && y<r) {
			System.out.println(y);
		} else {System.out.println(r);
		}
		
	}
	
}