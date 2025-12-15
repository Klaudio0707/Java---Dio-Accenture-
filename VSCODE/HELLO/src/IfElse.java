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
        
        var canDrive =  (idade >= 18 || (idade >= 16 && emancipado));
        var message = "sem mensagem";
         
        if (canDrive) {
            // Se pode dirigir, refinamos o motivo:
            // Dica: Não precisa usar "emancipado == true", apenas "emancipado"
            message = emancipado 
                ? "Você pode dirigir, pois é emancipado."
                : "Você pode dirigir, pois é maior de idade.";
        } else {
            // Se caiu aqui, com certeza não pode dirigir.
            // Não precisamos de ternário nem de IF.
            message = "Você não pode dirigir, pois é menor de idade.";  
        }
        System.out.printf("%s, %s", nome, message);
    }
    }

