/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Numbers;
import java.util.ArrayList;

/**
 * [ Esta interfaz tiene como objetivo la implementación de los dos metodos
 * por los cuales la lista de numeros podrá ser ordenada.
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
public interface IOrdeningMethods {
    
    /**
     * [Este metodo realiza el ordenamiento de una lista de objetos de tipo
     * numero por el algoritmo de burbuja.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param list Hace referencia a la lista de objetos de tipo numero que
     * va a ser ordenada.
     *      
     * @since [1.0.0]
     */
    public static void bubbleAlgorithm(ArrayList<Numbers> list){
        int i, j;
        double aux;
        for (i = 0; i < list.size() - 1; i++) {
            for (j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j + 1).getNumber() < list.get(j).getNumber()) {
                    aux = list.get(j + 1).getNumber();
                    list.get(j + 1).setNumber(list.get(j).getNumber());
                    list.get(j).setNumber(aux);
                }
            }
        }
    }
    
    /**
     * [Este metodo realiza el ordenamiento de una lista de objetos de tipo
     * numero por el algoritmo quick sort.
     * ]
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @param unorderedList Hace referencia a la lista de objetos de tipo 
     * numero que va a ser ordenada.
     * @param low Hace referencia al indice menor que tenga la lista (cero).
     * @param high Hase referencia al indice mayor que contenga la lista, 
     * es decir, su tamaño menos uno.
     *      
     * @since [1.0.0]
     */
    public static void quickSort(
            ArrayList<Numbers> unorderedList, int low, int high) 
    {
    
        int i,j;
        double temp, t;
        
        if(low > high){
            return;
        }
        i = low;
        j = high;
       
        temp = unorderedList.get(low).getNumber();
 
        while (i < j) {
            while (temp <= unorderedList.get(j).getNumber() && i < j) {
                j--;
            }
            while (temp >= unorderedList.get(i).getNumber()&&i<j) {
                i++;
            }
            if (i < j) {
                t = unorderedList.get(j).getNumber();
                unorderedList.get(j).setNumber(unorderedList.get(i).getNumber());
                unorderedList.get(j).setNumber(t);
            }
        }
        unorderedList.get(low).setNumber(unorderedList.get(i).getNumber());
        unorderedList.get(i).setNumber(temp);
    }   
}
