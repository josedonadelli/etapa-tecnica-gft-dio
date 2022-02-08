package com.veiculos;

public class Veiculos {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private String km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preço;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }


    void acelerar(){
        this.velocidade+=20;
    }


    void abastecer(int qtd){
        if(qtd+this.litrosCombustivel<=60 && qtd>0){
            this.litrosCombustivel+=qtd;
        }else{
            System.out.println("Qauntidade de combustível inválida");
        }


    }
    void frear(){
        if(this.velocidade>0){
            this.velocidade -= 20;
        }
    }

    void pintar(String cor){
        this.cor = cor;
    }
    void ligar(){
        if(!isLigado){
            isLigado = true;
        }
    }

    void desligar(){
        if(isLigado && velocidade==0){
            isLigado = false;
        }
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", cor='" + cor + '\'' +
                ", km='" + km + '\'' +
                ", isLigado=" + isLigado +
                ", litrosCombustivel=" + litrosCombustivel +
                ", velocidade=" + velocidade +
                ", preço=" + preço +
                '}';
    }
}
