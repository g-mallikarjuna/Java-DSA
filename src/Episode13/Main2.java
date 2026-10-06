package Episode13;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<1; i++){
            System.out.print("Enter an ID");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter a name ");
            String name = sc.nextLine();
            System.out.print("Enter a age ");
            int age = sc.nextInt();
            System.out.print("Enter isALive ");
            boolean isAlive = sc.nextBoolean();
            System.out.print("Enter a salary ");
            double salary = sc.nextDouble();
            System.out.print("Enter a favorate character ");
            char c = sc.next().charAt(0);

            System.out.println("#########Details##########");
            System.out.println("Id "+id);
            System.out.println("Name "+name);
            System.out.println("Age "+age);
            System.out.println("isAlive "+isAlive);
            System.out.println("salary "+salary);
            System.out.println("character "+c);
        }

    }
}
