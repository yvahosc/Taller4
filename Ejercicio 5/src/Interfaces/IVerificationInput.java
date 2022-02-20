/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.time.LocalDate;
import java.util.Scanner;

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
                        + "mayor a cero.");
            } else{
                return value;
            }  
        }
        catch (NumberFormatException e){
            System.out.println("Ingrese un numero entero válido.");
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
                        + " vacío, por favor.");
            } else{
                return input;
            }  
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        catch (Throwable exp){
            System.out.println("Ingrese un texto válido, por favor.");
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
                throw new IllegalArgumentException("Ingrese una fecha válida,"
                        + " no una fecha que no ha pasado.");
            } else{
                return date;
            } 
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
        catch (Throwable exp){
            System.out.println("Ingrese una fecha válida.");
            return null;
        }
    }
    
    /**
     * [El objetivo principal de este método es evaluar la elección por parte
     * del usuario sobre si el vehículo tiene tres o cinco puertas y 
     * convertirla a tipo de dato booleano.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar.
     * 
     * @return el método retorna uno si el vehículo tiene tres puertas y 
     * cero si tiene cinco.
     *      
     * @since [1.0.0]
     */
    public static int consoleInputVerificationBoolean (String input){
        try{
            int value;
            value = Integer.parseInt(input);
            if (value != 1 && value != 2){
                throw new IllegalArgumentException("Ingrese un numero entero "
                        + "válido, uno o dos.");
            } else if (value == 1){
                return 1;
            } else{
                return 0;
            }
        }
        catch (NumberFormatException e){
            System.out.println("Ingrese un numero válido.");
            return -1;
        }
        catch (IllegalArgumentException exp){
            System.out.println(exp.getMessage());
            return -1;
        }
    }
    
    /**
     * [El objetivo principal de este método es evaluar si el argumento puede
     * ser convertido a tipo float, el método se utilizará para validar los
     * datos pasados por el usuario en los casos en los que se requiera que 
     * sean numeros con parte decimal.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param input hace referencia al parametro ingresado por el usuario que
     * se quiere validar si es un numero con parte decimal.
     * 
     * @return el método retorna el parametro dado convertido a tipo float si 
     * es posible, de no ser posible retorna el numero cero.
     *      
     * @since [1.0.0]
     */
    public static float consoleInputVerificationFloat(String input){
        try{
            float value;
            value = Float.valueOf(input);
            if (value <= 0){
                throw new IllegalArgumentException("Ingrese un numero entero"
                        + " mayor a cero.");
            } else{
                return value;
            }  
        }
        catch (NumberFormatException e){
            System.out.println("Ingrese un numero entero válido.");
            return 0;
        }
        catch (IllegalArgumentException exp){
            System.out.println(exp.getMessage());
            return 0;
        }
    }
    
    /**
     * [El objetivo principal de este método es pedir al usuario el ingreso
     * de la información correspondiente a la fecha de registro del vehículo.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return el método retorna una fecha, un valor del tipo LocalDate.
     *      
     * @since [1.0.0]
     */
    public static LocalDate dateInput() {
        LocalDate registrationDate = null;
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        while (registrationDate == null){
            System.out.println("Ingrese la fecha de matrícula, la estructura "
                    + "debe ser: yyyy-mm-dd.:");
            input = keyboard.nextLine();
            registrationDate = 
                    IVerificationInput.consoleInputVerificationDate(input);
        }
        return registrationDate;
    }
    
    /**
     * [El objetivo principal de este método es pedir al usuario el ingreso
     * de la información correspondiente a si el vehículo cuenta o no con 
     * tripulación abordo.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return el método retorna un valor de tipo booleano en función de si el 
     * vehículo cuenta o no con tripulación abordo.
     *      
     * @since [1.0.0]
     */
    public static boolean crewOnBoardInput() {
        int crewOnBoard = -1;
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        while (crewOnBoard == -1){
            System.out.println("¿El vehículo cuenta con "
                    + "tripulación abordo? \n 1. Sí. \n 2. No.");
            input = keyboard.nextLine();
            crewOnBoard = 
                    IVerificationInput.consoleInputVerificationBoolean(input);
        }
        boolean crew = (crewOnBoard == 1);
        return crew;
    }
    
    /**
     * [El objetivo principal de este método es pedir al usuario el ingreso
     * de la información correspondiente al numero de pasajeros con los que
     * cuenta el vehículo.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return el método retorna un valor de tipo entero que hace referencia
     * a la cantidad de pasajeros con los que cuenta el vehículo.
     *      
     * @since [1.0.0]
     */
    public static int numberOfPassengersInput() {
        int numberOfPassengers = 0;
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        while (numberOfPassengers == 0){

            System.out.println("Ingrese el numero de pasajeros:");
            input = keyboard.nextLine();
            numberOfPassengers = 
                    IVerificationInput.consoleInputVerificationNumber(input);
        }
        return numberOfPassengers;
    }    
}
