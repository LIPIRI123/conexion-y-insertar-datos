/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author lipiri
 */
public class tabla_estudiante {
    connec conec=new connec();
    Connection cc1;
   int control=0;
    public int  ingresar_datos(int ci1,String nombre,String apellidop){
        cc1=conec.conectar();
        try{
            String sq="insert into estudiante(ci,nombre,apellido_p)values(?,?,?)";
            PreparedStatement p=cc1.prepareStatement(sq);
            p.setInt(1, ci1);
            
            p.setString(2, nombre);
            p.setString(3, apellidop);
            p.execute();
            
            control=1;
        }catch(Exception e){
            
        }
    return control;
    }
}
