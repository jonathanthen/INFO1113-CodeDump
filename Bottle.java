public class Bottle {
    protected String name;
    protected double width;
    protected double height;
    protected double depth;
    protected double litresFilled;

    public Bottle(String name, double width, double height, double depth) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.litresFilled = 0;
    }

    public double volume() {
        return height*width*depth;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        GlassBottle b = new GlassBottle("This", 10, 20, 30);
        System.out.println(b.volume());
        System.out.println(b.getName());
    }

}
