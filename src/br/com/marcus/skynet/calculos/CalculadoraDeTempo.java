package br.com.marcus.skynet.calculos;

import br.com.marcus.skynet.modelos.Film;
import br.com.marcus.skynet.modelos.Serie;
import br.com.marcus.skynet.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Film f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui(Title titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
