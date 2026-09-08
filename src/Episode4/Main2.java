package Episode4;

public class Main2 {
    public static void main(String[] args){
        String name = "Mallikarjuna";
        String revName = "";
        for(int i=name.length()-1; i>=0; i--){
            revName += name.charAt(i);
        }
        System.out.println(name + " "+revName);

    }
}
