public class Tute2Array {
    public static void main(String[] args) {
        if (args.length <= 0) {
            return;
        }
        System.out.println(args[0]);

        int[] numbers = {1,2,3,4,5,6,7};
        //x = printSum(numbers);
        System.out.println(printSum(numbers));
    }
    public static int printSum(int[] numbers) {
        if (numbers == null || numbers.length ==0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        return count;
    }
}

