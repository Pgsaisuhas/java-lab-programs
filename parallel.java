package practice;

import java.util.Random;

class Square extends Thread {
	int x;

	Square(int n) {
		x = n;
	}

	public void run() {
		int square = x * x;
		System.out.println("Square of " + x + " is: " + square);
	}
}

class Cube extends Thread {
	int x;

	Cube(int n) {
		x = n;
	}

	public void run() {
		int cube = x * x * x;
		System.out.println("Square of " + x + " is: " + cube);
	}
}

class Number extends Thread {
	public void run() {
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			int randint = rand.nextInt(100);
			System.out.println("The randomyl geenrated integer is: " + randint);
			Square s = new Square(randint);
			s.start();
			Cube c = new Cube(randint);
			c.start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class parallel {
	public static void main(String[] args) {
		Number n = new Number();
		n.start();
	}
}
