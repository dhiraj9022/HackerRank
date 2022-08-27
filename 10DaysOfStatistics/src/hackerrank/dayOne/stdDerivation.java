package hackerrank.dayOne;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Derivation {

	/*
	 * Complete the 'stdDev' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public static void stdDev(List<Integer> arr) {
		// Print your answers to 1 decimal place within this function
		int n = arr.size();

		double sum = 0;
		double stdSum = 0;
		double mean = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arr.get(i);
			mean = sum / n;
		}

		for (int j = 0; j < arr.size(); j++) {
			stdSum = stdSum + Math.pow((arr.get(j) - mean), 2);
		}
		System.out.println(Math.sqrt(stdSum / n));
	}

}

class stdDerivation {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		Derivation.stdDev(vals);

		bufferedReader.close();
	}
}
