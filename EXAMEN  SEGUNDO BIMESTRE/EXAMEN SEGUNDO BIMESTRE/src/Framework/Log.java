package Framework;
import BusinessLogic.UsuariosBL;
import BusinessLogic.Entities.Usuarios;
import BusinessLogic.PasswordEncrypter;

public class Log {
    UsuariosBL slUsuarioBL = new UsuariosBL();

    public boolean slValidacionIngreso(String slUsuario, String slClave) throws AppException{
        boolean slIngresoExitoso = false;
        
        for (Usuarios slU : slUsuarioBL.slGetAllUsuario()) {
            if(slU.getSL_USUARIOS().equals(slUsuario) && slU.getSL_CONTRASENA().equals(PasswordEncrypter.encrypt(slClave)))
                slIngresoExitoso = true;
        }
        return slIngresoExitoso;
    }
}
