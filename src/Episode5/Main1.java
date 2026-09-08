package Episode5;

public class Main1 {
    public static void sum(){
        System.out.println("Sum "+(10+10));
    }
    static void sum(int n, int m){
        System.out.println("Sum "+(n+m));
    }
    void sum(int a, int b, int c){
        System.out.println("Sum "+(a+b+c));
    }
    int sum(int a, int b, int c, int d){

        return(a+b);
    }
    public static void main(String[] args){
        System.out.println("Hello");
        sum();
        sum(100,100);
        Main1 obj = new Main1();
        obj.sum(10,20,30);
        System.out.println(obj.sum(10,20,30,40));
    }

}
