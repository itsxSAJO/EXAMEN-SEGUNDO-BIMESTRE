package BusinessLogic.Entities;

public class Armamento {
    private int SL_CAPACIDAD_BELICA;
    private String SL_GEOLOCALIZACION;
    private String SL_ARSENAL;
    private String SL_FECHA_HACKEO;

    public Armamento(int sL_CAPACIDAD_BELICA, String sL_GEOLOCALIZACION, String sL_ARSENAL, String sL_FECHA_HACKEO) {
        SL_CAPACIDAD_BELICA = sL_CAPACIDAD_BELICA;
        SL_GEOLOCALIZACION = sL_GEOLOCALIZACION;
        SL_ARSENAL = sL_ARSENAL;
        SL_FECHA_HACKEO = sL_FECHA_HACKEO;
    }

    public int getSL_CAPACIDAD_BELICA() {
        return SL_CAPACIDAD_BELICA;
    }

    public void setSL_CAPACIDAD_BELICA(int sL_CAPACIDAD_BELICA) {
        SL_CAPACIDAD_BELICA = sL_CAPACIDAD_BELICA;
    }

    public String getSL_GEOLOCALIZACION() {
        return SL_GEOLOCALIZACION;
    }

    public void setSL_GEOLOCALIZACION(String sL_GEOLOCALIZACION) {
        SL_GEOLOCALIZACION = sL_GEOLOCALIZACION;
    }

    public String getSL_ARSENAL() {
        return SL_ARSENAL;
    }

    public void setSL_ARSENAL(String sL_ARSENAL) {
        SL_ARSENAL = sL_ARSENAL;
    }

    public String getSL_FECHA_HACKEO() {
        return SL_FECHA_HACKEO;
    }

    public void setSL_FECHA_HACKEO(String sL_FECHA_HACKEO) {
        SL_FECHA_HACKEO = sL_FECHA_HACKEO;
    }
   
}
