/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author Dremi7w7
 */
public class ProductoServicio implements IProductoServicio {
    
    private static final List<Producto> productoList = new ArrayList<>();

    
    @Override
    public Producto crear(Producto producto) {
        this.productoList.add(producto);
        return producto;
    }

    @Override
    public Producto modificar(int codigoProducto, Producto productoNuevo) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoProducto));
        this.listar().get(posicion).setTipo(productoNuevo.getTipo());
        this.listar().get(posicion).setNombre(productoNuevo.getNombre());
        this.listar().get(posicion).setPrecio(productoNuevo.getPrecio());
        this.listar().get(posicion).setCaducidad(productoNuevo.getCaducidad());
        this.listar().get(posicion).setPeso(productoNuevo.getPeso());
        this.listar().get(posicion).setCodigo(productoNuevo.getCodigo());
        
        return productoNuevo;
    }

    @Override
    public Producto eliminar(int codigoProducto) {
        Producto producto=this.buscarPorCodigo(codigoProducto);
        var posicion=this.buscarPosicion(producto);
        this.listar().remove(posicion);
        return producto;
    }

    @Override
    public Producto buscarPorCodigo(int codigoProducto) {
        Producto producto=null;
        for(var b:this.productoList){
            if(codigoProducto==b.getCodigo()){
                producto=b;
                break;
            }
        }
        return producto;
    }
    @Override
    public List<Producto> listar() {
        return this.productoList;
    }
    @Override
    public int buscarPosicion(Producto producto) {
         int posicion=-1;
        for(var b:this.productoList){
            posicion++;
            if(b.getCodigo()==producto.getCodigo()){
                break;
            }
        }
        return posicion;
    }
    
}
