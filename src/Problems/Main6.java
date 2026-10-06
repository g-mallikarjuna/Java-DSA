package Problems;

public class Main6 {
    public static void main(String[] args){
        String s = "abcdd";
        int max = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    max = Math.min(max, j);
                }
            }
        }
        System.out.println(s.charAt(max));
    }
}
