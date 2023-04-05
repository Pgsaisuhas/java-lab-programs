import java.util.Scanner;

public class Students{
    private String USN;
    private String name;
    private String branch;
    private String phone;

    public Students(String USN, String name, String branch, String phone) {
        this.USN = USN;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
    }

    public String getUSN() {
        return USN;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getPhone() {
        return phone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Creating an array of Student objects
        Students[] students = new Students[n];

        // Inputting details for each Student object
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the details for student %d:%n", i+1);
            System.out.print("USN: ");
            String USN = scanner.next();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Branch: ");
            String branch = scanner.next();
            System.out.print("Phone: ");
            String phone = scanner.next();

            students[i] = new Students(USN, name, branch, phone);
        }

        // Printing the details of each Student object
        System.out.printf("%-15s%-15s%-15s%-15s%n", "USN", "Name", "Branch", "Phone");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%n", students[i].getUSN(), students[i].getName(), students[i].getBranch(), students[i].getPhone());
        }

        scanner.close();
    }
}
