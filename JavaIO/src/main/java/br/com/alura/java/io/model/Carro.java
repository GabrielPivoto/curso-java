package br.com.alura.java.io.model;

import java.io.Serializable;

public class Carro implements Serializable {

    private String fabricante;
    private String modelo;
    private String cor;
    private double kmRodados;

    public void mostraInfo(){
        System.out.println("--------");
        System.out.println("Modelo: " + this.modelo + " Cor: " + this.cor + " Fabricante: " + this.fabricante);
        System.out.println("Quilometros rodados: " + this.kmRodados);
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }
}
