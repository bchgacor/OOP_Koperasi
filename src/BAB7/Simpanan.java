/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7;

import BAB6.*;
import BAB5.*;

/**
 *
 * @author Shadow
 */
public class Simpanan extends KeuanganKoperasi {
    private double simpananPokok;
    private double simpananWajib;
    private double simpananSukarela;

    public void setSimpananPokok(double pokok) {
        this.simpananPokok = pokok;
    }

    public void setSimpananWajib(double wajib) {
        this.simpananWajib = wajib;
    }

    public void setSimpananSukarela(double sukarela) {
        this.simpananSukarela = sukarela;
    }

    public double getSimpananPokok() {
        return simpananPokok;
    }

    public double getSimpananWajib() {
        return simpananWajib;
    }

    public double getSimpananSukarela() {
        return simpananSukarela;
    }

    public double getTotalSimpanan() {
        return simpananPokok + simpananWajib + simpananSukarela;
    }

    public void resetSimpanan() {
        simpananPokok = simpananWajib = simpananSukarela = 0;
        System.out.println("Simpanan telah di-reset.");
    }

    @Override
    public void hitungBunga() {
        double total = getTotalSimpanan();
        double bunga = total * (getSukuBunga() / 100);
        setTotalSaldo(getTotalSaldo() + bunga);
    }

    @Override
    public String tampil() {
        return super.tampil() + "\nTotal Simpanan: Rp" + getTotalSimpanan();
    }
}