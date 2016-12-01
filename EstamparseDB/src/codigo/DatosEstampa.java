package codigo;

import java.awt.image.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

public class DatosEstampa extends ManejoConexion {

    public static ArrayList<BufferedImage> imagenGaleria = new ArrayList<>();
    public static ArrayList<String> CategoriasTemp = new ArrayList<>();
    public static ArrayList<String> GaleriaTemp = new ArrayList<>();
    public static ArrayList<Integer> precioTemp = new ArrayList<>();
    public static ArrayList<Blob> datosEstampa = new ArrayList<>();
    public static int cantidadCamisetas;
    public static int dineroCompra;

    public static ArrayList<String> DatosCarrito = new ArrayList<>();
    public static ArrayList<Integer> PrecioCarrito = new ArrayList<>();
    public static ArrayList<BufferedImage> imagenCarrito = new ArrayList<>();

    PreparedStatement ps = null;

    public boolean verGaleria(String Artista) {
        boolean SiHay = false;
        try {
            establecerConexion();
            String sql = "SELECT ARTISTA,IMAGEN from GALERIA"; // declaracion de consulta 
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();// ejecucion del usuario
            //paso 5: impresion de resultados
            imagenGaleria.clear();
            while (rs.next()) {
                if (rs.getString(1).equals(Artista)) {
                    rs.getBinaryStream(2);
                    imagenGaleria.add(ImageIO.read(rs.getBinaryStream(2)));
                    SiHay = true;
                }
            }
            rs.close();
            ps.close();
            cerrarCon();
            //conexion.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No existe ese artista" + ex);
        }
        return SiHay;
    }

    public boolean insertarCategoria(String Categoria) {
        boolean inserto = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "insert into CATEGORIA VALUES ('" + Categoria + "','NO')";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                inserto = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return inserto;
    }

    public boolean verificarCategoria(String Categoria) {
        boolean igual = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select CATEGORIA from CATEGORIA where CATEGORIA = '" + Categoria + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                igual = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return igual;
    }

    public boolean OcultarCategoria(String Categoria) {
        boolean oculto = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "update CATEGORIA set OCULTO = 'SI' where CATEGORIA = '" + Categoria + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                oculto = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return oculto;
    }

    public boolean restaurarCategoria(String Categoria) {
        boolean restauro = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "update CATEGORIA set OCULTO = 'NO' where CATEGORIA = '" + Categoria + "' and OCULTO = 'SI'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                restauro = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return restauro;
    }

    public void registrarEstampa(String Categoria, String estampa, String Username, int precio, FileInputStream imagen) {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "insert into ESTAMPAS VALUES ('" + estampa + "',?," + precio + ",'" + Categoria + "','" + Username + "')";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.setBinaryStream(1, imagen);
            ps.execute();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
    }

    public boolean cambiarEstampa(String Categoria, String estampa, String estampaNueva, String Username) {
        boolean SiCambio = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "update ESTAMPAS  set NOMBRE='" + estampaNueva + "' ,"
                    + " CATEGORIA='" + Categoria + "'"
                    + "where USERNAME ='" + Username + "' and NOMBRE ='" + estampa + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                SiCambio = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return SiCambio;
    }

    public boolean buscarCategoria() {
        boolean SiHay = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from CATEGORIA";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SiHay = true;
            }
            rs.close();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return SiHay;
    }

    public void ObtenerCategoria() {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from CATEGORIA where OCULTO = 'NO'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CategoriasTemp.add(rs.getString(1));
            }
            rs.close();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
    }

    public void ObtenerEstampaFiltro(String Categoria) {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from ESTAMPAS where CATEGORIA = '" + Categoria + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            GaleriaTemp.clear();
            while (rs.next()) {
                GaleriaTemp.add("Nombre Estampa: " + rs.getString(1)
                        + "\n\nCategoria Estampa: " + Categoria
                        + "\n\nPrecio: " + rs.getInt(3));
                imagenGaleria.add(ImageIO.read(rs.getBinaryStream(2)));
                datosEstampa.add(rs.getBlob(2));
            }
            rs.close();
            ps.close();
            cerrarCon();
        } catch (Exception ex) {
        }
    }

    public void ObtenerEstampa() {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from ESTAMPAS";
            GaleriaTemp.clear();
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GaleriaTemp.add("Nombre Estampa: " + rs.getString(1)
                        + "\n\nCategoria Estampa: " + rs.getString(4)
                        + "\n\nPrecio: " + rs.getInt(3));
                imagenGaleria.add(ImageIO.read(rs.getBinaryStream(2)));
                datosEstampa.add(rs.getBlob(2));
                precioTemp.add(rs.getInt(3));
            }
            rs.close();
            ps.close();
            cerrarCon();
        } catch (Exception ex) {
        }
    }

    public boolean buscarEstampa() {
        boolean SiHay = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from ESTAMPAS";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SiHay = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
        }
        return SiHay;
    }

    public void AlmacenarCarrito(String username, Blob estampa, String datos, int precio) {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "insert into CAMISETA VALUES ('" + username + "',?,'" + datos + "'," + precio + ",'NO',0)";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.setBlob(1, estampa);
            ps.execute();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
    }

    public boolean revisarCarrito(String username) {
        boolean SiHay = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from CAMISETA where USERNAME = '" + username + "' and COMPRA = 'NO'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SiHay = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
        return SiHay;
    }

    public void recojerCarrito(String username) {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select * from CAMISETA where USERNAME = '" + username + "' and COMPRA = 'NO'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                imagenCarrito.add(ImageIO.read(rs.getBinaryStream(2)));
                DatosCarrito.add(rs.getString(3));
                PrecioCarrito.add(rs.getInt(4));
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
    }

    public boolean cambiarCarrito(String username, String Datos, int Precio, int Cantidad) {
        boolean SiCambio = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "update CAMISETA set PRECIO = " + Precio + ", COMPRA ='SI' , CANTIDAD = " + Cantidad
                    + " where USERNAME = '" + username + "' and COMPRA = 'NO' and DATOS ='" + Datos + "'";
            ps = conexion.prepareStatement(InsercionSQL);
            if (ps.executeUpdate() == 1) {
                SiCambio = true;
            }
            ps.close();
            cerrarCon();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
        return SiCambio;
    }

    public void AlmacenarCompra(String username, Blob estampa, String datos, int precio, int cantidad) {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "insert into CAMISETA VALUES ('" + username + "',?,'" + datos + "'," + precio + ",'SI'," + cantidad + ")";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.setBlob(1, estampa);
            ps.execute();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
    }

    public void obtenerDatos() {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select PRECIO,CANTIDAD from CAMISETA where COMPRA= 'SI'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dineroCompra += rs.getInt(1);
                cantidadCamisetas += rs.getInt(2);
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
    }

    public boolean revisarDatos() {
        boolean SiHay = false;
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "select PRECIO,CANTIDAD from CAMISETA where COMPRA= 'SI'";
            ps = conexion.prepareStatement(InsercionSQL);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SiHay = true;
            }
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR DB: " + ex);
        }
        return SiHay;
    }

}
