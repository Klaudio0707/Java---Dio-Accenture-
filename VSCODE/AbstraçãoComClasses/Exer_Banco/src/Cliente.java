public class Cliente {

    private final String cpf;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private boolean ativo;

    public Cliente(String cpf, String nome, int idade, String endereco, String telefone) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.ativo = true;
    }

    public boolean verificarCPF(String cpfDigitado) {
        return cpfDigitado != null && cpfDigitado.equals(this.cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
