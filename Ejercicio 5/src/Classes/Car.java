/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;

/**
 * [ Esta clase extiende de la clase vehículo y tiene como objetivo
 * la creación de objetos de tipo carro con toda la información 
 * correspondiente, la cual es definida en la clase de la 
 * cual extiende y algunos atributos especificos de la clase junto con los
 * métodos de la clase de la que extiende y sus propios métodos.
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
public class Car extends Vehicle {
    
    private final String type;
    private final boolean threeDoors;
    private final boolean fiveDoors;

    /**
     * Constructor de la clase carro, el cual sirve
     * para la creación de cada uno de los elementos de tipo carro
     * con toda su información.
     * @param type Hace referencia al tipo de vehículo, en este caso carro.
     * @param threeDoors Hace referencia a si el vehículo creado cuenta o no 
     * con tres puertas.
     * @param fiveDoors Hace referencia a si el vehículo creado cuenta o no 
     * con cinco puertas.
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
    public Car(
            String type, 
            boolean threeDoors, 
            boolean fiveDoors,
            int numberOfPassengers, 
            boolean crewOnBoard, 
            int numberOfWheels, 
            LocalDate registrationDate, 
            String meansOfTransport, 
            int identifier) 
    {
        super(numberOfPassengers, crewOnBoard, numberOfWheels, registrationDate,
                meansOfTransport, identifier);
        this.type = type;
        this.threeDoors = threeDoors;
        this.fiveDoors = fiveDoors;
    }

    public String getType() {
        return type;
    }

    public boolean isThreeDoors() {
        return threeDoors;
    }

    public boolean isFiveDoors() {
        return fiveDoors;
    }

    /**
     * [Este metodo convierte un objeto a string, en este caso un objeto de
     * tipo carro en string.
     * ]
     *
     * @return un string que muestra la información de uno o mas objetos 
     * de tipo carro.
     * 
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Vehículo " + getIdentifier() + "\n Tipo de vehículo: " + 
                getType() + "\n Numero de pasageros: " + getNumberOfPassengers()
                + "\n Tripulación abordo: " + isCrewOnBoard() + 
                "\n Numero de ruedas: " + getNumberOfWheels() + 
                "\n Fecha de matrícula: " + getRegistrationDate() + 
                "\n Medio en el que se transporta: " + getMeansOfTransport() 
                + "\n Tres puertas: " + isThreeDoors() + "\n Cinco puertas: " 
                + isFiveDoors() + "\n";
    } 
}
