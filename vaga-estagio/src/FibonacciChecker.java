import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe um número para verificar se ele pertence à sequência de Fibonacci:");
        int numero = scanner.nextInt();
        
        int a = 0;
        int b = 1;
        int fibonacci = 0;

        boolean pertence = false;

        while (fibonacci <= numero) {
            if (fibonacci == numero) {
                pertence = true;
                break;
            }

            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
