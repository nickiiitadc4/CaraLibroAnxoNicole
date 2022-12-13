package com.mycompany.caralibro;

import java.util.Scanner;

public class GeneradorMenu {
    caraLibroBD baseDatos = new CaraLibroBD(); 
    
    public void mostrarMenuinicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvido");
        System.out.println("Iniciar Sesión");
        System.out.println("Rexistrarse");
    }
    
    public void mostrarMenuPrincipal(Perfil p){
        
        
    }

    public void mostrarBiografia(Perfil p){
       
        
    }

    public void mostrarSolicitudesDeAmistad(Perfil p){
        
        
    }

    public void mostrarListaAmigos(Perfil p){
        
        
    }

    public void mostrarMensajes(Perfil p){
        
        
    }

    public void cerrarSesion(){
        
        
    }

    private void crearPerfil(){
        
        
    }

    private void iniciarSesion(){
        String nombre;
        String contraseña;
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciar sesión");
            System.out.println("Introduce o teu nome de usuario");
            nombre = sc.nextLine();
            System.out.println("Introduce o teu contrasinal");
            contraseña = sc.nextLine();
        Perfil entrar = baseDatos.
                
        mostrarMenuinicial(entrar);
    }

    private void cambiarEstado(Perfil p){
        
        
    }

    private void escribirComentario(Publicacion pub, Perfil p){
        
        
    }

    private void hacerMeGusta(Publicacion pub){
        
        
    }

    private void escribirMensaje(Perfil remitente, Perfil destinatario){
        
    }

    private void marcarMensajeComoLeido(Mensaje m){
        
    }

    private void eliminarMensaje(Mensaje m){
        
    }

}
