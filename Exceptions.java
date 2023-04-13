package practice;

import java.util.Scanner;

public class Exceptions {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values of a,b: ");
		a = in.nextInt();
		b = in.nextInt();
		in.nextLine();
		try {
			c = a / b;
			System.out.println("The result is: " + c);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("divide by Zero error!!\n");
		}

	}

}
