package br.com.marcus.skynet.modelos;

import br.com.marcus.skynet.calculos.Classificavel;

public class Film extends Title implements Classificavel {

  private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }
}
