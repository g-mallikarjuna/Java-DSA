package Episode16;

import java.util.HashMap;
public class Main1 {
    public static void main(String[] args){
        HashMap<String, Integer> names = new HashMap<>();
        String n[]= {"Hello", "hi", "Hello", "Sup"};

        for(int i=0; i<n.length; i++){
            if(names.containsKey(n[i])){
                names.put(n[i], names.get(n[i])+1);
            }else{
                names.put(n[i],1);
            }
        }
        for(String s : names.keySet()){
            System.out.println(s+" "+names.get(s));
        }
    }
}
