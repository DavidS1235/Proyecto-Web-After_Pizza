/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class Usuario {
    private String id_user;
    private String id_rol;
    private String nombre;
    private String email;
    private String password;
    private String domicilio;
    private String foto;
    public Usuario() {
    }

    public Usuario(String id_rol, String nombre, String email, String password, String domicilio,String foto) {
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.domicilio = domicilio;
        this.foto=foto;
    }

    public Usuario(String id_user, String id_rol, String nombre, String email, String password, String domicilio, String foto) {
        this.id_user = id_user;
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.domicilio = domicilio;
        this.foto = foto;
    }
    
    
    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getId_rol() {
        return id_rol;
    }

    public void setId_rol(String id_rol) {
        this.id_rol = id_rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
    