/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPraktikum.BAB6;

import ProjectPraktikum.BAB5.*;

/**
 *
 * @author MyBook Hype AMD
 */
public class Main{
    public static void main(String[] args) {
        Kendaraan pesawat = new pesawat(900, 150);
        System.out.println("Kecepatan Pesawat: " + pesawat.hitungKecepatan() + " km/jam");
        System.out.println("Kapasitas Pesawat: " + pesawat.hitungKapasitas() + " penumpang");

        Kendaraan Becak = new Becak(10, 2);
        System.out.println("Kecepatan Becak: " + Becak.hitungKecepatan() + " km/jam");
        System.out.println("Kapasitas Becak: " + Becak.hitungKapasitas() + " penumpang");
    }
}