package Binarka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, ktora chcesz zamienic na binarke");
        int liczba = scanner.nextInt();

// 20-16
// 4-8 X
// 4-4
// 0

        int i = 1;
        StringBuilder bin = new StringBuilder();
        while (i <= liczba) {
            i = i * 2;
        }
        i = i / 2;
        int bazowa = liczba;
        while (liczba >= 0 && i != 0) {
            if (liczba - i >= 0) {
                liczba -= i;
                i = i / 2;
                bin.append("1");
            } else {
                i = i / 2;
                bin.append("0");
            }
        }
        System.out.println("DEC -> BIN: " + bazowa + " -> " + bin);
    }
}

        // System.out.println("DEC -> BIN: " + bazowa + " -> " + Integer.toBinaryString(bazowa));

