import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Notatka notatka = new Notatka("Inf-04","zdawanie egzaminu");
        System.out.println("testowanie metody diagnostyka: ");
        notatka.diagnostyka();
        System.out.println("testownie metody wyswietlajacej tytul i tresc: ");

        notatka.WyswietlTytuliTresc();
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj tytul");
        String tytul = sc.next();
        System.out.println("podaj tresc");
        String tresc = sc.next();
        Notatka notatka1 = new Notatka(tytul,tresc);
        System.out.println("testowanie metody diagnostyka: ");
        notatka1.diagnostyka();
        System.out.println("testownie metody wyswietlajacej tytul i tresc: ");

        notatka1.WyswietlTytuliTresc();
        }
    }
