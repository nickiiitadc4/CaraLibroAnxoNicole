package com.mycompany.caralibro;

import java.sql.Date;

public class Comentario {
    public Date fecha;
    public String texto;

    public Comentario(String texto) {
        this.texto = texto;
        System.out.println("Publicado o " + fecha);
        System.out.println(texto);
    }

}
