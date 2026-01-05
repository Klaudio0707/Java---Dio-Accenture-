
public class App {

    public static void main(String[] args) {
        printEmployee(new Salesman());
        printEmployee(new Manager());
    }

    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Manager manager -> {
                manager.setName("Joao");
                manager.setLogin("joao123");
                manager.setPassword("senha123");

                System.out.println(manager.getClass().getCanonicalName());
                System.out.println(manager.getName());

                System.out.println("Login do gerente: " + manager.getLogin());
                System.out.println("Senha do gerente: " + manager.getPassword());
            }
            case Salesman salesman -> {
                salesman.setName("Maria");
                salesman.setPercentPersold(15.5);

                System.out.println(salesman.getClass().getCanonicalName());
                System.out.println(salesman.getName());

                System.out.println("Percentual de vendas da vendedora: "
                        + salesman.getPercentPersold() + "%");
            }
        }
    }
}
