import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Qual é seu nome? ");
        String nome = scanner.nextLine();
        System.out.printf("%s, por favor insira seu peso em kg:", nome);
        double peso = scanner.nextDouble();
        System.out.printf("%s, por favor insira sua altura em centimentros:", nome);
        double altura = scanner.nextDouble();
        double imc = 0;
        double alturaEmMetros = 0;
        if (altura <= 0 || peso <= 0) {

            System.out.println("Erro: Altura ou peso inválidos (devem ser maiores que zero).");
            return;
        } else if (altura > 3.0) {
            System.out.println("Detectado: Altura em centímetros. Convertendo...");
            alturaEmMetros = altura / 100;
        } else {
            System.out.println("Detectado: Altura em metros.");
            alturaEmMetros = altura;
        }

        imc = peso / (alturaEmMetros * alturaEmMetros);

        System.out.printf("\n%s, seu IMC é: %.2f\n", nome, imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso"); 
        }else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso normal"); 
        }else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("levemente acima do peso"); 
        }else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau I"); 
        }else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau II(Severa)"); 
        }else if (imc >= 40.0) {
            System.out.println("Obesidade grau III(Mórbida)"); 
        }else {
            System.out.println("Acima do peso");
        }

        scanner.close();
    }
}
