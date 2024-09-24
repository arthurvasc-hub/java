package edu.arthur.OperacoesBasicasMap;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
  private Map<String, Integer> mapAgendaContatos;

public AgendaContatos() {
    this.mapAgendaContatos = new HashMap<>();
}

public Map<String, Integer> getMapAgendaContatos() {
    return mapAgendaContatos;
}

public void adicionarContatos (String nome, Integer telefone){
    mapAgendaContatos.put(nome, telefone);
}

public void removerContato(String nome){
    if(!mapAgendaContatos.isEmpty()){
        mapAgendaContatos.remove(nome);
    }
}

public void exibirContatos(){
    System.out.println(mapAgendaContatos);
}

public Integer pesquisarPorNome(String nome){
    Integer contatoPorNome = null;
    if(!mapAgendaContatos.isEmpty()){
        contatoPorNome = mapAgendaContatos.get(nome);
    }
return contatoPorNome;
}


 public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContatos("Arthur", 9999999);
    agendaContatos.adicionarContatos("Mofi", 99998888);
    agendaContatos.adicionarContatos("Arthur Vasconcelos", 9997777);
    agendaContatos.adicionarContatos("Bola", 9996666);
    agendaContatos.adicionarContatos("Victor", 99955555);

    // Método PUT em MAP atualiza um contato com a mesma KEY.
    agendaContatos.adicionarContatos("Arthur", 9999991);


    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Mofi");

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Arthur"));

    
 }
}
