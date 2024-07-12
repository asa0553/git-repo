import java.util.Scanner;

public class classB{
    public static String Caps(String s){
        return s.toLowerCase();
    }
    public static void main(String[] args) {
         Scanner z = new Scanner(System.in);
        System.out.println("Please enter a name: ");
         String name = z.nextLine();
         String capname = Caps(name);
         System.out.println(capname);
         z.close();
    }
}
