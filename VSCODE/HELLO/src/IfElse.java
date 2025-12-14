import java.util.Scanner;

public class IfElse {
    public static void  main(String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("Informe seu nome: ");
       var nome = scanner.next();
       System.out.printf("informe sua idade, %s? ",nome);
       var idade = scanner.nextInt();
        // var emancipado = scanner.next().equalsIgnoreCase(anotherString: "sim");

        if (idade >= 18) {
            System.out.printf("%s Você é maior de idade.", nome);
        } else {
            System.out.printf("$s, Você é menor de idade.", nome);
        }
        }
    }

