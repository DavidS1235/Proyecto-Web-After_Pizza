/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author David
 */
public class Categoria {
    private String id_categ;
    private String nom_categ;


    public Categoria(String id_categ, String nom_categ) {
        this.id_categ = id_categ;
        this.nom_categ = nom_categ;
    }

    public Categoria() {
       
    }

    public String getNom_categ() {
        return nom_categ;
    }

    public void setNom_categ(String nom_categ) {
        this.nom_categ = nom_categ;
    }

    public String getId_categ() {
        return id_categ;
    }

    public void setId_categ(String id_categ) {
        this.id_categ = id_categ;
    }
    
    
}
