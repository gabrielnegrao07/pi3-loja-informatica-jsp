/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author IDCOM
 */
public class Database {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/Informatica";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                //Loading The Driver Class
                Class.forName(DRIVER);

                //Getting the connection Object
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        return connection;
    }
}
