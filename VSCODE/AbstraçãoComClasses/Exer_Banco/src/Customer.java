
public class Customer {
    private String CPF;

    private  String name;

    private int age;

    private String address;

    private String phoneNumber;

    private boolean active;


    public Customer(String cpf, String name, int age, String address, String phoneNumber) {
        this.CPF = cpf;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.active = true;
    }
    public boolean verificationCPF(String cpf) {
        return cpf != null && cpf.equals(this.CPF);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}