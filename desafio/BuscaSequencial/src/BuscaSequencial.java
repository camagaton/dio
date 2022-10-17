import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) throws Exception {
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        Scanner leitor = new Scanner(System.in);
        //System.out.print("Digite o numero a ser encontrado: ");
        int numero = leitor.nextInt();
        int resposta = buscarSequencial(numero, elementos);
        if(resposta != -0){
            System.out.println("Achei "+numero+" na posicao "+resposta);
        }else{
            System.out.println("Numero "+numero+" nao encontrado! ");
        }
        leitor.close();
    }
    
    public static int buscarSequencial(int numero, int elementos[]){
        int resultado = -0;
        for (int i =0; i < elementos.length; i++){
            if(elementos[i] == numero){
                resultado = i;
            }
        }
        return resultado;
    }
}
