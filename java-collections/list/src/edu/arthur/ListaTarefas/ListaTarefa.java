package edu.arthur.ListaTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa { 
    private List<Tarefa> listaDeTarefas;

    public ListaTarefa(){
        this.listaDeTarefas = new ArrayList<>();
    }

    public List<Tarefa> getListaDeTarefas(){
        return listaDeTarefas;
    }


    public void adicionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> listaRemoverTarefas = new ArrayList<>();
            for(Tarefa t : listaDeTarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    listaRemoverTarefas.add(t);
                }
            }
            listaDeTarefas.removeAll(listaRemoverTarefas);
    }

    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    public void obterDescricaoTarefas(){
        //for(Tarefa tarefa : listaDeTarefas)
            System.out.println(listaDeTarefas);
    }
}





