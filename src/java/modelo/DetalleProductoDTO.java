/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class DetalleProductoDTO {
    private String id_Detalle;
    private String id_Producto;
    private String nom_producto;
    private String id_boleta;
    private int cant;
    private double precioSubTotal;
    private String estado;
    private double precioUnitario;

    public DetalleProductoDTO() {
    }

    public DetalleProductoDTO(String id_Detalle, String id_Producto, String id_boleta, int cant, double precioSubTotal, String estado) {
        this.id_Detalle = id_Detalle;
        this.id_Producto = id_Producto;
        this.id_boleta = id_boleta;
        this.cant = cant;
        this.precioSubTotal = precioSubTotal;
        this.estado = estado;
    }
    
    public DetalleProductoDTO(String id_Producto, String nom_producto, String id_boleta, int cant, String estado, double precioUnitario) {
        this.id_Producto = id_Producto;
        this.nom_producto = nom_producto;
        this.id_boleta = id_boleta;
        this.cant = cant;
        this.estado = estado;
        this.precioUnitario = precioUnitario;
    }
    

    public String getId_Detalle() {
        return id_Detalle;
    }

    public void setId_Detalle(String id_Detalle) {
        this.id_Detalle = id_Detalle;
    }

    public String getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(String id_Producto) {
        this.id_Producto = id_Producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(String id_boleta) {
        this.id_boleta = id_boleta;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecioSubTotal() {
        return precioSubTotal;
    }

    public void setPrecioSubTotal(double precioSubTotal) {
        this.precioSubTotal = precioSubTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
}
