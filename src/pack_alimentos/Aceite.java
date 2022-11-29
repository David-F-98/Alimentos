
package pack_alimentos;

public class Aceite extends ClaseG implements Interface_Alimentos, Interface_Grasas {
    public String tipo_aceite;
    public String planta;

    public Aceite(String tipo_aceite, String planta, String nivel_salud, String tipo_contextura, String textura, 
                  String sabor, String vitaminas) {
        super(nivel_salud, tipo_contextura, textura, sabor, vitaminas);
        this.tipo_aceite = tipo_aceite;
        this.planta = planta;
    }
  
    @Override
    public void comer () {
    System.out.println("no se come, se usa para fritar o cocinar alimentos");
    }
    
    @Override
    public void salud (){
    System.out.println("es poco sano ya que es un alimento graso y en cantidad es dañino");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda usar solo 1/3 de taza para cocinar");
    }
    
    @Override
    public void calorias() {
    System.out.println("tiene 246 calorias");
    }

    @Override
    public void aporte() {
    System.out.println("aporta algunas vitaminas");
    }

    @Override
    public void sugerir() {
    System.out.println("se recomienda no consumir tan seguido ");
    }
    
    public void cocina() {
    System.out.println("hay tipos de aceite y se usan para fritas o cocinar en especial carnes");
    }
}
