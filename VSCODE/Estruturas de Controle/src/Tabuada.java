import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args)  {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Informe um numero para gerar a tabuada:");
   int numero = scanner.nextInt();
    System.out.println("Informe qual operação voce deseja");
    System.out.println("+ - soma | - subtraçao | * multiplicação | / divisão ");
    String operacao = scanner.next();
    for (int i = 1; i <= 10; i++){
        int resultado = 0;
    switch (operacao) {
        case  "+":
            resultado = numero + i; 
            break;
        case "-":
            resultado = numero - i;
            break;
        case "*":
            resultado = numero * i;
            break;
        case "/":
            if (numero != 0) {    
                resultado = numero / i;
            }else{
                System.out.println("Divisão por zero não é permitida.");
                return;
            }
            break;    
        default:
        System.out.println("Operação não válida."); 
        return;
    }
    System.out.printf("%d %s %d = %d%n", numero, operacao, i, resultado);
     
    }
    scanner.close();
    }
}
