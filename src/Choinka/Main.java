package Choinka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int wysokosc = 2;
        int x = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chcesz ustalic dowolna* wysokosc choinki?\n*) Liczba nie moze byc wieksza, niz 999");
        String bool = scanner.nextLine();

        while (!(bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t") || bool.equalsIgnoreCase("nie") || bool.equalsIgnoreCase("n"))) {
            System.out.println("Blad!\nPoprawne argumenty:\n- Tak\n- Nie");
            bool = scanner.nextLine();
        }

        if (bool.equalsIgnoreCase("tak") || bool.equalsIgnoreCase("t")) {
            System.out.println("Wpisz wysokosc choinki:");
            wysokosc = scanner.nextInt();
            if (wysokosc > 999) {
                System.out.print("Blad! Wysokosc nie moze byc wieksza, niz 999");
            }
        } else {
            System.out.println("Wybrana odpowiedz: " + bool + "\nUstawiono domyslna wysokosc: " + wysokosc);
        }

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 5; j > 0; j--) {
                for (int k = 1; k < j; k++) {
                    System.out.print("   ");
                }
                for (int l = (10 * (i - 1)); l < x; l++) {
                    if (i >= 10) {
                        if (i >= 100) {
                            System.out.print(i);
                        } else {
                            System.out.print(i + " ");
                        }
                    } else {
                        System.out.print(" " + i + " ");
                    }
                }
                x += 2;
                System.out.println("  ");
            }
        }
        for (int i = 1; i <= 3; i++) {
            if (wysokosc >= 10) {
                if (wysokosc >= 100) {
                    System.out.println("         xxxxxxxxx");
                } else {
                    System.out.println("         xx xx xx");
                }
            } else {
                System.out.println("          x  x  x");
            }
        }
    }
}