public class Count {
    public static void main(String[] args) {
        int[] array = {1,1,5,6,5,3,8,1,9,2,8};
        int result = count(array, 1);
        System.out.println(result);
    }
    static int count(int[] a, int element) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                count++;
            }
        }
        return count;
    }
}