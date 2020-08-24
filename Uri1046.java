import java.util.Scanner;
    public class Uri1046{
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int horainicio, horafim, duracao, total;
        
        horainicio = teclado.nextInt();
        horafim = teclado.nextInt();

        if ( horainicio >= horafim ) { 
            total = horainicio - horafim;
            duracao = 24 - total;
            System.out.println("O JOGO DUROU " +duracao+ " HORA(S)");
        }


        else {
            duracao = horafim - horainicio;
            System.out.println("O JOGO DUROU " +duracao+ " HORA(S)");
             }
        }
    }