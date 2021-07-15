/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author ivan.c.contreras
 */
public class Inicio {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
                
         int opcion=0;
       
       do{
            System.out.println("-----------------");
            System.out.println(" Aplicacion de mensajes");
            System.out.println(" 1. crear mensaje");
            System.out.println(" 2. listar mensajes");
            System.out.println(" 3. eliminar mensaje");
            System.out.println(" 4. editar mensaje");
            System.out.println(" 5. salir");
            //leemos la opcion del usuario
            opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
                    MensajesServicie.crearMensaje();
                    break;
                case 2:
                    MensajesServicie.listarMensajes();
                    break;
                case 3:
                    MensajesServicie.borrarMensaje();
                    break;
                case 4:
                    MensajesServicie.editarMensaje();
                    break;
                default:
                    break;
            }
           
       }while(opcion != 5);
        
        
       /* Conexion conexion = new Conexion();
        
        try (Connection cnx = conexion.get_connection()) {
            
        } catch (SQLException e) {
            System.out.println(e);
        }*/
        
    }
    
}
