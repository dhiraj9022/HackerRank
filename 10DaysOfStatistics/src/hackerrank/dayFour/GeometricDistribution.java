package hackerrank.dayFour;

public class GeometricDistribution {
	public static void main(String[] args) {

		int n = 5;
		double p = 1 / 3.0;
		double q = 1 - p;
		double gd = 0.0;
		for (int i = 0; i < n; i++) {
			gd = Math.pow(q, n - 1) * p;
		}
		System.out.format("%.3f", gd);
	}
}
