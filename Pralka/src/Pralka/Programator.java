package Pralka;

public class Programator extends Pralka implements ZabrudzoneP, Delikatne{
    private int temperatura;
    private int czasPrania;
    private int wirowanie;

    public void lekkoZabrudzone() {
        temperatura = 40;
        czasPrania = 60;
        wirowanie = 1500;
        wlaczPralke();
    }
    public void mocnoZabrudzone() {
        temperatura = 60;
        czasPrania = 120;
        wirowanie = 2000;
        wlaczPralke();
    }
    public void delikatneSyntetyczne() {
        temperatura = 30;
        czasPrania = 45;
        wirowanie = 1000;
        wlaczPralke();
    }
    public void welna() {
        temperatura = 30;
        czasPrania = 30;
        wirowanie = 500;
        wlaczPralke();
    }

    private void wlaczPralke() {
        System.out.println(String.format("Start pralki."+"" +
                "\n Temperatura prania: %s stopni,czas prania %s minut, "+
                "\n przy obrotach %s wirowania.", temperatura, czasPrania, wirowanie));
    }
}