import java.util.Scanner;

public class AriCalci {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		double num1, num2;
		double result = 0;
		String choice;
		String isRunOn = "";
		while (!isRunOn.equals("no")) {
			System.out.print("Enter number 1 value: ");
			num1 = in.nextInt();
			in.nextLine();
			System.out.print("Enter the operator(+,-,*,/,%): ");
			choice = in.next();
			System.out.print("Enter number 2 value: ");
			num2 = in.nextInt();
			in.nextLine();
			switch (choice) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("Divide by zero error!!\n");
					return;
				}
				result = num1 / num2;
				break;
			case "%":
				if (num2 == 0) {
					System.out.println("Divide by zero error!!\n");
					return;
				}
				result = num1 % num2;
				break;
			default:
				System.out.println("Wrong choice of operator!!\n");
				result = 0;
			}
			System.out.println("Result = " + result);
			System.out.print("Do you want to run again?(Yes/no): ");
			isRunOn = in.next();

		}
		in.close();
	}
}
