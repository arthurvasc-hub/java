package edu.arthur.pilares.Apps;

import edu.arthur.pilares.ServicoDeMensagemInstantanea;

public class Telegram extends ServicoDeMensagemInstantanea{
    public void enviarMensagem() {
        verificarInternet();
        System.out.println("Enviando mensagem pelo TELEGRAM");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo TELEGRAM");
    }
    public void salvarHistorico(){
        System.out.println("Histórico salvo com sucesso.");
    }
}
