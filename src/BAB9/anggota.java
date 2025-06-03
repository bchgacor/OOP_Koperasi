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
public class anggota extends KeuanganKoperasi {
    private String idAnggota, nama, telp;

    public void setIdAnggota(String id) {
        this.idAnggota = id;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getTelp() {
        return telp;
    }

    public boolean validasiTelp() {
        return telp != null && telp.matches("08\\d{9,10}");
    }

    @Override
    public void hitungBunga() {
        double bunga = (getTotalSaldo() * getSukuBunga()) / 100;
        setTotalSaldo(getTotalSaldo() + bunga);
    }

    public String tampilLengkap() {
        return tampil() + "\nID: " + idAnggota + "\nNama: " + nama + "\nTelepon: " + telp;
    }

    @Override
    public String tampil() {
    return super.tampil() + "\n" +
           "ID Anggota    : " + idAnggota + "\n" +
           "Nama          : " + nama + "\n" +
           "Telepon       : " + telp;
}
    
    public void cetakLaporan() {
        System.out.println("===== Laporan Anggota =====");
        System.out.println("ID     : " + idAnggota);
        System.out.println("Nama   : " + nama);
        System.out.println("Telp   : " + telp);
        System.out.println("Saldo  : Rp" + getTotalSaldo());
    }
}