package edu.arthur.Interface.loja;

import edu.arthur.Interface.equipamentos.copiadora.Copiadora;
import edu.arthur.Interface.equipamentos.digitalizadora.Digitalizadora;
import edu.arthur.Interface.equipamentos.impressora.DeskJet;
import edu.arthur.Interface.equipamentos.impressora.Impressora;
import edu.arthur.Interface.equipamentos.impressora.LaserJet;
import edu.arthur.Interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Loja {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = new LaserJet();

        impressora.imprimir();
        em.imprimir();


    }
}
