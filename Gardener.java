import java.util.List;

public class Gardener {

	
	public static void main(String[] args) {
		
		/*Plant p1 = new Plant("Rose", 5.0);
		Plant p2 = new Weed("Weedle", 2.1);
		System.out.println(p1.isAlive());*/
		
	}
	public void uprootWeeds(List<Plant> garden) {
		for (int i = 0; i < garden.size(); i++) {
			if (garden.get(i).isWeed() == true) {
				garden.get(i).uproot();
			}
		}
	}
	public void removeUndesirables(List<Plant> garden) {
		for (int i = 0; i < garden.size(); i++) {
			if (garden.get(i).isWeed() == true || garden.get(i).isAlive() == false) {
				garden.get(i).uproot();
				garden.remove(i);
			}
		}
	}
	
}