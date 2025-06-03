/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7; // Nama package

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

    // Setor
    public void setor(double jumlah) {
        if (jumlah > 0) {
            totalSaldo += jumlah;
            System.out.println("Setoran Rp" + jumlah + " berhasil.");
            catatTransaksi("Setor");
        }
    }

    public void setor(double jumlah, String keterangan) {
        if (jumlah > 0) {
            totalSaldo += jumlah;
            System.out.println("Setoran Rp" + jumlah + " berhasil. Keterangan: " + keterangan);
            catatTransaksi("Setor - " + keterangan);
        }
    }

    // Tarik
    public void tarik(double jumlah) {
        if (jumlah > 0 && totalSaldo >= (jumlah + biayaAdmin)) {
            totalSaldo -= (jumlah + biayaAdmin);
            System.out.println("Penarikan Rp" + jumlah + " berhasil. Biaya admin: Rp" + biayaAdmin);
            catatTransaksi("Tarik");
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public void tarik(double jumlah, String keterangan) {
        if (jumlah > 0 && totalSaldo >= (jumlah + biayaAdmin)) {
            totalSaldo -= (jumlah + biayaAdmin);
            System.out.println("Penarikan Rp" + jumlah + " berhasil. Keterangan: " + keterangan);
            catatTransaksi("Tarik - " + keterangan);
        } else {
            System.out.println("Saldo tidak mencukupi.");
        }
    }

    public void cekSaldo() {
        System.out.println("Saldo: Rp" + totalSaldo);
    }

    protected void catatTransaksi(String jenis) {
        System.out.println("Transaksi: " + jenis + " | Saldo saat ini: Rp" + totalSaldo);
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

    public String tampil() {
        return "Koperasi: " + namaKoperasi + "\nSaldo: Rp" + totalSaldo + "\nBunga: " + sukuBunga + "%\nAdmin: Rp" + biayaAdmin;
    }
}