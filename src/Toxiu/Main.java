package Toxiu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int suma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj minimalna wartosc przedzialu");

        int i = scanner.nextInt();

        System.out.println("Podaj maksymalna wartosc przedzialu");

        int j = scanner.nextInt();

        for (int k = i; k <= j; k++) {
            suma += k;
        }

        System.out.println(suma);
    }
}
