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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.InterfaceCategoria;
import modelo.Categoria;

public class CategoriaDao implements InterfaceCategoria {

    Conexion cn = new Conexion();
    ResultSet rs;
    Categoria c;
    ArrayList<Categoria> lista = new ArrayList<>();
    String sql = "";
    String men = "";

    @Override
    public boolean agregarCategoria(String nom) {
        boolean verificar = false;
        sql = "{call agregarCategoria(?)}";
        Conexion cn = new Conexion();

        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, nom);

            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public boolean eliminarCategoria(String id) {
        boolean verificar = false;
        sql = "{call eliminarCategoria(?)}";
        Conexion cn = new Conexion();
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, id);
            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public boolean editarCategoria(Categoria c) {
        boolean verificar = false;
        sql = "{call modificaCateg(?,?)}";
        Conexion cn = new Conexion();
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, c.getId_categ());
            cs.setString(2, c.getNom_categ());

            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public Categoria listarunaCategoria(String id) {
        
        sql = "{call mostrarDatosCateg(?)}";
        Conexion cn = new Conexion();
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
                cs.setString(1, id);
            ResultSet rs = cs.executeQuery();
            if (rs.next()) {
                c = new Categoria();
                c.setId_categ(rs.getString(1));
                c.setNom_categ(rs.getString(2));

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
           

        }

        return c;
    }

    @Override
    public ArrayList<Categoria> listarCategorias() {
        try {
            String sql = "select * from categoria";
            Connection com = cn.getConnection();
            CallableStatement cs = com.prepareCall(sql);
            rs = cs.executeQuery();
            while (rs.next()) {
                c = new Categoria();
                c.setId_categ(rs.getString("id_categoria"));
                c.setNom_categ(rs.getString("nombre"));
                lista.add(c);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }

}
