package edu.arthur.pilares;

public class Usuario {
    public static void main(String[] args) {
        Msn msn = new Msn();
        System.out.println("MSN");
        msn.enviarMensagem();

        Facebook fcb = new Facebook();
        System.out.println("FACEBOOK");
        fcb.enviarMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
    }
    
    
}
