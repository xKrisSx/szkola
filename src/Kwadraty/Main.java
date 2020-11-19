package Kwadraty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc siatki");
        int size = scanner.nextInt();
        int pow = 0;
        for (int i = 1; i <= size; i++) {
            pow += i;
        }
        long wynik = (long) Math.pow(pow, 2);
        System.out.println(pow);
        System.out.println("Ilosc prostokatow w kwadracie " + size + "x" + size + ": " + wynik);
    }
}
