/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Aditya Maulana
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Berhasil Koneksi");
    }catch (ClassNotFoundException ex) {
        System.out.println("Gagal Koneksi");            
    }
    String url = "jdbc:mysql://localhost/tabungan";
    try {
        koneksi = DriverManager.getConnection(url,"root","root");
        System.out.println("Berhasil Koneksi Ke Database");
    } catch (SQLException ex) {
            System.out.println("Gagal Koneksi Ke Database");
    }
    return koneksi;
    }
    
}
