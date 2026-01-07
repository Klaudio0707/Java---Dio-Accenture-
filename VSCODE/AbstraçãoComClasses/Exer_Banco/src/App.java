
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("12345678901", "João Silva", 30, "Rua X", "119999");
        Banco banco = new Banco("1111", "54564564564-00", "500");

        Account conta = new Account("12345", cliente, 600);

        int opcao;
        do {
            System.out.println("\n=== MENU CONTA BANCÁRIA ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar cheque especial");
            System.out.println("7 - Listar contas do banco");
            System.out.println("8 - Transferir entre contas");
            System.out.println("9 - Relatório geral do banco");
            System.out.println("10 - Consultar saldo");
            System.out.println("---------------------------");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("CPF:");
                    String cpf = sc.next();
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    System.out.print("Endereço: ");
                    String endereco = sc.next();
                    System.out.println("Telefone: ");
                    String telefone = sc.next();
                    System.out.print("Deseja depositar um valor inicial? (S / N) ");
                    String resposta = sc.next();
                    double valorDeposito = 0.0;
                    if (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("Sim")) {
                        System.out.print("Informe o valor a depositar");
                        valorDeposito = sc.nextDouble();
                        System.out.println("Conta criada com depósito inicial de R$ " + valorDeposito);
                    } else {
                        System.out.println("Conta criada sem depósito inicial.");
                    }
                    //capturando os dados do cliente
                    var novoCliente = new Cliente(cpf, nome, idade, endereco, telefone);
                    conta = banco.criarConta(novoCliente, valorDeposito);
                    System.out.println("Agora você está operando a conta de: " + novoCliente.getNome());
                }
                case 2 -> {
                    System.out.println("Limite: R$ " + conta.getLimiteChequeEspecial());
                    System.out.println("Usado: R$ " + conta.getChequeEspecialUsado());
                }
                case 3 -> {
                    System.out.print("Valor: R$ ");
                    var valorDeposito = sc.nextDouble();
                     System.out.println("Deseja pagar o cheque especial com esse depósito? (S / N) ");
                        String respostaCheque = sc.next();
                        if (respostaCheque.equalsIgnoreCase("S") || respostaCheque.equalsIgnoreCase("Sim")) {
                            conta.depositar(valorDeposito, true);
                        } else {
                            conta.depositar(valorDeposito, false);
                        }
                }
                case 4 -> {
                    System.out.print("Valor: R$ ");
                    conta.sacar(sc.nextDouble());
                }
                case 5 -> {
                    System.out.print("Boleto: R$ ");
                    conta.pagarBoleto(sc.nextDouble());
                }
                case 6 -> {
                    conta.estaUsandoChequeEspecial();
                }
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
                case 9 -> {
                    banco.relatorioGeral();
                }
                case 10 -> {
                    conta.imprimirSaldo();
                    System.out.println("Saldo disponível: R$ " + conta.getSaldoDisponivel());
                }
                case 0 ->
                    System.out.println("Obrigado!");
                default ->
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
