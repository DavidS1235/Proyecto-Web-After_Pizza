/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misInterfaces;

import java.util.ArrayList;
import modelo.DetalleProductoDTO;

/**
 *
 * @author VICTOR
 */
public interface InterfaceDetalleCompra {
    public boolean agregarDetalleCompra(DetalleProductoDTO dpDTO);
    public boolean eliminarrDetalleCompra(String codigo);
    public boolean editarDetalleCompra(DetalleProductoDTO dpDTO);
    public DetalleProductoDTO listarunDetalleComprao(String codigo);
    public ArrayList<DetalleProductoDTO> listaTodosDetalleCompra();
}
