/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloDAO;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import misInterfaces.InterfaceBoleta;
import modelo.Boleta;


public class BoletaDao implements InterfaceBoleta{

     Conexion cn = new Conexion();
    ResultSet rs;
    Boleta b;
    ArrayList<Boleta> lista = new ArrayList<>();
    String sql="";
    @Override
    public ArrayList<Boleta> listaBoleta() {
       sql = "{Call mostrarBoleta()}";
        try (Connection com = cn.getConnection();
                PreparedStatement ps = com.prepareStatement(sql);) {
            rs = ps.executeQuery();
            while (rs.next()) {
                b=new Boleta();
                b.setIdBoleta(rs.getString(1));
                b.setId_pedido(rs.getString(2));
                b.setFecha(rs.getString(3));
                b.setPagoTotal(rs.getDouble(4));
                lista.add(b);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
}
