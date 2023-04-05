import java.util.Scanner;
class Staff{
    String staffid, name, phone, salary;
    Scanner in = new Scanner(System.in);
    public void Getdata(){
        System.out.print("Enter the Staff ID: ");
        staffid = in.nextLine();
        System.out.print("Enter the Name: ");
        name = in.nextLine();
        System.out.print("Enter the Phone Number: ");
        phone = in.nextLine();
        System.out.print("Enter the salary ");
        salary= in.nextLine();
    }
    public void Display(){
        System.out.printf("\n%-15s %-15s %-15s %-15s\n", "staffid", "name", "phone", "salary");
        System.out.printf("%-15s %-15s %-15s %-15s\n\n", staffid, name, phone, salary);
    }
}


class Teaching extends Staff{
    String domain, publications;
    Scanner in = new Scanner(System.in);
    public void Getdata(){
        super.Getdata();
        System.out.print("Which Domain: ");
        domain = in.nextLine();
        System.out.print("Number of Publications: ");
        publications = in.nextLine();
    }

    public void Display(){
        super.Display();
        System.out.println("Domain : "+ domain);
        System.out.println("Publications number : "+ publications);
        System.err.println();

    }
}

class Technical extends Staff{
    String skills;
    Scanner in = new Scanner(System.in);
    public void Getdata(){
        super.Getdata();
        System.out.print("what skill do you have: ");
        skills = in.nextLine();
    }

    public void Display(){
        super.Display();
        System.out.printf("Skills : %s", skills);
        
    }
}

class Contract extends Staff{
    String period;
    Scanner in = new Scanner(System.in);
    public void Getdata(){
        super.Getdata();
        System.out.print("Contract period: ");
        period = in.nextLine();
    }

    public void Display(){
        super.Display();
        System.out.printf("contract Period : %s", period);
        
    }
}

public class StaffDetails {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n1,n2,n3;
        System.out.print("Enter the number of Teaching staff: ");
        n1 = in.nextInt();
        Teaching staff1[] = new Teaching[n1];
        for(int i = 0; i < n1; i++){
            staff1[i] = new Teaching();
            staff1[i].Getdata();
        }
        for(int i = 0; i< n1; i++){
            staff1[i].Display();
        }

        System.out.print("Enter the number of Technical staff: ");
        n2 = in.nextInt();
        Technical staff2[] = new Technical[n2];
        for(int i = 0; i < n2; i++){
            staff2[i] = new Technical();
            staff2[i].Getdata();
        }
        for(int i = 0; i< n2; i++){
            staff2[i].Display();
        }

        System.out.print("Enter the number of contract base staff: ");
        n3 = in.nextInt();
        Contract staff3[] = new Contract[n3];
        for(int i = 0; i < n3; i++){
            staff3[i] = new Contract();
            staff3[i].Getdata();
        }
        for(int i = 0; i< n3; i++){
            staff3[i].Display();
        }
        in.close();
    }
}
