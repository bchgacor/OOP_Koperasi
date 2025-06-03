/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB9;

/**
 *
 * @author VivoBook
 */
public class PersegiPanjang extends BangunDatar implements Keliling,SimetriBangunDatar{
    public double panjang,lebar;

    @Override
    public double hitungLuas() {
        return (panjang * lebar);
    }
    @Override
    public void tampilHasil() {
        System.out.println("Luas Persegi panjang = " + Double.toString(hitungLuas()));
        System.out.println("Keliling Persegi Panjang = " + Double.toString(hitungKeliling()));
        System.out.println("Banyak simetri Putar = "+ hitungSimetriPutar());
    }
    @Override
    public double hitungKeliling() {
        return (2*(panjang * lebar));
    }
    @Override
    public double hitungSimetriPutar() {
        return 2.0;
    }
}
