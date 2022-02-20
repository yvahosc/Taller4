/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 * [ Esta clase extiende de la clase selección nacional y tiene como objetivo
 * la creación de los objetos correspondientes a los miembros del cuerpo 
 * técnico de la selección nacional.
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
public class CoachStaff extends NationalTeam{
    
    private final String role = "Miembro del cuerpo técnico.";
    
    /**
     * Constructor de la clase miembros del cuerpo técnico, el cual sirve para
     * la creación de cada uno de los miembros del cuerpo técnico de la 
     * selección con toda su información.
     * @param name Hace referencia al nombre de una persona que hace parte de la
     * selección nacional.
     * @param age Hace referencia a la edad de una persona que hace parte de la
     * selección nacional.
     */
    public CoachStaff(String name, int age) {
        super(name, age);
    }

    public String getRole() {
        return role;
    }
    
    /**
     * [Este metodo convierte un objeto a string, en este caso un objeto del 
     * tipo miembro del cuerpo técnico de la selección nacional en string.
     * ]
     *
     * @return un string que muestra la información de uno o mas objetos 
     * correspondientes a los miembros del cuerpo técnico de la selección
     * nacional.
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
     * elementos del cuerpo técnico por medio de la instanciación de la 
     * clase con la información de cada uno de los elementos.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return Una lista con todos los objetos instanciados creados que
     * corresponden al cuerpo técnico de la selección nacional.
     *      
     * @since [1.0.0]
     */
    public static ArrayList<CoachStaff> CreationOfCoachStaffList(){
        CoachStaff coachStaff1 = new CoachStaff("Reinaldo Rueda.", 64);
        CoachStaff coachStaff2 = new CoachStaff("Bernardo Redin.", 58);
        CoachStaff coachStaff3 = new CoachStaff("Néstor Lo Tartaro.", 54);
        
        ArrayList<CoachStaff> coachStaffList = new ArrayList<>();
        
        coachStaffList.add(coachStaff1);
        coachStaffList.add(coachStaff2);
        coachStaffList.add(coachStaff3);
        
        return coachStaffList;   
    }
    
    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización de los objetos 
     * pertenecientes a la selección nacional de futbol, en este caso, cuerpo 
     * técnico y sus atributos.
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
        System.out.println("Imprimiendo desde metodo main en clase cuerpo"
                + " técnico.\n");
        ArrayList<CoachStaff> coachStaffList = CoachStaff.CreationOfCoachStaffList();
        for (CoachStaff a: coachStaffList){
            System.out.println(a.toString());
        }
        
    }
}
