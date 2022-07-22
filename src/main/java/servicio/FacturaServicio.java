/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Factura;

/**
 *
 * @author Dremi7w7
 */
public class FacturaServicio implements IFacturaServicio {
    
    private final List<Factura> facturaList = new ArrayList<>();
    
    

    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        try {
            this.almacenarEnArchivo(factura,"C:\\Nueva carpeta/archivoFactura.dat");
        } catch (Exception ex) {
            
        }
        return factura;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }

    @Override
    public boolean almacenarEnArchivo(Factura factura, String rutaArchivo) throws Exception {
        var retorno=false;
        DataOutputStream salida=null;
        try{
            
            salida= new DataOutputStream(new FileOutputStream("C:\\Nueva carpeta/archivoFactura.dat",true));
            salida.write(factura.getCantidad());
            salida.writeUTF(factura.getDireccion());
            salida.writeUTF(factura.getNombre());
            salida.writeUTF(factura.getfecha());
            salida.close();
            retorno=true;
            
        }catch(Exception e)
        {
            salida.close();   
        }
        return retorno;
    }

    @Override
    public List<Factura> recuperarDeArchivo(String rutaArchivo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


