package edu.arthur.Metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 15;


    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal da TV, canal atual: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o canal da TV, canal atual: " + canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume da TV");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume da TV");
    }

    public void ligarTv(){
        ligada = true;
        System.out.println("A SmartTV está ligada!");
    }
    public void desligarTv(){
        ligada = false;
        System.out.println("A SmartTV está desligada!");
    }
}
