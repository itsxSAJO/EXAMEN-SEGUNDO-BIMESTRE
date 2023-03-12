package BusinessLogic;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import Framework.AppException;
import pkDataAccess.ArmamentoDAC;
import BusinessLogic.Entities.Armamento;

public class ArmamentoBL {
    public List <Armamento> getAllArmamento() throws AppException {
        try {
            ArmamentoDAC slArmamentoDAC = new ArmamentoDAC();
            List<Armamento> armamentos = new ArrayList<Armamento>();
            ResultSet slRs = slArmamentoDAC.slGetAllCoordenada();
            while (slRs.next()) {
                Armamento a = new Armamento (slRs.getInt("sL_CAPACIDAD_BELICA"), slRs.getString("sL_GEOLOCALIZACION"), slRs.getString("sL_ARSENAL"), slRs.getString("sL_FECHA_HACKEO"));
                armamentos.add(a);
            }
            return armamentos;
        }
        catch (SQLException e) {
            throw new AppException(e, getClass()); 
        }
    }

    public int[] slGetAllCapacidadBelica() throws AppException{
        
        int[] slCapacidadBelica = new int[10];
        int i = 0;

        try {
            ArmamentoDAC slCoordenadaDAC = new ArmamentoDAC();  
            ResultSet slRs = slCoordenadaDAC.slGetAllCapacidadBelica();
            while(slRs.next()) {
                slCapacidadBelica[i++] = slRs.getInt("sL_CAPACIDAD_BELICA");
            }
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
        return slCapacidadBelica;
    }
}
