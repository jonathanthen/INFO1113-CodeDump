public class Weed extends Plant {
	public Weed(double height, String species) {
		super(height, species);
	}
	@Override
	public boolean isWeed() {
		weed = true;
		return weed;
	}
}