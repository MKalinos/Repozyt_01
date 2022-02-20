package Pralka;

public class Pralka {

    public static void main(String[] args) {
    Programator robimyPranie = new Programator();
    ZabrudzoneP i = robimyPranie;
    Delikatne j = robimyPranie;

    i.mocnoZabrudzone();
        System.out.println("-----------");
    j.welna();

    }
}
