package codigo;


public class Usuario {
    
    
      
    private String nombre;
    private String documento;
    private String Usuario;
    private String Contraseña;
    private String email;
    private String numeroCuenta;

    public Usuario() {
    }

    public Usuario(String nombre, String documento, String Usuario, String Contraseña, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.email = email;
    }

    public Usuario(String nombre, String documento, String Usuario, String Contraseña, String email, String numeroCuenta) {
        this.nombre = nombre;
        this.documento = documento;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.email = email;
        this.numeroCuenta = numeroCuenta;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    
    
    
    
    
    

}
