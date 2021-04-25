/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maysqlconexxion;

import conexion.tabla_estudiante;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author lipiri
 */
public class ingresar_dato_estu {
    public static void main(String[]org){
        Scanner l=new Scanner(System.in);
        tabla_estudiante es=new tabla_estudiante();
        System.out.println("ingrese su CI");
        int ci=l.nextInt();
        System.out.println("Ingrese su nombre");
        String nombre=l.next();
        System.out.println("Ingrese su apellido Paterno");
           String app=l.next();
        int c=5;
           c=es.ingresar_datos(ci,nombre,app);
        if(c==1){
           System.out.println("Correcto se guardo");
            
        }else if(c==0){
           System.out.println("Error al guardar");
        
        }
    }
}
