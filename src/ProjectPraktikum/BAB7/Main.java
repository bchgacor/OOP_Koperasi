/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB7;

/**
 *
 * @author VivoBook
 */
public class Main {
      public static void main(String[] args) {
        BangunDatar Bdatar; // deklarasi referensi superclass

        System.out.println("Penerapan Polimorfisme Upcasting");

        Bdatar = new Persegi(10); // Upcasting
        System.out.println("Luas               : " + Bdatar.hitungLuas());
        System.out.println("Keliling           : " + Bdatar.hitungKeliling());
        System.out.println("---------------------------------------------");

        System.out.println("Penerapan Polimorfisme Downcasting");

        // Buat objek Persegi terlebih dahulu untuk bisa didowncast
        Bdatar = new Persegi(8);

        // Lakukan pemeriksaan dengan instanceof sebelum downcasting
        if (Bdatar instanceof Persegi) {
            Persegi kotak = (Persegi) Bdatar; 
            System.out.println("Luas              : " + kotak.hitungLuas());
            System.out.println("Keliling          : " + kotak.hitungKeliling());
        } else {
            System.out.println("Bdatar bukan objek Persegi, tidak bisa di-cast.");
        }

        System.out.println("---------------------------------------------");
    }
}
