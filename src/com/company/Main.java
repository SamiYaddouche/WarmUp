package com.company;

public class Main {

    public static boolean pruefeObPrimzahl (int zahl) {
        boolean ergebnis = false;
        if (zahl > 1 && zahl%2 != 0){
            ergebnis = true;
        }
        return ergebnis;
    }

    public static void main(String[] args) {
	System.out.println(pruefeObPrimzahl(4));
    }
}
