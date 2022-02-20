package Biblioteka;

import java.util.HashMap;
import java.util.Map;

public class Biblioteka {

    String wyszukaj;

    Map<Integer, Ksiazka> zawartBiblio = new HashMap<Integer, Ksiazka>();

    Ksiazka ksA = new Ksiazka(951, "J.R.R.", "Tolkien", "Władca Pierscieni", true);
    Ksiazka ksB = new Ksiazka(987, "Terry", "Pratchett", "Kolor magii", false);
    Ksiazka ksC = new Ksiazka(87, "Remigiusz", "Mróz", "Behawiorysta ", true);
    Ksiazka ksD = new Ksiazka(54, "Andrzej", "Toole", "Sprzysiężenie osłów", true);
    Ksiazka ksE = new Ksiazka(456, "Remigiusz", "Mróz", "Chór zapomnianych głosów", false);
    Ksiazka ksF = new Ksiazka(23, "Adam", "Mickiewicz", "Pan Tadeusz", false);
    Ksiazka ksG = new Ksiazka(12, "Sławomir", "Mrożek", "Maleńkie Lato", false);
    Ksiazka ksH = new Ksiazka(465, "Philip K", "Dick", "Człowiek z Wysokiego Zamku ", true);
    Ksiazka ksI = new Ksiazka(64, "Philip K", "Dick", "Czy androidy śnią o elektrycznych owcach?", true);
    Ksiazka ksK = new Ksiazka(88, "John", "Toole", "Sprzysiężenie osłów", true);


    //        to powinna być metoda domyślna
    public void metodaDodaj() {
        zawartBiblio.put(81, ksA);
        zawartBiblio.put(62, ksB);
        zawartBiblio.put(23, ksC);
        zawartBiblio.put(64, ksD);
        zawartBiblio.put(45, ksE);
        zawartBiblio.put(16, ksF);
        zawartBiblio.put(78, ksG);
        zawartBiblio.put(87, ksH);
        zawartBiblio.put(90, ksI);
        zawartBiblio.put(11, ksK);
    }

    public void pokZawBiblio() {
        for (Ksiazka i : zawartBiblio.values()) {
            System.out.println("* "+i.tytul+": "+i.Imie+" "+i.Nazwisko);

        }
    }
    public void zajetePolkiBiblio() {
        for (int i : zawartBiblio.keySet()) {
                System.out.println("miejsce na półce:" + i + " zajete:"+zawartBiblio.get(i));
        }
    }
    public void iloscKsiazek() {
        System.out.println("Wszystkich książek na półce jest: " + zawartBiblio.size());
    }

    public void wypozyczone() {
        int j = 0;
        for (Ksiazka i : zawartBiblio.values()) {
            if (i.dostępna == false) {
                System.out.println("* "+i.tytul+" "+i.Imie+" "+i.Nazwisko);
                j++;
            } else {
                continue;
            }

        }
        System.out.println("stan wypozyczonych książek: "+j);
    }
    public void dostepne() {
        int j = 0;
        for (Ksiazka i : zawartBiblio.values()) {
            if (i.dostępna == true) {
                System.out.println("* "+i.tytul+": "+i.Imie+" "+i.Nazwisko);
                j++;
            } else {
                continue;
            }
        }
        System.out.println("stan dostępnych książek: "+j);
    }



}

