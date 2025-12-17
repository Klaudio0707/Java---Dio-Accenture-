import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe quantos centimetros, tem um lado do quadrado:");
         int lado = scanner.nextInt();
        int areaQuadrado = lado*lado;
        System.out.printf("Area total do quadrado é: %d cm²", areaQuadrado);
        }
}
