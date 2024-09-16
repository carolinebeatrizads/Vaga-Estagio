import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe uma palavra para ser invertida:");
        String input = scanner.nextLine();
        
        char[] caracteres = input.toCharArray();
        
        String invertida = "";
        
        for (int i = caracteres.length - 1; i >= 0; i--) {
            invertida += caracteres[i];
        }
        
        System.out.println("Palavra invertida: " + invertida);

        scanner.close();
    }
}
