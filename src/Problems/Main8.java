package Problems;

public class Main8 {
    public static void main(String[] args){
        String s = " Hello World ";
        String trimS = s.trim();
        System.out.println(trimS);
        String s2[] = trimS.split(" ");
        System.out.println(s2.length);
        for(String sn : s2){
            System.out.println(sn);
        }
        System.out.println(s2[1].length());

    }
}
