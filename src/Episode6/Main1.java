package Episode6;

public class Main1 {
    public static void main(String[] args){
        String name = "Mallikarjuna";
        int sum = 0;
        for(int i=0; i<name.length(); i++){
            int n = name.charAt(i);
            sum += n;
        }
        System.out.println(sum);
    }
}
