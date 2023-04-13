package practice;

import java.io.File;
import java.util.Scanner;

public class Filechk {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String filename = in.nextLine();
		File file = new File(filename);
		if (file.exists()) {
			System.out.println("The file name is: " + file.getName());
			System.out.println("Is the file writable? : " + file.canWrite());
			System.out.println("Is the file Readable? : " + file.canRead());
			System.out.println("The size of the file is: " + file.length());
		} else {
			System.out.println("The File " + filename + " Does not exist.\n");
		}
	}

}
