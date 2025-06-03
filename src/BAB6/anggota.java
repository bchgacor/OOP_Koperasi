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
public class anggota extends KeuanganKoperasi {
    private String id_anggota, nama, telp;

    // Getter dan Setter
    public void setIdAnggota(String id) {
        this.id_anggota = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getIdAnggota() {
        return id_anggota;
    }

    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }

    @Override
    public void hitungBunga() {
        double bunga = (getTotalSaldo() * getSukuBunga()) / 100;
        setTotalSaldo(getTotalSaldo() + bunga);
    }

    @Override
    public String tampil() {
        return "ID: " + id_anggota + "\nNama: " + nama + "\nTelp: " + telp;
    }
}