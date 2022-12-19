package com.mycompany.caralibro;

/**
 *
 * @author nicki
 */
import java.util.Date;
import java.util.ArrayList;

public class Publicacion {

    //creamos el objeto d esta clase, al no dar parametros nos daria fecha actual
    Date fecha = new Date();
    Comentario comentarioPublicacion = new Comentario();
    GeneradorMenu gen = new GeneradorMenu();
    
    public String texto;
    ArrayList<Perfil> perfiles;
    ArrayList<Publicacion> publicaciones = new ArrayList<>();
    ArrayList<Perfil>likesPublicacion = new ArrayList<>();

    public Publicacion() {

    }

    public Publicacion(Perfil autor, String texto) {

        //ORDENAMOS EL ARRAY POR FECHA, lo lemos de al rves 
        for (int contador = 0; contador < publicaciones.size(); contador++) {

           
            publicaciones.add(contador, new Publicacion(autor, texto));
        }

    }

    public void añadirMeGusta(Perfil autor) {
        
        
        for ( int contador= 0 ; contador < likesPublicacion.size(); contador++){
            likesPublicacion.add(autor);
        }
    }

    public void añadirComentario(Comentario c) {
        //añado el comentario , en orden de recientem
        for (int contador = comentarioPublicacion.comentarios.size(); contador > 0; contador--) {
            comentarioPublicacion.comentarios.add(contador,c);
        }

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
