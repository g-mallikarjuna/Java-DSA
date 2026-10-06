package Episode9;

public class Main2 {
    public static void main(String[] args){
        int n = 20;
        int m = 3;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("*");
                if(j!=m-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
