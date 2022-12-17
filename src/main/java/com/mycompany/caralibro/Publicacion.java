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
        
    }
        
        
    }

    public void añadirMeGusta(Perfil autor) {
        
        
    } 

    public void añadirComentario(Comentario c) {

    }
}