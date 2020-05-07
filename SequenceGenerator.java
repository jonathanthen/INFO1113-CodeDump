public class SequenceGenerator {
	
	public static SequenceIndex[] genSequence(int n) {
		if (n <= 0) {
			return null;
		} else {
			SequenceIndex[] arr = new SequenceIndex[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = new SequenceIndex(i);
			}
			return arr;
		}
	}
	
	public static void main(String[] args) {
		SequenceIndex[] objects = genSequence(-1);
		System.out.println(objects);
	}
	
}