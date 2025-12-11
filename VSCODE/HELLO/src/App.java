import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Olá, informe seu nome:\n");
        String name = scanner.next();
        System.out.println("Informe o sua idade:\n");
        int age = scanner.nextInt();
        System.out.println("Olá " + name + ", você tem " + age + " anos!");

        
    }
}
