import java.util.Scanner;

public class App {

    // Início do Programa
    public static void main(String[] args) throws Exception {
        
        // Declaração de Variaveis 
        
        double n1;
        double n2;
        double soma;

        // Solicitação de Dados
        
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Digite um número:" );
        n1 = teclado.nextDouble();
        System.out.println ("Digite outro número:" );
        n2 = teclado.nextDouble();
        teclado.close();

        // Fazer a Soma dos Números 

        soma = n1 + n2;

        System.out.println ("A soma dos dois números informados é = " + soma);
    }
}
