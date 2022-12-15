package com.mycompany.caralibro;

/**
 *
 * @author nicki
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;


public class Publicacion {

    Date fecha = new Date();
    public String texto;
    ArrayList<Perfil> perfiles;
    ArrayList<Publicacion> publicaciones = new ArrayList <>();

    public Publicacion(String texto) throws ParseException {
        Scanner sc = new Scanner(System.in);

    //meto la fecha, como un date no se puede meter a través de un Scanner.
        String fechaComoTexto = sc.nextLine();
    
    //Leo cadena de txt String, lo convertimos en objeto en una clase Date
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
    }

    public void añadirMeGusta(Perfil autor) {
        
        
    }

    public void añadirComentario(Comentario c) {

    }
}