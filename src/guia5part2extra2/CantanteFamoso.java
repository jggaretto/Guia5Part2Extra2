
package guia5part2extra2;

public class CantanteFamoso {
    private String nombre;
    private String discoConMasVentas;
    
    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }
    
    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }
}
