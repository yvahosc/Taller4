/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.Vehicle;
import Interfaces.IVehicles;
import Interfaces.IVerificationInput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá realizar el proceso de registro de vehículos a un ferry.
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
public class Ejercicio4 {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar el proceso de registro de maximo 
     * 10 vehículos a un ferry a parti de la interacción con el ususario.
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
        System.out.println("Bienvenido al servicio de Ferry.\n");
        Scanner keyboard = new Scanner(System.in);
        
        
        boolean flag = true;
        int option;
        String input;
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        
        while (flag){
            System.out.println("¿Qué desea hacer? \n 1. Ver los vehículos que "
                    + "han abordado. \n 2. Registrar un vehículo para el "
                    + "abordaje. \n 3. Salir del registro de abordaje.");
            input = keyboard.nextLine();
            option = IVerificationInput.consoleInputVerificationNumber(input);
            
            switch (option) {
                case 1:
                    if (vehicleList.isEmpty()){
                        System.out.println("Aún no hay vehículos registrados "
                                + "para el abordaje.\n");
                    } else {
                        System.out.println("Vehículos registrados "
                                + "para el abordaje:\n");
                        IVehicles.ToShowVehicles(vehicleList);
                    }
                break;
                case 2:
                    
                    if (vehicleList.size() == 10){
                        System.out.println("no es posible registrar más "
                                + "vehículos, capacidad de abordaje del ferry "
                                + "(10 vehículos) completa. \n");
                    } else{
                        int numberOfPassengers = 0, numberOfWheels = 0, 
                                crewOnBoard = -1;
                        String meansOfTransport = null;
                        LocalDate registrationDate = null;
                        boolean crew;
                        System.out.println("Vehículo " + 
                                (vehicleList.size() + 1));

                        while (numberOfPassengers == 0){

                            System.out.println(
                                    "Ingrese el numero de pasajeros:");
                            input = keyboard.nextLine();
                            numberOfPassengers = 
                                    IVerificationInput.
                                            consoleInputVerificationNumber(
                                            input);
                        }

                        while (numberOfWheels == 0){
                            System.out.println("Ingrese el numero de ruedas:");
                            input = keyboard.nextLine();
                            numberOfWheels = 
                                    IVerificationInput.
                                            consoleInputVerificationNumber(
                                            input);
                        }

                        while (meansOfTransport == null){
                            System.out.println("Ingrese el medio de transporte "
                                    + "en el que se desplaza:");
                            input = keyboard.nextLine();
                            meansOfTransport = 
                                    IVerificationInput.
                                            consoleInputVerificationString(
                                            input);
                        }

                        while (registrationDate == null){
                            System.out.println("Ingrese la fecha de matrícula:"
                                    + " la estructura debe ser: yyyy-mm-dd.");
                            input = keyboard.nextLine();
                            registrationDate = 
                                    IVerificationInput.
                                            consoleInputVerificationDate(input);
                        }

                        while (crewOnBoard == -1){
                            System.out.println("¿El vehículo cuenta con "
                                    + "tripulación abordo? \n 1. Sí. \n 2. No.");
                            input = keyboard.nextLine();
                            crewOnBoard = 
                                    IVerificationInput.
                                            consoleInputVerificationcrewOnBoard(
                                                    input);
                        }
                        crew = crewOnBoard == 1;

                        Vehicle vehicle = new Vehicle(
                                numberOfPassengers, crew, numberOfWheels, 
                                registrationDate, meansOfTransport, 
                                vehicleList.size() + 1);

                        vehicleList = IVehicles.CreationOfVehiclesList(
                                vehicleList, vehicle);
                        IVehicles.ToShowVehicles(vehicleList);
                        System.out.println("El vehículos ha sido agregados "
                                + "exitosamente al abordaje.\n");
                    }
                break;
                case 3:
                    flag = false;
                    System.out.println("Cierre de registro de abordaje.");
                break;
                
                default:
                    System.out.println(
                            "La opción seleccionada no existe, por favor,"
                                    + " digite una válida. \n"); 
            }
        }
    }  
}
