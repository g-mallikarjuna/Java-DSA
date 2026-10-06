package Problems;

public class Main5 {
    public static void main(String[] args){
        String s = "aabb";
        for(int i=0; i<s.length(); i++){
            String sub = "";
            if(i==0){
                sub = s.substring(i+1);
            }else{
                sub += s.substring(0,i);
                sub += s.substring(i+1);
            }

            if(!(sub.contains(Character.toString(s.charAt(i))))){
                System.out.println(i);
                break;
            }
        }

    }
}
