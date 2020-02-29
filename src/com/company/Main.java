package com.company;

import java.util.ArrayList;

public class Main {
    static ArrayList<Figury> mFigury = new ArrayList<>();


    public static void main(String[] args) {
        mFigury.add(new Szescian(1));
        mFigury.add(new Szescian(4));
        mFigury.add(new Szescian(3));
        mFigury.add(new Prostopadloscian(2, 3, 1));
        mFigury.add(new Prostopadloscian(2, 3, 1));
        mFigury.add(new Graniastosluptrojkatny(1, 1));
        mFigury.add(new Graniastosluptrojkatny(5, 5));

        for (Figury figury : mFigury)
            figury.print();
        for (int i = 0; i < 7; i++) {
            mFigury.get(i).setUnitPrice(2);
            mFigury.get(i).printPrice();
        }


//        Szescian szescian1 = new Szescian(3);
//        szescian1.setUnitPrice(15.30);
//        szescian1.print();
//        szescian1.printPrice();
//
//        Prostopadloscian prostopadloscian1 = new Prostopadloscian(2,3,4);
//        prostopadloscian1.setUnitPrice(20);
//        prostopadloscian1.print();
//        prostopadloscian1.printPrice();
//
//        Graniastosluptrojkatny trojkatny1= new Graniastosluptrojkatny(3,10);
//        trojkatny1.setUnitPrice(20);
//        trojkatny1.print();
//        trojkatny1.printPrice();

    }
}

