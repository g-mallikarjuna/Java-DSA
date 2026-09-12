package Episode8;

public class Main2 {
    public static void main(String[] args){
        int temp = Integer.MIN_VALUE;
        String sentence[] = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        for(int i=0; i<sentence.length; i++){
            String sent1  = sentence[i];
//            System.out.println(sent1.length()+" "+sent1);
            int count = 1;
            for(int j=0; j<sent1.length(); j++){
                if(sent1.charAt(j) == ' '){
                    count += 1;
                }
            }
            temp = Math.max(temp, count);
        }
        System.out.println(temp);
    }
}
