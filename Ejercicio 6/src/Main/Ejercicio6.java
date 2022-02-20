/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Main;

import Interfaces.IVectorCreation;
import Interfaces.IVerificationInput;
import java.util.Scanner;
import java.util.Vector;



/**
 * [Esta clase tiene como objetivo iniciar la aplicación en la cual se podrá 
 * realizar el proceso de registro de objetos de tipo numero y la creación de 
 * un vector con estos objetos.
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
public class Ejercicio6 {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar el proceso de registro de objetos 
     * de tipo numero y la creación de un vector con estos objetos a partir 
     * de la interacción con el usuario y posteriormente imprimirlos cuando 
     * los dos ultimos objetos de tipo numero del vector sean iguales.
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
        Vector numberVector = new Vector();
        System.out.println("Bienvenido\n");
        Scanner keyboard = new Scanner(System.in);
        int number;
        boolean flag = true;
        String input;
        boolean verificationNumber;
        
        
        while (flag){
            System.out.println("Agrega un numero entero al vector");

            input = keyboard.nextLine();
            verificationNumber = 
                    IVerificationInput.consoleInputVerificationNumber(input);
            if (verificationNumber) {
                number = Integer.parseInt(input);
                numberVector =
                    IVectorCreation.CreationOfNumberVector(numberVector, number);
                
                if (numberVector.size() > 1){
                    if (numberVector.lastElement().equals(
                        numberVector.elementAt(numberVector.size() - 2)))
                    {
                        System.out.println("Los componentes del vector "
                                + "agregados hasta ingresar dos veces "
                                + "el mismo numero son:\n");
                        IVectorCreation.ToShowNumbers(numberVector);
                        System.out.println(
                                "Vector: " + numberVector.toString());
                        flag = false;
                    }
                }
            }   
        }
    }   
}
