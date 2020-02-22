package com.company;

abstract public class Figury implements Cena {
    double pole, objetosc, poleBoczne, unitPrice;

    abstract void obliczPole();

    abstract void obliczObjetosc();

    abstract void obliczPoleBoczne();

    Figury() {
        obliczPole();
        obliczPoleBoczne();
        obliczObjetosc();
    }

    void print() {
        System.out.println("______________________________");
        System.out.println("Pole powierzchni wynosi: " + pole);
        System.out.println("Pole powierzchni bocznej wynosi: " + poleBoczne);
        System.out.println("Objętość wynosi:" + objetosc);
        System.out.println("_______________________________");
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getPrice() {
        return unitPrice * objetosc;
    }

    @Override
    public void printPrice() {
        System.out.println("Cena za powyższy graniastosłup wynosi: " + getPrice() + "zł");

    }

}
