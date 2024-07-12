import java.util.*;

public class Add {
    public static void main(String[] args) {
        int a, b,c;
        Scanner z = new Scanner(System.in);
        System.out.println("Please enter a number: ");
         a = z.nextInt();
         System.out.println("Please enter a second number: ");
         b= z.nextInt();
         c= a+b;
        System.out.println("The sum is : " + c);
        z.close();
    }
}