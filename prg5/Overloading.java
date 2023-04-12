import java.util.Scanner;

class Box {
	double height, width, breadth;

	Box(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	Box() {
		this.height = this.width = this.breadth = 0;
	}

	Box(double n) {
		this.height = this.width = this.breadth = n;
	}

	double volume(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
		return this.height * this.width * this.breadth;
	}

	double volume() {
		return height * width * breadth;
	}
}

public class prg5 {
	public static void main(String[] args) {
		Box b1 = new Box(5, 6, 7);
		Box b2 = new Box();
		System.out.println("Enter height, width, breadth: ");
		Scanner in = new Scanner(System.in);
		double h = in.nextDouble();
		double w = in.nextDouble();
		double b = in.nextDouble();

		System.out.print("enter a side of a cube: ");
		double c = in.nextDouble();

		Box b3 = new Box(c);
		double vol = b1.volume();
		System.out.println("Initial volume = " + vol);
		vol = b2.volume(h, w, b);
		System.out.println("Updated volume = " + vol);
		vol = b3.volume();
		System.out.println("volume of a cube is = " + vol);
		in.close();
	}

}
