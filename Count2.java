public class Count2 {
	
	public static int count(int[] array, int element) {
        if (array == null || array.length ==0) {
            return 0;
        } else {
		    int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    count++;
                }
            }
        return count;
        }
	}
	
	public static void main(String[] args) {
		int[] array = {1,1,5,6,5,3,8,1,9,2,8};
        int result = count(array, 1);
        System.out.println(result);
		
	}
	
}
