/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB6;

/**
 *
 * @author VivoBook
 */
class Becak extends Kendaraan {
    private final double kecepatan; // dalam km/jam
    private final int kapasitas;    // jumlah penumpang

    // Konstruktor Becak
    public Becak(double kecepatan, int kapasitas) {
        this.kecepatan = kecepatan;
        this.kapasitas = kapasitas;
    }

    // Implementasi metode hitungKecepatan untuk Becak
    @Override
    double hitungKecepatan() {
        return this.kecepatan;
    }

    // Implementasi metode hitungKapasitas untuk Becak
    @Override
    int hitungKapasitas() {
        return this.kapasitas;
    }
}