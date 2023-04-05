import java.util.Scanner;

public class Primeornot{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.print("enter a sumber to check if it is prime or not: ");
        number = in.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=number/2; i++){
            if(number%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number\n");
        }else{
            System.out.println(number + " is not a prime number\n");
        }
        in.close();
    }
}