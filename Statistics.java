import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Statistics {
	
	// Returns the mean of the given data set.
	public static double mean(ArrayList<Double> numbers) {
		double sum = 0;
		double count = numbers.size();
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		double m = sum/count;
		return m;
	}
	
	// Returns the variance of the given data set.
	public static double variance(ArrayList<Double> numbers, double mean) {
		double total = 0;
		double count = numbers.size();
		for (int i = 0; i < numbers.size(); i++) {
			double temp = numbers.get(i) - mean;
			double temp2 = temp*temp;
			total += temp2;
		}
		double v = total/count;
		return v;
	}
	
	// Returns the standard deviation of the given data set.
	public static double sd(double variance) {
		double std = Math.sqrt(variance);
		return std;
	}
	
	public static void main(String[] args) {
	
		ArrayList<Double> list = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter data set:");
		while (scan.hasNextDouble()) {
			double d = scan.nextDouble();
			list.add(d);
		}
		System.out.println();
		if (list.size() == 0) {
			System.out.println("No data!");
			return;
		}
		double avg = mean(list);
		System.out.printf("Mean = %.4f", avg);
		System.out.println();
		double var = variance(list, avg);
		System.out.printf("Variance = %.4f", var);
		System.out.println();
		double stdev = sd(var);
		System.out.printf("Standard deviation = %.4f", stdev);
		System.out.println();
	}
}