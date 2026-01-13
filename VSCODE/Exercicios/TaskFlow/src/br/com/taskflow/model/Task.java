package br.com.taskflow.model;

public class Task {
    private Integer id;

    private String titulo;

    private String descricao;

    private Status status;

    public Task( String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = Status.PENDENTE;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
       }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Task [id=" + id + ", titulo=" + titulo + ", status=" + status + "]";
    }
}
