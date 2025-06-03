/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectPraktikum.BAB4;

/**
 *
 * @author MyBook Hype AMD
 */
public class MainManager {
    public static void main(String[] args) {
// Membuat objek Manager
        Manager mgr = new Manager(25000000, "Teknologi Informasi");
        // Mengatur Nama dan ID menggunakan setter
        mgr.setNama("Ahmad Santoso");
        mgr.setId("ID-MGR-001");

        // Menampilkan informasi
        mgr.tampilkanInfo();
    }
}

