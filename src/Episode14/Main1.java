package Episode14;

public class Main1 {
    public static void main(String[] args){
        int n[] = {10,1,2,3,4,5,6};

        for(int i=0; i<n.length; i++){

            boolean isBool = false;
            for(int j=0; j<n.length-1-i; j++){
                if(n[j] < n[j+1]){
                    System.out.println(n[j]);
                    int temp = n[j];
                    n[j] = n[j+1];
                    n[j+1] = temp;
                    isBool = true;
                }
            }
            if(isBool == false){
                System.out.println("yup");
                break;
            }
        }
        for(int i=0; i<n.length; i++){
            System.out.print(n[i]+" ");
        }
    }
}
