public class IsFirstGreater {
	
	public static int parseInt(String arg) {
		int x = -1;
		try {
			x = Integer.parseInt(arg);
		} catch (NumberFormatException e) {
			//ignore!
			x = -1;
		}
		return x;
	}
	
	public static void main(String[] args) {
		if(args.length < 2) {
			return;
		}
		int n1 = parseInt(args[0]);
		int n2 = parseInt(args[1]);
		if (n1 > n2) {
			System.out.println("Is " + n1 + " > " + n2 +"? true");
		} else {
			System.out.println("Is " + n1 + " > " + n2 +"? false");
		}
		
	}
	
}