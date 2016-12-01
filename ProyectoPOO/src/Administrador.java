
public class Administrador extends Usuario {

    public Administrador(String nombre, String documento, String userName, String password, String correoElectronico) {
        super(nombre, documento, userName, password, correoElectronico);
    }


    @Override
    public boolean ingresarSistema(String userName, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean agregarUsuarioNuevo(String nombre, String documento, String userName, String password, String correoElectronico) {
        boolean confirmacion = false;
        
        return confirmacion;
    }

    public void modificarTema() {

    }

    public void eliminarUsuario() {

    }

    public void verEstadoVentas() {

    }

    @Override
    public void salirSistema() {
        System.exit(0);
    }

}
