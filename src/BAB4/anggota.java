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
public class anggota extends KeuanganKoperasi {
    private String id_anggota, nama, telp;

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

    //set berguna mengisi nilai variabel
    //get berguna mendapatkan data nilai
} 