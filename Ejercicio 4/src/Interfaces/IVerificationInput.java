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
     * @return el método retorna el parametro dado convertido a tipo entero si 
     * es posible, de no ser posible retorna el numero cero.
     *      
     * @since [1.0.0]
     */
    public static int consoleInputVerificationNumber(String input){
        try{
            int value;
            value = Integer.parseInt(input);
            if (value <= 0){
                throw new IllegalArgumentException("Ingrese un numero entero "
                        + "mayor a cero.\n");
            } else{
                return value;
            }  
        }
        catch (NumberFormatException e){
            System.out.println("Ingrese un numero entero válido. \n");
            return 0;
        }
        catch (IllegalArgumentException exp){
            System.out.println(exp.getMessage());
            return 0;
        }
    }
    
    /**
     * [El objetivo principal de este método es evaluar que el argumento no sea
     * un string vacío o inválido, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean de tipo string.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar.
     * 
     * @return el método retorna el parametro dado si no está vacío o no es
     * inválido, de lo contrario retorna null.
     *      
     * @since [1.0.0]
     */
    public static String consoleInputVerificationString(String input){
        try{
            if ("".equals(input) || " ".equals(input)){
                throw new IllegalArgumentException("Ingrese un texto válido no"
                        + " vacío, por favor. \n");
            } else{
                return input;
            }  
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        catch (Throwable exp){
            System.out.println("Ingrese un texto válido, por favor. \n");
            return null;
        }
    }
    
    /**
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo LocalDate (fecha), el método se utilizará para 
     * validar los datos pasados por el usuario en los casos en los que se 
     * requiera que sean fechas.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es una fecha.
     * 
     * @return el método retorna el parametro dado convertido a tipo LocalDate
     * si es posible, de no ser posible retorna null.
     *      
     * @since [1.0.0]
     */
    public static LocalDate consoleInputVerificationDate(String input){
        try{
            LocalDate date = LocalDate.parse(input);
            if (date.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("Ingrese una fecha válida, "
                        + "no una fecha que no ha pasado.\n");
            } else{
                return date;
            } 
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        catch (Throwable exp){
            System.out.println("Ingrese una fecha válida, la estructura debe "
                    + "ser: yyyy-mm-dd. \n");
            return null;
        }
    }
    
    /**
     * [El objetivo principal de este método es evaluar la elección por parte
     * del ususario sobre si el vehículo cuenta con tripulación o no.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar.
     * 
     * @return el método retorna uno si la tripulación va abordo del vehículo
     * y cero si no.
     *      
     * @since [1.0.0]
     */
    public static int consoleInputVerificationcrewOnBoard(String input){
        try{
            int value;
            value = Integer.parseInt(input);
            if (value != 1 && value != 2){
                throw new IllegalArgumentException("Ingrese un numero entero "
                        + "válido, uno o dos. \n");
            } else if (value == 1){
                return 1;
            } else{
                return 0;
            }
        }
        catch (NumberFormatException e){
            System.out.println("Ingrese un numero válido.\n");
            return -1;
        }
        catch (IllegalArgumentException exp){
            
            System.out.println(exp.getMessage());
            return -1;
        }
    }
}
