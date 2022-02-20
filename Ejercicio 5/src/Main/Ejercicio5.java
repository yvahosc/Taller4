/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.Vehicle;
import Classes.Bicycle;
import Classes.Boat;
import Classes.Car;
import Classes.Motorcycle;
import Classes.Truck;
import Interfaces.IVehicles;
import Interfaces.IVerificationInput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Esta clase tiene como objetivo iniciar la aplicación en la cual se podrá 
 * realizar el proceso de registro de varios tipos de vehículos a un ferry.
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
public class Ejercicio5 {

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá realizar el proceso de registro de maximo 
     * 10 vehículos, que pueden ser de varios tipos, a un ferry a partir de la 
     * interacción con el ususario.
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
                    boolean flag2 = true;
                    while (flag2){
                        if (vehicleList.size() == 10){
                            System.out.println("no es posible registrar más "
                                    + "vehículos, capacidad de abordaje del "
                                    + "ferry (10 vehículos) completa. \n");
                            flag2 = false;
                        } else{
                            int option1 = 0;
                            int numberOfWheels = 0;
                            int numberOfPassengers;
                            boolean crew;
                            LocalDate registrationDate;

                            while (option1 == 0){
                                System.out.println("¿Qué tipo de vehículo desea"
                                    + " registrar? \n 1. Bicicleta. \n 2. "
                                    + "Motocicleta.\n 3. Carro. \n 4. Camión. "
                                    + "\n 5. Lancha.\n 6. Salir.");

                                input = keyboard.nextLine();
                                option1 = 
                                        IVerificationInput.
                                                consoleInputVerificationNumber(
                                                        input);
                            }

                            switch (option1) {
                                case 1:
                                    System.out.println("Vehículo " + 
                                    (vehicleList.size() + 1));

                                    crew = IVerificationInput.crewOnBoardInput();
                                    registrationDate = 
                                            IVerificationInput.dateInput();
                                    Bicycle bicycle = new Bicycle("Bicicleta", 
                                            false, 1, crew, 2, registrationDate, 
                                            "Tierra", (vehicleList.size() + 1));

                                    vehicleList = 
                                            IVehicles.CreationOfVehiclesList(
                                            vehicleList, bicycle);
                                    IVehicles.ToShowVehicles(vehicleList);
                                    System.out.println("El vehículo ha sido "
                                            + "agregado exitosamente al "
                                            + "abordaje.\n");

                                break;
                                case 2:


                                    System.out.println("Vehículo " + 
                                    (vehicleList.size() + 1));

                                    numberOfPassengers = 
                                            IVerificationInput.
                                                    numberOfPassengersInput();
                                    crew = IVerificationInput.crewOnBoardInput();
                                    registrationDate = 
                                            IVerificationInput.dateInput();
                                    Motorcycle motorcycle = new Motorcycle(
                                            "Motocicleta", true, 
                                            numberOfPassengers, crew, 2, 
                                            registrationDate, "Tierra", 
                                            (vehicleList.size() + 1));

                                    vehicleList = 
                                            IVehicles.CreationOfVehiclesList(
                                            vehicleList, motorcycle);
                                    IVehicles.ToShowVehicles(vehicleList);
                                    System.out.println("El vehículo ha sido "
                                            + "agregado exitosamente al "
                                            + "abordaje.\n");
                                break;
                                case 3:
                                    System.out.println("Vehículo " + 
                                    (vehicleList.size() + 1));

                                    boolean threeDoors;
                                    boolean fiveDoors;
                                    int doors = -1;

                                    while (doors == -1){
                                        System.out.println("¿Cual es la "
                                                + "cantidad de puertas con las"
                                                + " que cuenta el carro? \n"
                                                + " 1. Tres \n 2. Cinco.");
                                        input = keyboard.nextLine();
                                        doors = IVerificationInput.
                                                consoleInputVerificationBoolean(
                                                        input);
                                    }
                                    threeDoors = (doors == 1);
                                    fiveDoors = !threeDoors;

                                    numberOfPassengers = 
                                            IVerificationInput.
                                                    numberOfPassengersInput();
                                    crew = IVerificationInput.crewOnBoardInput();
                                    registrationDate = 
                                            IVerificationInput.dateInput();
                                    Car car = new Car(
                                            "Carro", threeDoors, fiveDoors, 
                                            numberOfPassengers, crew, 4, 
                                            registrationDate, "Tierra", 
                                            (vehicleList.size() + 1));

                                    vehicleList = 
                                            IVehicles.CreationOfVehiclesList(
                                            vehicleList, car);
                                    IVehicles.ToShowVehicles(vehicleList);
                                    System.out.println("El vehículo ha sido "
                                            + "agregado exitosamente al "
                                            + "abordaje.\n");
                                break;
                                case 4:
                                    float height = 0;
                                    System.out.println("Vehículo " + 
                                    (vehicleList.size() + 1));

                                    while (height == 0){
                                        System.out.println("Ingrese la altura "
                                                + "del camión:");
                                        input = keyboard.nextLine();
                                        height = IVerificationInput.
                                                consoleInputVerificationFloat(
                                                        input);   
                                    }

                                    int load = -1;

                                    while (load == -1){
                                        System.out.println("¿El camión lleva "
                                                + "algún tipo de carga? \n "
                                                + "1. Sí \n 2. No.");
                                        input = keyboard.nextLine();
                                        load = IVerificationInput.
                                                consoleInputVerificationBoolean(
                                                        input);
                                    }
                                    boolean shipment = (load == 1);

                                    while (numberOfWheels == 0){
                                        System.out.println("Ingrese el numero "
                                                + "de ruedas:");
                                        input = keyboard.nextLine();
                                        numberOfWheels = IVerificationInput.
                                                consoleInputVerificationNumber(
                                                        input);
                                    }

                                    numberOfPassengers = 
                                            IVerificationInput.
                                                    numberOfPassengersInput();
                                    crew = IVerificationInput.crewOnBoardInput();
                                    registrationDate = 
                                            IVerificationInput.dateInput();

                                    Truck truck = new Truck(
                                            "Camión", height, shipment, 
                                            numberOfPassengers, crew, 
                                            numberOfWheels, registrationDate, 
                                            "Tierra",(vehicleList.size() + 1));

                                    vehicleList = 
                                            IVehicles.CreationOfVehiclesList(
                                            vehicleList, truck);
                                    IVehicles.ToShowVehicles(vehicleList);
                                    System.out.println("El vehículo ha sido "
                                            + "agregado exitosamente al "
                                            + "abordaje.\n");

                                break;
                                case 5:
                                    System.out.println("Vehículo " + 
                                    (vehicleList.size() + 1));

                                    int numberOfEngines = 0;
                                    while (numberOfEngines == 0){
                                        System.out.println("Ingrese el numero "
                                                + "de motores de la lancha:");
                                        input = keyboard.nextLine();
                                        numberOfEngines = IVerificationInput.
                                                consoleInputVerificationNumber(
                                                        input);
                                    }

                                    numberOfPassengers = 
                                            IVerificationInput.
                                                    numberOfPassengersInput();
                                    crew = IVerificationInput.crewOnBoardInput();
                                    registrationDate =
                                            IVerificationInput.dateInput();

                                    Boat boat = new Boat(
                                            "Lancha", numberOfEngines, 
                                            numberOfPassengers, crew, 0, 
                                            registrationDate, "Agua", 
                                            (vehicleList.size() + 1));

                                    vehicleList = 
                                            IVehicles.CreationOfVehiclesList(
                                            vehicleList, boat);
                                    IVehicles.ToShowVehicles(vehicleList);
                                    System.out.println("El vehículo ha sido "
                                            + "agregado exitosamente al "
                                            + "abordaje.\n");   
                                break;
                                case 6:
                                    flag2 = false;
                                    System.out.println("Cierre de almacenaje "
                                            + "en registro de abordaje.");                                
                                break;
                                default:
                                    option = 2;
                                    System.out.println("La opción seleccionada"
                                            + " no existe, por favor, digite "
                                            + "una válida. \n");      
                            }
                        }
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

