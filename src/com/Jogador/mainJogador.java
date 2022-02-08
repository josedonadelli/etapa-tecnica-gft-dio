package com.Jogador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class mainJogador {
    public static void main(String[] args) throws ParseException {
        long result;
        String dob="02/27/2013";
        //Date today = new Date();
        Calendar hoje = Calendar.getInstance();
        Date dobDate = new SimpleDateFormat("dd/mm/yyyy").parse(dob);


       // result = dobDate.compareTo(today);


       // System.out.println("Resultado: " + result);
    }
}
