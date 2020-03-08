public class Coaster {
	public String name;
	public Tumbler tum;
	
	public Coaster(String n) {
		name = n;
		tum = null;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}
	public Tumbler getTumbler() {
		return tum;
	}
	public void setTumbler(Tumbler t) {
		tum = t;
	}
}