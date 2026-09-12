package Episode7;

public class Main1 {
    public static void main(String[] args){
        String s[] = {"X++", "X++","X++"};
        int x = 0;
        for(int i=0; i<s.length; i++){
            if(s[i].equals("--X") || s[i].equals("X--")){
                x -= 1;
            }else{
                x += 1;
            }
        }
        System.out.println(x);
    }
}
