
package pack_alimentos;

public class ClaseG extends ClaseA_super implements Interface_Grasas {
   public String nivel_salud;
   public String tipo_contextura;

    public ClaseG(String nivel_salud, String tipo_contextura, String textura, String sabor, String vitaminas) {
        super(textura, sabor, vitaminas);
        this.nivel_salud = nivel_salud;
        this.tipo_contextura = tipo_contextura;
    }
   
    @Override
    public void calorias() {}

    @Override
    public void aporte() {}

    @Override
    public void sugerir() {}
    
}
