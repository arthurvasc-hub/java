package edu.arthur.CatalagoLivros;

public class App {
    public static void main(String[] args) {
        CatalagosLivros catalagosLivros = new CatalagosLivros();

        catalagosLivros.adicionarLivro("Chefinho rei", "Chefinho", 2024);
        catalagosLivros.adicionarLivro("Livro do JoJo", "Jojo", 1999);
        catalagosLivros.adicionarLivro("Damzik no VAVA", "Damzik", 2001);
        catalagosLivros.adicionarLivro("Tutuzin rei", "Arthur", 2005);
        catalagosLivros.adicionarLivro("Tutuzin MESTRE", "Arthur", 2008);
        catalagosLivros.adicionarLivro("Tutuzin RADIANTE", "Arthur", 2014);

        

        System.out.println(catalagosLivros.pesquisarPorTitulo("Tutuzin rei"));
        



    }   
}
