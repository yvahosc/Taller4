/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Classes.Numbers;
import Interfaces.IOrdeningMethods;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * [Esta clase tiene como objetivo iniciar la aplicación en la cual se 
 * podrá crear una lista de numeros aleatorios y ordenarla por medio del método
 * que el usuario lo decida.
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
public class Ejercicio3 implements IOrdeningMethods{

    /**
     * [El objetivo principal de este método es iniciar la ejecución del 
     * programa en el que se podrá rear una lista de numeros aleatorios y 
     * ordenarla por medio del método que el usuario por medio de 
     * interacciones decida.
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
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Numbers> list;
        
        System.out.println("Ingrese la cantidad de numeros que quiere "
                + "agregar a la lista: ");
        String input = keyboard.nextLine();

        try{
            int numberAmoung = Integer.valueOf(input);
            if (numberAmoung <= 0) {
                throw new IllegalArgumentException("No es posible ingresar"
                        + " numeros menores o iguales a cero.");
            }
            else{
                list = Numbers.creationList(numberAmoung);
                for (Numbers num : list) {
                System.out.println(num.getNumber());
                }
                System.out.println("Con que método quiere ordenar la "
                        + "lista de numeros creada: \n 1. Algoritmo "
                        + "burbuja. \n 2. Quick Sort. \n");
                input = keyboard.nextLine();

                try{
                    int option = Integer.valueOf(input);
                    switch (option){
                        case 1:
                            System.out.println("Ordenando lista por metodo"
                                    + " burbuja.");
                            IOrdeningMethods.bubbleAlgorithm(list);
                            for (Numbers num : list) {
                                System.out.println(num.getNumber());
                            }
                        break;
                        case 2:
                            System.out.println("Ordenando lista por metodo"
                                    + " quick sort.");
                            IOrdeningMethods.quickSort(
                                    list, 0, list.size() - 1);
                            for (Numbers num : list) {
                                System.out.println(num.getNumber());
                            }
                        break;
                        default:
                            System.out.println("Ingrese un numero valido,"
                                    + " por favor.");
                    } 
                } catch (Throwable e) {
                    System.out.println("Ingrese una opción valida, por "
                            + "favor, no un texto");
                }
            } 
        } catch (NumberFormatException exc){
            System.out.println("Por favor ingrese numeros");
        } catch (IllegalArgumentException exc){
            System.out.println(exc.getMessage());
        }

        catch (Throwable e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }     
    }  
}
