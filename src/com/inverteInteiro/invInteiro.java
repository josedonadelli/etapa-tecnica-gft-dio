package com.inverteInteiro;

public class invInteiro {
    public static int inverteNumero(int numero){
        int invert=0, aux;
        while(numero>0){
            aux = numero%10;
            invert = invert*10 + aux;
            numero/=10;
        }
        return invert;
    }
}
