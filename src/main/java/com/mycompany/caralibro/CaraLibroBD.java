package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.Scanner;

public class CaraLibroBD {

    
    ArrayList<Perfil> perfiles = new ArrayList<>();
    Perfil pf;
    
    public Perfil obtenerPerfil(String nombre, String contraseña) {
        String contr = contraseña;
        String nombr = nombre;
        boolean entrar = false;
        //un flar, miro si esta vacio los perfiles
        if (!perfiles.isEmpty()) {
            //flar
            while (!entrar) {
                for (int i = 0; i < perfiles.size(); i++) {

                    //recorro el array y comparo el nombre y las contraseñas
                    if (perfiles.get(i).nombre.contentEquals(nombr) && perfiles.get(i).contraseña.contentEquals(contr)) {
                        pf = perfiles.get(i);
                        entrar = true;
                    }
                }

            }
        } else {
            System.out.print("No existe el usuario");
            GeneradorMenu gen = new GeneradorMenu();
            gen.mostrarMenuInicial();
        }
        return pf;
    }

    public Perfil buscarPerfil(String nombre) {

        //recorro el array
        for (int i = 0; i < perfiles.size(); i++) {

            //si contiene el nombre
            if (perfiles.get(i).nombre.equals(nombre)) {
                return perfiles.get(i);

            }

        }

        return null;
    }

    public void añadirPerfil(Perfil novoPerfil) {
        
        perfiles.add(novoPerfil);
                
    }

}
