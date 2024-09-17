package edu.arthur.pilares;

public class ServicoDeMensagemInstantanea {
    
   
    public void enviarMensagem(){
        verificarInternet();
        System.out.println("Enviando mensagem");
        salvarHistorico();
    }


    private void salvarHistorico(){
        System.out.println("Salvando o histórico de mensagens");
    }

    private void verificarInternet() {
        System.out.println("Verificando se o usuário está conectado a internet");
    }



}
