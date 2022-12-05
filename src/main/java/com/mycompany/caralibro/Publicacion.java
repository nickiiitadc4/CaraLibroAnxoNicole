package com.mycompany.caralibro;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
        public  LocalDateTime fecha;
        public String texto;
        List<Perfil> likes = new ArrayList <Perfil>();
        List<Comentario> comentarios = new ArrayList <Comentario>();
        
    public Publicacion(String texto, Perfil autor){
       this.fecha = fecha;
       this.texto = texto;
       
    }

    public void añadirMeGusta(){
        
    }

    public void añadirComentario(){
        
    }
}
