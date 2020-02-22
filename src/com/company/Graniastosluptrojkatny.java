package com.company;

public class Graniastosluptrojkatny extends Figury implements Cena {
    double a, h;

    Graniastosluptrojkatny(double a, double h) {
        this.a = a;
        this.h = h;
        obliczPole();
        obliczPoleBoczne();
        obliczObjetosc();
    }


    @Override
    void obliczPole() {
        this.pole = 2 * (a * a * Math.sqrt(3) / 4) + a * h;

    }

    @Override
    void obliczObjetosc() {
        this.objetosc = (a * a * Math.sqrt(3) / 4) * h;


    }

    @Override
    void obliczPoleBoczne() {
        this.poleBoczne = a * h;

    }
}
