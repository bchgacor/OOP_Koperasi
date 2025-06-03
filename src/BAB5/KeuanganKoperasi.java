/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB5; // Nama package



/**
 * Program Sistem Keuangan Koperasi
 * Digunakan untuk mengelola transaksi keuangan koperasi seperti setor, tarik, dan cek saldo.
 * @author VivoBook
 */
public class KeuanganKoperasi {
    protected String namaKoperasi;
    private double totalSaldo;
    private double sukuBunga;
    protected double biayaAdmin;

    //method untuk menyetor uang ke koperasi
    public void setor(double jumlah) {
        if (jumlah > 0) {
            totalSaldo += jumlah;
            System.out.println("Setoran sebesar Rp" + jumlah + " berhasil.");
            catatTransaksi("Setor");
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0.");
        }
    }

    //Overloading setor: dengan keterangan tambahan
    public void setor(double jumlah, String keterangan) {
        if (jumlah > 0) {
            totalSaldo += jumlah;
            System.out.println("Setoran sebesar Rp" + jumlah + " berhasil. Keterangan: " + keterangan);
            catatTransaksi("Setor - " + keterangan);
        } else {
            System.out.println("Jumlah setoran harus lebih dari 0.");
        }
    }

    //method untuk menarik uang dari koperasi
    public void tarik(double jumlah) {
        if (jumlah > 0 && totalSaldo >= (jumlah + biayaAdmin)) {
            totalSaldo -= (jumlah + biayaAdmin);
            System.out.println("Penarikan sebesar Rp" + jumlah + " berhasil. Biaya admin: Rp" + biayaAdmin);
            catatTransaksi("Tarik");
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }

    //Overloading tarik: dengan keterangan tambahan
    public void tarik(double jumlah, String keterangan) {
        if (jumlah > 0 && totalSaldo >= (jumlah + biayaAdmin)) {
            totalSaldo -= (jumlah + biayaAdmin);
            System.out.println("Penarikan sebesar Rp" + jumlah + " berhasil. Biaya admin: Rp" + biayaAdmin + ". Keterangan: " + keterangan);
            catatTransaksi("Tarik - " + keterangan);
        } else {
            System.out.println("Saldo tidak mencukupi atau jumlah tidak valid.");
        }
    }

    //method untuk menghitung bunga dan menambahkannya ke saldo
    public void hitungBunga() {
        double bunga = (totalSaldo * sukuBunga) / 100;
        totalSaldo += bunga;
        System.out.println("Bunga sebesar Rp" + bunga + " telah ditambahkan ke saldo.");
    }

    //method untuk menampilkan saldo saat ini
    public void cekSaldo() {
        System.out.println("Saldo saat ini di koperasi '" + namaKoperasi + "': Rp" + totalSaldo);
    }

    //method internal untuk mencatat jenis transaksi
    protected void catatTransaksi(String jenis) {
        System.out.println("Transaksi: " + jenis + " | Saldo saat ini: Rp" + totalSaldo);
    }

    //Getter untuk totalSaldo
    public double getTotalSaldo() {
        return this.totalSaldo;
    }

    //Setter untuk totalSaldo
    public void setTotalSaldo(double totalSaldo) {
        this.totalSaldo = totalSaldo;
    }

    //Setter untuk sukuBunga
    public void setSukuBunga(double sukuBunga) {
        this.sukuBunga = sukuBunga;
    }

    //Setter untuk biayaAdmin
    public void setBiayaAdmin(double biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }
    
    //Getter untuk biayaAdmin
    public double getBiayaAdmin() {
        return this.biayaAdmin;
    }


    //Getter untuk sukuBunga
    public double getSukuBunga() {
        return this.sukuBunga;
    }

    //method untuk menampilkan informasi koperasi
    public String tampil() {
        return "Nama Koperasi  : " + namaKoperasi + "\n" +
               "Total Saldo    : Rp." + totalSaldo + "\n" +
               "Suku Bunga     : " + sukuBunga + "%\n" +
               "Biaya Admin    : Rp." + biayaAdmin + "\n";
    }
}