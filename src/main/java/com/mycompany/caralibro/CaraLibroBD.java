package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.Scanner;

public class CaraLibroBD {

    
    ArrayList<Perfil> perfiles = new ArrayList<>();

    public void obtenerPerfil(String nombre, String contraseña) {
        Scanner entrada = new Scanner(System.in);
        
        String contr = contraseña;
        String nombr = nombre;
        boolean entrar = false;
        //un flar, miro si esta vacio los perfiles
        if (!perfiles.isEmpty()) {
            //flar
            while (!entrar) {
                for (int i = 0; i < perfiles.size(); i++) {

                    //recorro el array y comparo el nombre y las contraseñas
                    if (perfiles.get(i).equals(nombr) && perfiles.get(i).equals(contr)) {
                        perfiles.get(i);
                        entrar = true;
                    }
                }

            }
        } else {
            System.out.print("No existe el usuario");
        }

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

    public void añadirPerfil() {

    }

}
