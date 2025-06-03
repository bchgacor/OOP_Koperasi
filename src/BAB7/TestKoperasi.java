/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7;

/**
 *
 * @author VivoBook
 */
public class TestKoperasi {
    public static void main(String[] args) {
        KeuanganKoperasi[] koperasi = new KeuanganKoperasi[2];

        anggota a = new anggota();
        a.setIdAnggota("A001");
        a.setNama("Budi");
        a.setTelp("081234567890");
        a.setTotalSaldo(1000000);
        a.setSukuBunga(2.5);

        Simpanan s = new Simpanan();
        s.setSimpananPokok(200000);
        s.setSimpananWajib(150000);
        s.setSimpananSukarela(100000);
        s.setTotalSaldo(500000);
        s.setSukuBunga(3.0);

        koperasi[0] = a;
        koperasi[1] = s;

        for (KeuanganKoperasi k : koperasi) {
            k.hitungBunga();      // polimorfisme di sini
            k.cekSaldo();
        }
    }
}