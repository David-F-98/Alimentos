
package pack_alimentos;

public class Tomate extends ClaseFV implements Interface_Alimentos, Interface_FrutasVerduras {
    public String tipo_tomate;
    public String como_comerlo;

    public Tomate(String tipo_tomate, String como_comerlo, int tamaño, String color, String tipo_alimento, 
                  String nivel_salud, String figura, String textura, String sabor, String vitaminas) {
        super(tamaño, color, tipo_alimento, nivel_salud, figura, textura, sabor, vitaminas);
        this.tipo_tomate = tipo_tomate;
        this.como_comerlo = como_comerlo;
    }
   
    @Override
    public void comer () {
    System.out.println("se puede comer en rodajas o cocinado ");
    }
    
    @Override
    public void salud (){
    System.out.println("es un excelente alimento para la sangre");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda comerse cocinado");
    }
    
    @Override
    public void variedad() {
    System.out.println("tiene muchos usos en platos y sason ");
    }

    @Override
    public void compartir() {
    }

    @Override
    public void aroma() {
    System.out.println("posee un aroma agridulce muy agradable");
    }
    
    public void preferencia() {
    System.out.println("se usa mucho en guisado o ensaladas");
    }
}
