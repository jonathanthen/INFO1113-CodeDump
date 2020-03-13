public class Contains2 {
	
	public static boolean contains(int[] a, int element) {
		if (a == null || a.length == 0) {
			return false;
		} else {
		for (int i = 0; i < a.length; i++) {
			if (element == a[i]) {
				return true;
				}
			}
		return false;
		}
	}
	public static void main(String[] args) {
		int[] array = {1, 1, 5, 5, 5, 3, 8, 1};
		if (array != null) {
			boolean x = contains(array, 5);
			System.out.println(x);
		}
	}
	
	
}