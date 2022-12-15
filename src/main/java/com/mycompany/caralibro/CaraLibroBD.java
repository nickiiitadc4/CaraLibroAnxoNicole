package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.Scanner;

public class CaraLibroBD {

    Scanner entrada = new Scanner(System.in);
    ArrayList<String> perfiles = new ArrayList<>();

    public void obtenerPerfil(String nombre, String contraseña) {
        String contr = contraseña;
        String nombr = nombre;
        boolean entrar = false;
        if (!perfiles.isEmpty()) {
            while (!entrar) {
                for (int i = 0; i < perfiles.size(); i++) {

                    if (perfiles.get(i).contains(nombr) && perfiles.get(i).contains(contr)) {
                        perfiles.get(i);
                        entrar = true;
                    }
                }

            }
        }else
            System.out.print("No existe el usuario");
            
            
    }

    public void buscarPerfil(Perfil nombre) {
        
    
        for (int i = 0; i < perfiles.size(); i++) {

            if (perfiles.contains(nombre)){
                
                   System.out.print("El perfil si existe");
                   
               
            }else{
                System.out.print("El perfil no existe");
            }

        }
        
            
        
    }

    public void añadirPerfil() {
       
    }

    

}
