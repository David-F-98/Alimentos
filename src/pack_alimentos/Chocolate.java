
package pack_alimentos;

public class Chocolate extends ClaseG implements Interface_Alimentos, Interface_Grasas {
    public String tipo_chocolate;
    public String planta;

    public Chocolate(String tipo_chocolate, String planta, String nivel_salud, 
                     String tipo_contextura, String textura, String sabor, String vitaminas) {
        super(nivel_salud, tipo_contextura, textura, sabor, vitaminas);
        this.tipo_chocolate = tipo_chocolate;
        this.planta = planta;
    }
    
   @Override
    public void comer () {
    System.out.println("es un alimento que se puede comer en cualquier momento");
    }
    
    @Override
    public void salud (){
    System.out.println("no es malo para la luz en cantidades minimas");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda comer un pequeño dulce por dia");
    }
    
    @Override
    public void calorias() {
    System.out.println("tiene 120 calorias");
    }

    @Override
    public void aporte() {
    System.out.println("aporta muchas vitaminas en especial para el sistema nervioso");
    }

    @Override
    public void sugerir() {
    System.out.println("se sujiere comer chocolate natural o negro");
    }
     
}
