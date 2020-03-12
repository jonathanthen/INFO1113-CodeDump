public class Contains {
    public static void main(String[] args) {
        int[] array = {1,1,5,5,5,3,8,1};
        boolean x = contains(array, 5);
        System.out.println(x);
    }
    public static boolean contains(int[] a, int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return true;
            }
        }
        return false;
    }

}