
package codigo;

import java.sql.*;
import javax.swing.*;

public abstract class ManejoConexion {

    protected Connection conexion;

    protected void establecerConexion()  {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KAITO", "1412");

        } catch (SQLException exception) {

        }
    }

    protected void cerrarCon() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ya estas conectado...");
        }
    }
}
