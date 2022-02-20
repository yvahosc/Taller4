/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Classes.Players;
import Classes.CoachStaff;
import java.util.ArrayList;

/**
 * [ Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar la visualización de los objetos pertenecientes a la selección
 * nacional de futbol, jugadores y cuerpo técnico y sus atributos.
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-19
 *
 * 1.0.0,2022-02-19, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public class Ejercicio2 {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización de los objetos 
     * pertenecientes a la selección nacional de futbol, jugadores y cuerpo 
     * técnico y sus atributos, directamente llamando a los métodos que los 
     * crean y los listan.
     * ]
     *
     * @param args
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Imprimiendo desde metodo main en clase "
                + "Ejercicio2.\n");
        
        ArrayList<CoachStaff> coachStaffList = 
                CoachStaff.CreationOfCoachStaffList();
        for (CoachStaff a: coachStaffList){
            System.out.println(a.toString());
        }
        
        ArrayList<Players> playersList = Players.CreationOfPlayersList();
        for (Players a: playersList){
            System.out.println(a.toString());
        }   
    }  
}
