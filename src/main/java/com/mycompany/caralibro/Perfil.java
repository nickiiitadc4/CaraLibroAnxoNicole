package com.mycompany.caralibro;

import java.util.ArrayList;

public class Perfil {
    
    CaraLibroBD baseDatos = new CaraLibroBD();
    
    public String contraseña;
    public String nombre;
    public String estado;
    
    ArrayList <Perfil> amigos= new ArrayList<>();
    ArrayList <Perfil> solicitudAmistad = new ArrayList<>();
    
    
    
    public Perfil(String contraseña, String nombre) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }
    public Perfil(){
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public void añadirAmigo(Perfil perfil){
        
       //LLAMO AL METODO BUSCAR PERFIL Y ME DEVUELVE 
      
       if(baseDatos.buscarPerfil(nombre)!=null){
           
           amigos.add(perfil);
       }else 
            System.out.print("NO EXISTE EL AMIGO");
       
        
        
    }

    public void añadirPublicacion(){
        
    }

    public void añadirSolicitudDeAmistad(Perfil perfilSolicitante){
        
        
        if(baseDatos.buscarPerfil(nombre)!=null){
           
           solicitudAmistad.add(perfilSolicitante);
       }else 
            System.out.print("NO EXISTE EL PERFIL BUSCADO");
       
        
        
       
    }

    public void aceptarSolicitudDeAmistad(Perfil perfilSolicitante){
        
        
    }

    public void denegarSolicitudDeAmistad(){
        
    }

    public void añadirMensaje(){
        
    }

    public void eliminarMensaje(){
        
    }


}
