package com.Biodata;

import java.util.Scanner;

public class Student implements Resume {
	String name, age, result, discipline;

	public void biodata() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = in.nextLine();
		System.out.println("Enter the age : ");
		age = in.next();
		System.out.println("Enter the result : ");
		result = in.next();
		System.out.println("Enter discipline : ");
		discipline = in.nextLine();

		// Display
		System.out.println("\n\nBiodata : Student");
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Result : " + result);
		System.out.println("discipline : " + discipline);
	}

}
