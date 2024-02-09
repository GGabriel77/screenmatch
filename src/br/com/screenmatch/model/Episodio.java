package br.com.screenmatch.model;

import br.com.screenmatch.calculo.Ratable;

public class Episodio implements Ratable {
    private int number;
    private String name;
    private Serie serie;
    private int visualizationTotal;

    public int getVisualizationTotal() {
        return visualizationTotal;
    }

    public void setVisualizationTotal(int visualizationTotal) {
        this.visualizationTotal = visualizationTotal;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getRating() {
        if (visualizationTotal > 100){
            return 4;
        } else {
            return 2;
        }

    }
}
