import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quanto é 2 + 2?\n ");
        var result = scanner.nextInt();
        var isWrong = result != 4;
        System.out.printf("Voce Acertou? (%s)\n", !isWrong);
    }
}