package Problems;

public class Main4 {
    public static boolean checkPal(String s){
        char firstLetter = s.charAt(0);
        char lastLetter = s.charAt(s.length()-1);
        int count = 0;
        if(firstLetter == lastLetter){
            for(int i=0; i<s.length()/2; i++){
                if(s.charAt(i) == s.charAt(s.length()-1-i)){
                    count++;
                }else{
                    count--;
                    break;
                }
            }
        }else{
            count = 0;
        }
        if(count >= s.length()/2){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        String[] words = {"abc","car","ada","racecar","cool"};
        for(int i=0; i<words.length; i++){
            boolean isTrue = checkPal(words[i]);
            if(isTrue){
                System.out.println(words[i]);
                break;
            }
        }
    }
}
