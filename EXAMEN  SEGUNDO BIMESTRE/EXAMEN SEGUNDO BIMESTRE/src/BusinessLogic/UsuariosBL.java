package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pkDataAccess.UsuariosDAC;
import Framework.AppException;
import BusinessLogic.Entities.Usuarios;

public class UsuariosBL {
    public String slGetClaveUsuario(String slUsuario) throws AppException{
        try {
            UsuariosDAC slUsuariosDAC = new UsuariosDAC();
            ResultSet slRs = slUsuariosDAC.slGetClaveByUsuario(slUsuario);
            String eaClave = new String(slRs.getString("EA_CLAVE"));
            return eaClave;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
    public List<Usuarios> slGetAllUsuario() throws AppException{
        try {
            UsuariosDAC slUsuariosDAC = new UsuariosDAC();
            ResultSet slRs = slUsuariosDAC.slGetAllUsuario();
            List<Usuarios> slUsuario = new ArrayList<Usuarios>();

            while(slRs.next()) {
                Usuarios slU = new Usuarios (slRs.getString("SL_USUARIOS"), slRs.getString("SL_CONTRASENA"));
                slUsuario.add(slU);
            }
            return slUsuario;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    } 
}
