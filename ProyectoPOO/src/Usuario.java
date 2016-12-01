

public abstract class Usuario {
    
    private String nombre;
    private String documento;
    private String userName;
    private String password;
    private String correoElectronico;

    public Usuario(String nombre, String documento, String userName, String password, String correoElectronico) {
        this.nombre = nombre;
        this.documento = documento;
        this.userName = userName;
        this.password = password;
        this.correoElectronico = correoElectronico;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    
    
    public abstract boolean ingresarSistema(String userName, String password);
    
    public abstract void salirSistema();
    
}
