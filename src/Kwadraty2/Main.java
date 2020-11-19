package Kwadraty2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc siatki");
        int size = scanner.nextInt();
        long j = 0;
        for (int i = 1; i <= size; i++) {
            j += Math.pow(i, 2);
        }
        System.out.println(j);
    }
}
