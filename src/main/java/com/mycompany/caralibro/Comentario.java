package com.mycompany.caralibro;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Comentario {
    
    Publicacion publicacion1 = new Publicacion();
    public Date fecha;
    public String texto;
    ArrayList<Comentario> comentarios = new ArrayList<>();

    public Comentario(Perfil perfilcomenta, String texto) {
        this.texto = texto;
        
       
        for (int contador = 0; contador < comentarios.size(); contador ++) {
            
            comentarios.get(contador).fecha.before(fecha);
            comentarios.add(contador,new Comentario(perfilcomenta, texto));
            
            
            
        }
        
    }

}
