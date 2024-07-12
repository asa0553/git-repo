import java.util.Scanner;

public class complex {
        public static double findSquareRoot(double number) {
            double squareRoot = Math.sqrt(number);
            return squareRoot;
        }

        public static double product(double a, double b) {
            return a * b;
        }
        public static double sum(double a, double b) {
            return a + b;
        }
        public static double sub(double a, double b) {
            return a - b;
        }

        public static void main(String[] args) {
            Scanner z = new Scanner(System.in);
            System.out.println("Please enter the first number: ");
            double a = z.nextDouble();
            System.out.println("Please enter the second number: ");
            double b = z.nextDouble();
            System.out.println("Please enter the third number: ");
            double c= z.nextDouble();
            double  B = product(b, b);
            double A = product(a,a);
            double AB = product(A, b);
            double C1 = product(a, b);
            double ABC = product(C1, c);
            double A2= sum(B, AB);
            double result = sub(A2, ABC);
            System.out.println("The result is: " + result);
            z.close();
            
        }
}