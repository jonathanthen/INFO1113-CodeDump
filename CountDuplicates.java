/*public class CountDuplicates {
	
	
	public static int countDuplicates(int[] a) {
		if (a == null || a.length == 0) {
			return 0;
		} else {
			int dup = 0;
			int[] num = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			for (int i = 0; i < num.length; i++) {
				int count = 0;
				for (int element : a) {
					if (num[i] == element) {
						count += 1;
					}
				}
					if (count > 1) {
						dup++;
					}
			}
		return dup;	
		}	
	}*/
	
	
    public class CountDuplicates {
        public static int countDuplicates(int[] a) {
            if (a == null || a.length == 0) {
                return 0;
            }
    
            int[] dups = new int[(a.length/2)+1]; // max length for duplicates
            int count = 0;
    
            for (int i = 0; i < a.length; i++) {
                boolean exist = false; // assume the number not exist in dups
                for (int j = 0; j < count; j++) { // check wheather it exist or not
                    if (dups[j] == a[i]) {
                        exist = true;
                    }
                }
    
                if (! exist) {
                    for (int j = 0; j < a.length; j++) {
                        if (i != j && a[i] == a[j]) { // cannot compare with itself 
                            dups[count] = a[i];
                            count++;
                            break;
                        }
                    }
                }
            }
    
            return count;
        }
        public static void main(String[] args) {
            int[] dups = new int[] {1,1,5,6,5,3,8,1,9,2,8};
            int result = countDuplicates(dups);
            System.out.println(result);
        }
    }