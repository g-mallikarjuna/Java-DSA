package Problems;

public class Main7 {
    public static void main(String[] args){
        int nums[] = {3,1,0};
        int count = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
