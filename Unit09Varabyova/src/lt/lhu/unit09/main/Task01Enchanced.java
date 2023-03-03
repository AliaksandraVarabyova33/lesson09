package lt.lhu.unit09.main;

import java.util.Scanner;

public class Task01Enchanced {
	public static void main(String[] args) {
		double x;
		double result;

		x = inputDoubleFromConsole("Enter function argument");

		result = calculateFunction(x);

		simplePrint(x, result);
		richPrint(x, result);

	}

	public static double inputDoubleFromConsole(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Not valid input. " + message);
		}
		return sc.nextDouble();
	}

	public static double calculateFunction(double x) {
		return Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2.0 / 3.0))) + 1.7;
	}

	public static void simplePrint(double x, double result) {
		System.out.println(x + ", " + result);
	}

	public static void richPrint(double x, double result) {
		System.out.printf("x = [%.2f] , result = [%.2f]", x, result);
	}
}
