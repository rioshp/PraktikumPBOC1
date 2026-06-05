/**
 * File         : MySQLPersonDAO.java
 * Deskripsi    : implementasi PersonDAO untuk MySQL
 * Pembuat      : Rio Setiawan Hastanu Putra/24060124130068
 * Tanggal      : 14 Mei 2026
 */

package PersistentObject;

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getName();
        //membuat koneksi, nama db,user,password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pbo","root","rio123");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}