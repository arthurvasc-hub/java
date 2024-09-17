package tecnologias.ipod;

public class Ipod implements ReprodutorMusical {

    Musica musica = new Musica("Matue: 333");

    public void tocar(){
        System.out.println("Tocando a música - " + musica.getMusica() + " através do ipod");
    }
    public  void pausar(){
        System.out.println("Pausando a musica através do Ipod");
    }
    public void selecionarMusica(){
        System.out.println("Escutando agora no Ipod: " + musica.getMusica());
    }

}
