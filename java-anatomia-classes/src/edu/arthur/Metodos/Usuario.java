package edu.arthur.Metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A SmartTV está ligada? " + smartTv.ligada);
        smartTv.ligarTv();
        System.out.println("A SmartTV está ligada? " + smartTv.ligada);
        smartTv.desligarTv();
        System.out.println("A SmartTV está ligada? " + smartTv.ligada);

        System.out.println("O Volume atual da SmartTv é: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("O Volume atual da SmartTv é: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("O Volume atual da SmartTv é: " + smartTv.volume);


        System.out.println("O canal atual da SmartTv é: " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("O canal atual da SmartTv é: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("O canal atual da SmartTv é: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("O canal atual da SmartTv é: " + smartTv.canal);

}       
    
}
