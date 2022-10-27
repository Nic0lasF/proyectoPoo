package Usuarios;



public abstract class Usuario {
    
    private String nombreUsuario; // nombre unico
    private String clave;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    public abstract void crearUsuario();
}
