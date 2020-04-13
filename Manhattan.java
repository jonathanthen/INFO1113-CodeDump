import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.lang.Math;

public class Manhattan {
	public static void main(String[] args) {
		if (args.length != 5) {
			System.out.println("Invalid Number Of Arguments");
			return;
		}
		int width = 0;
		int height = 0;
		int x = 0;
		int y = 0;
		int walklimit = 0;
		int locx = 0;
		int locy = 0;
		try {
		int w = Integer.parseInt(args[0]);
		width = w;
		} catch (NumberFormatException a) {
			System.err.println("Invalid Width");
			return;
		}
		if (width <= 0) {
			System.out.println("Invalid Width");
			return;
		}
		try {
		int h = Integer.parseInt(args[1]);
		height = h;
		} catch (NumberFormatException b) {
			System.err.println("Invalid Height");
			return;
		}
		if (height <= 0) {
			System.out.println("Invalid Height");
			return;
		}
		try {
		int x1 = Integer.parseInt(args[2]);
		int y1 = Integer.parseInt(args[3]);
		int walk_limit = Integer.parseInt(args[4]);
		x = x1;
		y = y1;
		walklimit = walk_limit;
		} catch (NumberFormatException c) {
			System.err.println("Invalid Character Properties");
			return;
		}
		if (x < 0 || x > width) {
			System.out.println("Invalid Character Properties");
			return;
		}
		if (y < 0 || y > height) {
			System.out.println("Invalid Character Properties");
			return;
		}
		if (walklimit < 0) {
			System.out.println("Invalid Character Properties");
			return;
		}
		
		/*for (int i = 0; i < (height+2); i++) {
			for (int j = 0; j < (width*2)+1; j++) {
				if (i == 0 || i == (height+1)) {
					if (j == 0 || j == (width*2)) {
						System.out.print("+");
					} else {
						System.out.print("-");
					}
				} else {
					if (j == 0 || (j % 2) == 0) {
						System.out.print("|");
					} else {
						locx = (2*x)+1;
						locy = y+1;		
						if (j == locx && i == locy) {
							System.out.print("C");
							continue;
						}
						// TODO
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}*/
		//CREATING 2D ARRAY
		String[][] array = new String[height+2][(width*2)+1];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i == 0 || i == array.length -1) {
					if (j == 0 || j == array[0].length -1) {
						array[i][j] = "+";
					} else {
						array[i][j] = "-";
					}
				} else {
					if (j == 0 || j % 2 == 0) {
						array[i][j] = "|";
					} else {
						if (i == y+1 && j == (2*x)+1) {
							array[i][j] = "C";
						} else {
							array[i][j] = " ";
						}
					}
				}
			}
		}
		//TRYING TO PUT NUMBERS
		locx = (2*x)+1;
		locy = y+1;

		for (int i = 1; i < array.length-1; i+=1) {
			for (int j = 1; j < array[0].length; j+=2) {
				int dist = Math.abs(locy-i) + Math.abs(locx-(j/2)-x-1);
				if (dist == 0) {
					array[i][j] = "C";
				} else if (dist <= walklimit) {
					array[i][j] = Integer.toString(Math.abs(walklimit-dist));
				} else {
					array[i][j] = " ";
				}
			}
		}
		
		//PRINTING 2D ARRAY
		for (int i = 0; i < array.length; i ++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}