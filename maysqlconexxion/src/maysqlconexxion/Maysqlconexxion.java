/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maysqlconexxion;

import conexion.connec;
import java.sql.Connection;
/**
 *
 * @author lipiri
 */
public class Maysqlconexxion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Connection c;
        connec co=new connec();
        c=co.conectar();
    }
    
}
