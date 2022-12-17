package com.mycompany.caralibro;

import java.util.Scanner;

public class GeneradorMenu {

    CaraLibroBD baseDatos = new CaraLibroBD();

    /**
     * Mostra o menu inicial ao iniciar o programa
     *
     */
    public void mostrarMenuInicial() {
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
        System.out.println("(1)Estado");
        System.out.println("(2)Biografía");
        System.out.println("(3)Solicitudes de amistad");
        System.out.println("(4)Lista de amigos");
        System.out.println("(5)Mensajes");
        System.out.println("(6)Cerrar sesión");
        int opcionesPrincipales = sc.nextInt();
        switch (opcionesPrincipales) {
            case 1:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Queres cambiar o teu estado?");
                int cambiar = sc2.nextInt();
                if (cambiar == 1) {
                    cambiarEstado(p);
                } else {
                    System.out.println();
                }
                break;
            case 2:
                mostrarBiografia(p);
                break;
            case 3:
                mostrarSolicitudesDeAmistad(p);
                break;
            case 4:
                mostrarListaAmigos(p);
                break;
            case 5:
                mostrarMensajes(p);
                break;
            case 6:
                cerrarSesion();
                break;
            default:
                System.out.println("Introduce unha opción válida entre 1 e 6");
                mostrarMenuPrincipal(p);
                break;
        }
    }

    /**
     *
     * @param p
     */
    public void mostrarBiografia(Perfil p) {
        Scanner op = new Scanner(System.in);

        int create;
        System.out.println("Nueva Publicacion");
        create = op.nextInt();
        if (create == 1) {
            String text = null;
            Publicacion n = new Publicacion(p, text);
            p.añadirPublicación(n);

            for (int i = 0; i < p.publicaciones.size(); i++) {
                String auth = p.nombre;
                if (p.publicaciones.get(i).texto.contentEquals(auth)) {
                    System.out.println(p.publicaciones.get(i).texto);
                    System.out.println(p.publicaciones.get(i).fecha);

                }
            }
        }
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Preme 0 para pechar a tua sesión");
        int cerrar = sc.nextInt();
        if (cerrar == 0) {
            mostrarMenuInicial();
        }

    }

    /**
     * Crea un perfil co nome e contraseña que o usuario pase por pantalla e
     * añadeo a caraLibroBD
     *
     */
    private void crearPerfil() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String contraseña;
        System.out.println("Registrarse\n");
        System.out.println("Escribe tu nombre:");
        nombre = sc.nextLine();

        System.out.println("Escribe tu Contraseña:");
        contraseña = sc.nextLine();

        Perfil perf = new Perfil(nombre, contraseña);
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

        System.out.println("Introduzca su contraseña:");
        String contraseña = sc.nextLine();

    }

    /**
     * Cambia o estado do perfil
     *
     * @param p
     */
    private void cambiarEstado(Perfil p) {
        Scanner sc = new Scanner(System.in);
        String estado;
        int salir = 0;
        System.out.println("Pulsa 1 para salir");
        System.out.println("Nuevo estado:\n");
        estado = sc.nextLine();

        p.estado = estado;
        mostrarMenuPrincipal(p);
        if (sc.nextInt() == 1) {
            mostrarMenuPrincipal(p);
        }

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
