interface LiquidContainer {
    public void pour(double litres);

    public default void pourInto(LiquidContainer container, double litres) {
        if (container != null) {
            pour(litres);
            container.fill(litres);
        } else {
            pour(litres);
        }
    }

    public void fill(double litres);
}