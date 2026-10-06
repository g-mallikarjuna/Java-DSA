package Episode10;

public class Main2 {
    public static void main(String[] args){
        int m = 4;
        for(int i=0; i<m; i++){
            for(int s=0; s<m-i-1; s++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j==0 || j>=2*i+1-1 || i==m-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
