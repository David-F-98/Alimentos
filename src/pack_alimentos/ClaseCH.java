
package pack_alimentos;

public class ClaseCH extends ClaseA_super implements Interface_CarboHidratos {
    public String nivel_salud;
    public int cantidad;

    public ClaseCH(String nivel_salud, int cantidad, String textura, String sabor, String vitaminas) {
        super(textura, sabor, vitaminas);
        this.nivel_salud = nivel_salud;
        this.cantidad = cantidad;
    }
    

   
    @Override
    public void consumo_especifico() {}

    @Override
    public void rapida() {}
    
}
