import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c;
		double disc, root1, root2, rp, ip;

		String userInput = "";
		while (!userInput.equals("no")) {
			System.out.println("Enter the co-efficients of the quadratic Equation: ");
			System.out.print("A: ");
			a = in.nextDouble();
			System.out.print("B: ");
			b = in.nextDouble();
			System.out.print("C: ");
			c = in.nextDouble();
			in.nextLine();

			disc = (b * b) - (4 * a * c);

			if (disc > 0) {
				root1 = (-b + (Math.sqrt(disc))) / (2 * a);
				root2 = (-b - (Math.sqrt(disc))) / (2 * a);
				System.out.println("The Roots are real and distinct!\nRoot1: " + root1 + "\nRoot2: " + root2);
			} else if (disc == 0) {
				root1 = root2 = (-b) / (2 * a);
				System.out.println("The Roots are real and equal!\nRoot1: " + root1 + "\nRoot2: " + root2);
			} else {
				rp = (-b) / (2 * a);
				ip = Math.sqrt(-disc) / (2 * a);
				System.out.println(
						"The roots are imaginary!\n" + "Root1: " + rp + "+ i " + ip + "\nRoot2: " + rp + "- i " + ip);
			}

			System.out.println("Do you want to run again?(Yes/No): ");
			userInput = in.next();

		}
	}
}