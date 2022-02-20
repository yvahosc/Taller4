/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import java.util.Vector;

/**
 * [ Esta interfaz tiene como objetivo la creación e impresión en 
 * consola de un vector de numeros.
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
public interface IVectorCreation {
    
    /**
     * [El objetivo principal de este método es agregar a un vector objetos
     * de tipo numero.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param numberVector
     * @param number
     * 
     * @return el método retorna un vector pasad como parametro con el objeto
     * de tipo numero pasado como parametro, agregado a él.
     *      
     * @since [1.0.0]
     */
    public static Vector<Number> CreationOfNumberVector(
            Vector<Number> numberVector, Number number)
    {
        numberVector.add(number);
        return numberVector;
    } 
    
    /**
     * [El objetivo principal de este método es mostrar cada uno de los 
     * objetos de un vector de objetos de tipo numero.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param numberVector Hace referencia al vector de objetos de tipo 
     * numero que se quiere mostrar.
     *      
     * @since [1.0.0]
     */
    public static void ToShowNumbers (Vector<Number> numberVector){
        numberVector.forEach((number) -> {
            System.out.println(number.toString());
        });
    }
}
