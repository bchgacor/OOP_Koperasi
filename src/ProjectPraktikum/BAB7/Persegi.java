/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB7;

/**
 *
 * @author VivoBook
 */
public class Persegi extends BangunDatar{
    private double sisi;
    public Persegi(double sisi) {
        this.sisi = sisi;
    } 
    @Override
    double hitungLuas() {
        return sisi * sisi;
    }
    @Override
    double hitungKeliling() {
        return 4 * sisi;
    } }
