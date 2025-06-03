/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9;

import BAB8.*;
import BAB7.*;
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

    
public void setSimpananPokok(double pokok) throws TransaksiException {
    if (pokok < 0) {
        throw new TransaksiException("Simpanan pokok tidak boleh negatif.");
    }
    this.simpananPokok = pokok;
}

public void setSimpananWajib(double wajib) throws TransaksiException {
    if (wajib < 0) {
        throw new TransaksiException("Simpanan wajib tidak boleh negatif.");
    }
    this.simpananWajib = wajib;
}

public void setSimpananSukarela(double sukarela) throws TransaksiException {
    if (sukarela < 0) {
        throw new TransaksiException("Simpanan sukarela tidak boleh negatif.");
    }
    this.simpananSukarela = sukarela;
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

    private double getTotalSimpanan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void cetakLaporan() {
        System.out.println("==== Laporan Simpanan ====");
        System.out.println("Simpanan Pokok: Rp" + simpananPokok);
        System.out.println("Simpanan Wajib: Rp" + simpananWajib);
        System.out.println("Simpanan Sukarela: Rp" + simpananSukarela);
        System.out.println("Total Saldo: Rp" + getTotalSaldo());
    }
}