package com.company.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Corrida {

    private double distancia;
    private int premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;

    public Corrida(double distancia, int premioEmDolares, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<Veiculo>();
    }

    public void registrarCarro(int velocidade, int aceleracao, int anguloDeGiro, String patente){

        if(listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, patente));
            quantidadeVeiculosPermitidos++;
        }else {
            System.out.println("Não há mais lugares para a corrida");
        }
    }

    public void registrarMoto(int velocidade, int aceleracao, int anguloDeGiro, String patente){

        if(listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, patente));
            quantidadeVeiculosPermitidos++;
        }else {
            System.out.println("Não há mais lugares para a corrida");
        }

    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
        quantidadeVeiculosPermitidos--;
    }

    public void removerVeiculoPorPlaca(String placa){
        listaVeiculos.removeIf(veiculo -> veiculo.getPlaca().equals(placa));
        quantidadeVeiculosPermitidos--;
    }

    public void registrarSocorristaMoto(){

        if(listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new SocorristaMotos());
            quantidadeVeiculosPermitidos++;
        }else {
            System.out.println("Não há mais lugares para a corrida");
        }

    }

    public void registrarSocorristaCarro(){

        if(listaVeiculos.size() < quantidadeVeiculosPermitidos) {
            listaVeiculos.add(new SocorristaCarros());
            quantidadeVeiculosPermitidos++;
        }else {
            System.out.println("Não há mais lugares para a corrida");
        }

    }


    public void iniciarCorrida(){

        Veiculo vencedor = new Veiculo();

        double score, ultimoMaior = -1;

        for(Veiculo veiculo : listaVeiculos){

            score = veiculo.getVelocidade() ;//* veiculo.getAceleracao() / (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));

            if(ultimoMaior < score) {
                ultimoMaior = score;
                vencedor = veiculo;
            }


        }

        System.out.println("O vencedor é: " + vencedor.toString());

    }

}
