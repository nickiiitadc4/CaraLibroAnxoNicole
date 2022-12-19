package com.mycompany.caralibro;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneradorMenu {

    CaraLibroBD baseDatos = new CaraLibroBD();

    Comentario comment = new Comentario();
    Mensaje message = new Mensaje();

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
                mostrarMenuInicial();
                break;
        }

    }

    /**
     *
     * @param p
     */
    public void mostrarMenuPrincipal(Perfil p) {
        System.out.println("Benvido " + p.nombre);
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
                System.out.println(p.estado);
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Queres cambiar o teu estado? Si(1)");
                int cambiar = sc2.nextInt();
                if (cambiar == 1) {
                    cambiarEstado(p);
                } else {
                    mostrarMenuPrincipal(p);
                }
                break;
            case 2:
                mostrarBiografia(p);
                break;
            case 3:
                System.out.println(p.amigos);
                mostrarSolicitudesDeAmistad(p);
                break;
            case 4:
                mostrarListaAmigos(p);
                break;
            case 5:
                System.out.println(p.mensajePerfil.texto);
                mostrarMensajes(p);
                System.out.println("Escribir mensaxe (1) /n Marcar como lido (2) /n Eliminar mensaxe (3)");
                Scanner sc3 = new Scanner(System.in);
                int dm = sc3.nextInt();
                if (dm == 1) {
                    escribirMensaje(p, p);
                } else if (dm == 2) {
                    marcarMensajeComoLeido(message);
                } else if (dm == 3) {
                    eliminarMensaje(message);
                }
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
        Scanner sc = new Scanner(System.in);
        int create;
        System.out.println("Nueva Publicacion (1) /n Volver ao menú principal (2)");
        create = sc.nextInt();
        if (create == 1) {
            Scanner sc1 = new Scanner(System.in);
            String text;
            System.out.println("Introduce o texto da túa publicación");
            text = sc1.nextLine();
            Publicacion n = new Publicacion(p, text);
            p.añadirPublicacion(n);

            for (int i = 0; i < p.publicacionesUsuario.size(); i++) {
                String autor = p.nombre;
                if (p.publicacionesUsuario.get(i).texto.contentEquals(autor)) {
                    System.out.println(p.publicacionesUsuario.get(i).texto);
                    System.out.println(p.publicacionesUsuario.get(i).fecha);

                }
            }
            mostrarBiografia(p);
        } else if (create == 2) {
            mostrarMenuPrincipal(p);
        } else {
            System.out.println("Número non válido, proba outro");
            mostrarBiografia(p);

        }
    }

    /**
     *
     * @param p
     */
    public void mostrarSolicitudesDeAmistad(Perfil p) {
        Scanner sc = new Scanner(System.in);
        int añadir;
        for (int i = 0; i < p.amigos.size(); i++) {
            System.out.println("Añadir (1), Eliminar(2)");
        }
        añadir = sc.nextInt();
        switch (añadir) {
            case 1:
                p.añadirAmigo(p);
                break;
            case 2:
                p.amigos.remove(p);
                break;
            default:
                mostrarMenuPrincipal(p);
                break;
        }
    }

    /**
     *
     * @param p
     */
    public void mostrarListaAmigos(Perfil p) {
        System.out.println(p.amigos);
    }

    /**
     *
     * @param p
     */
    public void mostrarMensajes(Perfil p) {
        Scanner sc = new Scanner(System.in);
        int menu;
        System.out.println("Ver mensaxes (1) /n Volver ao menú principal (2)");
        menu = sc.nextInt();
        if (menu == 1) {
            for (int i = 0; i < message.mensajes.size(); i++) {
                System.out.println(message.mensajes);
            }
        } else if (menu == 2) {
            mostrarMenuPrincipal(p);
        }
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

        Perfil p = new Perfil(contraseña, nombre);
        baseDatos.añadirPerfil(p);
        mostrarMenuInicial();

    }

    /**
     * Este método chamaráse se o usuario teclea 1 en mostrarMenuInicial,
     * buscará en caraLibroBD un perfil que coincida cos parámetros que se
     * tecleen.
     */
    private void iniciarSesion() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu  nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su contraseña:");
        String contraseña = sc.nextLine();

        if (baseDatos.obtenerPerfil(nombre, contraseña) == baseDatos.pf) {
            mostrarMenuPrincipal(baseDatos.buscarPerfil(nombre));
        } else {
            System.out.println("Perfil incorrecto, intentelo de nuevo");
            mostrarMenuInicial();

        }
    }

    /**
     * Cambia o estado do perfil, en menú principal mostrarase o estado por
     * pantalla.
     *
     * @param p
     */
    private void cambiarEstado(Perfil p) {
        Scanner sc = new Scanner(System.in);
        String estado;
        System.out.println("Nuevo estado:\n");
        estado = sc.nextLine();
        p.estado = estado;
        mostrarMenuPrincipal(p);

    }

    /**
     * Escribe un comentario en determinada publicación, rexistra a data de
     * publicación e o perfil que publica o mesmo
     *
     * @param pub
     * @param p
     */
    private void escribirComentario(Publicacion pub, Perfil p) {
        Scanner sc = new Scanner(System.in);
        int escribir;
        for (int i = 0; i < pub.publicaciones.size(); i++) {

            escribir = sc.nextInt();

            switch (escribir) {
                case 1:
                    System.out.println("Escribe o teu comentario");
                    comment.texto = sc.nextLine();
                    pub.añadirComentario(comment);
                    System.out.println(comment.texto);
                    break;
                case 2:
                    mostrarMenuPrincipal(p);
                    break;
                default:
                    System.out.println("Número non válido");
                    break;
            }
        }
    }

    /** Fai me gusta a unha publicación seleccionando o numero da mesma
     *
     * @param pub
     */
    private void hacerMeGusta(Publicacion pub) {
        Perfil p = new Perfil();
        Scanner sc = new Scanner(System.in);
        int opciones;
        System.out.println("Da like(1) /n, Volve ao menú (2)");
        opciones = sc.nextInt();
        if (opciones == 1) {
            pub.añadirMeGusta(p);
            System.out.println("Decheslle like á publicación de " + p);
        } else if (opciones == 2) {
            this.mostrarMenuPrincipal(p);
        }
    }

    /** Escribe unha mensaxe a un amigo, rexistra o nome do destinatario e do
     * autor
     *
     * @param remitente
     * @param destinatario
     */
    private void escribirMensaje(Perfil remitente, Perfil destinatario) {
        Scanner sc = new Scanner(System.in);
        int dm;
        System.out.println("Escribir mensaje (1) /n Volver ao menú (2)");
        dm = sc.nextInt();
        if (dm == 1) {
            System.out.println(remitente + "Escribe a túa mensaxe");
            message.texto = sc.nextLine();
            System.out.println(message);
            destinatario.añadirMensaje(message);
            mostrarMenuPrincipal(remitente);

        } else {
            mostrarMenuPrincipal(remitente);
        }
    }

    /** Marca unha mensaxe como leida
     *
     * @param m
     */
    private void marcarMensajeComoLeido(Mensaje m) {
        Scanner sc = new Scanner(System.in);
        int dm;
        System.out.println("Marcar mensaxe como leído (1) /n Volver ao menú (2)");
        dm = sc.nextInt();
        if (dm == 1) {
            m.leido = true;
            mostrarMenuPrincipal(m.remitente);
        } else if (dm == 2) {
            mostrarMenuPrincipal(m.remitente);
        }
    }

    /** Elimina unha mensaxe da clase Mensaje
     *
     * @param m
     */
    private void eliminarMensaje(Mensaje m) {
        Perfil p = new Perfil();
        Scanner sc = new Scanner(System.in);
        int dm;
        System.out.println("Eliminar mensaxe (1) /n Volver ao menú(2)");
        dm = sc.nextInt();
        if (dm == 1) {
            p.eliminarMensaje(m);
        } else if (dm == 2) {
            mostrarMenuPrincipal(p);
        }
    }

}
