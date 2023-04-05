import java.util.Scanner;

public class Aricalc {
    public static void main(String[] args) {
        double num1, num2, result=0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter num1 and num2: ");
            num1 = in.nextDouble();
            num2 = in.nextDouble();

            System.out.println("\nArithmetic calculator: ");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Check remainder");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            String choice = in.next();
            

            switch (choice) {
                case "1":
                    result = num1 + num2;
                    break;
                case "2":
                    result = num1 - num2;
                    break;
                case "3":
                    result = num1 * num2;
                    break;
                case "4":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case "5":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = num1 % num2;
                    break;
                case "6":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    // continue;
            }

            System.out.printf("Result: %.2f\n\n", result);
            // in.close();
        }
        
    }
}

