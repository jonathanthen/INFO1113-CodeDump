enum LightColor {
    Red,
    Green,
    Yellow;

    public LightColor change() {
        if (this == Red) {
            return Green;
        } else if (this == Green) {
            return Yellow;
        } else if (this == Yellow) {
            return Red;
        }
        return null;
    }
}


public class TrafficLight {

    private LightColor color;

    public TrafficLight() {
        color = LightColor.Red;
    }

    public LightColor change() {
        color = color.change();
        return color;
    }

    public static void main(String[] args) {
        TrafficLight tl = new TrafficLight();
        System.out.println(tl.change());
        System.out.println(tl.change());
        System.out.println(tl.change());
        System.out.println(tl.change());
    }

}