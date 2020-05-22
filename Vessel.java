public abstract class Vessel {
    protected double litres;
    private double maxLitres;

    public Vessel(double litres, double maxLitres) {
        this.litres = litres;
        this.maxLitres = maxLitres;
    }

    public double pour(Vessel v, double amount) {
        litres -= amount;
        return litres;
    }

    public void fill(double amount) {
        litres += amount;
    }

    public double getLitres() {
        return litres;
    }

    public double getCapacity() {
        return maxLitres;
    }
}