package hackerrank.dayFive;

public class PosionDistributionII {
	public static void main(String[] args) {

		double lemA = 0.88;
		double lemB = 1.55;
		double cA = 0;
		double cB = 0;

		// caseI
		cA = 160 + 40 * (lemA + Math.pow(lemA, 2));
		System.out.format("%.3f", cA);
		System.out.println();

		// caseII
		cB = 128 + 40 * (lemB + Math.pow(lemB, 2));
		System.out.format("%.3f", cB);

	}
}