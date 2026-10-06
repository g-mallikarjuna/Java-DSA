package Episode13;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        System.out.print("Enter a float");
        float floatn = sc.nextFloat();
        System.out.print("Enter a double");
        double doublen = sc.nextDouble();
        System.out.print("Enter a boolean");
        boolean booleann = sc.nextBoolean();
        System.out.print("Enter a character");
        char charn = sc.next().charAt(0);
        System.out.print("Enter a String");
        String s = sc.next();

        System.out.println("Number "+n);
        System.out.println("Floats "+floatn);
        System.out.println("Double "+doublen);
        System.out.println("Boolean "+booleann);
        System.out.println("Char "+charn);
        System.out.println("String "+s);
    }
}
