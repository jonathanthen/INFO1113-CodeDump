public class Dolphin implements Move {
    private String region; // Water or Land
    private final double LAND_MOVEMENT_SPEED_KMH = 1.0;
    private final double WATER_MOVEMENT_SPEED_KMH = 60.0;
    private double kmTravelled = 0.0;

    public Dolphin(String region) {
        this.region = region;
    }

    public void move(double hours) {
        if (region.equals("water")) {
            kmTravelled += (WATER_MOVEMENT_SPEED_KMH * hours);
        } else if (region.equals("land")) {
            kmTravelled += (LAND_MOVEMENT_SPEED_KMH * hours);
        }
    }

    public double getKMTravelled() {
        return kmTravelled;
    }
}