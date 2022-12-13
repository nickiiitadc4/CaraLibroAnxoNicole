package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.Scanner;

public class CaraLibroBD {
    Scanner sc1 = new Scanner(System.in);
    ArrayList <String> perfiles = new ArrayList<>();
    
    
    public void obtenerPerfil(String nombre, String contraseña){
        String contr = contraseña;
        String nombr = nombre;
        boolean entrar = false;
        if(!perfiles.isEmpty()){
            while(!entrar){
                for(int i = 0; i < perfiles.size();i++){
                    
                    if(perfiles.get(i).contains(nombr) && perfiles.get(i).contains(contr)){
                        perfiles.get(i);
                        entrar = true;
                    }
                }
                
            }
        }
    }

    public void buscarPerfil(){
        
    }

    public void añadirPerfil(){
        for(int i = 0; i < caraLibroBD.size();i++){
            System.out.println("Introduce o teu nome");
            
        }
    }

}
