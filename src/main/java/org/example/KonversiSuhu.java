package org.example;
import java.util.Scanner;
/**
 * Kelas ini digunakan untuk mengkonversi suhu antara Fahrenheit dan Celsius.
 */
public class KonversiSuhu {
    /**
     * Fungsi ini mengkonversi suhu dari Fahrenheit ke Celsius.
     *
     * @param fahrenheit Suhu dalam Fahrenheit yang akan dikonversi.
     * @return Suhu dalam Celsius setelah konversi.
     */
    public static double fahrenheitKeCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    /**
     * Fungsi ini mengkonversi suhu dari Celsius ke Fahrenheit.
     *
     * @param celsius Suhu dalam Celsius yang akan dikonversi.
     * @return Suhu dalam Fahrenheit setelah konversi.
     */
    public static double celsiusKeFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    /**
     * Fungsi utama program untuk konversi suhu. Pengguna akan diminta memilih jenis konversi
     * dan memasukkan suhu yang akan dikonversi.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam program ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Konversi Suhu");
        System.out.print("Pilih jenis konversi (1 untuk Fahrenheit ke Celsius, 2 untuk Celsius ke Fahrenheit): ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = fahrenheitKeCelsius(fahrenheit);
            System.out.println("Suhu dalam Celsius: " + celsius + "°C");
        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double celsius = input.nextDouble();
            double fahrenheit = celsiusKeFahrenheit(celsius);
            System.out.println("Suhu dalam Fahrenheit: " + fahrenheit + "°F");
        } else {
            System.out.println("Pilihan tidak valid. Harap pilih 1 atau 2.");
        }

        input.close();
    }
}

