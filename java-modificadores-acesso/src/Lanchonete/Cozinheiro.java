package Lanchonete;

public class Cozinheiro {
    //pode ser default
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL: SANDUICHE, NO BALCÃO");
    }
    //pode ser default
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO SANDUICHE ");
    }
    public void prepararSuco(){
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararSuco();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO E CARNE");
    }

    public void selecionarIngredientesSuco(){
        System.out.println("SELECIONANDO FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }

    public void baterSucoLiquidificador(){
        System.out.println("BATENDO O SUCO NO LIQUIDIFICADOR");
    }

    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER");
    }
    
    public void pedirParaTrocarGas(Atendente atendente){
        atendente.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife almoxarife){
        almoxarife.trocarGas();
    }

    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }


}
