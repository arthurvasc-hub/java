package edu.arthur.pilares.Apps;

import edu.arthur.pilares.ServicoDeMensagemInstantanea;

public class Facebook  extends ServicoDeMensagemInstantanea{
    public void enviarMensagem() {
        verificarInternet();
        System.out.println("Enviando mensagem pelo FACEBOOK");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo FACEBOOK");
    }

    public void salvarHistorico(){
        System.out.println("Histórico salvo com sucesso.");
    }
}
