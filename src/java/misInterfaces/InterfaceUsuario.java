/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misInterfaces;

import java.util.ArrayList;
import java.util.List;
import modelo.Usuario;
import modelo.UsuarioRolDTO;


public interface InterfaceUsuario {
    public boolean agregarUsuario(Usuario u);
    public boolean eliminarrUsuario(String codigo);
    public boolean editarUsuario(Usuario u);
    public Usuario logeoUsuario (String corr, String psw);
    public Usuario listarunUsuario(String codigo);
    public ArrayList<UsuarioRolDTO> listaTodosUsuarios();
    
}
