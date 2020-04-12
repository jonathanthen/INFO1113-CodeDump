public class Line {
	
	public static Point2D findPoint(Point2D a, Point2D b, double d) {
		//d can only be between 0 and 1, return null if it not.
		//Find the point that 
		if (d > 1.0 || d < 0.0) {
			return null;
		}
		double x = a.getX() + ((b.getX() - a.getX()) * d);
		double y = a.getY() + ((b.getY() - a.getY()) * d);
		Point2D twodpoint = new Point2D(x,y);
		return twodpoint;
	}
}