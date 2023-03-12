package BusinessLogic.Entities;

public class Usuarios {
    private int    SL_NR_USUARIOS;
    private String SL_USUARIOS;
    private String SL_CONTRASENA;
    
    public Usuarios(String sL_USUARIOS, String sL_CONTRASENA) {
        //SL_NR_USUARIOS = sL_NR_USUARIOS;
        SL_USUARIOS = sL_USUARIOS;
        SL_CONTRASENA = sL_CONTRASENA;
    }

    public int getSL_NR_USUARIOS() {
        return SL_NR_USUARIOS;
    }

    public void setSL_NR_USUARIOS(int sL_NR_USUARIOS) {
        SL_NR_USUARIOS = sL_NR_USUARIOS;
    }

    public String getSL_USUARIOS() {
        return SL_USUARIOS;
    }

    public void setSL_USUARIOS(String sL_USUARIOS) {
        SL_USUARIOS = sL_USUARIOS;
    }

    public String getSL_CONTRASENA() {
        return SL_CONTRASENA;
    }

    public void setSL_CONTRASENA(String sL_CONTRASENA) {
        SL_CONTRASENA = sL_CONTRASENA;
    }
    
}
