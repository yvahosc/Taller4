/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Vehicle;
import java.util.ArrayList;

/**
 * [ Esta interfaz tiene como objetivo la creación e impresión en 
 * consola de una lista de vehículos.
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
public interface IVehicles {
    
    /**
     * [El objetivo principal de este método es agregar a una lista objetos
     * de tipo vehículo.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param vehicleList Hace referencia a una lista a la que se van a 
     * adicionar elementos de tipo vehículo.
     * @param vehicle Hace referencia al objeto de tipo vehículo que se va a
     * agregar a la lista de objetos de tipo vehículo.
     * 
     * @return el método retorna la lista pasada como parametro con el objeto
     * de tipo vehículo pasado como parametro, agregado a ella.
     *      
     * @since [1.0.0]
     */
    public static ArrayList<Vehicle> CreationOfVehiclesList(
            ArrayList<Vehicle> vehicleList, Vehicle vehicle)
    {
        vehicleList.add(vehicle);
        return vehicleList;
    } 
    
    /**
     * [El objetivo principal de este método es mostrar  cada uno de los 
     * objetos de una lista de objetos de tipo vehículo.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param vehicleList Hace referencia a la lista de objetos de tipo 
     * vehículo que se quiere mostrar.
     *      
     * @since [1.0.0]
     */
    public static void ToShowVehicles (ArrayList<Vehicle> vehicleList){
        for (Vehicle Vehicle : vehicleList){
            System.out.println(Vehicle.toString());
        }
    }
    
    
}
