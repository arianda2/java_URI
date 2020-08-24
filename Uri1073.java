import java.util.Scanner; 
public class Uri1073{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in);

        int x;
        long potencia;

        x = teclado.nextInt(); 

        for (int cont = 2; cont <= x; cont = cont + 2) {
            potencia = cont * cont;
            System.out.println(cont + "^2 = " + potencia);
        }
 } 
}