/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4;

/**
 *
 * @author Shadow
 */
public class simpanan extends KeuanganKoperasi {
    private double simpanan_pokok, simpanan_wajib, simpanan_sukarela;

    public void setSimpananPokok(double pokok) {
        this.simpanan_pokok = pokok;
    }

    public void setSimpananWajib(double wajib) {
        this.simpanan_wajib = wajib;
    }

    public void setSimpananSukarela(double sukarela) {
        this.simpanan_sukarela = sukarela;
    }

    public double getSimpananPokok() {
        return simpanan_pokok;
    }

    public double getSimpananWajib() {
        return simpanan_wajib;
    }

    public double getSimpananSukarela() {
        return simpanan_sukarela;
    }


}