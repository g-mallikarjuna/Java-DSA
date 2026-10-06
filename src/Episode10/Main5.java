package Episode10;
public class Main5 {
    public static void main(String[] args){
        int n = 6;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(j!=i){
                    System.out.print(j+" ");
                }else{
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}
