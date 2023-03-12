package pkDataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class ArmamentoDAC extends SQLiteDataHelper{
    public ArmamentoDAC() {
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet slGetAllCoordenada() throws AppException{
        try {
            String slSql = "SELECT * FROM SL_COORDENADA";
            return getResultSet(slSql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "slGetAllCoordenada()");
        }
    }

    public ResultSet slGetAllCapacidadBelica() throws AppException{
        try {
            String slSql = "SELECT SL_CAPACIDAD_BELICA FROM SL_COORDENADA";
            return getResultSet(slSql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "slGetAllCapacidadBelica()");
        }
    }
}
