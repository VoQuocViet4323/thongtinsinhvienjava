/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chuong4_javaswing11;
import java.sql.*;

/**
 *
 * @author admin
 */
public class Chuong4_JavaSwing11 {
    public static Connection KetnoiCSDL() throws SQLException {
        Connection kn = DriverManager.getConnection("jdbc:mysql://localhost:3306/chuong4_javasw", "root", "");
        return kn;
    }
}
