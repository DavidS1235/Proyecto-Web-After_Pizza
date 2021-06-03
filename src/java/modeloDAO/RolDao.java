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
import misInterfaces.InterfaceRol;

import modelo.Rol;

public class RolDao implements InterfaceRol{
    Conexion cn = new Conexion();
    ResultSet rs;
    Rol r;
    ArrayList<Rol> lista = new ArrayList<>();
    String sql = "";

    @Override
    public ArrayList<Rol> listaTodosRoles() {
    sql = "SELECT * from roles";
        try (Connection com = cn.getConnection();
                PreparedStatement ps = com.prepareStatement(sql);) {
            rs = ps.executeQuery();
            while (rs.next()) {
                r=new Rol();
                r.setId(rs.getString(1));
                r.setName(rs.getString(2));
                lista.add(r);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }


}
