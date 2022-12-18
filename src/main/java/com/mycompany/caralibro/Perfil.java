package com.mycompany.caralibro;

import java.util.ArrayList;

public class Perfil {
    
    CaraLibroBD baseDatos = new CaraLibroBD();
    Publicacion publicacion1 = new Publicacion();
    Mensaje mensajePerfil = new Mensaje();
    
    public String contraseña;
    public String nombre;
    public String estado;
    
    ArrayList <Perfil> amigos= new ArrayList<>();
    ArrayList <Perfil> solicitudAmistad = new ArrayList<>();
    ArrayList <Publicacion> publicacionesUsuario = new ArrayList<>();
    
    
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
       }else {
           System.out.print("NO EXISTE EL AMIGO");
       }
       
        
      
    }

    public void añadirPublicacion(Publicacion pub){
        
        publicacionesUsuario.add(pub);
    }

    public void añadirSolicitudDeAmistad(Perfil perfilSolicitante){
        
        
        if(baseDatos.buscarPerfil(nombre)!=null){
           
           solicitudAmistad.add(perfilSolicitante);
       }else {
            System.out.print("NO EXISTE EL PERFIL BUSCADO");
        }
       
        
        
       
    }

    public void aceptarSolicitudDeAmistad(Perfil perfilSolicitante){
        
        amigos.add(perfilSolicitante);
        
    }

    public void denegarSolicitudDeAmistad(Perfil perfilSolicitante){
        
       
        solicitudAmistad.remove(perfilSolicitante);
        
        
    }

    public void añadirMensaje(Mensaje m){
        
        
        
    }

    public void eliminarMensaje(Mensaje m){
        
        mensajePerfil.mensajes.remove(m);
        
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public CaraLibroBD getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(CaraLibroBD baseDatos) {
        this.baseDatos = baseDatos;
    }

    public Publicacion getPublicacion1() {
        return publicacion1;
    }

    public void setPublicacion1(Publicacion publicacion1) {
        this.publicacion1 = publicacion1;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Perfil> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Perfil> amigos) {
        this.amigos = amigos;
    }

    public ArrayList<Perfil> getSolicitudAmistad() {
        return solicitudAmistad;
    }

    public void setSolicitudAmistad(ArrayList<Perfil> solicitudAmistad) {
        this.solicitudAmistad = solicitudAmistad;
    }


}
