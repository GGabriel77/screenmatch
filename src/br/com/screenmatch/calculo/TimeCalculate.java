package br.com.screenmatch.calculo;

import br.com.screenmatch.model.Titulo;

public class TimeCalculate {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

  /*  public void inclui(Movie movie){
        totalTime += movie.getMinutesDurationTime();
    }

    public void inclui(Serie serie){
        totalTime += serie.getMinutesDurationTime();
    }*/
    //Aplicando o polimorfismo.
    public void inclui (Titulo titulo){
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.totalTime += titulo.getMinutesDurationTime();
    }

}
