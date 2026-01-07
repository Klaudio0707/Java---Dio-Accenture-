
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private String cnpj;
    private String agencia;
    private List<Account> contas;
    private int proximoNumeroConta;

    public Banco(String nome, String cnpj, String agencia) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.agencia = agencia;
        this.contas = new ArrayList<>();
        this.proximoNumeroConta = 1110;
    }

    public Account criarConta(Cliente cliente, double depositoInicial) {
        String numeroConta = agencia + "-" + proximoNumeroConta++;
        Account novaConta = new Account(numeroConta, cliente, depositoInicial);
        contas.add(novaConta);
        System.out.println("Conta criada: " + numeroConta);
        return novaConta;
    }

    public Account buscarConta(String numeroConta) {
        return contas.stream()
                .filter(conta -> conta.getNumeroConta().equals(numeroConta))
                .findFirst()
                .orElse(null);
    }

    public void listarContas() {
        System.out.println("\n=== CONTAS DO " + nome + " ===");
        contas.forEach(conta -> {
            System.out.println(conta.getNumeroConta() + " - "
                    + conta.getCliente().getNome() + " - Saldo: R$"
                    + conta.getSaldo());
        });
    }

    public boolean transferir(String contaOrigem, String contaDestino, double valor) {
        Account origem = buscarConta(contaOrigem);
        Account destino = buscarConta(contaDestino);

        if (origem == null || destino == null  ) {
            System.out.println("Conta não encontrada.");
            return false;
        } else if (contas.size() == 1){
            System.out.println("Não há contas suficientes para realizar a transferência.");
            return false;
        }
        if (origem.sacar(valor)) {
            destino.depositar(valor, false);
            System.out.println("Transferência realizada: " + valor);
            return true;
        }
        return false;
    }

    public void relatorioGeral() {
        double totalSaldo = contas.stream().mapToDouble(Account::getSaldo).sum();
        System.out.println(nome + " - Total de contas: " + contas.size());
        System.out.println("Saldo total no banco: R$ " + totalSaldo);
    }
}
