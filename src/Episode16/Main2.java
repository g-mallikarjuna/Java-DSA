package Episode16;

import java.util.HashMap;
public class Main2 {
    public static void main(String[] args){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int nums[] = {3,2,3};

        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                int prev = hm.get(nums[i]);
                hm.put(nums[i], prev+1);
            }else{
                hm.put(nums[i],1);
            }
        }

        for(int n : hm.keySet()){
            System.out.println(n+" "+hm.get(n));
        }
    }
}
