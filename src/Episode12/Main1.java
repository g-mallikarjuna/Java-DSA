package Episode12;

public class Main1 {
    public static void main(String[] args){
        int arr[] = {17,18,5,4,6,1};
        int right = -1;
        for(int i=arr.length-1; i>=0; i--){
            int prev = arr[i];
            arr[i] = right;
            right = Math.max(right, prev);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
