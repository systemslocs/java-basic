package edu.lucas.poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();

        jeep.ligar();
        jeep.setChassi("09830984039");

        Moto xre = new Moto();

        xre.setChassi("99837870945");
    }
}
