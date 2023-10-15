/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demos;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author oussama
 */
public class Test {
    public void save (Site s){
    String user = "root";
    String password = "";
    String url = "jdbc:mysql;//localhost/exemple";
    Connection cn = null;
    Statement st = null;
    try {
    Class.forName("com.mysql.jdbc.Driver");
    cn = DriverManager.getConnection(url, user, password);
    st = cn.createStatement();
    String req = "insert into Site values (null, '" +s.getNom()+"')";
    st.executeUpdate(req);
            
            } catch(SQLException e){
                System.out.println("erreur en sql " +e.getMessage());              
            } catch(ClassNotFoundException e){
                System.out.println("impossible de charger les drivers "+e.getMessage());
            } finally {
        try {
            st.close();
            cn.close();
        } catch (SQLException e){
            System.out.println("impossible de liberer les resources" +e.getMessage());
        }
    }
        }
        public static void load(){
            String user = "root";
            String password = "";
            String url ="jdbc:mysql://localhost/exemple";
            Connection cn = null;
            Statement st = null ;
            ResultSet rs = null;
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                cn = DriverManager.getConnection(url, user, password);
                st = cn.createStatement();
                String req = "select *from Site";
                rs= st.executeQuery(req);
                while (rs.next()){
                    int id = rs.getInt(1);
                    String nom =rs.getString(2);
                    System.out.println("Nom : "+ id +" nom = " + nom + " ");
                    
                }
            }catch(SQLException e){
                System.out.println(" erreur en sql "+e.getMessage());
            }catch(ClassNotFoundException e){
                System.out.println("impossible de charger le driver "+e.getMessage());
            }finally{
                try{
                    st.close();
                    cn.close();
                    rs.close();
                }catch(SQLException e){
                    System.out.println("erreur dans sql " +e.getMessage());
                }
            }
        }
    
    
}
