package fibonacci;

import java.util.*;

public class Fibonacci_Edic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int maxNum = input.nextInt();
		System.out.print("Do you want to test:\n1. Non-recursive\n2. Recursive\nInput: ");
		int options = input.nextInt();
		long startTime, endTime, elapsedTime;

		switch (options) {
		case 1:
			nrfibonacci(maxNum);
			startTime = System.nanoTime();
			endTime = System.nanoTime();
			elapsedTime = endTime - startTime;

			System.out.println("\nElapsed time: " + elapsedTime + " nanoseconds");
			break;

		case 2:
			for (int i = 0; i < maxNum; i++) {
				System.out.print(rfibonacci(i) + " ");
			}
			startTime = System.nanoTime();
			endTime = System.nanoTime();
			elapsedTime = endTime - startTime;

			System.out.println("\nElapsed time: " + elapsedTime + " nanoseconds");
			break;
		}
	}

	public static void nrfibonacci(int i) {
		int num1 = 0;
		int num2 = 1;

		for (int j = 1; j <= i; j++) {
			System.out.print(num1 + " ");

			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}

	public static int rfibonacci(int i) {
		if (i == 0) {
			return 0;
		}
		if (i == 1 || i == 2) {
			return 1;
		}
		return rfibonacci(i - 2) + rfibonacci(i - 1);
	}
}
