package edu.arthur.CatalagoLivros;
import java.util.ArrayList;
import java.util.List;


public class CatalagosLivros {
    private List<Livro> catalagoLivros;

    public CatalagosLivros(){
        this.catalagoLivros = new ArrayList<>();
    }

    public List<Livro> getCatalagoLivros() {
        return catalagoLivros;
    }
    

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalagoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosFiltrados = new ArrayList<>();
            if(!catalagoLivros.isEmpty()){
                for(Livro l : catalagoLivros){
                    if(l.getAutor().equalsIgnoreCase(autor)){
                        livrosFiltrados.add(l);
                    }
                }
            }
            return livrosFiltrados;
    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaFiltrada = new ArrayList<>();
            if(!catalagoLivros.isEmpty()){
                for(Livro l : catalagoLivros){
                    if(anoInicial <= l.getAnoPublicacao() && anoFinal >= l.getAnoPublicacao()){
                        listaFiltrada.add(l);
                    }
                }
            }
            return listaFiltrada;
    }

    
    public Livro pesquisarPorTitulo(String titulo){
        Livro tituloFiltrado = null;
            if(!catalagoLivros.isEmpty()){
                for(Livro l : catalagoLivros){
                    if(l.getTitulo().equalsIgnoreCase(titulo)){
                       tituloFiltrado = l;
                       break;
                    }
                }
            }
            return tituloFiltrado;
    }

}

