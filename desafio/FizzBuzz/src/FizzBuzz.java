import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);
        //System.out.print("digite um numero: ");
        int num = number.nextInt();
        responder(num);
        number.close();
    }

    static void responder(int num){
        if(((num % 3) == 0) && ((num % 5) == 0)){
            System.out.println("FizzBuzz");
        }else if((num % 3) == 0){
            System.out.println("Fizz");
        }else if((num % 5) == 0){
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }
}
