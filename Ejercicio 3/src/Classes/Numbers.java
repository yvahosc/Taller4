/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 * [ Esta clase abstracta tiene como objetivo la creación del objeto numero 
 * y una lista de estos.
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
public class Numbers {
    
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    /**
     * Constructor de la clase numero el cual sirve para la creación de los
     * numeros de forma aleatoria.
     */
    public Numbers() {
        this.number = Math.random();
    }

    /**
     * [Este método tiene como objetivo la creación de una lista de objetos de 
     * tipo numero.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param amountNumbers hace referencia a la cantidad de numeros
     * que tendrá la lista.
     * 
     * @return una lista de objetos de tipo numero, aleatorios, con la cantidad
     * de numeros correspondiente al valor pasado como parametro.
     *      
     * @since [1.0.0]
     */
    public static ArrayList<Numbers> creationList(int amountNumbers){
        ArrayList<Numbers> list = new ArrayList<>();
        for (int i = 0; i < amountNumbers; i++){
            Numbers num = new Numbers();
            list.add(num);
        }
        return list;
    }  
}
