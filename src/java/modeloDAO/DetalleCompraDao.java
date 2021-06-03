/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import misInterfaces.InterfaceDetalleCompra;
import modelo.DetalleProductoDTO;

public class DetalleCompraDao implements InterfaceDetalleCompra {

    Conexion cn = new Conexion();
    ResultSet rs;
    DetalleProductoDTO dpDTO;
    ArrayList<DetalleProductoDTO> listaDTO = new ArrayList<>();
    String sql = "";

    @Override
    public boolean agregarDetalleCompra(DetalleProductoDTO dpDTO) {
        boolean verificar = false;
        sql = "{call agregarDetalleB(?,?,?,?,?)}";
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, dpDTO.getId_Producto());
            cs.setString(2, dpDTO.getId_boleta());
            cs.setInt(3, dpDTO.getCant());
            cs.setDouble(4, dpDTO.getPrecioUnitario());
            cs.setString(5, dpDTO.getEstado());

            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public boolean eliminarrDetalleCompra(String codigo) {
        boolean verificar = false;
        sql = "{call eliminarDetalleB(?)}";
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, codigo);
            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public boolean editarDetalleCompra(DetalleProductoDTO dpDTO) {
        boolean verificar = false;
        sql = "UPDATE detalle_compra AS AC SET AC.id_producto=?,AC.id_boleta=?,AC.cantidad=?,AC.precioSubTotal=?,AC.estado=? WHERE AC.id_detalle=?";
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {

            cs.setString(1, dpDTO.getId_Producto());
            cs.setString(2, dpDTO.getId_boleta());
            cs.setInt(3, dpDTO.getCant());
            cs.setDouble(4, dpDTO.getPrecioSubTotal());
            cs.setString(5, dpDTO.getEstado());
            cs.setString(6, dpDTO.getId_Detalle());

            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public DetalleProductoDTO listarunDetalleComprao(String codigo) {
        Conexion cn = new Conexion();
        sql = "SELECT id_detalle,id_boleta,producto.nombre,cantidad,precioSubTotal,estado,producto.precio "
                + "FROM detalle_compra,producto WHERE detalle_compra.id_producto=producto.id_producto AND id_detalle=?";
        try (Connection com = cn.getConnection();
                PreparedStatement ps = com.prepareStatement(sql);) {
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                dpDTO = new DetalleProductoDTO();

                dpDTO.setId_Detalle(rs.getString(1));
                dpDTO.setId_boleta(rs.getString(2));
                dpDTO.setNom_producto(rs.getString(3));
                dpDTO.setCant(rs.getInt(4));
                dpDTO.setPrecioSubTotal(rs.getDouble(5));
                dpDTO.setEstado(rs.getString(6));
                dpDTO.setPrecioUnitario(rs.getDouble(7));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return dpDTO;
    }

    @Override
    public ArrayList<DetalleProductoDTO> listaTodosDetalleCompra() {
        Conexion cn = new Conexion();
        sql = "SELECT id_detalle,id_boleta,producto.nombre,cantidad,precioSubTotal,estado,producto.precio FROM detalle_compra LEFT JOIN producto ON "
                + "detalle_compra.id_producto=producto.id_producto";
        try (Connection com = cn.getConnection();
                PreparedStatement ps = com.prepareStatement(sql);) {
            rs = ps.executeQuery();
            while (rs.next()) {
                dpDTO = new DetalleProductoDTO();

                dpDTO.setId_Detalle(rs.getString(1));
                dpDTO.setId_boleta(rs.getString(2));
                dpDTO.setNom_producto(rs.getString(3));
                dpDTO.setCant(rs.getInt(4));
                dpDTO.setPrecioSubTotal(rs.getDouble(5));
                dpDTO.setEstado(rs.getString(6));
                dpDTO.setPrecioUnitario(rs.getDouble(7));
                listaDTO.add(dpDTO);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaDTO;
    }

}
