public class StringLength {

	public static void main(String[] args) {
		if(args.length < 1) {
			return;
		}
		String str = args[0];
		int ch = str.length();
		System.out.println(str + " is " + ch + " characters long");
	}

}