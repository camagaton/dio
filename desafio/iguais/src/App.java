import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o valor de A:");
        int A = scan.nextInt();
        System.out.println("digite o valor de B:");
        int B = scan.nextInt();
        scan.close();

        if( A == B){
            System.out.println("Sao iguais!");
        }else{
            System.out.println("Nao sao iguais!");
        }

    }
}
