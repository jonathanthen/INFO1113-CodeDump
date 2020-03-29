public class GetIndices {

    public GetIndices() {

    }

    public int[] getIndices(String str, char ch) {
        // CHECK FOR NULL
        if (str == null) {
            return null;
        }

        int[] indarray = new int[0];
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                if (count < indarray.length + 1) {
                    int[] temp = new int[indarray.length + 1];
                    for (int j = 0; j < indarray.length; j++) {
                        temp[j] = indarray[j];
                    }
                    indarray = temp;
                }
                indarray[count] = i;
                count++;
            }
        }
        return indarray;
    }

    public static void main(String[] args) {
        GetIndices test = new GetIndices();
        String string = "omg this actually works";
        char character = 'o';
        int[] result = test.getIndices(string, character);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}