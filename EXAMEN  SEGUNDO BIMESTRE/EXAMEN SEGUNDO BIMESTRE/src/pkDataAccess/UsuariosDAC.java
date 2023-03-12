package pkDataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class UsuariosDAC extends SQLiteDataHelper {
    public UsuariosDAC() {
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet slGetAllUsuario() throws AppException{
        try {
            String eaSql = "SELECT * FROM SL_USUARIOS";
            return getResultSet(eaSql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "slGetAllUsuario()");
        }
    }

    public ResultSet slGetClaveByUsuario(String slUsuario) throws AppException{
        try {
            String eaSql = "SELECT SL_CONTRASENA FROM SL_USUARIOS WHERE SL_USUARIOS = '" + slUsuario + "'";
            return getResultSet(eaSql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "slGetClaveByUsuario()");
        }
    }

}
