
package pack_alimentos;


public class ClaseFV extends ClaseA_super implements Interface_FrutasVerduras {
    public int tamaño;
    public String color;
    public String tipo_alimento;
    public String nivel_salud;
    public String figura;

    public ClaseFV(int tamaño, String color, String tipo_alimento, String nivel_salud, String figura, String textura, String sabor, String vitaminas) {
        super(textura, sabor, vitaminas);
        this.tamaño = tamaño;
        this.color = color;
        this.tipo_alimento = tipo_alimento;
        this.nivel_salud = nivel_salud;
        this.figura = figura;
    }
    
    @Override
    public void variedad() {}

    @Override
    public void compartir() {}

    @Override
    public void aroma() {}
    
}
