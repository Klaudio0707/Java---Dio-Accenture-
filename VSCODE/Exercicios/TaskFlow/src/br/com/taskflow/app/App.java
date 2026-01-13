package br.com.taskflow.app;

import br.com.taskflow.model.Task;
import br.com.taskflow.service.TaskService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskService service = new TaskService();
        System.out.println("Bem vindo ao TaskFlow!");

        System.out.println("Deseja cadastrar uma nova task? (S/N)");
        String resposta = scanner.nextLine();
        do { 
            

        System.out.println("Informe uma task");
        String titulo = scanner.nextLine();
        System.out.println("Informe a descrição da task");
        String descricao = scanner.nextLine();
      service.salvar(new Task(titulo, descricao));
         var tarefas = service.listarTodas();

         System.out.println("Tarefas cadastradas:" + tarefas);
             
        }while (resposta.equalsIgnoreCase("S")|| resposta.equalsIgnoreCase("Sim"));
    }
}
