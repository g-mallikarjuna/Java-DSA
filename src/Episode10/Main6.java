package Episode10;

public class Main6 {
    public static void main(String[] args){
        int n = 5;
        for(int i=n-1; i>=0; i--){
            for(int s=0; s<i; s++){
                System.out.print("  ");
            }
            for(int j=(n-i); j>0; j--){
                System.out.print(j+" ");

            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int s=i; s<n; s++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
