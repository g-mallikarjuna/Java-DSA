package Problems;

public class Main3 {
    public static void main(String[] args){
        int nums[] = {1,2,3};
        int num2[] = {3,2,1};
        int ans[] = new int[2*nums.length];
        int index = 0;
        for(int i=0; i<nums.length; i++){
            ans[index++] = nums[i];
        }
        for(int j=0; j<nums.length; j++){
            ans[index++] = num2[j];
        }
        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
