import java.util.Scanner;
    public class Uri1035{
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

/*Leia 4 valores inteiros A, B, C e D. A seguir, 
se B for maior do que C (1)
e se D for maior do que A, (2)
e a soma de C com D for maior que a soma de A e B (3)
e se C e D, (4)
 ambos, forem positivos e se a variável A for par (5)
  escrever a mensagem "Valores aceitos", 
 senão escrever "Valores nao aceitos".
*/
        int A, B, C, D;
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();

//          COND (1)        COD (2)     COD (3)                COD(4)               COD(5)
        if ( ( B > C ) && ( D > A ) && ( C + D > A + B ) && ( C > 0 && D > 0) && ( A % 2 == 0 ) ){

        System.out.println("Valores aceitos");
        }
        else{
        System.out.println("Valores não aceitos");        
        }




        }
    }
