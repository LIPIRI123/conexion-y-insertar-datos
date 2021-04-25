/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author lipiri
 */
public class connec {
   Connection con=null;
   String driver="com.mysql.jdbc.Driver";
   String url="jdbc:mysql://localhost:3306/biblioteca";
   String user="root";

   public Connection conectar(){
       try{
         Class.forName(driver);
         con=DriverManager.getConnection(url, user, "");
         if(con!=null){
             System.out.println("Conexion establecida");
         }else{
             System.out.println("Conexion no establecida");
             
         }
             
       }catch(Exception e){
           
       }
       return con;
   }
}
