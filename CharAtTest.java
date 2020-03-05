public class CharAtTest {

    public static int findSubString(String sub, String full) {

        if (sub == null || full == null) {
            return -1;
        }

        if (full.length() == 0 || sub.length() == 0) {
            return -1;
        }

        int lastindex = 0;
        for (int i = 0; i < full.length(); i++) {
            if (full.charAt(i) == 'e' && full.charAt(i+1) == 'n') {
                lastindex = i;
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {
        int ex = findSubString("en", "ten pen zen");
        System.out.println(ex);
    }
}