package com.mycompany.caralibro;

import java.util.Scanner;

public class GeneradorMenu {

    CaraLibroBD baseDatos = new CaraLibroBD();

    /**
     * Mostra o menu inicial ao iniciar o programa
     *
     */
    public void mostrarMenuinicial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Benvido");
        System.out.println("(1)Iniciar Sesión");
        System.out.println("(2)Rexistrarse");

        int opcionesIniciales = sc.nextInt();
        switch (opcionesIniciales) {
            case 1:
                iniciarSesion();
                break;
            case 2:
                crearPerfil();
                break;
            default:
                System.out.println("Non introduciches un valor válido");
                break;
        }

    }

    /**
     *
     * @param p
     */
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

    /**
     *
     * @param p
     */
    public void mostrarBiografia(Perfil p) {

    }

    /**
     *
     * @param p
     */
    public void mostrarSolicitudesDeAmistad(Perfil p) {

    }

    /**
     *
     * @param p
     */
    public void mostrarListaAmigos(Perfil p) {

    }

    /**
     *
     * @param p
     */
    public void mostrarMensajes(Perfil p) {

    }

    /**
     *
     */
    public void cerrarSesion() {

    }

    /**
     * Crea un perfil co nome e contraseña que o usuario pase por pantalla
     *
     */
    private void crearPerfil() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String contraseña;
        System.out.println("Escribe o teu nome");
        System.out.println("Escribe o teu contrasinal");
        nombre = sc.nextLine();
        contraseña = sc.nextLine();
        baseDatos.añadirPerfil();
    }

    /**
     * Este método chamaráse se o usuario teclea 1 en mostrarMenuInicial,
     * buscará en caraLibroBD un perfil que coincida cos parámetros que se den
     * por pantalla, se non atopa ningún perfil, chamará ao método
     * crearUsuario()
     */
    private void iniciarSesion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu  nombre:");
        
        
        
            

        }
        System.out.println("Introduzca su contraseña:");
            String contraseña = sc.nextLine();
        
    }

    /**
     * Cambia o estado do perfil
     *
     * @param p
     */
    private void cambiarEstado(Perfil p) {

    }

    /**
     * Escribe un comentario en determinada publicación, rexistra a data de
     * publicación e o perfil que publica o mesmo
     *
     * @param pub
     * @param p
     */
    private void escribirComentario(Publicacion pub, Perfil p) {

    }

    /**
     *
     * @param pub
     */
    private void hacerMeGusta(Publicacion pub) {

    }

    /**
     *
     * @param remitente
     * @param destinatario
     */
    private void escribirMensaje(Perfil remitente, Perfil destinatario) {

    }

    /**
     *
     * @param m
     */
    private void marcarMensajeComoLeido(Mensaje m) {

    }

    /**
     *
     * @param m
     */
    private void eliminarMensaje(Mensaje m) {

    }

}
