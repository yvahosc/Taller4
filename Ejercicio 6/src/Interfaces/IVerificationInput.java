/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.time.LocalDate;

/**
 * [ Esta interfaz tiene como objetivo la verificación de los datos ingresados
 * por el usuario en su interacción con la aplicación, dependiendo de que
 * tipo de dato se requiera en cada caso.
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-18
 *
 * 1.0.0,2022-02-18, La interfaz corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings]
 *
 * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public interface IVerificationInput {
    
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
     * @return el método retorna un dato booleano en función de si el parametro
     * ingresado puede convertirse o no a numero entero.
     *      
     * @since [1.0.0]
     */
    public static boolean consoleInputVerificationNumber(String input){
        try{
            int value;
            value = Integer.parseInt(input);
            return true;
             
        }
        catch (Throwable exp){
            System.out.println("Ingrese un numero válido\n");
            return false;
        }
    }
}
