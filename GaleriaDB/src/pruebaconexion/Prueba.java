package pruebaconexion;

import java.awt.image.*;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.imageio.*;
import javax.swing.JOptionPane;

public class Prueba extends ManejoConexion {

    static ArrayList<InputStream> imagenVector = new ArrayList<>();
    static ArrayList<BufferedImage> imagenGaleria = new ArrayList<>();
    static ArrayList<BufferedImage> imagenGaleriaTemp = new ArrayList<>();

    public Prueba() {
    }
    PreparedStatement ps = null;

    public String verDatos() {
        String datos = "";
        try {
            establecerConexion();
            String sql = "SELECT ARTISTA, ESTAMPA from GALERIA"; // declaracion de consulta 
            ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();// ejecucion del usuario
            //paso 5: impresion de resultados
            while (rs.next()) {
                datos += "Artista: " + rs.getString(1) + "\nEstampa: " + rs.getString(2) + "\n\n";
            }
            rs.close();
            ps.close();
            cerrarCon();
            //conexion.close();
        } catch (Exception ex) {
        }
        return datos;
    }

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
                    imagenVector.add(rs.getBinaryStream(2));
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

    public void recojerDatos(String artista, String estampa, String ciudad, FileInputStream imagen) {
        try {
            establecerConexion();
            String InsercionSQL;
            InsercionSQL = "insert into GALERIA (ARTISTA, ESTAMPA,CIUDAD, IMAGEN)"
                    + "VALUES (?,?,?,?)";
            ps = conexion.prepareStatement(InsercionSQL);
            ps.setString(1, artista);
            ps.setString(2, estampa);
            ps.setString(3, ciudad);
            ps.setBinaryStream(4, imagen);
            ps.execute();
            ps.close();
            cerrarCon();
        } catch (SQLException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
