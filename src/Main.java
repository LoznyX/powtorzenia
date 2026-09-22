import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            ArrayList<Integer> parzyste = new ArrayList<>();
            for (int i = 200; i <301 ; i = i +2) {
                    parzyste.add(i);
            }
            System.out.println(parzyste);
            //zapytaj o liczbe i pod jakim indeksem jest
            Scanner sc = new Scanner(System.in);
            System.out.println("podaj szukana liczbe");
            int liczbaszukana = sc.nextInt();
            for (int i = 0; i < parzyste.size(); i++) {
                 if(parzyste.get(i).equals(liczbaszukana))  {
                         System.out.println("indeks wynosi: "+i);
                         break;
                 }
            }

            }

        }

