import java.util.*;
public class SelectionSort {
	public static ArrayList<String> selectionSort(ArrayList<String> listA, ArrayList<Integer> listB) {
		if (listA == null || listB == null) {
			return null;
		}
		if (listA.size() != listB.size()) {
			return null;
		}
		
		ArrayList<String> listC = new ArrayList<String>();
		
		int small1 = -1;
		// RUNNING THROUGH THE LIST 
		for (int i = 0; i < listB.size(); i++) {
			int indexA = 0;
			int small2 = 1000000;
			for (int j = 0; j < listB.size(); j++) {
				if (listB.get(j) > small1) {
					if (listB.get(j) < small2) {
						small2 = listB.get(j);
						indexA = j;						
					}
				}
			}
			listC.add(listA.get(indexA));
			small1 = small2;
			}
		return listC;
		}
	}
