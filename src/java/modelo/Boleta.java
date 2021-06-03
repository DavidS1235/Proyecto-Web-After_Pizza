/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Boleta {
    private String idBoleta;
    private String id_pedido;
    private String fecha;
    private double PagoTotal;

    public Boleta() {
    }

    public Boleta(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getIdBoleta() {
        return idBoleta;
    }

    public void setIdBoleta(String idBoleta) {
        this.idBoleta = idBoleta;
    }

    public String getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(String id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(double PagoTotal) {
        this.PagoTotal = PagoTotal;
    }
    
}
