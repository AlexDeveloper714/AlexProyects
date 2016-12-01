public class Artista extends Usuario {

    private String numCuenta;

    public Artista(String nombre, String documento, String userName, String password, String correoElectronico) {
        super(nombre, documento, userName, password, correoElectronico);
    }
    
  

    @Override
    public boolean ingresarSistema(String userName, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void cargarCatalogoEstampas(){
        //boleano
    }
    
    
    @Override
    public void salirSistema() {
        System.exit(0);
    }
    
}
