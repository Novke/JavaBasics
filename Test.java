/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Novica
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        String url = "jdbc:mysql://localhost:3306/georeader";
        String user = "root";
        String pass = "msNovke121!";
        
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            
            Statement st = conn.createStatement();
            String upit = "INSERT INTO TEST (text) VALUES ('JOCKE MAJ STO REEEEE')";
            st.execute(upit);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
}
