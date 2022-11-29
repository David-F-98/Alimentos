
package pack_alimentos;

public class ClaseA_super implements Interface_Alimentos {
    public String textura;
    public String sabor;
    public String vitaminas;

    public ClaseA_super(String textura, String sabor, String vitaminas) {
        this.textura = textura;
        this.sabor = sabor;
        this.vitaminas = vitaminas;
    }
    
    @Override
    public void comer() {}

    @Override
    public void salud() {}

    @Override
    public void cantidad() {}
    
}
