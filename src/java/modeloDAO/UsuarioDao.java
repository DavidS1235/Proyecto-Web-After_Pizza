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
import misInterfaces.InterfaceUsuario;
import modelo.Usuario;
import modelo.UsuarioRolDTO;

public class UsuarioDao implements InterfaceUsuario {
    Conexion cn = new Conexion();
    ResultSet rs;
    Usuario u;
    UsuarioRolDTO urDTO;
    ArrayList<UsuarioRolDTO> listaDTO = new ArrayList<>();
    ArrayList<Usuario> lista = new ArrayList<>();
    String sql = "";
    String men = "";
    
    @Override
    public boolean agregarUsuario(Usuario u) {
       boolean verificar = false;
        sql = "{call agregarUsuario(?,?,?,?,?,?)}";
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, u.getId_rol());
            cs.setString(2, u.getNombre());
            cs.setString(3, u.getEmail());
            cs.setString(4, u.getPassword());
            cs.setString(5, u.getDomicilio());
            cs.setString(6, u.getFoto());
            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public boolean eliminarrUsuario(String codigo) {
         boolean verificar = false;
        sql = "{call eliminarUsuario(?)}";
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
    public boolean editarUsuario(Usuario u) {
        boolean verificar = false;
        sql = "{call modificarDatosU(?,?,?,?,?,?,?)}";
        try (Connection com = cn.getConnection();
            CallableStatement cs = com.prepareCall(sql);) 
            {
            
            cs.setString(1, u.getId_user());
            cs.setString(2, u.getNombre());
            cs.setString(3, u.getEmail());
            cs.setString(4, u.getPassword());
            cs.setString(5, u.getDomicilio()); 
            cs.setString(6, u.getId_rol());
            cs.setString(7, u.getFoto());

            if (cs.executeUpdate() > 0) {//filas afectadas
                verificar = true;

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return verificar;
    }

    @Override
    public Usuario logeoUsuario(String corr, String psw) {
        Usuario u = null;
        sql = "{call verificacionLogeoU(?,?)}";
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, corr);
            cs.setString(2, psw);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                u = new Usuario();
                u.setId_user(rs.getString(1));
                u.setNombre(rs.getString(2));
                u.setId_rol(rs.getString(3));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return u;
    }

    @Override
    public Usuario listarunUsuario(String codigo) {
        sql = "{call mostrarDatosU(?)}";
        try (Connection com = cn.getConnection();
                CallableStatement cs = com.prepareCall(sql);) {
            cs.setString(1, codigo);
            ResultSet rs = cs.executeQuery();
           if (rs.next()) {
                 u = new Usuario();
                u.setId_rol(rs.getString("id_rol"));
                u.setNombre(rs.getString("nombre"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setDomicilio(rs.getString("domicilio"));
               
                u.setId_user(rs.getString("id_user"));
                 u.setFoto(rs.getString("fotoPerfil"));
             //   lista.add(u);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return u;
    }

    @Override
    public ArrayList<UsuarioRolDTO> listaTodosUsuarios() {
       Conexion cn = new Conexion();
        sql = "SELECT id_user,usuarios.nombre,roles.nombre,email,domicilio,fotoPerfil from usuarios,roles WHERE usuarios.id_rol=roles.id_rol";
        try (Connection com = cn.getConnection();
                PreparedStatement ps = com.prepareStatement(sql);) {
            rs = ps.executeQuery();
            while (rs.next()) {
                urDTO=new UsuarioRolDTO();
                urDTO.setId_user(rs.getString(1));
                urDTO.setNombre(rs.getString(2));
                urDTO.setNom_rol(rs.getString(3));
                urDTO.setEmail(rs.getString(4));
                urDTO.setDomicilio(rs.getString(5));
                urDTO.setFoto(rs.getString(6));
                listaDTO.add(urDTO);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaDTO;
    }

}
