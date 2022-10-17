import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
        scanner.close();
    }

    public static boolean ehValido(String s) {
        //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
    }


}
