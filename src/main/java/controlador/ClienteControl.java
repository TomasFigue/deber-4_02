/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Cliente;
import servicio.ClienteServicio;

/**
 *
 * @author Dremi7w7
 */

public class ClienteControl {
    private final ClienteServicio clienteServicio = new ClienteServicio();
    
     public Cliente crear(String [] params){
        var cliente = new Cliente(Integer.valueOf(params[1]),params[0],params[2],params[3],params[5],params[4]); 
              
        this.clienteServicio.crear(cliente);
        return cliente;
    }
     
        public List<Cliente> listar(){
        return this.clienteServicio.listar();
    }
}
