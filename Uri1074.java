import java.util.Scanner; 
public class Uri1074{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in);

         int x;
         int n;

         x = teclado.nextInt(); 
          for (int cont=1; cont <=n; cont++){ 
                    n = teclado.nextInt();

                    if ( x == 0 )
                    System.out.println("NULL");
                    
                    if (( x % 2 == 0 ) && ( x > 0 ))
                    System.out.println("EVEN POSITIVE");

                    if (( x % 2 == 1 ) && ( x > 0 ))
                    System.out.println("ODD POSITIVE");

                    if (( x % 2 == 0 ) && ( x < 0 ))
                    System.out.println("EVEN NEGATIVE");

                    if (( x % 2 == -1 ) && ( x < 0 ))
                    System.out.println("ODD NEGATIVE");
         }
   

     }
}