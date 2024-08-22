package edu.arthur.Operadores;

public class Operadores {
    public static void main(String[] args) {
        boolean ADM = true;
        boolean USER = false;

        if(ADM && USER){
             System.out.println("Os dois estão liberados");
        }
        if(ADM || USER){
            System.out.println("O ADM está liberado");
       }
       if(!ADM || !USER){
        System.out.println("O Hacker (false) foi barrado");
       }
    
   
}
}
