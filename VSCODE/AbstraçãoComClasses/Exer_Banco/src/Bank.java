
public class Bank {
    private String nomeBanco;

    private String CNPJ;

    private String agencia;

    private List<Account> contas;

    private double proximoNumeroConta;

    public Bank(String nome, String CNPJ, String agencia){
        this.nomeBanco = nome;
        this.CNPJ = CNPJ;
        this.agencia = agencia;
        this.contas = new ArrayList<>();
        this.proximoNumeroConta = 1001;
    }

    public Account criarConta(Cliente cliente, double depositoInicial){
        //concatenação para incluir um traço antes do número da conta
        String numeroConta = agencia + "-" + proximoNumeroConta++;
        Account novaConta = new Account(numeroConta, cliente, depositoInicial);
        contas.add(novaConta);
        System.out.printf("Conta Criada com sucesso:s%",numeroConta);
    }

}