import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      int n = Integer.parseInt(new Scanner(System.in).nextLine());
      int count=0;
      int count2=0;
      int teste=0;

      int n2 = n;
      while(n2!=0) {
         int quadrado = (int) Math.sqrt(n2); 
         quadrado*=quadrado;
         n2 -=quadrado;
         count++;
     }

     int mesmoQuadrado = (int) Math.sqrt(n); 
     while(mesmoQuadrado>1) {
         count2=0;
         teste=0;
         int numAux = (int) Math.pow(mesmoQuadrado,2); 
         while(teste < n) {
             teste += numAux;
             count2++;

         }
         if(teste == n && count2 < count) {
             System.out.println(count2);
             return;
         }
         mesmoQuadrado--;
     }


     System.out.println(count);
    }
    
}
