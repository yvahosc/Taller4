/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.CoachStaff;
import Classes.Players;

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
public class AnotherMainClass {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización de los objetos 
     * pertenecientes a la selección nacional de futbol, jugadores y cuerpo 
     * técnico y sus atributos, llamando a los método main que se encuentran
     * en cada una de las clases (jugadores y cuerpo técnico).
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
                + "otra clase principal.\n");
        
        Players.main(args);
        CoachStaff.main(args); 
    }  
}
