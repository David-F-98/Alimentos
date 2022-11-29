
package pack_alimentos;

public class Papa extends ClaseCH implements Interface_Alimentos, Interface_CarboHidratos  {
    public String tipo_papa;
    public String tipo_preparacion;
    public String planta;

    public Papa(String tipo_papa, String tipo_preparacion, String planta, String nivel_salud, int cantidad, 
                String textura, String sabor, String vitaminas) {
        super(nivel_salud, cantidad, textura, sabor, vitaminas);
        this.tipo_papa = tipo_papa;
        this.tipo_preparacion = tipo_preparacion;
        this.planta = planta;
    }
    
    @Override
    public void comer () {
    System.out.println("este es un alimento que se come casi todos los dias");
    }
    
    @Override
    public void salud (){
    System.out.println("es un buen alimento solo si aumentas masa muscular");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda solo comer dos papas medianas cada 2 dias");
    }

    @Override
    public void consumo_especifico() {
    System.out.println("se suele comer mas hervida");
    }

    @Override
    public void rapida() {
    System.out.println("es un ingrediente que va en comidas rapidas");
    }
    
    public void preferida() {
    System.out.println("es el 3er alimento mas preferido ");
    }
    
}
