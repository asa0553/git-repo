import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (
        Scanner s = new Scanner(System.in)) {
            int a,b,c;
            System.out.println("Enter two numbers: ");
            a=s.nextInt();
            b=s.nextInt();
            c=a+b;
            System.out.println("The sum of the two numbers is: "+c);
        }
    }
}
                                        
                
