package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.http.Part;

public class Imagen {
    //Atributos
    private Part part;
    private File carpetaAlmacenarImg;
    private String nombreArchivo; 
    private String[] extensiones;
    //Constructor
    public Imagen() {
    }
    
    
    //Metodos
    //Metodo que permite guardar la imagen
    public String guardarImg(String cod){
        String nombreImagen="";
        String extension="";
        
        int i;
        
        try {
            //Obtenemos la extensión de la imagen subida por el usuario
            i = nombreArchivo.lastIndexOf('.');
            if(i>0){
                extension = nombreArchivo.substring(i);
            }
                      
            //Generamos un nuevo nombre para el archivo
            nombreImagen = cod+extension;
            
            
            //Obetenos el archivo (imagen) que subio el usuario  (Carpeta Temporal)
            InputStream imagen = part.getInputStream();
            
            if(imagen != null){
                //Enlazamos el parametro que tiene la ruta donde se alamacena la imagen con el nombre del archivo
                File archivo = new File(carpetaAlmacenarImg, nombreImagen);
 
                
                //Copiamos desde la carpeta temporal del sistema a la carpeta donde se alamcenará la imagen
                //Guardamos el archivo en la carpeta "imagenProducto"
                Files.copy(imagen, archivo.toPath()); 
                
            }
            imagen.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return nombreImagen; 
    }
    
    //Metodo para verificar que el archivo subido sea una imagen (Tenga las extensiones adecuadas)
    public boolean cumpleRequisitosExt(){
        
        //Iteramos la reglas de las extensiones
        for(String ext : extensiones){
            //Si el nombre de nuestro archivo finaliza con la extensión adecuada devolvemos "TRUE"
            if(nombreArchivo.toLowerCase().endsWith(ext)){
                return true;
            }
        }
        
        return false;
    }
    
    //Metodos para eliminar una imagen
    public void eliminarImg(String nombreImagen){
        //Obtenemos el archivo donde esta almacenado la imagen
        File archivo = new File(carpetaAlmacenarImg, nombreImagen);
        
        if(archivo.delete()){
            System.out.println("Imagen Eliminada");
        }else{
            System.out.println("No se ha eliminado imagen");
        }
    }
    
    //Metodos GET y SET
    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public File getCarpetaAlmacenarImg() {
        return carpetaAlmacenarImg;
    }

    public void setCarpetaAlmacenarImg(File carpetaAlmacenarImg) {
        this.carpetaAlmacenarImg = carpetaAlmacenarImg;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String[] getExtensiones() {
        return extensiones;
    }

    public void setExtensiones(String[] extensiones) {
        this.extensiones = extensiones;
    }
}
