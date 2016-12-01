
package pruebaconexion;

import java.sql.*;
import java.util.logging.*;

public abstract class ManejoConexion {

    protected Connection conexion;
    protected String driver = "oracle.jdbc.OracleDriver";

    protected void establecerConexion() throws SQLException {
        try {
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "KAITO", "1412");

        } catch (SQLException exception) {
            throw new SQLException("ERROR: ConsultaDAO obteniendo una conexi�n.");
        }
    }

    protected void cerrarCon() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
    }
}
