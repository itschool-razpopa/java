public class Operators {
	public static void main(String[] args) {
		
		int sum = add(1,2);
		System.out.println(sum);

		double substract = substract(1.2,4);
		System.out.println(substract);

		int divide = divide(1,4);
		System.out.println(divide);

		int multiply = multiply(1,4);
		System.out.println(multiply);

		int rest = mod(1,4);
		System.out.println(rest);

		String result = div(10,4);
		System.out.println(result);
	}

	public static int add(int termen1, int termen2) {
		return termen1 + termen2;
	}

	public static double substract(double termen1, double termen2) {
		return termen1 - termen2;
	}

	public static int divide(int numarator, int numitor) {
		return numarator / numitor;
	}

	public static int multiply(int factor1, int factor2) {
		return factor1 * factor2;
	}

	public static int mod(int factor1, int factor2) {
		return factor1 % factor2;
	}

	public static String div(int numarator, int numitor) {
		int cat = divide(numarator, numitor);
		int rest = mod(numarator, numitor);

		return numarator + " = " + numitor + " * " + cat + " + " + rest;

	}
}