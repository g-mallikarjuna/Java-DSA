import java.util.Scanner;
public class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array of numbers ");
        for(int i=0; i<arr.length; i++){
            System.out.printf("Enter a number %d ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered arrays ");
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        System.out.println(count);
    }
}