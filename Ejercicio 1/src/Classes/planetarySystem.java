/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * [ Esta clase abstracta tiene como objetivo servir de molde para la 
 * creación del sistema planetario, definiendo los atributos y métodos 
 * que estos elementos deben tener.
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
public abstract class planetarySystem {
    
    private double mass;
    private double density;
    private double diameter;
    private double distanceToTheSun;
    private int identifier;
    private String name;

    /**
     * Constructor de la clase sistema planetario, el cual sirve para la 
     * creación de cada uno de los objetos del sistema planetario con toda
     * su información.
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
    public planetarySystem(
            double mass, 
            double density, 
            double diameter, 
            double distanceToTheSun, 
            int identifier, 
            String name) 
    {
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceToTheSun = distanceToTheSun;
        this.identifier = identifier;
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    public void setDistanceToTheSun(double distanceToTheSun) {
        this.distanceToTheSun = distanceToTheSun;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * [Hace referencia a la declaración de un método el cual 
     * deberá ser implementado por la o las clases que extiendan de esta.
     * ]
     *
     *
     * @author [Yeisson Augusto Vahos Cortes, yvahosc@unal.edu.co]
     * 
     * @return un string que muestra la información de uno o mas objetos 
     * del sitema planetario.
     *      
     * @since [1.0.0]
     */
    @Override
    public abstract String toString();      
}
