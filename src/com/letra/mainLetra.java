package com.letra;

public class mainLetra {

    public static char encontraLetra(String palavra){
        char[] letras=null;
        int contador;
        letras = palavra.toCharArray();
        for(int i = 0; i < palavra.length(); i++){
            contador = 0;
            for(int j=0; j<palavra.length(); j++){

                if(letras[j] == letras[i] && j!=i){
                    contador++;
                }
            }
            if(contador == 0 ){
                return letras[i];
            }
        }
        return '_';
    }

    public static void main(String[] args) {

        String palavra = "aaabccccdeeef";
        System.out.println(encontraLetra(palavra));
        palavra = "strings";
        System.out.println(encontraLetra(palavra));
        palavra = "microsoft visual studio 2022";
        System.out.println(encontraLetra(palavra));
        palavra = "abcedoftz";
        System.out.println(encontraLetra(palavra));
    }
}
