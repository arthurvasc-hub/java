package edu.arthur.pilares.Apps;

import edu.arthur.pilares.ServicoDeMensagemInstantanea;

public class MsnMessenger extends ServicoDeMensagemInstantanea {
    
    public void enviarMensagem() {
        verificarInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }
    public void salvarHistorico(){
        System.out.println("Histórico salvo com sucesso.");
    }
}
