import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) throws Exception {
        int A, N;
        Scanner input = new Scanner(System.in);

        //System.out.print("Digite o valor de A:");
        A = input.nextInt();
        //System.out.print("Digite o valor de N:");
        N = input.nextInt();
        
        int soma = 0;
        int total = 0;
        while(soma < N){
            soma = soma + A;
            total = total + soma;
            //System.out.println("soma = "+soma);
            //System.out.println("total = "+total);
        }
        System.out.println(total);
    }
}
