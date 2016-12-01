
public class ClienteFinal extends Usuario{

    private String numCuenta;
    private String direccionEnvio;
    private String telefono;

    public ClienteFinal(String nombre, String documento, String userName, String password, String correoElectronico) {
        super(nombre, documento, userName, password, correoElectronico);
    }
    
    
   
    @Override
    public boolean ingresarSistema(String userName, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void verCatalogoEstampa(){
        
    }
    public void verEstadoCompra(){
        
    }
    public void diseñarCamiseta(){
        
    }
    public void verCatalogoCamiseta(){
        
    }
    public void configurarCamiseta(){
        
    }
    
    
    @Override
    public void salirSistema() {
     
        System.exit(0);
    }
        
}
