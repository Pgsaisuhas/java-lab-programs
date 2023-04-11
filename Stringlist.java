package com.Suhas;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringlist {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String choice;
		String str, str1;

		while (true) {
			System.out.println("\n********************************\n");
			System.out.println(
					"\n1.Append at the end\n2.Add at given position\n3.Search\n4.List of items starting with\n5.Exit\n");
			System.out.println("\n********************************\n");
			System.out.print("Enter your choice: ");
			choice = in.next();
			in.nextLine(); // consume the newline character left by the previous in.next() call
			switch (choice) {
			case "1":
				System.out.print("Enter a String: ");
				str = in.nextLine();
				list.add(str);
				break;
			case "2":
				System.out.print("Enter a string: ");
				str = in.nextLine();
				System.out.print("Enter the position: ");
				int position = in.nextInt();
				in.nextLine(); // consume the newline character left by the previous in.nextInt() call
				list.add(position, str);
				break;
			case "3":
				System.out.print("Enter a String to search: ");
				str = in.nextLine();
				int index = list.indexOf(str);
				System.out.println(str + " is found at " + index);
				break;
			case "4":
				System.out.print("Enter a starting letter: ");
				str = in.next();
				for (int i = 0; i < list.size(); i++) {
					str1 = list.get(i);
					if (str1.startsWith(str)) {
						System.out.println(str1);
					}
				}
				break;
			case "5":
				System.exit(0);
				break;
			}
		}
	}
}
