package edu.arthur.pilares;

import edu.arthur.pilares.Apps.Facebook;
import edu.arthur.pilares.Apps.MsnMessenger;
import edu.arthur.pilares.Apps.Telegram;

public class Usuario {
    public static void main(String[] args) {
        ServicoDeMensagemInstantanea smi = null;
            /* 
             NÃO SE SABE QUAL APP 
             MAS QUALQUER UM DEVERA ENVIAR E RECEBER MENSAGEM
             */

        String appEscolhido = "fcb";

        if(appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();
        else if(appEscolhido.equals("fcb"))
            smi = new Facebook();

        smi.enviarMensagem();
        smi.receberMensagem();
        smi.salvarHistorico();
    }
    
    
}
