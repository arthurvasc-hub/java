package edu.arthur.pilares;

public class Usuario {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        Facebook fcb = new Facebook();
        System.out.println("FACEBOOK");
        fcb.enviarMensagem();
        fcb.receberMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
    
    
}
