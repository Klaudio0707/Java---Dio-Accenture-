
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {
        var opcao = -1;

        do {
            try {
                System.out.println("== Escolha uma das opções == ");
                System.out.println("1 - Dar banho no pet");
                System.out.println("2 - Abastecer máquina com água");
                System.out.println("3 - Abastecer máquina com shampoo");
                System.out.println("4 - Colocar pet na máquina");

                System.out.println("5 - Retirar pet da máquina");
                System.out.println("6 - Lavar máquina");
                System.out.println("7 - Verificar níveis de água e shampoo");
                System.out.println("8 - Verificar se há um pet na máquina");

                System.out.println("0 - Sair");
                System.out.println("Escolha uma das opções");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 ->
                        petMachine.takeShower();
                    case 2 ->
                        petMachine.addWater();
                    case 3 ->
                        petMachine.addShampoo();
                    case 4 ->
                        setPetInPetMachine();
                    case 5 ->
                        petMachine.removePet();
                    case 6 ->
                        petMachine.washMachine();
                    case 7 ->
                        hasShampooiWater();
                    case 8 ->
                        petMachine.hasPet();
                    case 0 ->
                        exitProgram();
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Erro: Você deve digitar um número inteiro!");
                scanner.nextLine(); // Limpa o buffer do scanner
                opcao = -1;
            }
        } while (opcao != 0);
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do pet ");
            name = scanner.nextLine();
        }
        if (petMachine.getShampoo() >= 2 && petMachine.getWater() >= 10) {
            var pet = new Pet(name);
            petMachine.setPet(pet);
            System.out.println(" O pet " + pet.getName() + ", foi colocado na máquina.");
            //    petMachine.takeShower();
        } else {
            System.out.println("Não há água ou shampoo suficiente para dar banho no pet.");
        }
    }

    public static void getPetFromMachine() {
        petMachine.removePet();
    }

    public static void hasShampooiWater() {
        var nivelShampoo = petMachine.getShampoo();
        var nivelWater = petMachine.getWater();
        System.out.printf("Nivel de agua: %d\nNivel de shampo: %d", nivelWater, nivelShampoo);
    }

    public static void exitProgram() {
        System.out.println("Saindo do programa...");
        scanner.close();
    }
}
