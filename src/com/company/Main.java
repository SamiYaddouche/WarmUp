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

    public static String berechneAnzahlXistPrimzahlUndQuersummeIstPrimzahl (int zahl) {
       String ausgabe = "";
        int anzahl = 0;

        if(zahl >= 100 || zahl <=1) {
           ausgabe = "Ungültig! \nZahl muss zwischen 1 und 100 sein.\nGeben Sie die Zahl erneut ein.";
       }
       if(zahl < 100 && zahl > 1) {
           for (int i = 2; i <= zahl; i++) {

               if (pruefeObPrimzahl(i) && pruefeObPrimzahl(berechneQuersumme(i)))
                   anzahl++;
               ausgabe = "Frage: Für wie viele Zahlen x zwischen 1 und 100 gilt:\nDie Zahl ist eine Primzahl und die Quersumme von der Primzahl ist ebenfalls eine Primzahl ?:\n\nAntwort: " + anzahl;
           }
       }
        return ausgabe;

    }

    public static void main(String[] args) {
	    // System.out.println(pruefeObPrimzahl(4));
        //System.out.println(berechneQuersumme(11));
        System.out.print(berechneAnzahlXistPrimzahlUndQuersummeIstPrimzahl(23));

    }
}
