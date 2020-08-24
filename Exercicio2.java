import java.util.Scanner;

 public class Exercicio2{
    
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float velocidademedia;
        float tempo;
        float distancia;
        float consumo;

        
        System.out.println("Digite o tempo gasto na viagem: ");
        tempo = teclado.nextFloat();

        System.out.println("Velocidade média: ");
        velocidademedia = teclado.nextFloat();

//com base no tempo e velocidade, calculo a distancia 

            distancia = veliocidademedia * tempo;
            consumo = distancia / 12;
                     
        //saída
                System.out.println("Foram consumidos "+consumo+" litros de combustível");


    }

    }