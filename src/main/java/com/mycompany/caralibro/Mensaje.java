package com.mycompany.caralibro;

import java.sql.Date;
import java.time.LocalDateTime;

public class Mensaje {
    public LocalDateTime fecha;
    public String texto;
    public Boolean leido;
    Perfil remitente;
    
    public Mensaje(String texto, Perfil remitente){
        this.texto = texto;
        this.fecha = LocalDateTime.now();
        this.remitente = remitente;
    }

}
