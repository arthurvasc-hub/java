package ListaTarefas;
public class App {
    public static void main(String[] args) throws Exception {
       ListaTarefa listaTarefa = new ListaTarefa();

       System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

       listaTarefa.adicionarTarefa("Tarefa 1");
       listaTarefa.adicionarTarefa("Tarefa 1");
       listaTarefa.adicionarTarefa("Tarefa 2");
       listaTarefa.adicionarTarefa("Tarefa 3");
       listaTarefa.adicionarTarefa("Tarefa 4");

       System.out.println("O número total de tarefas APÓS A ADIÇÃO é: " + listaTarefa.obterNumeroTotalTarefas());
    
       listaTarefa.removerTarefa("Tarefa 1");

       System.out.println("O número total de tarefas APÓS A REMOÇÃO é: " + listaTarefa.obterNumeroTotalTarefas());

       listaTarefa.obterDescricaoTarefas();
       

    }
}
