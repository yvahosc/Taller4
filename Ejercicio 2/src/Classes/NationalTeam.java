/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * [ Esta clase abstracta tiene como objetivo servir de molde para la 
 * conformación de la selección nacional, definiendo los atributos y métodos 
 * que los miembros deben tener.
 * ]
 *
 * @version ["VS" 1.0.0,2022-02-19
 *
 * 1.0.0,2022-02-19, La clase corresponde a la versión 1.0.0 del sistema,
 * la misma hasta el momento no ha recibido ningun refactorings ]
 *
 * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
 * 
 * @since [1.0.0]
 *
 */
public abstract class NationalTeam {
    
    private String name;
    private int age;
    
    /**
     * Constructor de la clase selección nacional, el cual sirve para la 
     * creación de cada uno de los miembros de la selección con toda
     * información.
     * @param name Hace referencia al nombre de una persona que hace parte de la
     * selección nacional.
     * @param age Hace referencia a la edad de una persona que hace parte de la
     * selección nacional.
     */
    public NationalTeam(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * [Hace referencia a la declaración de un método el cual 
     * deberá ser implementado por la o las clases que extiendan de esta, con
     * el fin de convertir un objeto a string.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return un string que muestra la información de uno o mas objetos 
     * de la selección nacional.
     *      
     * @since [1.0.0]
     */
    @Override
    public abstract String toString(); 
}
