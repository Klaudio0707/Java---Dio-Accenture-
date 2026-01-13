package br.com.taskflow.service;
import java.util.ArrayList;
import java.util.List;
import br.com.taskflow.model.Task;

public class TaskService {

    List<Task> tasks = new ArrayList<>();

    public void salvar(Task task){
        Integer novoId = tasks.size() + 1;

        task.setId(novoId);

        tasks.add(task);

        System.out.println("Tarefa salva com sucesso "+ task);
    }
    public List<Task> listarTodas() {
        return tasks;
    }
}
