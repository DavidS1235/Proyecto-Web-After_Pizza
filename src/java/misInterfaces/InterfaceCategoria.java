/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misInterfaces;

import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

/**
 *
 * @author David
 */
public interface InterfaceCategoria {

    public boolean agregarCategoria(String nom);

    public boolean eliminarCategoria(String id);

    public boolean editarCategoria(Categoria c);

    public Categoria listarunaCategoria(String id);

    public ArrayList<Categoria> listarCategorias();
}
