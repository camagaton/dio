import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) throws Exception {
        int A, N;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        A = input.nextInt();
        System.out.print("Digite o valor de N:");
        N = input.nextInt();
        
        int soma = A;
        int cont = A;
        while(cont <= N){
            soma = soma + A;
            cont = cont + A;
        }
        System.out.println(soma);
    }
}
