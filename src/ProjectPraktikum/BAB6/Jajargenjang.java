/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPraktikum.BAB6;

/**
 *
 * @author VivoBook
 */
public class Jajargenjang extends BangunDatarSegiEmpat{

    @Override
    double luas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    double keliling() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public class JajajrGenjang extends BangunDatarSegiEmpat{
    double a,t,b;
    public JajajrGenjang(){
        this.a = 8;
        this.t = 3;
        this.b = 9;
    }
    @Override
    double luas() {
        return (a*t);
    }

    @Override
    double keliling() {
        return (2*(a+b));
    } 
}
}
