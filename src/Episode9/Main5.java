package Episode9;

public class Main5 {
    public static void main(String[] args){
        int c = 10;
        int r = 6;

        for(int i=0; i<r; i++){
            for(int j=r; j<c-i; j--){
//                System.out.print("*");
            }
            System.out.println();
        }
    }
}
