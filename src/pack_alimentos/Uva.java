
package pack_alimentos;

public class Uva extends ClaseFV implements Interface_Alimentos, Interface_FrutasVerduras {
    public String tipo_uvas;
    public String como_comerla;

    public Uva(String tipo_uvas, String como_comerla, int tamaño, String color, String tipo_alimento, 
               String nivel_salud, String figura, String textura, String sabor, String vitaminas) {
        super(tamaño, color, tipo_alimento, nivel_salud, figura, textura, sabor, vitaminas);
        this.tipo_uvas = tipo_uvas;
        this.como_comerla = como_comerla;
    }
    
    @Override
    public void comer () {
    System.out.println("se puede comer simple o en ensaladas de frutas ");
    }
    
    @Override
    public void salud (){
    System.out.println("es un excelente alimento para los ojos");
    }
    
    @Override
    public void cantidad (){
    System.out.println("no hay limite");
    }
    
    @Override
    public void variedad() {
    System.out.println("cada tipo de uva posee diferentes vitaminas");
    }

    @Override
    public void compartir() {
    System.out.println("es un alimento usado para diferentes cosas");
    }

    @Override
    public void aroma() {
    System.out.println("posee un aroma dulce");
    }
    
    public void merendar() {
    System.out.println("perfecta para merendar o postre");
    }
}
