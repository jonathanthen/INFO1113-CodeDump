public class GetVowelWords {

    public static String[] getVowelWords(String[] data) {
        if (data == null) {
            return null;
        }

        String[] arr = new String[0];
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            if (data[i].charAt(0) == 'a' || 
            data[i].charAt(0) == 'e' ||
            data[i].charAt(0) == 'i' ||
            data[i].charAt(0) == 'o' ||
            data[i].charAt(0) == 'u') {
                if (count < arr.length + 1) {
                    String[] temp = new String[arr.length + 1];
                    for (int k = 0; k < arr.length; k++) {
                        temp[k] = arr[k];
                    }
                    arr = temp;
                }
                arr[count] = data[i];
                count++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] stuff = {"chicken", "open", "soap", "brush", "apple"};
        String[] vowelstuff = getVowelWords(stuff);

        for (int i = 0; i < vowelstuff.length; i++) {
            System.out.println(vowelstuff[i]);
        }
    }
}