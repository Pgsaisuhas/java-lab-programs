import java.util.Scanner;
class Quadratic{
    public static void main(String args[]) {
       float a,b,c;
       System.out.print("Enter the values of A,B,C which are the coefficients of x2, x, constant: ");
       Scanner in = new Scanner(System.in);
       a = in.nextFloat();
       b = in.nextFloat();
       c = in.nextFloat();

       float disc = (b*b)-(4*a*c);

       if(disc > 0){
        float root1, root2;
        root1 = ((-b)+(float)(Math.sqrt(disc)))/(2*a);
        root2 = ((-b)-(float)(Math.sqrt(disc)))/(2*a);
        System.out.printf("The Roots are Real and distinct\nRoot1: %.2f\nRoot2: %.2f\n",root1,root2);
       }else if(disc == 0){
        float root;
        root = (-b)/(2*a);
        System.out.printf("The Roots are Real and Equal\nRoot1: %.2f\nRoot2: %.2f\n",root,root);
       }else{
        float rp, ip;
        rp = (-b)/(2*a);
        ip = (float)(Math.sqrt(-disc))/(2*a);
        System.out.printf("The roots are not real\nRoot1: %.2f + %.2f\nRoot2: %.2f - %.2f\n",rp,ip,rp,ip);
       }
       in.close();

    }
}