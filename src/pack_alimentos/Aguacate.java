
package pack_alimentos;


public class Aguacate extends ClaseFV implements Interface_Alimentos, Interface_FrutasVerduras {
    public String tipo_aguacate;
    public String como_comerlo;

    public Aguacate(String tipo_aguacate, String como_comerlo, int tamaño, String color, 
                    String tipo_alimento, String nivel_salud, String figura, String textura, String sabor, 
                    String vitaminas) {
        super(tamaño, color, tipo_alimento, nivel_salud, figura, textura, sabor, vitaminas);
        this.tipo_aguacate = tipo_aguacate;
        this.como_comerlo = como_comerlo;
    }
    
    @Override
    public void comer () {
    System.out.println("se puede comer sin nada adicional o acompañado ");
    }
    
    @Override
    public void salud (){
    System.out.println("es un excelente alimento para la sangre");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se puede comer 2 o 3 aguacates cada 2 dias");
    }
    
    @Override
    public void variedad() {
    System.out.println("se pede comer de muchas formas");
    }

    @Override
    public void compartir() {
    System.out.println("es un alimento muy usado para comidas especiales");
    }

    @Override
    public void aroma() {
    System.out.println("no posee un aroma");
    }
    
    public void uso() {
    System.out.println("se puede comer en ensaladas, hacer salsa o aceite");
    }
}
