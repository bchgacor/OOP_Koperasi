/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9; // Nama package

import BAB8.*;
import BAB7.*;
import BAB6.*;
import BAB5.*;




/**
 * Program Sistem Keuangan Koperasi
 * Digunakan untuk mengelola transaksi keuangan koperasi seperti setor, tarik, dan cek saldo.
 * @author VivoBook
 */
public abstract class KeuanganKoperasi {
    protected String namaKoperasi;
    private double totalSaldo;
    private double sukuBunga;
    protected double biayaAdmin;

    // Abstract method (untuk polimorfisme)
    public abstract void hitungBunga();

public void setor(double jumlah) throws TransaksiException {
    if (jumlah <= 0) {
        throw new TransaksiException("Jumlah setoran harus lebih dari 0.");
    }
    setTotalSaldo(getTotalSaldo() + jumlah);
    System.out.println("Setoran Rp" + jumlah + " berhasil.");
    catatTransaksi("Setor");
}

public void tarik(double jumlah) throws TransaksiException {
    if (jumlah <= 0) {
        throw new TransaksiException("Jumlah penarikan harus lebih dari 0.");
    }
    if (getTotalSaldo() < jumlah + biayaAdmin) {
        throw new TransaksiException("Saldo tidak mencukupi untuk penarikan dan biaya admin.");
    }
    setTotalSaldo(getTotalSaldo() - (jumlah + biayaAdmin));
    System.out.println("Penarikan Rp" + jumlah + " berhasil.");
    catatTransaksi("Tarik");
}

    public void cekSaldo() {
        System.out.println("Saldo: Rp" + totalSaldo);
    }

    protected void catatTransaksi(String jenis) {
        System.out.println("Transaksi: " + jenis + " | Saldo saat ini: Rp" + totalSaldo);
    }
    
    public String tampil() {
    return "Nama Koperasi : " + namaKoperasi + "\n" +
           "Saldo         : Rp" + totalSaldo + "\n" +
           "Suku Bunga    : " + sukuBunga + "%\n" +
           "Biaya Admin   : Rp" + biayaAdmin;
}

    public void tampilTransaksi() {
        System.out.println("[Info] Transaksi terakhir tercatat.");
    }

    public void resetSaldo() {
        totalSaldo = 0;
        System.out.println("Saldo telah di-reset.");
    }

    public double getTotalSaldo() {
        return totalSaldo;
    }

    public void setTotalSaldo(double totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    public double getSukuBunga() {
        return sukuBunga;
    }

    public void setSukuBunga(double sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    public double getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }
}