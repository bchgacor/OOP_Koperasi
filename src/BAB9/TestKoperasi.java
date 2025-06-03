/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9;

import BAB8.*;
import BAB7.*;

/**
 *
 * @author VivoBook
 */
public class TestKoperasi {
    public static void main(String[] args) {
        try {
            Laporan[] daftarLaporan = new Laporan[2];

            anggota a = new anggota();
            a.setIdAnggota("A001");
            a.setNama("Budi");
            a.setTelp("081234567890");
            a.setTotalSaldo(1000000);

            Simpanan s = new Simpanan();
            s.setSimpananPokok(200000);
            s.setSimpananWajib(150000);
            s.setSimpananSukarela(100000);
            s.setTotalSaldo(500000);

            daftarLaporan[0] = (Laporan) a;
            daftarLaporan[1] = (Laporan) s;

            for (Laporan l : daftarLaporan) {
                l.cetakLaporan(); // polimorfisme via interface
            }

        } catch (TransaksiException e) {
            System.err.println("Kesalahan transaksi: " + e.getMessage());
        }
    }
}