import java.util.Scanner;

public class tarefa1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1, numero2, soma;

        System.out.print("Digite o primeiro número inteiro: ");
        numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        numero2 = scanner.nextInt();

        soma = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + soma);

        scanner.close();
    }
}
