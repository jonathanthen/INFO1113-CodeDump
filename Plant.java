public class Plant {
	private String species;
	private double height;
	private boolean alive;
	public boolean uprooted;
	public boolean weed;

	public Plant(double height, String species) {
		this.species = species;
		this.height = height;
		this.alive = true;
		this.uprooted = false;
		this.weed = false;
	}
	public boolean isAlive() {
		return alive;
	}
	public void kill() {
		alive = false;
	}
	public double getHeight() {
		return height;
	}
	public String getSpecies() {
		return species;
	}
	public void uproot() {
		uprooted = true;
	}
	public boolean uprooted() {
		return uprooted;
	}
	public boolean isWeed() {
		return weed;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		final Plant other = (Plant) obj;
		if (this.alive != other.alive) {
			return false;
		}
		if (this.species != other.species) {
			return false;
		}
		if (this.height != other.height) {
			return false;
		}
		if (this.uprooted != other.uprooted) {
			return false;
		}
		return true;
	}
}