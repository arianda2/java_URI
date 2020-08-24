import java.util.Scanner;
    public class Uri1012{
        public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double A, B, C, areatriangulo, areacirculo, areatrapezio, arearetangulo, areaquadrado;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();
        
        areatriangulo = (A * C) / 2;
        areacirculo = (3.14159 * C) * C;
        areatrapezio = ((A + B) * C) / 2;
        arearetangulo = A * B;
        areaquadrado = B * B;

        System.out.printf("TRIANGULO = U$ %.3f\n", areatriangulo);
        System.out.printf("CIRCULO = U$ %.3f\n", areacirculo);
        System.out.printf("TRAPEZIO = U$ %.3f\n", areatrapezio);
        System.out.printf("RETANGULO = U$ %.3f\n", arearetangulo);
        System.out.printf("QUADRADO = U$ %.3f\n", areaquadrado);

      

        }



    }