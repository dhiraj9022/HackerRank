package hackerrank.daySix;

public class CentralLimitTheoremIII {
	public static void main(String[] args) {

		double mean = 500;
		double n = 100;
		double stdDeri = 80;
		double z = 1.96;
		double Xa = 0;
		double Xb = 0;

		// caseI
		Xa = ((stdDeri * z) / Math.sqrt(n)) - mean;

		// caseII
		Xb = ((stdDeri * z) / Math.sqrt(n)) + mean;

		// caseI
		System.out.format("%.2f%n", Math.abs(Xa));

		// caseII
		System.out.format("%.2f%n", Xb);

	}
}