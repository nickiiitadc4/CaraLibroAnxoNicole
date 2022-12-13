package com.mycompany.caralibro;

import java.sql.Date;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Publicacion {

    Date fecha = new Date();
    public String texto;
    List<Perfil> likes = new ArrayList<Perfil>();
    List<Comentario> comentarios = new ArrayList<Comentario>();

    public Publicacion(String texto, Perfil autor) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Año");
        fecha = sc.next();

        System.out.println("Mes");

        System.out.println("Día");
    }

    public void añadirMeGusta(Perfil autor) {

    }

    public void añadirComentario(Comentario c) {

    }
}
