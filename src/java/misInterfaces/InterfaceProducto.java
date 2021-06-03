package misInterfaces;

import java.util.ArrayList;
import modelo.Producto;

public interface InterfaceProducto {
    
    //Metodos
    public boolean agregarP(Producto p);
    public boolean editarP(Producto p);
    public boolean eliminarP(String codP);
    public Producto listarUnProducto(String idP);
    public ArrayList<Producto> listarTodosProductos();
    public ArrayList<Producto> listarProductoxCategoria(String codCat);
    public String obtenerCodP();
}
