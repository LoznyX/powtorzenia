public class Notatka {
    private static int zlicz;
    protected String tytyl;
    protected String tresc;
    private int identyfikator;

    public Notatka(String tytyl, String tresc) {
        this.tytyl = tytyl;
        this.tresc = tresc;

        zlicz++;
        identyfikator = zlicz;
    }
    public void WyswietlTytuliTresc() {
        System.out.println("tytul: "+tytyl);
        System.out.println("tresc: "+tresc);
    }

    public void diagnostyka(){
        System.out.println("notatka{" +
                "tytyl='" + tytyl + '\'' +
                ", tresc='" + tresc + '\'' +
                ", identyfikator=" + identyfikator +
                '}');
    }

    }

