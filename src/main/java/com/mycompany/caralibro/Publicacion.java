package com.mycompany.caralibro;

/**
 *
 * @author nicki
 */

import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

public class Publicacion {

  
    
    //creamos el objeto d esta clase, al no dar parametros nos daria fecha actual
    Date fecha = new Date();
    
    
    public String texto;
    ArrayList<Perfil> perfiles;
    ArrayList<Publicacion> publicaciones = new ArrayList <>();
    
    public Publicacion(){
        
    }
    
    public Publicacion(Perfil autor, String texto) {
        
          
    //ORDENAMOS EL ARRAY POR FECHA, lo lemos de al rves 
    
    for(int contador= 0; contador< publicaciones.size(); contador++){
        
        
        publicaciones.get(contador).fecha.after(fecha);
        publicaciones.add(contador,new Publicacion(autor, texto));
    }
        
        
    }

    public void añadirMeGusta(Perfil autor) {
        
        
    } 

    public void añadirComentario(Comentario c) {

    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public ArrayList<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }
    
}