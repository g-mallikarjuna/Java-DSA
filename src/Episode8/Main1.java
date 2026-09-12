package Episode8;

public class Main1 {
    public static void main(String[] args){
        int arr[] = {5,8,10,11,50,15,20,25};
        int temp = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           temp =  Math.max(temp, arr[i]);
        }
        System.out.println(temp);
    }

}
