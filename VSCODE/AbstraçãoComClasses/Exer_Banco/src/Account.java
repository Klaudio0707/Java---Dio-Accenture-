
public class Account {

    private String numeroConta;
    private Cliente cliente;
    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;
    private boolean ativa;

    public Account(String numeroConta, Cliente cliente, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = depositoInicial;
        this.ativa = true;
        if (depositoInicial <= 500) {
            limiteChequeEspecial = 50.0;
        } else if (depositoInicial > 500) {
            limiteChequeEspecial = depositoInicial * 0.5;
        }
        this.chequeEspecialUsado = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta != null && !numeroConta.isEmpty()) {
            this.numeroConta = numeroConta;
            System.out.println("Número da conta definido");
        } else {
            System.out.println("Número da conta inválido.");
        }
    }

    public Cliente getCliente() {
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Endereço do cliente: " + cliente.getEndereco());
        return cliente;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    public double getSaldoDisponivel() {
        return saldo + (limiteChequeEspecial - chequeEspecialUsado);
    }

    public double getSaldo() {
        return saldo;
    }

    public double verificacaoChequeEspecial(double valor) {
        if (chequeEspecialUsado > 0 && valor > saldo) {
            System.out.println("Saldo do cheque especial utilizado: R$ " + chequeEspecialUsado);
            double saldoLiquido = chequeEspecialUsado - valor;
            System.out.println("Saldo restante do cheque especial: R$ " + saldoLiquido);
            return saldoLiquido;
        }
        return 0;
    }
    public void depositar(double valor) {
        if (!ativa || valor <= 0) {
            System.out.println("Depósito falhou: conta inativa ou valor inválido.");
            return;
        }
        if(chequeEspecialUsado > 0){
            double dividaTotalComJuros = chequeEspecialUsado * 1.2;
            if (valor >= dividaTotalComJuros) {
             valor -= dividaTotalComJuros;
             chequeEspecialUsado = 0;
             System.out.println("Cheque especial quitado com juros 20%. Novo saldo do depósito: R$ " + valor);
            }else{
          double abateReal = valor / 1.2;
            chequeEspecialUsado -= abateReal;
            System.out.println("Pagamento parcial. Dívida restante no cheque especial: R$ " + chequeEspecialUsado);
            valor = 0;
        }

       }else{
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
       }

    }

    public boolean sacar(double valor) {
    if (!ativa || valor <= 0) {
        System.out.println("Saque inválido: conta inativa ou valor inválido.");
        return false;
    }

    double disponivel = getSaldoDisponivel();
    if (valor > disponivel) {
        System.out.println("Saldo insuficiente (incluindo cheque especial).");
        return false;
    }

    if (valor <= saldo) {
        // só usa saldo
        saldo -= valor;
    } else {
        // usa tudo do saldo e o resto vai para cheque especial
        double restante = valor - saldo;
        saldo = 0;
        chequeEspecialUsado += restante;
    }

    System.out.println("Saque de R$ " + valor + " realizado. Saldo: R$ " + saldo +
            " | Cheque especial usado: R$ " + chequeEspecialUsado);
    return true;
}

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getChequeEspecialUsado() {
        return chequeEspecialUsado;
    }

    public void setChequeEspecialUsado(double chequeEspecialUsado) {
        this.chequeEspecialUsado = chequeEspecialUsado;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }
}
