import java.util.Scanner;
    public class Uri1043{
        public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C;
        double perimetro, area;

        
        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        if ( ( A + B > C ) && ( B + C > A ) && ( A + C > B) ) {
            perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        }
        else {
            area = ( A + B ) * C / 2;
            System.out.printf("Area = %.1f\n", area);
             }
        }
    }
