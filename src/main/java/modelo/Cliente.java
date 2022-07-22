/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dremi7w7
 */
public class Cliente {
    private String nombre; 
    private int edad; 
    private String nacionalidad;
    private String genero; 
    private String pago; 
    private String m_edad;
    

    public Cliente(Integer edad, String nombre, String nacionalidad, String genero, String pago) {
        this.nombre = nombre; 
        this.edad = edad; 
        this.nacionalidad = nacionalidad; 
        this.genero = genero;
        this.pago = pago;
    }

    public Cliente(Integer edad, String nombre, String nacionalidad, String genero, String pago, String m_edad) {
        this.nombre = nombre; 
        this.edad = edad; 
        this.nacionalidad = nacionalidad; 
        this.genero = genero;
        this.pago = pago;
        this.m_edad = m_edad;
    }

    public Cliente(String nombre) {
        this.nombre = nombre; 
    }
    
    public int getEdad() {
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getGenero() {
        return genero;
    }

    public String getPago() {
        return pago;
    }
    public String getM_edad() {
        return m_edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setPago(String pago) {
        this.pago = pago;
    }
    public void setN_edad(String m_edad) {
        this.m_edad = m_edad;
    }  
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + 
               ", genero=" + genero + ", pago=" + pago + ", mayor edad=" + m_edad +'}';
        
    }
}
