package Episode9;

public class Main6 {
    public static void main(String[] args){
        int n = 3;
        for(int i=0; i<n; i++){
            for(int j=n; j>=n-i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
