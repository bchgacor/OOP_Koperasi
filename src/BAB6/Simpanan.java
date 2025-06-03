/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6;

import BAB5.*;

/**
 *
 * @author Shadow
 */
public class Simpanan extends KeuanganKoperasi {
    private double simpanan_pokok;
    private double simpanan_wajib;
    private double simpanan_sukarela;

    // Getter & Setter
    public void setSimpananPokok(double pokok) {
        this.simpanan_pokok = pokok;
    }
    
    public double getSimpananPokok() {
        return simpanan_pokok;
    }
    
    // ... (implementasi sama untuk wajib dan sukarela)

    @Override
    public void hitungBunga() {
        // Implementasi khusus simpanan
        double total = simpanan_pokok + simpanan_wajib + simpanan_sukarela;
        double bunga = total * (getSukuBunga() / 100);
        setTotalSaldo(getTotalSaldo() + bunga);
    }
}