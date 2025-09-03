package lab5;
import java.util.Scanner;

public class pascal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Depth: ");
		int depth = scanner.nextInt();
		for(int i = 0; i < depth; i++) {
			for(int k = depth - i; k > 0; k--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(factorial(i) / (factorial(j) * factorial(i - j)));
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	public static int factorial(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
