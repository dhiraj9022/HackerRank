package hackerrank.dayZero;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Solution {
	/*
	 * Complete the 'weightedMean' function below.
	 *
	 * The function accepts following parameters: 1. INTEGER_ARRAY X 2.
	 * INTEGER_ARRAY W
	 */

	public static void weightedMean(List<Integer> X, List<Integer> W) {
		// Write your code here

		double weightSum = 0;
		double xweightSum = 0;

		for (int i = 0; i < X.size(); i++) {
			xweightSum = xweightSum + X.get(i) * W.get(i);
			weightSum = weightSum + W.get(i);
		}
		double weightedMean = 0;
		weightedMean = (int) (xweightSum / weightSum);
		System.out.format("%.1f", weightedMean);
	}

}

public class WeightedMean {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Solution.weightedMean(vals, weights);

		bufferedReader.close();
	}
}
