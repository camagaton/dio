import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
        scanner.close();
    }

    public static boolean ehValido(String s) throws StringIndexOutOfBoundsException {
        int tamanho = s.length();
        //testa parenteses       
        if((s.charAt(0) == '(') && (s.charAt(tamanho - 1) == ')')){
            return true;            
        }
        //testa colchetes
        if((s.charAt(0) == '[') && (s.charAt(tamanho - 1) == ']')){
            return true;            
        }
        //testa chaves
        if((s.charAt(0) == '{') && (s.charAt(tamanho - 1) == '}')){
            return true;            
        }      
        return false;

    }


}
