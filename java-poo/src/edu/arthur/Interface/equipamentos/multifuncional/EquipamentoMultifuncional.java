package edu.arthur.Interface.equipamentos.multifuncional;

import edu.arthur.Interface.equipamentos.copiadora.Copiadora;
import edu.arthur.Interface.equipamentos.digitalizadora.Digitalizadora;
import edu.arthur.Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Impressora, Digitalizadora {
    public void copiar(){
        System.out.println("Copiando através do equipamento MULTIFUNCIONAL");
    }

    public void digitalizar(){
        System.out.println("Digitalizando através do equipamento MULTIFUNCIONAL");
    }

    public void imprimir(){
        System.out.println("Imprimindo através do equipamento MULTIFUNCIONAL");
    }
}
