package modeloDAO;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import misInterfaces.InterfaceProducto;
import modelo.Producto;

public class ProductoDAO implements InterfaceProducto{
    
    //Atributos
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Producto p;
    ArrayList<Producto> listaP = new ArrayList();
    String sql;
    
    @Override
    public boolean agregarP(Producto p) {
        boolean verificar = false;
        
        try {
            con = cn.getConnection();
            sql = "{call agregarProducto(?,?,?,?,?)}";
            ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getCategoria());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getDescripcion());
            ps.setString(4, p.getImagen());
            ps.setDouble(5, p.getPrecioU());
            
            ps.executeUpdate();
            
            verificar = true;
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("AAA: " + ex.getMessage());
        }
        
        return verificar;
    }

    @Override
    public boolean editarP(Producto p) {
        try {
            String codP = p.getIdProducto();
            String nomP = p.getNombre();
            String descr = p.getDescripcion();
            String img = p.getImagen();
            Double pre = p.getPrecioU();
            
            sql = "{call modificarProducto('"+codP+"','"+nomP+"','"+descr+"','"+img+"', "+pre+")}";
            
            con = cn.getConnection();
            ps = con.prepareCall(sql);
            ps.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public boolean eliminarP(String codP) {
        try {
            sql = "{call eliminarProducto('"+codP+"')}";
            
            con = cn.getConnection();
            ps = con.prepareCall(sql);
            ps.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public Producto listarUnProducto(String idP) {
       Conexion cn = new Conexion();
        try {
            sql = "{call mostrarUnProducto('"+idP+"')}";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                p = new Producto();
                p.setIdProducto(rs.getString(1));
                p.setCategoria(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setImagen(rs.getString(5));
                p.setPrecioU(rs.getDouble(6));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }

    @Override
    public ArrayList<Producto> listarTodosProductos() {
        try {
            sql = "{call mostrarProductos()}";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                p = new Producto();
                p.setIdProducto(rs.getString(1));
                p.setNombreCategoria(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setDescripcion(rs.getString(4));
                p.setImagen(rs.getString(5));
                p.setPrecioU(rs.getDouble(6));
                p.setCategoria(rs.getString(7));
                
                listaP.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("AAA: " + ex.getMessage());
        } 
        
        return listaP;
    }

    @Override
    public ArrayList<Producto> listarProductoxCategoria(String codCat) {
        try {
            sql = "{call listarProductosXCategoria('"+codCat+"')}";
            
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                p = new Producto();
                p.setIdProducto(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                p.setImagen(rs.getString(4));
                p.setPrecioU(rs.getDouble(5));
                p.setCategoria(codCat);
                
                listaP.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("AAA: " + ex.getMessage());
        } 
        
        return listaP;
    }

    @Override
    public String obtenerCodP() {
        String cod="";
        CallableStatement cs;//Permite hacer llamadas a funciones de la Base de datos
        
        try {
            sql = "{?=call codigoProducto()}";
            
            con = cn.getConnection();
            
            cs = con.prepareCall(sql);
            
            //Se indica el tipo de objeto que retornara y la posición de dicho objeto, en este caso retornara un String
            cs.registerOutParameter(1, Types.VARCHAR);
            
            //Ejecuta la llamada y retorna un boolean
            //Tambien se puede utilizar el comando executeUpdate(), la cual, retornará un entero
            cs.execute();
            
            //Recuperamos el resultado de la función
            cod = cs.getString(1);
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("AAA: " + ex.getMessage());
        }
        
        return cod;
    }
}
