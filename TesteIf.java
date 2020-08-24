import java.util.Scanner;
    public class TesteIf{
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        float n1, n2, media;
        
        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        media = (n1 + n2)/2;

        System.out.println("Sua media vale = " +media);

        if ( media >=6 ) {
        
        System.out.println("Parabens voce foi aprovado/a");
        }
        else{
        System.out.println("Dessa vez não rolou!");        

        }

        System.out.println("Fim do programa");        

        }
    }


