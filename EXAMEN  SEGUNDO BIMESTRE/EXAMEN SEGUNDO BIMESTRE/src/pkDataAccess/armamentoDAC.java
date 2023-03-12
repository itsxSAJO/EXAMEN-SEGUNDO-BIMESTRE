package pkDataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class armamentoDAC extends SQLiteDataHelper{
    public armamentoDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllUsuarios() throws AppException {
        try {
            String sql = "SELECT * " +
                         "FROM USUARIOS" + 
                         "WHEN SL_NR_USUARIOS = 1";
            return getResultSet(sql);
        }
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllUsuarios()");
        }
    }

    public ResultSet getAllCapacidadBelica() throws AppException{
        try {
            String sql =    "SELECT  * " +
                            "FROM    COORDENADAS " +
                            "WHERE   SL_CAPACIDAD_BELICA = 1";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllCapacidadBelica()");
        }
    }
}
