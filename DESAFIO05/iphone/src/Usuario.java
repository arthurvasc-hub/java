import tecnologias.Iphone.Iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Utilizando os serviços que foram implementados pelo Reprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("Utilizando os serviços que foram implementados pelo Aparelho Telefônico");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("Utilizando os serviços que foram implementados pelo Navegador de Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
