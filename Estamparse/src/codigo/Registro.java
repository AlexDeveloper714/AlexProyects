package codigo;

import java.util.*;

public class Registro {

    static ArrayList<Cliente> arrayCliente = new ArrayList<>();
    static ArrayList<Artista> arrayArtista = new ArrayList<>();
    static ArrayList<Administrador> arrayAdmin = new ArrayList<>();
    public static int x = 0;
    public static String UsuarioActivo = "";
    public static int conteo = 0;

    public void agregarUsuario() {
        if (conteo == 0) {
            arrayAdmin.add(new Administrador("Carlos", "12345", "c", "c", "carlos@gmail.com"));
            /*Temporal*/
            arrayCliente.add(new Cliente("Carlos", "12345", "a", "a", "carlos@gmail.com", ""));
            arrayArtista.add(new Artista("Carlos", "12345", "b", "b", "carlos@gmail.com", "2222"));
            conteo++;
        }

    }

    public boolean EliminarAdmin(String tipoUsuario, String UserName) {
        boolean eliminar = false;
        if (tipoUsuario.equals("Cliente")) {
            for (int i = 0; i < arrayCliente.size() && eliminar == false; i++) {
                if (arrayCliente.get(i).getUsuario().equals(UserName)) {
                    arrayCliente.remove(i);
                    eliminar = true;
                }
            }

        } else {
            for (int i = 0; i < arrayArtista.size() && eliminar == false; i++) {
                if (arrayArtista.get(i).getUsuario().equals(UserName)) {
                    arrayArtista.remove(i);
                    eliminar = true;
                }
            }

        }
        return eliminar;
    }

    public boolean CambiarDatos(String UserName, String nombre, String Documento, String Contraseña, String contraseña2, String Email, String Cuenta) {
        boolean Cambio = false;
        for (int i = 0; i < arrayCliente.size() && Cambio == false; i++) {
            if (arrayCliente.get(i).getUsuario().equals(UserName) && arrayCliente.get(i).getContraseña().equals(Contraseña)) {
                arrayCliente.get(i).setNombre(nombre);
                arrayCliente.get(i).setDocumento(Documento);
                arrayCliente.get(i).setContraseña(contraseña2);
                arrayCliente.get(i).setEmail(Email);
                arrayCliente.get(i).setNumeroCuenta(Cuenta);
                Cambio = true;
            }
        }

        for (int i = 0; i < arrayArtista.size() && Cambio == false; i++) {
            if (arrayArtista.get(i).getUsuario().equals(UserName) && arrayArtista.get(i).getContraseña().equals(Contraseña)) {
                arrayArtista.get(i).setNombre(nombre);
                arrayArtista.get(i).setDocumento(Documento);
                arrayArtista.get(i).setContraseña(contraseña2);
                arrayArtista.get(i).setEmail(Email);
                arrayArtista.get(i).setNumeroCuenta(Cuenta);
                Cambio = true;
            }
        }
        return Cambio;
    }

    public int BuscarUsuario(String UserName) {
        int buscarExito = 0;

        for (int i = 0; i < arrayCliente.size() && buscarExito == 0; i++) {
            if (arrayCliente.get(i).getUsuario().equals(UserName)) {
                buscarExito = 1;
            }
        }

        for (int i = 0; i < arrayArtista.size() && buscarExito == 0; i++) {
            if (arrayArtista.get(i).getUsuario().equals(UserName)) {
                buscarExito = 2;
            }
        }

        return buscarExito;
    }

    public boolean buscarIgual(String UserName) {
        boolean igual = false;
        for (int i = 0; i < arrayCliente.size() && igual == false; i++) {
            if (arrayCliente.get(i).getUsuario().equals(UserName)) {
                igual = true;
            }
        }
        for (int i = 0; i < arrayArtista.size() && igual == false; i++) {
            if (arrayArtista.get(i).getUsuario().equals(UserName)) {
                igual = true;
            }
        }
        for (int i = 0; i < arrayAdmin.size() && igual == false; i++) {
            if (arrayAdmin.get(i).getUsuario().equals(UserName)) {
                igual = true;
            }
        }
        return igual;
    }

    public void ingresarUsuario(String nombre, String documento, String username, String password, String Email, String numeroCuenta) {
        if (numeroCuenta.equals("")) {
            arrayCliente.add(new Cliente(nombre, documento, username, password, Email, numeroCuenta));
        } else {
            arrayArtista.add(new Artista(nombre, documento, username, password, Email, numeroCuenta));
        }
    }

    public boolean ingresarSistema(String usuario, String contraseña) {
        boolean ingreso = false;
        /*Cambio de condicion usando arrayList*/
        for (int i = 0; i < arrayAdmin.size() && ingreso == false; i++) {
            if (arrayAdmin.get(i).getUsuario().equals(usuario) && arrayAdmin.get(i).getContraseña().equals(contraseña)) {
                x = 0;
                ingreso = true;
            }
        }
        for (int i = 0; i < arrayCliente.size() && ingreso == false; i++) {
            if (arrayCliente.get(i).getUsuario().equals(usuario) && arrayCliente.get(i).getContraseña().equals(contraseña)) {
                ingreso = true;
                x = 1;
                UsuarioActivo = usuario;
            }
        }
        for (int i = 0; i < arrayArtista.size() && ingreso == false; i++) {
            if (arrayArtista.get(i).getUsuario().equals(usuario) && arrayArtista.get(i).getContraseña().equals(contraseña)) {
                ingreso = true;
                x = 2;
                UsuarioActivo = usuario;
            }
        }

        return ingreso;
    }

}
