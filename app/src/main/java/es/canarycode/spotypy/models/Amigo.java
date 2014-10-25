package es.canarycode.spotypy.models;

/**
 * Created by victorcanadaojeda on 25/10/14.
 */
public class Amigo {
    private String nombre;
    private String twitter;
    private String ultimaCancion;


    public String getUltimaCancion() {
        return ultimaCancion;
    }

    public void setUltimaCancion(String ultimaCancion) {
        this.ultimaCancion = ultimaCancion;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
