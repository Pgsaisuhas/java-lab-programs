package com.Biodata;

import java.util.Scanner;

public class Teacher {
	String name, age, qualification, experience;
	int n;
	String ach[] = new String[100];

	public void biodata() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = in.nextLine();
		System.out.println("Enter the age : ");
		age = in.next();
		System.out.println("Enter the qualification : ");
		qualification = in.next();
		System.out.println("Enter the Experience : ");
		experience = in.next();
		System.out.println("Enter the number of achivements : ");
		n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the achivement " + (i + 1) + " : ");
			ach[i] = in.nextLine();

		}
		// Display
		System.out.println("\n\nBiodata : Teacher");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Qualification : " + qualification);
		System.out.println("Experience : " + experience);
		System.out.println("Achivements : ");
		for (int i = 0; i < n; i++) {
			System.out.println(ach[i]);
		}
	}

}
