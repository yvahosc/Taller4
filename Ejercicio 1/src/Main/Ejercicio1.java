/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.elementsOfThePlanetarySystem;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [ Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar la visualización de los objetos del sistema planetario 
 * y poder calcular la atracción gravitatoria entre dos de ellos elegidos 
 * por el usuario.
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-18
 *
 * 1.0.0,2022-02-18, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public class Ejercicio1 {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar la visualización de los objetos 
     * del sistema planetario  y poder calcular la atracción gravitatoria 
     * entre dos de ellos elegidos por medio de interacciones con el usuario.
     * ]
     *
     * @param args
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        boolean flag = true;
        ArrayList<elementsOfThePlanetarySystem> objectsPlanetarySystem;
        objectsPlanetarySystem = creationOfElementsOfThePlanetarySystem();
        while (flag){
            System.out.println("Hola, ¿Qué desea hacer? \n 1. Ver todos los "
                    + "objetos" + " planetarios. \n 2. Calcular la atracción "
                    + "gravitatoria " + "entre dos cuerpos cualesquiera del "
                    + "sistema. \n 3. Salir.");
            String input = keyboard.nextLine();
            int option = consoleInputVerificationNumber(input);
            switch (option){
                case 1:
                    for (elementsOfThePlanetarySystem a: 
                            objectsPlanetarySystem){
                        System.out.println(a.toString());
                    }
                break;
                case 2:
                    System.out.println("Es necesario elegir dos objetos "
                            + "planetarios para realizar el calculo. \n ");
                    for (elementsOfThePlanetarySystem a: 
                            objectsPlanetarySystem){
                        System.out.println(a.message());
                    }
                    System.out.println("Elija el primero:");
                    
                    input = keyboard.nextLine();
                    int option1 = consoleInputVerificationNumber(input);
                    
                    System.out.println("Elija el segundo:");
                    input = keyboard.nextLine();
                    int option2 = consoleInputVerificationNumber(input);
                    
                    try{
                        elementsOfThePlanetarySystem.
                                        gravitationalAttraction(
                                objectsPlanetarySystem.get(option1 - 1), 
                                objectsPlanetarySystem.get(option2 - 1));
                                
                    } 
                    catch (Throwable e){
                        System.out.println("Ingrese solo numeros entre " + 
                                objectsPlanetarySystem.get(0).getIdentifier() 
                                + " y " + objectsPlanetarySystem.get(8)
                                        .getIdentifier() + " por favor. \n");                     
                    }  
                break;
                case 3:
                    flag = false;
                    System.out.println("Aplicación cerrada.");
                break;
                
                default:
                    System.out.println(
                            "La opción seleccionada no existe, por favor,"
                                    + " digite una válida. \n");    
            }
        }   
    }
    
    /**
     * [El objetivo principal de este método es la creación de los 
     * elementos del sistema planetario por medio de la instanciación de la 
     * clase con la información de cada uno de los planetras y el sol.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return Una lista con todos los objetos instanciados creados que
     * corresponden a los elementos del sistema planetario.
     *      
     * @since [1.0.0]
     */
    public static ArrayList<elementsOfThePlanetarySystem> 
        creationOfElementsOfThePlanetarySystem() 
    {
        elementsOfThePlanetarySystem object1 = 
                new elementsOfThePlanetarySystem(
                        3.302E23, 5.430, 4879.4, 58E6, 1, "Mercurio");
        elementsOfThePlanetarySystem object2 = 
                new elementsOfThePlanetarySystem(
                        4.869E24, 5.240, 12103.6, 108E6, 2, "Venus");
        elementsOfThePlanetarySystem object3 = 
                new elementsOfThePlanetarySystem(
                        5.974E24, 5.515, 12742.0, 150E6, 3, "Planeta tierra");
        elementsOfThePlanetarySystem object4 = 
                new elementsOfThePlanetarySystem(
                        6.418E23, 3.933, 6794.4, 250E6, 4, "Marte");
        elementsOfThePlanetarySystem object5 = 
                new elementsOfThePlanetarySystem(
                        1.899E27, 1.336, 142984.0, 750E6, 5, "Jupiter");
        elementsOfThePlanetarySystem object6 = 
                new elementsOfThePlanetarySystem(
                        5.688E26, 0.690, 120536.0, 1418E6, 6, "Saturno");
        elementsOfThePlanetarySystem object7 = 
                new elementsOfThePlanetarySystem(
                        8.686E25, 1.274, 51118.0, 3000E6, 7, "Urano");
        elementsOfThePlanetarySystem object8 = 
                new elementsOfThePlanetarySystem(
                        1.024E26, 1.640, 49572.0, 4500E6, 8, "Neptuno");
        elementsOfThePlanetarySystem object9 = 
                new elementsOfThePlanetarySystem(
                        1.9891E30, 1.411, 1.39E6, 0, 9, "El sol");
        
        ArrayList<elementsOfThePlanetarySystem> objectsPlanetarySystem =
                new ArrayList<>();
        
        objectsPlanetarySystem.add(object1);
        objectsPlanetarySystem.add(object2);
        objectsPlanetarySystem.add(object3);
        objectsPlanetarySystem.add(object4);
        objectsPlanetarySystem.add(object5);
        objectsPlanetarySystem.add(object6);
        objectsPlanetarySystem.add(object7);
        objectsPlanetarySystem.add(object8);
        objectsPlanetarySystem.add(object9);
        return objectsPlanetarySystem;
    }
       
    /**
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo entero, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean numeros enteros.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es un numero entero.
     * 
     * @return el método retorna el parametro dado convertido a tipo entero si 
     * es posible, de no ser posible retorna el numero cero.
     *      
     * @since [1.0.0]
     */
    public static int consoleInputVerificationNumber(String input){
        try{
            int choice;
            choice = Integer.parseInt(input);
            return choice;
        }
        catch (Exception e){
            return 0;
        }
    }   
}
