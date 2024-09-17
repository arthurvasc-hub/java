package edu.arthur.pilares;

public abstract class ServicoDeMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistorico();

    protected void verificarInternet(){
        System.out.println("Verificando se o usuário está conectado a internet.");
    }


}
