package br.com.taskflow.app;

import br.com.taskflow.model.Task;
import br.com.taskflow.service.TaskService;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskService service = new TaskService();
        System.out.println("Bem vindo ao TaskFlow!");
        
        while (true) {
           
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Nova Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();
            
            switch (opcao) {
                case "1":
                    System.out.println("Digite o título da task:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite a descrição da task:");
                    String descricao = scanner.nextLine();
                    Task task = new Task(titulo, descricao);
                    service.salvar(task);
                    break;
                case "2":
                    System.out.println("Listar todas as tasks");
                    var tasks = service.listarTodas();
                    System.out.println("Tarefas cadastradas:" + tasks);
                    break;
                case "3":
                    System.out.println("Encerrando o sistema. Até mais!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                    break;
            }
        }
    }

}
