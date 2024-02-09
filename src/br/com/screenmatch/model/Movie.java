package br.com.screenmatch.model;

import br.com.screenmatch.calculo.Ratable;

public class Movie extends Titulo implements Ratable {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getRating() {
        return (int) getAvarege() / 2;
    }
}
