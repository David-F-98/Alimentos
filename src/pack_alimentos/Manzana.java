
package pack_alimentos;

public class Manzana extends ClaseFV implements Interface_Alimentos, Interface_FrutasVerduras {
     public String tipo_manzana;
     public String como_comerla;

    public Manzana(String tipo_manzana, String como_comerla, int tamaño, String color, String tipo_alimento, 
                   String nivel_salud, String figura, String textura, String sabor, String vitaminas) {
        super(tamaño, color, tipo_alimento, nivel_salud, figura, textura, sabor, vitaminas);
        this.tipo_manzana = tipo_manzana;
        this.como_comerla = como_comerla;
    }
    
    @Override
    public void comer () {
    System.out.println("se puede comer sin nada adicional o acompañado ");
    }
    
    @Override
    public void salud (){
    System.out.println("es un excelente alimento antioxidante");
    }
    
    @Override
    public void cantidad (){
    System.out.println("no hay una cantidad, puedes comerla durnte el dia");
    }
    
    @Override
    public void variedad() {
    System.out.println("hay muchos tipos de manzanas y colores");
    }

    @Override
    public void compartir() {
    System.out.println("perfecta para una merienda ");
    }

    @Override
    public void aroma() {
    System.out.println("posee un aroma dulce ");
    }
    
    public void vida() {
    System.out.println("puede durar muchos dias sin dañarse ");
    }
}
