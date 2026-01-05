
public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private boolean ativa;
    private double saldo;

    public ContaBancaria(String titular, int numerodaConta, boolean ativa) {
        this.titular = titular;
        this.numeroConta = numerodaConta;
        this.ativa = ativa;
        this.saldo = 0.0;
    }

    private void mostrarTitular() {
        System.out.println("Titular: " + titular);
    }

    public void mostrarSaldo(int numeroConta) {
         if(numeroConta != this.numeroConta){
        System.out.println("Número da conta inválido.");
        return;
         }
        mostrarTitular();
        if (saldo >= 0) {

            System.out.println("Saldo: " + saldo);
        } else {
            System.out.println("Saldo negativo: " + saldo);
        }
    }

    public void mostrarAtiva() {
        if (ativa) {
            System.out.println("Conta ativa");
        } else {
            System.out.println("Conta inativa");
        }
    }

    public void depositar(double valor, int numerodaConta) {
       if(numeroConta != this.numeroConta){
        System.out.println("Número da conta inválido.");
        return;
       }
        mostrarTitular();
       
        if (ativa && valor > 0 ) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Não foi possível realizar o depósito.");
        }
    }

}
