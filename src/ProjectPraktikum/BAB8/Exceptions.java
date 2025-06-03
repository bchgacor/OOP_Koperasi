/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB8;

/**
 *
 * @author VivoBook
 */
import java.util.Scanner;

public class Exceptions{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlKaki;
        System.out.println("Berapa Jumlah kaki kerbau ?");
        try{
            System.out.print("Jumlah Bebek Yang Ingin Dibawa: ");
            jmlKaki = input.nextInt(); //Mendapatkan Input Dari User
            if(jmlKaki != 4){
                //Jika jumlah kaki kerbau lebih atau kurang dari 4, maka akan terjad error
                throw new Exception("Terjadi Kesalahan  Nih!");
            }else{
                System.out.println("Benar Jumlah kaki kerbau 4");
            }
        }catch(Exception e){
            //Menampilkan Pesan Kesalahan
            e.printStackTrace();
        }
    }
}

