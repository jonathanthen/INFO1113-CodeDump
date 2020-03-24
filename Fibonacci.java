public class Fibonacci {

    public static int[] generateSequence(int n) {

        if (n < 0) {
            return new int[0];
        } else if (n == 0) {
            return new int[] {0};
        } else if (n == 1) {
            return new int[] {0,1};
        } else {
            int[] f1 = generateSequence(n-1);
            int[] f2 = generateSequence(n-2);
            int[] newF = new int[f1.length + 1];
            newF[newF.length - 1] = f1[f1.length - 1] + f2[f2.length - 1];
            for (int i = 0; i < f1.length; i++) {
                newF[i] = f1[i];
            }
            return newF;
        }
    }

    public static void main(String[] args) {
        int[] print = generateSequence(5);
        for (int elem : print) {
            System.out.println(elem);
        }
    }
}