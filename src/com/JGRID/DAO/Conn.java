package com.JGRID.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    
    public static Connection getConnection() throws Exception {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/jgrid";
            String user = "root";
            String clave = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, clave);
            System.out.println("connecting.......");
        } catch (Exception e) {
            System.out.println("SQLError: " + e.getMessage());
            e.printStackTrace();
        }
        return con;
    }   
}
