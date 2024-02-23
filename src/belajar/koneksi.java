/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mac
 */
public class koneksi {
     private static Connection DatabaseConnection;
    public static Connection koneksiDB() throws SQLException {
        try {
            String user="postgres";
            String pass="password";
            String driver="org.postgresql.Driver";
            String url="jdbc:postgresql://localhost/example";
            Class.forName(driver);
            DatabaseConnection=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak ada koneksi","Error",
            JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
         return DatabaseConnection;
    }
}
