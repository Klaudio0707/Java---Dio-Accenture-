import java.util.Scanner;

public class IfElse {
    public static void  main(String[] args) {
       var scanner = new Scanner(System.in);
       System.out.println("Informe seu nome: ");
       var nome = scanner.next();
       System.out.printf("informe sua idade, %s? ",nome);
       var idade = scanner.nextInt();
       System.out.println("Você é emancipado? (s/n)");
       var emancipado = scanner.next().equalsIgnoreCase("s");
        if (idade >= 18) {
            System.out.printf("%s, Você é maior de idade.", nome);
        }else if (idade >= 16 && emancipado){
            System.out.printf("%s, Você é maior de idade por emancipação.", nome);
        } else {
            System.out.printf("%s, Você é menor de idade.", nome);
        }
        }
    }

