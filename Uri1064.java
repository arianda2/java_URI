import java.util.Scanner; 
public class Uri1064{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in);

         int contador = 0;
         float acumulador = 0;
         float num;
         

            for (int i = 0; i < 6; i++) {
                num = teclado.nextFloat();

                if (num > 0){
                    contador = contador + 1;
                    acumulador = acumulador + num;
                }
            }
            System.out.println(contador + " valores positivos");
            System.out.printf("%.1f\n", (acumulador / contador));
     }
}
