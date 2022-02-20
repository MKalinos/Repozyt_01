package Biblioteka;

import java.util.HashMap;
import java.util.Map;

public class Ksiazka {
    int id;
    String Imie,Nazwisko,tytul;
    boolean dostępna;


    public Ksiazka(int id, String imie, String nazwisko, String tytul, boolean dostępna) {
        this.id = id;
        this.Imie = imie;
        this.Nazwisko = nazwisko;
        this.tytul = tytul;
        this.dostępna = dostępna;

    }

    @Override
    public String toString() {
        return " Egzemplrz: " +
                "id: " + id +
                ", Imie: " + Imie +
                ", Nazwisko: " + Nazwisko +
                ", tytul: " + tytul +
                ", dostępna: " + dostępna;
    }



    }

