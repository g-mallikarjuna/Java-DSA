package Episode3;

public class Main1 {
    public static void main(String[] args){
        int arr[] = {10,20,40,50,2,1,15,200};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] % 3 == 0){
                count++;
                System.out.print(arr[i]);
            }
        }
        System.out.println(" "+count);
    }
}
