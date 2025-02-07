/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBConnection {
    //C:\Program Files\Java\jre1.8.0_351\lib\ext
    final static String jdbc_driver="com.mysql.jdbc.Driver";
    final static String db_url="jdbc:mysql://localhost:3306/student";
            final static String user="root";
            final static String pass="";
    
    public static Connection connection(){
        try{
            Class.forName(jdbc_driver);
            Connection con =DriverManager.getConnection(db_url,user,pass);
            return con;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
