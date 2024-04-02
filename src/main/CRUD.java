/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class CRUD {
    private Double angka1, hasil;
    private String Operator1, Operator2;
    private PreparedStatement psmt;
    private Connection Koneksi;
    private String query;

    //menyambungkan ke database
    public CRUD() {
        Koneksi conn = new Koneksi();
        Koneksi = conn.getKoneksi();
    }

    //membuat setter dan getter
    public Double getAngka1() {
        return angka1;
    }

    public void setAngka1(Double angka1) {
        this.angka1 = angka1;
    }

    public Double getHasil() {
        return hasil;
    }

    public void setHasil(Double hasil) {
        this.hasil = hasil;
    }

    public String getOperator1() {
        return Operator1;
    }

    public void setOperator1(String Operator1) {
        this.Operator1 = Operator1;
    }

    public String getOperator2() {
        return Operator2;
    }

    public void setOperator2(String Operator2) {
        this.Operator2 = Operator2;
    }

    //membuat fungsi insert data
    public void simpanData(Double angka1, String operator1, String operator2, Double hasil) {
        query = "insert into tb (angka1, Operator1, Operator2, hasil) values (?, ?, ?, ?)";
        try {
            psmt = Koneksi.prepareStatement(query);
            psmt.setDouble(1, angka1);
            psmt.setString(2, operator1);
            psmt.setString(3, operator2);
            psmt.setDouble(4, hasil);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    
}
    
}
