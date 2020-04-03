public class GradeProgram {
	
	public static void main(String[] args) {
		String result = args[0];
		int mark = Integer.parseInt(result);
		if (mark >= 0 && mark < 50) {
			System.out.println("Fail");
		}
		if (mark >= 50 && mark < 65) {
			System.out.println("Pass");
		}
		if (mark >= 65 && mark < 75) {
			System.out.println("Credit");
		}
		if (mark >= 75 && mark < 85) {
			System.out.println("Distinction");
		}
		if (mark >= 85) {
			System.out.println("High Distinction");
		}
	}
	
}