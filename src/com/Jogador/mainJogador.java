package com.Jogador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mainJogador {
    public static void main(String[] args) throws ParseException {
       Jogador jogador = new Jogador();

       jogador.setNome("Joao");
       jogador.setPosicao("Ataque");
       jogador.setDataNasc("05/10/1994");

        System.out.println(jogador.toString());
    }
}
