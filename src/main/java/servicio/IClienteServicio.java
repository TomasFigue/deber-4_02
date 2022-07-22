/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Cliente;
import modelo.Factura;

/**
 *
 * @author Dremi7w7
 */
public interface IClienteServicio {
    public Cliente crear(Cliente cliente);
    public List<Cliente> listar();  
    public boolean almacenarEnArchivo(Factura factura, String rutaArchivo) throws Exception;
    public List<Factura> recuperarDeArchivo(String rutaArchivo) throws Exception;
}
