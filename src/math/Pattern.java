package math;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		for (int i = 100; i >= 90; i--) {
			System.out.print(i + ",");
		}
		for (int j = 88; j >= 70; j = j - 2) {
			System.out.print(j + ",");
		}
		for (int k = 67; k >= 40; k = k - 3) {
			System.out.print(k + ",");
		}
		for (int l = 36; l >= 4; l = l - 4) {
			System.out.print(l + ",");
		}
		System.out.println(0);


	}
}