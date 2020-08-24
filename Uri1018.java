import java.util.Scanner;
    public class Uri1018{
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int valorlido, resto;
        int q100, q50, q20, q10, q5, q2, q1;

        valorlido = teclado.nextInt();


        q100 = valorlido / 100;
        resto = valorlido % 100;

        q50 = resto / 50;
        resto = resto % 50;      
        
        q20 = resto / 20;
        resto = resto % 20;  

        q10 = resto / 10;
        resto = resto % 10;  

        q5 = resto / 5;
        resto = resto % 5; 

        q2 = resto / 2;
        q1 = resto % 2;

        System.out.println(valorlido);
        System.out.println(q100 + " nota(s) de R$ 100,00");
        System.out.println(q100 + " nota(s) de R$ 50,00");
        System.out.println(q100 + " nota(s) de R$ 20,00");
        System.out.println(q100 + " nota(s) de R$ 10,00");
        System.out.println(q100 + " nota(s) de R$ 5,00");
        System.out.println(q100 + " nota(s) de R$ 2,00");
        System.out.println(q100 + " nota(s) de R$ 1,00");

        }
    }