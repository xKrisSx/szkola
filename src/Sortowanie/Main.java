package Sortowanie;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int i = 40; //Domyślna liczba elementów w tablicy
        int k = 8; //Domyślna liczba elementów w jednym wierszu
        int c; //Ilośc cyfr każdej liczby w tablicy
        int wiersz = 0;

        System.out.println("Wypisz liczbe cyfr kazdej liczby w tablicy");

        c = scanner.nextInt();

        while (c < 1) {
            System.out.println("Blad! Parametr c musi byc wiekszy od 0!");
            c = scanner.nextInt();
        }

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
            System.out.print("\nTablica przed posortowaniem:\n");
            for (int j = 0; j < tablica.length; j++) {
                tablica[j] = random.nextInt((int) (9 * (Math.pow(10, (c - 1)))) - 1) + ((int) (Math.pow(10, (c - 1))));
                if (j % k == 0) {
                    wiersz += 1;
                    System.out.print("\nWiersz #" + wiersz + ": ");
                }
                System.out.print(tablica[j] + " ");
            }

            System.out.println("\n\nCzy chcesz posortowac liczby?");
            if (bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t")) {
                bool = scanner.nextLine();
            }
            bool = scanner.nextLine();

            while (!(bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t") || bool.equalsIgnoreCase("nie") || bool.equalsIgnoreCase("n"))) {
                System.out.println("Blad!\nPoprawne argumenty:\n- Tak\n- Nie");
                bool = scanner.nextLine();
            }

            if (bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t")) {
                System.out.println("\nTablica po posortowaniu:");
                sort(tablica);
                wiersz = 0;
                for (int j = 0; j < tablica.length; j++) {
                    if (j % k == 0) {
                        wiersz += 1;
                        System.out.print("\nWiersz #" + wiersz + ": ");
                    }
                    System.out.print(tablica[j] + " ");
                }
            }
        } else {
            System.out.println("Blad!\nParametr \"K\" nie moze byc mniejszy od 1!");
        }
    }

    public static void sort(int[] tablica) {
        int z;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 1; j < (tablica.length - i); j++) {
                if (tablica[j - 1] > tablica[j]) {
                    z = tablica[j - 1];
                    tablica[j - 1] = tablica[j];
                    tablica[j] = z;
                }
            }
        }
    }
}