
package pack_alimentos;

public class Arroz extends ClaseCH implements Interface_Alimentos, Interface_CarboHidratos {
    public String tipo_arroz;
    public String tipo_preparacion;
    public String planta;

    public Arroz(String tipo_arroz, String tipo_preparacion, String planta, String nivel_salud, int cantidad, 
                 String textura, String sabor, String vitaminas) {
        super(nivel_salud, cantidad, textura, sabor, vitaminas);
        this.tipo_arroz = tipo_arroz;
        this.tipo_preparacion = tipo_preparacion;
        this.planta = planta;
    }

   @Override
    public void comer () {
    System.out.println("este es un alimento que se come casi todos los dias");
    }
    
    @Override
    public void salud (){
    System.out.println("es un buen alimento rico y sano pero no en cantidad");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda solo comer 1/3 del plato dos veces al dia");
    }

    @Override
    public void consumo_especifico() {
    System.out.println("se suele comer en los almuerzos y cenas");
    }

    @Override
    public void rapida() {
    System.out.println("es un alimento facil de preparar");
    }
    
    public void estilos() {
    System.out.println("es un alimento que tiene muchas formas de preparar y estilos");
    } 
}
