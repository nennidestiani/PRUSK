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
public class Koneksi {
    private Connection connect;
    private String jdbcUrl = "jdbc:mysql://localhost:3306/ko";
    private String username = "root";
    private String password ="";
    
    public Connection getKoneksi(){
        if (connect == null) {
            try{
                connect = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Koneksi Berhasil");
            } catch ( SQLException ex) {
                System.out.println("Koneksi gagal: " + ex);
            }
        } 
      return connect;
}
    
    public static void main (String[] args) {
        Koneksi k = new Koneksi();
        Connection c = k.getKoneksi();
    }
}
