//GLASS BOTTLE
    public class GlassBottle extends Bottle {
        public GlassBottle(String name, double width, double height, double depth) {
            super(name, width, height, depth);
            this.name = "Glass Bottle";
        }

        private boolean shattered = false;

        public void shatter() {
            shattered = true;
        }

        public boolean isBroken() {
            return shattered;
        }
    }