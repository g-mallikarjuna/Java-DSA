package Episode4;

public class Main1 {
    public static void main(String[] args){
        int number = 123321;
        int temp = number;
        int revNumber = 0;

        while(number > 0){
            int temp1 = number % 10;
            revNumber = (revNumber * 10) + temp1;
            number = number / 10;
        }
        System.out.println(revNumber);
        if(revNumber == temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}
