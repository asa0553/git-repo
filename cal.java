import java.util.Scanner;

public class cal {
    public static void addTwoNumbers(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println("Result= " + sum);
    }
    public static void mulTwoNumbers(double mul1, double mul2) {
        double sum_mul = mul1*mul2;
        System.out.println("Result= " + sum_mul);
    }
    public static void subTwoNumbers(double sub1, double sub2) {
        double result_sub = sub1 - sub2;
        System.out.println("Result= " + result_sub);
    }
    public static void divTwoNumbers(float div1, float div2) {
        float sum_div = div1 / div2;
        System.out.println("Result= " + sum_div);
    }
    public static void Display() {
        System.out.println("You got it correct!!");
    }
    public static void main(String[] args) {
        int a, b;
        Scanner z = new Scanner(System.in);
        System.out.println("Please enter a number: ");
         a = z.nextInt();
         System.out.println("Please enter a second number: ");
         b= z.nextInt();
         addTwoNumbers(a, b);
         mulTwoNumbers(a, b);
         divTwoNumbers(a, b);
         subTwoNumbers(a, b);
         Display();
         z.close();

    }
}
         
