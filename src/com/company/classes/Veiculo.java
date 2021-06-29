package com.company.classes;

public class Veiculo {

    private int velocidade;
    private int aceleracao;
    private int anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo() {
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public int getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return "Veiculo --> " + placa;
    }
}
