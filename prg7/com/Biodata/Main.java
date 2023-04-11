package com.Biodata;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int choice;
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("\n1.Teacher\n2.Student\n3.Exit\n");
			System.out.println("Enter your choice: ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				Teacher t = new Teacher();
				t.biodata();
				break;
			case 2:
				Student s = new Student();
				s.biodata();
				break;
			case 3:
				System.exit(0);
				break;
			}
		}
	}
}
