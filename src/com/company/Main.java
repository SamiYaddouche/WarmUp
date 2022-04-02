package com.company;

public class Main {

    public static boolean pruefeObPrimzahl (int zahl) {
        boolean ergebnis = false;
        if (zahl > 1 && zahl%2 != 0){
            ergebnis = true;
        }
        return ergebnis;
    }

    public static int berechneQuersumme(int zahl) {
        int quersumme = 0;
        int rest = 0;
        for (int i = 0; zahl > 0; i++){
            quersumme += zahl%10;
            zahl = zahl / 10;
        }

        return quersumme;
    }
    public static void main(String[] args) {
	    // System.out.println(pruefeObPrimzahl(4));
        System.out.println(berechneQuersumme(112));

    }
}
