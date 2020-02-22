package com.company;

public class Szescian extends Figury implements Cena {
    double a;

    Szescian(double a) {
        this.a = a;
        obliczPole();
        obliczObjetosc();
        obliczPoleBoczne();
    }


    @Override
    void obliczPole() {
        this.pole = 6 * Math.pow(a, 2);

    }

    @Override
    void obliczObjetosc() {
        this.objetosc = Math.pow(a, 3);

    }

    @Override
    void obliczPoleBoczne() {
        this.poleBoczne = 4 * Math.pow(a, 2);

    }
}
