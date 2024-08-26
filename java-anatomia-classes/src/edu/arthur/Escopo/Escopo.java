package edu.arthur.Escopo;
public class Escopo {
    

    public static void main(String[] args) throws Exception {
        int salario = 1500;
        System.out.println(calcularValor(salario));
    }

    public static int calcularValor(int salario){
        int novoSalario = 0;

        for(int i = 1; i < 3; i++){
            novoSalario += salario * i;
        }
        return novoSalario;
        
    }
}
