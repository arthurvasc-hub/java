package tecnologias.Iphone;

import tecnologias.aparelhoTelefonico.AparelhoTelefonico;
import tecnologias.ipod.Musica;
import tecnologias.ipod.ReprodutorMusical;
import tecnologias.navegadorInternet.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    Musica musica = new Musica("Matue: Crack com Mussilon");

    public void tocar() {
        System.out.println("Tocando a música - " + musica.getMusica()+ " através do Iphone");
    }

    
    public void pausar() {
       System.out.println("Pausando a música através do Iphone");
    }

    
    public void selecionarMusica() {
        System.out.println("Iphone está tocando - " + musica.getMusica());
    }

    public void ligar(){
        System.out.println("Realizando ligação através do Iphone");
    }

    public void atender(){
        System.out.println("Alo, Arthur aqui, com quem eu falo?");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz, deixe sua mensagem após o BIP...");
    }
    
    public void exibirPagina(){
        System.out.println("Exibindo página inicial do Safari.");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando outra aba");
        exibirPagina();
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a pagina...");
    }
}
