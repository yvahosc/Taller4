/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;

/**
 * [ Esta clase tiene como objetivo definir la estructura para los objetos 
 * de tipo vehículo que se creen, sus atributos y sus metodos.
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
public class Vehicle {
    private int numberOfPassengers;
    private boolean crewOnBoard;
    private int numberOfWheels;
    private LocalDate registrationDate;
    private String meansOfTransport;
    private final int identifier;

    /**
     * Constructor de la clase vehículos para la creación de las instancias
     * de dicha clase, con todos sus atributos.
     * @param numberOfPassengers Hace referencia al numero de pasajeros con 
     * los que cuenta el vehículo que se está creando.
     * @param crewOnBoard Hace referencia a si la tripulación va abordo del
     * vehículo que se está creando.
     * @param numberOfWheels Hace referencia al numero de ruedas con 
     * los que cuenta el vehículo que se está creando.
     * @param registrationDate Hace referencia a la fecha de registro del 
     * vehículo que se está creando.
     * @param meansOfTransport Hace referencia al medio en el que se desplaza 
     * el vehículo que se está creando.
     * @param identifier Hace referencia a un numero único que identifica 
     * al vehículo que se está creando.
     */
    public Vehicle(
            int numberOfPassengers, 
            boolean crewOnBoard, 
            int numberOfWheels, 
            LocalDate registrationDate, 
            String meansOfTransport, 
            int identifier) 
    {
        this.numberOfPassengers = numberOfPassengers;
        this.crewOnBoard = crewOnBoard;
        this.numberOfWheels = numberOfWheels;
        this.registrationDate = registrationDate;
        this.meansOfTransport = meansOfTransport;
        this.identifier = identifier;
    }
    
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isCrewOnBoard() {
        return crewOnBoard;
    }

    public void setCrewOnBoard(boolean crewOnBoard) {
        this.crewOnBoard = crewOnBoard;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getMeansOfTransport() {
        return meansOfTransport;
    }

    public void setMeansOfTransport(String meansOfTransport) {
        this.meansOfTransport = meansOfTransport;
    }

    public int getIdentifier() {
        return identifier;
    }

    /**
     * [Este metodo convierte un objeto a string, en este caso un objeto de
     * tipo vehículo en string.
     * ]
     *
     * @return un string que muestra la información de uno o mas objetos 
     * de tipo vehículo.
     * 
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Vehículo " + getIdentifier() + "\n Numero de pasageros: " 
                + numberOfPassengers + "\n Tripulación abordo: " + crewOnBoard 
                + "\n Numero de ruedas: " + numberOfWheels + 
                "\n Fecha de matrícula: " + registrationDate + 
                "\n Medio en el que se transporta: " + meansOfTransport + "\n";
    }    
}
