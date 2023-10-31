package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Suhu");
        System.out.print("Pilih jenis konversi (1 untuk Fahrenheit ke Celsius, 2 untuk Celsius ke Fahrenheit): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            // Konversi dari Fahrenheit ke Celsius
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.println("Suhu dalam Celsius: " + celsius + "°C");
        } else if (pilihan == 2) {
            // Konversi dari Celsius ke Fahrenheit
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + "°F");
        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 atau 2.");
        }

        input.close();
    }
}