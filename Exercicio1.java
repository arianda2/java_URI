public class Exercicio1{
    
    /*
    100 kw - salMinimo/7
    1 kw  - x
    x * 100 = salMinimo/7
    */

    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float salarioMinimo;
        float consumokw;
        float valorkw;
        float valorapagar;
        float valorcomdesconto;

        System.out.println("Digite o salário mínimo: ");
        salarioMinimo = teclado.nextFloat();
     
        System.out.println("Kw gastos da residencia: ");
        consumokw = teclado.nextFloat();


        valorkw = salarioMinimo / 700.0f;
        valorapagar = valorkw * consumokw;
        valorcomdesconto = valorapagar * 0.9f;

        
        //valorcomdesconto = (float) (valorapagar * 0,9);


//saida em formato R$
        System.out.printf("Valor de 1 kw R$ %.2f\n", valorkw);
        System.out.printf("Valor bruto R$ %.2f\n", valorapagar); 
        System.out.printf("Valor com desconto R$ %.2f\n", valorcomdesconto);

    }

    }