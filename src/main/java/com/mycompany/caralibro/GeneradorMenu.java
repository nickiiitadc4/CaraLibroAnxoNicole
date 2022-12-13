package com.mycompany.caralibro;

import java.util.Scanner;

public class GeneradorMenu {

    caraLibroBD baseDatos = new CaraLibroBD();

    public void mostrarMenuinicial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvido");
        System.out.println("Iniciar Sesión");
        System.out.println("Rexistrarse");

        int opcionesIniciales = sc.nextInt();
        if (opcionesIniciales == 1) {
            crearPerfil();
        } else {
            iniciarSesion();
        }

    }

    public void mostrarMenuPrincipal(Perfil p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Estado");
        System.out.println("Biografía");
        System.out.println("Solicitudes de amistad");
        System.out.println("Lista de amigos");
        System.out.println("Mensajes");
        System.out.println("Cerrar sesión");
        int opcionesPrincipales = sc.nextInt();
    }

    public void mostrarBiografia(Perfil p) {

    }

    public void mostrarSolicitudesDeAmistad(Perfil p) {

    }

    public void mostrarListaAmigos(Perfil p) {

    }

    public void mostrarMensajes(Perfil p) {

    }

    public void cerrarSesion() {

    }

    private void crearPerfil() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String contraseña;
        System.out.println("Escribe o teu nome");
        System.out.println("Escribe o teu contrasinal");
        nombre = sc.nextLine();
        contraseña = sc.nextLine();
               
    }

    private void iniciarSesion() {
        String nombre;
        String contraseña;
        Scanner sc = new Scanner(System.in);
        System.out.println("Iniciar sesión");
        System.out.println("Introduce o teu nome de usuario");
        nombre = sc.nextLine();
        System.out.println("Introduce o teu contrasinal");
        contraseña = sc.nextLine();
        Perfil entrar = baseDatos.ob
                
        mostrarMenuinicial(entrar);
    }

    private void cambiarEstado(Perfil p) {

    }

    private void escribirComentario(Publicacion pub, Perfil p) {

    }

    private void hacerMeGusta(Publicacion pub) {

    }

    private void escribirMensaje(Perfil remitente, Perfil destinatario) {

    }

    private void marcarMensajeComoLeido(Mensaje m) {

    }

    private void eliminarMensaje(Mensaje m) {

    }

}
