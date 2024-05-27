/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpmod13;

import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LOQ
 */
public class Connection {
     public static java.sql.Connection conn;
    
    
    public static java.sql.Connection getConnection(){
        
        if(conn == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/tp_mhs"; 
                String user = "root";
                String pass = "";
                conn = (java.sql.Connection) DriverManager.getConnection(url,user,pass);
            } catch(Exception e){
                Logger.getLogger(Connection.class.getName()).log(Level.SEVERE,null,e);
            }
        }
        return conn;
    }
}
