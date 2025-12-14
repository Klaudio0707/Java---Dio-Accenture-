import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        var nome = scanner.nextLine();
        System.out.printf("%s, Informe o seu ano de nascimento: \n", nome);
        var anoNascimento = scanner.nextInt();
        var idade = 2025 - anoNascimento;
        System.out.printf("%s, você tem %d anos!", nome, idade);
        scanner.close();
    }
}
