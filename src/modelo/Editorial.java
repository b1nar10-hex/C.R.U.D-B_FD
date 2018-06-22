/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class Editorial {
    
    //atributos de la clase. 
    private int id_editorial;
    private String nombre;
    
    //contructor por defecto.
    public Editorial() {
    }
    
    //constructor con parametros.
    public Editorial(int id_editorial, String nombre) {
        this.id_editorial = id_editorial;
        this.nombre = nombre;
    }
    
    //generacion de metodos selectores y mutadores.

    /**
     * @return the id_editorial
     */
    public int getId_editorial() {
        return id_editorial;
    }

    /**
     * @param id_editorial the id_editorial to set
     */
    public void setId_editorial(int id_editorial) {
        this.id_editorial = id_editorial;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}//fin class
