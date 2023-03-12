package BusinessLogic.Entities;

public class Armamento {
    private int SL_CAPACIDAD_BELICA;
    private int SL_GEOLOCALIZACION;
    private int SL_ARSENAL;
    private int SL_FECHA_HACKEO;

    
    public Armamento(int sL_CAPACIDAD_BELICA, int sL_GEOLOCALIZACION, int sL_ARSENAL, int sL_FECHA_HACKEO) {
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


    public int getSL_GEOLOCALIZACION() {
        return SL_GEOLOCALIZACION;
    }


    public void setSL_GEOLOCALIZACION(int sL_GEOLOCALIZACION) {
        SL_GEOLOCALIZACION = sL_GEOLOCALIZACION;
    }


    public int getSL_ARSENAL() {
        return SL_ARSENAL;
    }


    public void setSL_ARSENAL(int sL_ARSENAL) {
        SL_ARSENAL = sL_ARSENAL;
    }


    public int getSL_FECHA_HACKEO() {
        return SL_FECHA_HACKEO;
    }


    public void setSL_FECHA_HACKEO(int sL_FECHA_HACKEO) {
        SL_FECHA_HACKEO = sL_FECHA_HACKEO;
    }

}
