package models;

public class VendedoresModel {
    private String codigo;
    private String nombre;

    public VendedoresModel(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return (this.getCodigo() + " - " + this.getNombre());
    }
    
    
}
