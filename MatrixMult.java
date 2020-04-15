import java.util.Scanner;

public class MatrixMult {
	public static void main(String[] args) {
		Scanner dimension = new Scanner(System.in);
		int colA = dimension.nextInt(); //c1
		int rowA = dimension.nextInt(); //r1
		int colB = dimension.nextInt(); //c2
		int rowB = dimension.nextInt(); //r2
		if (colA == 0) {
			System.out.println(0);
		}
		if (colA == rowB) {
			int[][] A = new int[rowA][colA];
			int[][] B = new int[rowB][colB];

			while (dimension.hasNextInt()) {
				for(int i = 0; i < A.length; i++) {
					for(int j = 0; j < A[0].length; j++) {
						A[i][j] = dimension.nextInt();
					}
				}
				for(int i = 0; i < B.length; i++) {
					for(int j = 0; j < B[0].length; j++) {
						B[i][j] = dimension.nextInt();
					}
				}
			}
			int[][] C = Mult(A, B, rowA, colB);
			for(int x = 0; x < C.length; x++) {
				for(int y = 0; y < C[0].length; y++) {
					if(y == (C[0].length -1)) {
						System.out.print(C[x][y]);
					} else {
						System.out.print(C[x][y] + " ");
					}
				}
				System.out.println();
			}
			
		} else {
			System.out.println("Invalid input.");
		}
	}
	
	public static int[][] Mult(int[][] arrayA, int[][] arrayB, int rA, int cB) {
		int[][] arrayC = new int[rA][cB];
		for(int i = 0; i < arrayA.length; i++) {
			for(int j = 0; j < arrayB[0].length; j++) {
				for(int k = 0; k < arrayA[0].length; k++) {
					arrayC[i][j] += arrayA[i][k] * arrayB[k][j];
				}
			}
		}
		return arrayC;
	}
}