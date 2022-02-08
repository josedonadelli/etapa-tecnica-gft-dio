package com.veiculos;

public class mainVeículo {
    public static void main(String[] args) {
        Veiculos veiculo = new Veiculos();
        veiculo.setCor("Azul");
        veiculo.setKm("10.000 km");
        veiculo.setMarca("Hyundai");
        veiculo.setModelo("HB20");
        veiculo.setPlaca("AAA 0000");
        veiculo.setPreço(100000.00);
        System.out.println(veiculo.toString());

        veiculo.abastecer(30);
        veiculo.pintar("Vermelho");
        veiculo.ligar();
        veiculo.acelerar();


        System.out.println(veiculo.toString());

        veiculo.abastecer(50);
    }

}
