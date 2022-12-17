package com.mycompany.caralibro;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Mensaje {
    public LocalDateTime fecha;
    public String texto;
    public Boolean leido;
    Perfil remitente;
    ArrayList<Mensaje> mensajes = new ArrayList <> (); 
    
    public Mensaje(){
        
    }
    public Mensaje(String texto, Perfil remitente){
        this.texto = texto;
        this.fecha = LocalDateTime.now();
        this.remitente = remitente;
        
        for (int contador = 0 ; contador < mensajes.size(); contador ++){
            
            
            mensajes.get(contador).fecha.isAfter(fecha);
            mensajes.add(this);
            
        }
        
        
            
    }

}
