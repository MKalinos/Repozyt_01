package Biblioteka;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Biblioteka ks = new Biblioteka();
        ks.metodaDodaj();

        Scanner scan = new Scanner(System.in);
        int i = 1;
        System.out.println("Witaj w Bibliotece");
        System.out.println("------------------");
        while(i==1){
            System.out.println(
                    " Ile książek jest w bibliotece naciśnij 1:" +
                    "\n Sprawdzić zawartość biblioteki - 2"+
                    "\n Wypożyczone książki 3"+
                    "\n Dostępne książki 4"+
                    "\n Sprawdzić zawartość biblioteki z półkami- 5"
            );
            int znak = scan.nextInt();
            if(znak == 1){
            ks.iloscKsiazek();
            }
            else if (znak == 2){
                ks.pokZawBiblio();
            }
            else if (znak == 3){
                ks.wypozyczone();
            }
            else if (znak == 4){
                ks.dostepne();
            }
            else if (znak == 5){
                ks.zajetePolkiBiblio();
            }
            else{
                System.out.println("??? ....");
            }
            System.out.println("---------------------------");
            System.out.println("Jeśli chcesz zakończyć naciśnij 9, jeśli chcesz wrócić do menu:8");
            int znak1 = scan.nextInt();
            if (znak1 == 9){
                i = 0;
            }
            else {
                continue;
            }
        }
    }
    }


