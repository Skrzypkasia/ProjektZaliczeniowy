package com.company;

public class Prostopadloscian extends Figury implements Cena {
    double a, b, c;

    Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        obliczPole();
        obliczObjetosc();
        obliczPoleBoczne();
    }

    @Override
    void obliczPole() {
        this.pole = a * b;

    }

    @Override
    void obliczObjetosc() {
        this.objetosc = a * b * c;
    }

    @Override
    void obliczPoleBoczne() {
        this.poleBoczne = b * c;

    }
}
