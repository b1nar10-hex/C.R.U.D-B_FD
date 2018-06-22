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
public class Libro {
    
    //atributos de la clase
    private String numero_de_serie;
    private int isbn;
    private String titulo;
    private int precio_de_referencia;
    private String año_de_publiacion;
    private String estado;
    private int REL_editorial_id;
    
    //constructor por defecto.
    public Libro() {
    }
    
    //constructor con parametros.     
    public Libro(String numero_de_serie, int isbn, String titulo, int precio_de_referencia, String año_de_publiacion, String estado, int REL_editorial_id) {
        this.numero_de_serie = numero_de_serie;
        this.isbn = isbn;
        this.titulo = titulo;
        this.precio_de_referencia = precio_de_referencia;
        this.año_de_publiacion = año_de_publiacion;
        this.estado = estado;
        this.REL_editorial_id = REL_editorial_id;
    }
    
    //generacion de metodos selectores y mutadores.
    /**
     * @return the numero_de_serie
     */
    public String getNumero_de_serie() {
        return numero_de_serie;
    }

    /**
     * @param numero_de_serie the numero_de_serie to set
     */
    public void setNumero_de_serie(String numero_de_serie) {
        this.numero_de_serie = numero_de_serie;
    }

    /**
     * @return the ISBN
     */
    public int getISBN() {
        return isbn;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(int ISBN) {
        this.isbn = ISBN;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the precio_de_referencia
     */
    public int getPrecio_de_referencia() {
        return precio_de_referencia;
    }

    /**
     * @param precio_de_referencia the precio_de_referencia to set
     */
    public void setPrecio_de_referencia(int precio_de_referencia) {
        this.precio_de_referencia = precio_de_referencia;
    }

    /**
     * @return the año_de_publiacion
     */
    public String getAño_de_publiacion() {
        return año_de_publiacion;
    }

    /**
     * @param año_de_publiacion the año_de_publiacion to set
     */
    public void setAño_de_publiacion(String año_de_publiacion) {
        this.año_de_publiacion = año_de_publiacion;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the REL_editorial_id
     */
    public int getREL_editorial_id() {
        return REL_editorial_id;
    }

    /**
     * @param REL_editorial_id the REL_editorial_id to set
     */
    public void setREL_editorial_id(int REL_editorial_id) {
        this.REL_editorial_id = REL_editorial_id;
    }
    
    
    
}//fin class
