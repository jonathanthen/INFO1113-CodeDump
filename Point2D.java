public class Point2D {
	double coord1;
	double coord2;
	
	public Point2D(double x, double y) {
	coord1 = x;
	coord2 = y;		
	}
	
	public double getX() {
		return coord1;
	}
	
	public double getY() {
		return coord2;
	}
	
	public double[] getCoords() {
		double[] bothcoord = {coord1, coord2};
		return bothcoord;
	}
}