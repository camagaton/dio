import java.util.*;

public class ChamadaRecursiva {
    public static void main(String[] args) throws Exception {
        Scanner numero = new Scanner(System.in);
        int somar = somatorio(numero.nextInt());
        System.out.println(somar);
        numero.close();       
    }
   
    //metodo para calcular somatorio:
   static int somatorio(int numero){
        if(numero == 0){
            return 0;
        }else {
            return numero + (somatorio(numero -1));
        }
    }
}
