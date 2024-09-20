package edu.arthur.sets.OperacoesBasicasSet;
import java.util.HashSet;
import java.util.Set;


public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public Set<Convidado> getConvidados() {
        return convidados;
    }

    public void adicionarConvidados(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidados){
            if(c.getCodigoConvite() == codigoConvite)
                convidadoParaRemover = c;
        }
        convidados.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidados.size();

    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidadosSet = new ConjuntoConvidados();

        System.out.println(convidadosSet.contarConvidados());

        convidadosSet.adicionarConvidados("Arthur", 12345);
        convidadosSet.adicionarConvidados("Victor", 1245);
        convidadosSet.adicionarConvidados("Eliesita", 125);
        convidadosSet.adicionarConvidados("Bruno", 126);

        System.out.println(convidadosSet.contarConvidados());

        
        convidadosSet.removerConvidadoPorCodigoConvite(126);
        
        System.out.println("Após a remoção: " + convidadosSet.contarConvidados());


        convidadosSet.exibirConvidados();


    }

    
}
