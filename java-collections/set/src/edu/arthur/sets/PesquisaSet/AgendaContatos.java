package edu.arthur.sets.PesquisaSet;
import java.util.Set;
import java.util.HashSet;


public class AgendaContatos {
  private Set<Contato> setContatos;

public AgendaContatos() {
    this.setContatos = new HashSet<>();
}

public void adicionarContatos(String nome, int numero){
    setContatos.add(new Contato(nome, numero));
}

public void exibirContatos(){
    System.out.println(setContatos);
}

public Set<Contato> pesquisarPorNome(String nome){
    Set<Contato> conatosPorNome = new HashSet<>();
        for(Contato c : setContatos){
            if(c.getNome().startsWith(nome)){
            conatosPorNome.add(c);
            }
        } 
    return conatosPorNome;
    }

  public Contato atualizarNumeroContato ( String nome, int novoNumero){
    Contato contatoAtualizado = null;
        for(Contato c : setContatos){
            if(c.getNome().equals(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
            }
        }
        return contatoAtualizado;
  }

  public static void main(String[] args) {
   AgendaContatos agContatos = new AgendaContatos();
    //agContatos.exibirContatos();

    agContatos.adicionarContatos("Arthur Vasconcelos", 99882214);
    agContatos.adicionarContatos("Arthur Antigo", 82815959);
    agContatos.adicionarContatos("Bola", 1111111);
    agContatos.adicionarContatos("Victor Vasconcelos", 2222222);
    agContatos.adicionarContatos("Victor novo", 3333333);


   // agContatos.exibirContatos();

   System.out.println(agContatos.pesquisarPorNome("Victor")); 

   agContatos.atualizarNumeroContato("Arthur Antigo", 123123123);

   System.out.println(agContatos.pesquisarPorNome("Arthur")); 



  }
}
