
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        Cliente cliente = new Cliente("12345678901", "João Silva", 30, "Rua X", "119999");
        Banco banco = new Banco( "1111", "Joao", "500");
    
        Account conta = new Account("12345", cliente, 600);

        int opcao;
        do {
            System.out.println("\n=== MENU CONTA BANCÁRIA ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    conta.imprimirSaldo();
                    System.out.println("Saldo disponível: R$ " + conta.getSaldoDisponivel());
                }
                case 2 -> {
                    System.out.println("Limite: R$ " + conta.getLimiteChequeEspecial());
                    System.out.println("Usado: R$ " + conta.getChequeEspecialUsado());
                }
                case 3 -> {
                    System.out.print("Valor: R$ ");
                    conta.depositar(sc.nextDouble());
                }
                case 4 -> {
                    System.out.print("Valor: R$ ");
                    conta.sacar(sc.nextDouble());
                }
                case 5 -> {
                    System.out.print("Boleto: R$ ");
                    conta.pagarBoleto(sc.nextDouble());
                }
                case 6 ->{
                    conta.estaUsandoChequeEspecial();}
                case 7 ->
                    banco.listarContas();
                case 8 -> {
                    System.out.print("Transferir de (número): ");
                    String origem = sc.next();
                    System.out.print("Para (número): ");
                    String destino = sc.next();
                    System.out.print("Valor: R$ ");
                    banco.transferir(origem, destino, sc.nextDouble());
                }
                case 9 ->
                    banco.relatorioGeral();
                case 0 ->
                    System.out.println("Obrigado!");
                default ->
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
