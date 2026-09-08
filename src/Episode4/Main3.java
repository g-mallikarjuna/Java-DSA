package Episode4;

public class Main3 {
    public static void main(String[] args){
        String name = "abba";
        String revName = "";
//        for(int i = name.length()-1; i>=0; i--){
//            if(name.charAt(i) == name.charAt(name.length()-1 - i)){
//                revName += name.charAt(i);
//                System.out.println("o");
//            }else{
//                break;
//            }
//        }
        boolean isTrue = false;
        for(int i=0; i<name.length()/2; i++){
            if(name.charAt(i) == name.charAt(name.length()-i-1)){
                isTrue = true;
            }else{
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
