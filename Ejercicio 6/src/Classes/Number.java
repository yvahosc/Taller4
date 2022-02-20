/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Vector;

/**
 * [ Esta clase extiende de la clase vector y tiene como objetivo definir 
 * la estructura para los objetos  de tipo numero que se creen, sus atributos
 * y sus metodos.
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
public class Number extends Vector{
    private int num;

    /**
     * Constructor de la clase numero para la creación de las instancias
     * de dicha clase, con sus atributos.
     * @param num Hace referencia al numero que se quiere crear como objeto
     * de la clase numero.
     */
    public Number(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }    
}
