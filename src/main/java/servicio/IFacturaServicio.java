/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Factura;

/**
 *
 * @author Dremi7w7
 */
public interface IFacturaServicio {
    public Factura crear(Factura factura);
    public List<Factura> listar();
    public boolean almacenarEnArchivo(Factura factura, String rutaArchivo) throws Exception;
    public List<Factura> recuperarDeArchivo(String rutaArchivo) throws Exception;
}
