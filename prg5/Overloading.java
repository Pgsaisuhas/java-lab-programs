public class Overloading {
    
    // constructor overloading
    public Overloading() {
        System.out.println("A new calculator has been created.");
    }
    
    public Overloading(int initialValue) {
        System.out.println("A new calculator with initial value " + initialValue + " has been created.");
    }
    
    // method overloading
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public double add(double num1, double num2) {
        return num1 + num2;
    }
    
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    public static void main(String[] args) {
        // constructor overloading example
        Overloading calc1 = new Overloading();
        Overloading calc2 = new Overloading(5);
        
        // method overloading example
        int sum1 = calc1.add(2, 3);
        double sum2 = calc1.add(2.5, 3.5);
        int sum3 = calc1.add(2, 3, 4);
        
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
        
        int sum4 = calc2.add(2, 3);
        double sum5 = calc2.add(2.5, 3.5);
        int sum6 = calc2.add(2, 3, 4);
        
        System.out.println("Sum4: " + sum4);
        System.out.println("Sum5: " + sum5);
        System.out.println("Sum6: " + sum6);
    }
    
}
