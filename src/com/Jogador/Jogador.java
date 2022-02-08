package com.Jogador;

import java.util.Date;

public class Jogador {
    private String nome;
    private String posicao;
    private String dataNasc; // Deverá ser inserida no formato dd/mm/yyyy

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

/*
    public static int calculaIdade(){
        Date hoje = new Date();


    }
    public void tempoAposentar(){
        int idadeAtual=0;
        Date today = new Date();

        switch (this.posicao){
            case "Defesa":
                System.out.println("Faltam "+(40-idadeAtual)+" anos para o jogador se aposentar");
                break;
            case "MeioCampo":
                System.out.println("Faltam "+(38-idadeAtual)+" anos para o jogador se aposentar");
                break;
            case "Ataque":
                System.out.println("Faltam "+(35-idadeAtual)+" anos para o jogador se aposentar");
                break;

        }
    }
    */

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", posicao='" + posicao + '\'' +
                ", dataNasc='" + dataNasc + '\'' +
                '}';
    }
}
