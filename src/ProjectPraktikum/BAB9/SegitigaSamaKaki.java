/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB9;

/**
 *
 * @author VivoBook
 */
public class SegitigaSamaKaki extends BangunDatar implements Keliling{
    public double alas, tinggi;
    public double a,b,c;
    @Override
    public double hitungLuas() {
        return ((alas * tinggi)/2);
    }
    @Override
    public void tampilHasil() {
        System.out.println("Luas Segitiga = "+ hitungLuas());
        System.out.println("Kelilng Segitiga = "+ hitungKeliling());
    }
    @Override
    public double hitungKeliling() {
        return (a+b+c);
    } 
}
