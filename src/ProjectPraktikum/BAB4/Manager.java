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
public class Manager extends Karyawan {
    private String departemen;
    
    // Konstruktor Manager, hanya menerima gaji dasar
    public Manager(double gajiDasar, String departemen) {
        super(gajiDasar);  // Mengatur gaji dasar di superclass
        this.departemen = departemen;
    }
    
    // Menampilkan informasi Manager, termasuk gaji akhir
    public void tampilkanInfo() {
        System.out.println(getInfoDasar() + 
                         "\nGaji Akhir: Rp" + String.format("%,.2f", getGajiAkhir()) + 
                         "\nDepartemen: " + departemen);
    }
}
