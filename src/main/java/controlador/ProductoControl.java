/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import modelo.Factura;
import modelo.Producto;
import servicio.ClienteServicio;
import servicio.FacturaServicio;
import servicio.ProductoServicio;

/**
 *
 * @author Dremi7w7
 */
public class ProductoControl {
    private final ProductoServicio productoServicio = new ProductoServicio();
    private final FacturaServicio facturaServicio = new FacturaServicio();
    private final ClienteServicio clienteServicio = new ClienteServicio(); 

    
    public Producto crear(String [] params){
        
        //var factura = new Cliente(params[6]); 
        //var factura = new Factura(params[7]); 
        
        Producto producto = new Producto(params[0],params[1],Integer.valueOf(params[2]),Integer.valueOf(params[3]),params[4],params[5]); 
        //Factura factura = new Factura(Integer.valueOf(params[0]),params[1],Integer.valueOf(params[2]),params[3],params[4],Integer.valueOf(params[5])); 
        this.productoServicio.crear(producto);
        //this.facturaServicio.crear(factura);
        return producto;
    }
    
    public Producto buscarProducto (String params){
     return this.productoServicio.buscarPorCodigo(Integer.valueOf(params));
     }
     
     
        public Producto eliminar(String params){
        return this.productoServicio.eliminar(Integer.valueOf(params));
    }
    
    public Producto modificar(String [] params){
        Producto productoNuevo = new Producto(params[0],params[1],Integer.valueOf(params[2]),Integer.valueOf(params[3]),params[4],params[5]); 
        this.productoServicio.modificar(Integer.valueOf(params[2]), productoNuevo);
        return productoNuevo;
    }
        
        public List<Producto> listar(){
        return this.productoServicio.listar();
    }
}
