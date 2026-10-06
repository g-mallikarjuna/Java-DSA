package Episode15;

import java.util.HashMap;
public class Main1 {
    public static void main(String[] args){
        HashMap<Integer, Integer> nums = new HashMap<>();
        int n[] = {1,5,8,0,1,8,1,5,1};

        for(int i=0; i<n.length; i++){

            if(nums.containsKey(n[i])){
                int prev = nums.get(n[i]);
                nums.put(n[i],prev+100);
            }else{
                nums.put(n[i],100);
            }

        }
        for(int i : nums.keySet()){
            System.out.println(i+" "+nums.get(i));
        }
    }
}
