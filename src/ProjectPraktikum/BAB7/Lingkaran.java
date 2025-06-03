/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB7;

/**
 *
 * @author VivoBook
 */
public class Lingkaran extends BangunDatar{
    private double jariJari;
    double phi = 3.14;

    public Lingkaran(int jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        return phi * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * phi * jariJari;
    }  }
