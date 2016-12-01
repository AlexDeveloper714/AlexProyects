package codigo;

import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class DatosRegistro extends ManejoConexion {

    PreparedStatement ps = null;
    public static String TipoUsuario = "";
    public static String UsuarioActivo = "";
    public static ArrayList<String> ColorLista = new ArrayList<>();
    public static ArrayList<String> TipoLista = new ArrayList<>();
    public static ArrayList<String> TallaLista = new ArrayList<>();
    public static int id = 3;

    public void crearTablas() {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "CREATE TABLE  USUARIOS "
                    + "(NOMBRE VARCHAR2(200), "
                    + "APELLIDO VARCHAR2(200),"
                    + "USERNAME VARCHAR2(200),"
                    + "CONTRASEÑA VARCHAR2(200),"
                    + "USUARIO VARCHAR2(200),"
                    + "EMAIL VARCHAR2(200), "
                    + "CUENTA NUMBER(38, 1))";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            InsercionSQL = "CREATE TABLE REGISTRO "
                    + "(DATO VARCHAR2(200), "
                    + "TIPO VARCHAR2(200),"
                    + "OCULTO VARCHAR2(200))";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            InsercionSQL = "CREATE TABLE CATEGORIA "
                    + "(CATEGORIA VARCHAR2(200), "
                    + "OCULTO VARCHAR2(200))";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            InsercionSQL = "CREATE TABLE ESTAMPAS "
                    + "(NOMBRE VARCHAR2(200), "
                    + "ESTAMPA BLOB,"
                    + "PRECIO NUMBER(38, 1),"
                    + "CATEGORIA VARCHAR2(200),"
                    + "USERNAME VARCHAR2(200))";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            InsercionSQL = "CREATE TABLE CAMISETA "
                    + "(USERNAME VARCHAR2(200), "
                    + "ESTAMPA BLOB,"
                    + "DATOS VARCHAR2(200),"
                    + "PRECIO NUMBER(38, 1),"
                    + "COMPRA VARCHAR2(200),"
                    + "CANTIDAD NUMBER(38, 1))";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            cerrarCon();
        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Tu excepción es: " + ex);
        }
    }

    public void registrarUsuariosDefecto() {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "insert into USUARIOS VALUES ('Alexander','Diaz','a','a','Cliente','ala@co',1)";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            InsercionSQL = "insert into USUARIOS VALUES ('Cristian','Diaz','b','b','Artista','ala@co',2)";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            InsercionSQL = "insert into USUARIOS VALUES('Liliana','Diaz','c','c','Administrador','ala@co',3) ";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.execute();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            Logger.getLogger(DatosRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean registrarUsuarios(String nombre, String apellido, String username, String password, String tipoUsuario, String Email, String Cuenta) {
        boolean Siregistro = false;
        try {
            establecerConexion();
            String InsercionSQL;
            if (tipoUsuario.equals("Cliente")) {
                id++;
                Cuenta = Integer.toString(id);
            }
            InsercionSQL = "insert into USUARIOS VALUES ('" + nombre + "',"
                    + "'" + apellido + "',"
                    + "'" + username + "',"
                    + "'" + password + "',"
                    + "'" + tipoUsuario + "',"
                    + "'" + Email + "'," + Integer.parseInt(Cuenta) + ")";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                Siregistro = true;
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {
        }
        return Siregistro;
    }

    public boolean actualizarUsuarios(String nombre, String apellido, String username, String password, String passwordAnt, String tipoUsuario, String Email, String Cuenta) {
        boolean SiActualizo = false;
        try {
            establecerConexion();
            String sql = "SELECT * from USUARIOS where USERNAME ='" + username + "' and CONTRASEÑA ='" + passwordAnt + "'";
            ps = conexion.prepareStatement(sql);
            if (ps.execute()) {
                SiActualizo = true;
                sql = "update USUARIOS  set NOMBRE='" + nombre + "',"
                        + "APELLIDO='" + apellido + "',"
                        + "CONTRASEÑA='" + password + "',"
                        + "EMAIL='" + Email + "'"
                        + "where USERNAME ='" + username + "'";
                ps = conexion.prepareStatement(sql);
                ps.execute();
                if (username.equals("Artista")) {
                    sql = "update USUARIOS  set CUENTA='" + Cuenta + "'"
                            + "where USERNAME ='" + username + "'";
                    ps = conexion.prepareStatement(sql);
                    ps.execute();
                }
            }
            ps.close();
            cerrarCon();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error DB");
        }
        return SiActualizo;
    }

    public boolean revisarDatos(String userName) {
        boolean datos = false;
        try {
            establecerConexion();
            String sql = "SELECT USERNAME from USUARIOS where USERNAME = '" + userName + "'"; // declaracion de consulta 
            ps = conexion.prepareStatement(sql);
            if (ps.executeUpdate() == 1) {
                datos = true;
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {

        }
        return datos;
    }

    public boolean elmininarUsuarios(String userName, String TipoUsuario) {
        boolean datos = false;
        try {
            establecerConexion();
            String sql = "DELETE from USUARIOS where USERNAME = '" + userName + "'"; // declaracion de consulta 
            ps = conexion.prepareStatement(sql);
            if (ps.executeUpdate() == 1) {
                datos = true;
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {

        }
        return datos;
    }

    public boolean ingresarUsuario(String userName, String password) {
        boolean datos = false;
        try {
            establecerConexion();
            String sql = "SELECT USERNAME,CONTRASEÑA,USUARIO from USUARIOS "
                    + "where USERNAME = '" + userName
                    + "' and CONTRASEÑA = '" + password + "'";
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                datos = true;
                UsuarioActivo = userName;
                TipoUsuario = rs.getString(3);
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {

        }
        return datos;
    }

    public void registrarTallasDefecto() {
        try {
            establecerConexion();
            String InsercionSQL;
            String tallasComunes = "XS,S,M,L,XL,XXL";
            String[] tallasEstandar = tallasComunes.split(",");
            for (int i = 0; i < tallasEstandar.length; i++) {
                InsercionSQL = "insert into REGISTRO VALUES ('" + tallasEstandar[i] + "','TALLA','NO')";
                ps = conexion.prepareStatement(InsercionSQL);
                ps.execute();
            }
            String ColoresComunes = "Amarillo,Azul,Rojo,Negro,Gris,"
                    + "Blanco,Rosado,Morado,"
                    + "Violeta,Verde,"
                    + "Naranja,Cafe";
            String[] colorEstandar = ColoresComunes.split(",");
            for (String colorEstandar1 : colorEstandar) {
                InsercionSQL = "insert into REGISTRO VALUES ('" + colorEstandar1 + "','COLOR','NO')";
                ps = conexion.prepareStatement(InsercionSQL);
                ps.execute();
            }
            String TipoCamisetaComunes = "Polo,Manga larga cuello V,"
                    + "Manga larga cuello tortuga,Manga corta cuello V,"
                    + "Manga corta cuello tortuga";
            String[] tipoCamisetaEstandar = TipoCamisetaComunes.split(",");
            for (String tipoCamisetaEstandar1 : tipoCamisetaEstandar) {
                InsercionSQL = "insert into REGISTRO VALUES ('" + tipoCamisetaEstandar1 + "','TIPO','NO')";
                ps = conexion.prepareStatement(InsercionSQL);
                ps.execute();
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
    }

    public boolean verificarTablaVacia() {
        boolean SiHay = false;
        int cantidad = 0, cantidad2 = 0, cantidad3 = 0;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "SELECT TIPO FROM REGISTRO where TIPO = 'TALLA'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cantidad++;
            }
            InsercionSQL = "SELECT TIPO FROM REGISTRO where TIPO = 'COLOR'";
            ps = conexion.prepareStatement(InsercionSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                cantidad2++;
            }
            InsercionSQL = "SELECT TIPO FROM REGISTRO where TIPO = 'TIPO'";
            ps = conexion.prepareStatement(InsercionSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                cantidad3++;
            }
            if (cantidad > 0 || cantidad2 > 0 || cantidad3 > 0) {
                SiHay = true;
            }
            rs.close();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Excepcio DB: " + ex);

        }
        return SiHay;
    }

    public void obtenerTallas() {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "SELECT DATO FROM REGISTRO where TIPO = 'TALLA' and OCULTO = 'NO'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TallaLista.add(rs.getString(1));
            }
            InsercionSQL = "SELECT DATO FROM REGISTRO where TIPO = 'TIPO' and OCULTO = 'NO'";
            ps = conexion.prepareStatement(InsercionSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoLista.add(rs.getString(1));
            }
            InsercionSQL = "SELECT DATO FROM REGISTRO where TIPO = 'COLOR' and OCULTO = 'NO'";
            ps = conexion.prepareStatement(InsercionSQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ColorLista.add(rs.getString(1));
            }
            rs.close();
            ps.close();
            cerrarCon();
        } catch (Exception ex) {

        }
    }

    public boolean agregarDatos(String Dato, String Tipo) {
        boolean Agregar = false;
        try {
            if (!Tipo.equals("TALLA")) {
                establecerConexion();
                String InsercionSQL;
                InsercionSQL = "insert into REGISTRO VALUES ('" + Dato + "','" + Tipo + "','NO')";
                ps = conexion.prepareStatement(InsercionSQL);
                if (ps.executeUpdate() == 1) {
                    Agregar = true;
                }
                ps.close();
                cerrarCon();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB");
        }
        return Agregar;
    }

    public boolean ocultarDatos(String Dato, String Tipo) {
        boolean Agregar = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "update REGISTRO set OCULTO = 'SI' "
                    + "where DATO ='" + Dato + "' and TIPO = '" + Tipo + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                Agregar = true;
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB");
        }
        return Agregar;
    }

    public boolean restaurarDatos(String Dato, String Tipo) {
        boolean Agregar = false;
        try {
            if (!Tipo.equals("TALLA")) {
                establecerConexion();
                String InsercionSQL;
                InsercionSQL = "update REGISTRO set OCULTO = 'NO' "
                        + "where DATO ='" + Dato + "' and TIPO = '" + Tipo + "' and OCULTO = 'SI'";
                ps = conexion.prepareStatement(InsercionSQL);
                if (ps.executeUpdate() == 1) {
                    Agregar = true;
                }
                ps.close();
                cerrarCon();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB");
        }
        return Agregar;
    }

    public boolean verificarDatos(String Dato, String Tipo) {
        boolean verificar = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from REGISTRO where DATO = '" + Dato + "' and TIPO = '" + Tipo + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                verificar = true;
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {

        }
        return verificar;
    }

}
