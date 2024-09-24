package edu.arthur.sets.OrdenacaoSet;
import java.util.Comparator;

public class CompararPorPreco implements Comparator<Produto>{
    
    public int compare(Produto p1, Produto p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

