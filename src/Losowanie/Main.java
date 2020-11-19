package Losowanie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int i = 20; //Domyślna liczba elementów w tablicy
        int k = 5; //Domyślna liczba elementów w jednym wierszu
        int x = random.nextInt((40) + 10);
        int y = 0; //Ilośc wystąpień x w tablicy
        int wiersz = 0;

        System.out.println("Czy chcesz wybrac wlasna ilosc elementow w tablicy i wierszu?");

        String bool = scanner.nextLine();

        while (!(bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t") || bool.equalsIgnoreCase("nie") || bool.equalsIgnoreCase("n"))) {
            System.out.println("Blad!\nPoprawne argumenty:\n- Tak\n- Nie");
            bool = scanner.nextLine();
        }

        if (bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t")) {
            System.out.println("Wpisz liczbe elementow tablicy (i):");
            i = scanner.nextInt();
            System.out.println("Wpisz liczbe elementow w jednym wierszu (k):");
            k = scanner.nextInt();
            System.out.println("Wybrana odpowiedz: " + bool + "\nUstawiono wartosci:\n- Liczba elementow w tablicy: " + i + "\n- Liczba elementow w jednym wierszu: " + k);
        } else {
            System.out.println("Wybrana odpowiedz: " + bool + "\nUstawiono domyslne wartosci:\n- Liczba elementow w tablicy: " + i + "\n- Liczba elementow w jednym wierszu: " + k);
        }

        if (k > 0) {
            int[] tablica = new int[i];
            System.out.print("\nTablica:\n");
            for (int j = 0; j < tablica.length; j++) {
                tablica[j] = random.nextInt((40) + 10);
                if (j % k == 0) {
                    wiersz += 1;
                    System.out.print("\nWiersz #" + wiersz + ": ");
                }
                System.out.print(tablica[j] + " ");
            }
            for (int i1 = 0; i1 < tablica.length; i1++) {
                if (tablica[i1] == x) {
                    y++;
                }
            }
            if (y != 0) {
                System.out.println("Liczba x (" + x + ") wystepuje w tablicy " + y + " razy");
            } else {
                System.out.println("Liczba x (" + x + ") nie wystepuje w tablicy");
            }

        } else {
            System.out.println("Blad!\nParametr \"K\" nie moze byc mniejszy od 1!");
        }
    }
}