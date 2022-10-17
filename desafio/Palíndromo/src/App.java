import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       String palavra = sc.nextLine();
       String resposta = verificarPalavra(palavra);
       sc.close();
       System.out.println(resposta);
    }
    
    public static String verificarPalavra(String palavra){
        StringBuilder str = new StringBuilder(palavra).reverse();
        if(palavra.equals(str.toString())){
            return "TRUE";
        }
        return "FALSE";    
    }
}

