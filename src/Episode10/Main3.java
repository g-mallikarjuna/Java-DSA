package Episode10;

public class Main3 {
    public static void main(String[] args){
        int n = 4;
        for(int i=n; i>=0; i--){
            for(int s=0; s<=n-i-1; s++){
                System.out.print(" ");
            }
            for(int j=0; j<i*2+1; j++){
                if(j==0 || i==n || j>=i*2+1-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
