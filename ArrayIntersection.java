public class ArrayIntersection {
    public static void main(String[] args) {
        int[] x = {1, 2, 5, 6, 0, 8, 7};
        int[] y = {3, 1, 2, 6, 10};

        int[] result = intersection(x, y);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    static int[] intersection(int[] x, int[] y) {
        int[] z = new int[3];
        int zcount = 0;
        for (int j = 0; j < x.length; j++) {
            for (int k = 0; k < y.length; k++) {
                if (x[j] == y[k]) {
                    z[zcount] = y[k];
                    zcount++;
                }
            }
        }
        return z;
    }
}