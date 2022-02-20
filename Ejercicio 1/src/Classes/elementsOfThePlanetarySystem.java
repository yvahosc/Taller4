/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;


/**
 * [ Esta clase extiende de la clase sistema planetario y tiene como objetivo
 * la creación de cada uno de los elementos del sistema planetario, 
 * con los atributos y métodos que estos elementos deben tener y toda su 
 * información, la cual es definida en la clase de la cual extiende.
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
public class elementsOfThePlanetarySystem extends planetarySystem {
    private static final double gravitationalConstant = 6.672E-11;

    public static double getGravitationalConstant() {
        return gravitationalConstant;
    }
    
    /**
     * Constructor de la clase elementos del sistema planetario, el cual sirve
     * para la creación de cada uno de los elementos del sistema planetario
     * con toda su información, la cual es definida en la clase de la cual 
     * extiende.
     * @param mass Hace referencia a la masa del objeto del sistema planetario.
     * @param density Hace referencia a la densidad del objeto del sistema
     * planetario.
     * @param diameter Hace referencia al diamentro del objeto del sistema
     * planetario.
     * @param distanceToTheSun Hace referencia a la distancia al sol del 
     * objeto del sistema planetario.
     * @param identifier Hace referencia a un número único que identifica 
     * al objeto del sistema planetario.
     * @param name Hace referencia al nombre del objeto del sistema planetario.
     */
    public elementsOfThePlanetarySystem(
            double mass, 
            double density, 
            double diameter, 
            double distanceToTheSun, 
            int identifier, 
            String name) 
    {
        super(mass, density, diameter, distanceToTheSun, identifier, name);
    }

    /**
     * [Este metodo convierte un objeto a string, en este caso un elemento del 
     * sistema planetario en string.
     * ]
     *
     * @return un string que muestra la información de uno o mas objetos 
     * del sitema planetario.
     * 
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     *      
     * @since [1.0.0]
     */
    @Override
    public String toString() {
        return "Objeto planetario " + getIdentifier() + "\n Nombre: " + getName()
                + "\n masa en Kg: " + getMass() + "\n Densidad en gr/cm^3: " + 
                getDensity() + "\n Diametro en Km: " + getDiameter() + 
                "\n Distancia al sol en Km: " + getDistanceToTheSun() + "\n";
    }
    
    /**
     * [Este metodo envia un mensaje con informacion de un objeto del 
     * sistema planetario.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return Un mensaje con información de un objeto del sistema planetario.
     *      
     * @since [1.0.0]
     */
    public String message() {
        return "Objeto planetario " + getIdentifier() + "\n Nombre: " + 
                getName() + "\n";
    }

    /**
     * [Este metodo calcula la atracción gravitatoria entre dos objetos 
     * elementos del sistema planetario pasados como parametros.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param object1 Hace referencia a uno de los dos elementos del sistema
     * planetario entre los cuales se quiere calcular la atracción gravitatoria.
     * @param object2 Hace referencia al otro de los dos elementos del sistema
     * planetario entre los cuales se quiere calcular la atracción gravitatoria.
     *      
     * @since [1.0.0]
     */
    public static void gravitationalAttraction(
            elementsOfThePlanetarySystem object1, 
            elementsOfThePlanetarySystem object2) 
    {
            try{
                double gravitationalAttraction;
                double distance;
                distance = object1.getDistanceToTheSun() - 
                        object2.getDistanceToTheSun();
                
                if (object1.getDistanceToTheSun() == 
                        object2.getDistanceToTheSun()) 
                {
                    throw new ArithmeticException();
                } else{
                    gravitationalAttraction = (getGravitationalConstant() * 
                        (object1.getMass() * object2.getMass())) 
                        / (Math.pow(distance * 1000,2));
                    System.out.println("El valor del calculo de la atracción "
                            + "gravitacional entre: " + object1.getName() + 
                            " y " + object2.getName() + " es: " + 
                            gravitationalAttraction + "\n");
                }   
            } catch (ArithmeticException exc){
                        System.out.println("Por favor seleccione dos objetos "
                                + "planetarios distintos, por favor.\n Al ser "
                                + "objetos iguales, su distancia es cero y la "
                                + "división por cero no está definida.");
                    }   
    }
}
