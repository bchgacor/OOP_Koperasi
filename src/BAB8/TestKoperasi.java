/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8;

import BAB7.*;

/**
 *
 * @author VivoBook
 */
public class TestKoperasi {
    public static void main(String[] args) {
        try {
            KeuanganKoperasi[] koperasi = new KeuanganKoperasi[2];

            anggota a = new anggota();
            a.setIdAnggota("A001");
            a.setNama("Budi");
            a.setTelp("081234567890");
            a.setTotalSaldo(1000000);
            a.setSukuBunga(2.5);

            Simpanan s = new Simpanan();
            s.setSimpananPokok(200000);        // tidak melempar exception
            s.setSimpananWajib(150000);        // tidak melempar exception
            s.setSimpananSukarela(-100000);    // ini akan memicu exception

            s.setTotalSaldo(500000);
            s.setSukuBunga(3.0);

            koperasi[0] = a;
            koperasi[1] = s;

            for (KeuanganKoperasi k : koperasi) {
                k.hitungBunga();      // polimorfisme
                k.cekSaldo();
            }
        } catch (TransaksiException e) {
            System.err.println("Kesalahan transaksi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Kesalahan umum: " + e.getMessage());
        }
    }
}