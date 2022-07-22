/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dremi7w7
 */
public class Producto {
    private String tipo;
    private String nombre; 
    private String precio; 
    private String caducidad; 
    private int peso; 
    private int codigo; 
    private Factura factura; 
    private Cliente cliente;
    
    
    public Producto(String tipo, String nombre, String precio, String caducidad, int peso, int codigo){
        this.tipo=tipo;
        this.nombre=nombre;
        this.precio=precio;
        this.caducidad=caducidad;
        this.peso=peso;
        this.codigo=codigo;
    
    }

    public Producto(String tipo, String nombre, Integer codigo, Integer peso, String precio, String caducidad) {
        this.tipo=tipo;
        this.nombre=nombre;
        this.precio=precio;
        this.caducidad=caducidad;
        this.peso=peso;
        this.codigo=codigo;
        //this.factura=factura; 
        //this.cliente=cliente;
        
    }


    
    public String getNombre() {
        return nombre;
    }
    public String getCaducidad() {
        return caducidad;
    }
    public String getTipo() {
        return tipo;
    }

    public String getPrecio() {
        return precio;
    }
    public int getPeso() {
        return peso;
    }
    public int getCodigo() {
        return codigo;
    }
  

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "tipo=" + tipo + ", nombre=" + nombre + ", codigo=" + codigo + 
               ", peso=" + peso + ", precio=" + precio + ", caducidad=" + caducidad +'}';
        
    }
}
