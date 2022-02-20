/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 * [ Esta clase extiende de la clase selección nacional y tiene como objetivo
 * la creación de los objetos correspondientes a los jugadores que
 * conforman la selección nacional.
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
public class Players extends NationalTeam {

    private final String role = "Jugador.";

    /**
     * Constructor de la clase jugadores, el cual sirve para la 
     * creación de cada uno de los jugadores miembros de la selección con toda
     * su información.
     * @param name Hace referencia al nombre de una persona que hace parte de la
     * selección nacional.
     * @param age Hace referencia a la edad de una persona que hace parte de la
     * selección nacional.
     */
    public Players(String name, int age) {
        super(name, age);
    }

    public String getRole() {
        return role;
    }
    
    /**
     * [Este metodo convierte un objeto a string, en este caso un objeto jugador 
     * de la selección nacional en string.
     * ]
     *
     * @return un string que muestra la información de uno o mas objetos 
     * correspondientes a los jugadores de la selección nacional.
     * 
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Nombre: " + getName() + "\nEdad: " + getAge() + " años." + 
                "\nRol: " + getRole() + "\n";
    }
    
    /**
     * [El objetivo principal de este método es la creación de los 
     * jugadores por medio de la instanciación de la 
     * clase con la información de cada uno de los elementos.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return Una lista con todos los objetos instanciados creados que
     * corresponden a los jugadores de la selección nacional.
     *      
     * @since [1.0.0]
     */
    public static ArrayList<Players> CreationOfPlayersList(){
        Players player1 = new Players("James Rodriguez.", 30);
        Players player2 = new Players("Juan Guillermo Cuadrado.", 33);
        Players player3 = new Players("Radamel Falcao Garcia.", 36);
        Players player4 = new Players("Andres Mosquera Marmolejo.", 30);
        
        ArrayList<Players> playersList = new ArrayList<>();
        
        playersList.add(player1);
        playersList.add(player2);
        playersList.add(player3);
        playersList.add(player4);
        
        return playersList;   
    }
    
    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización de los objetos 
     * pertenecientes a la selección nacional de futbol, en este caso,
     * jugadores y sus atributos.
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
                + "jugadores.\n");
        ArrayList<Players> playersList = Players.CreationOfPlayersList();
        for (Players a: playersList){
            System.out.println(a.toString());
        } 
    }  
}
