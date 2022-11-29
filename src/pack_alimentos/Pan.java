
package pack_alimentos;

public class Pan extends ClaseCH implements Interface_Alimentos, Interface_CarboHidratos {
    public String tipo_pan;
    public String tipo_preparacion;
    public String masa;

    public Pan(String tipo_pan, String tipo_preparacion, String masa, String nivel_salud, int cantidad, 
               String textura, String sabor, String vitaminas) {
        super(nivel_salud, cantidad, textura, sabor, vitaminas);
        this.tipo_pan = tipo_pan;
        this.tipo_preparacion = tipo_preparacion;
        this.masa = masa;
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
    System.out.println("se recomienda solo comer 2 tajadas por dia");
    }

    @Override
    public void consumo_especifico() {
    System.out.println("se suele comer en los desayunos acompañado");
    }

    @Override
    public void rapida() {
    System.out.println("es un alimento que no necesita preparacion");
    }
    
    public void esponjosidad() {
    System.out.println("suele ser muy esponjoso");
    }
}
