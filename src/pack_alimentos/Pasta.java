
package pack_alimentos;

public class Pasta extends ClaseCH implements Interface_Alimentos, Interface_CarboHidratos {
    public String tipo_pasta;
    public String tipo_preparacion;
    public String masa;

    public Pasta(String tipo_pasta, String tipo_preparacion, String masa, String nivel_salud, int cantidad, 
                 String textura, String sabor, String vitaminas) {
        super(nivel_salud, cantidad, textura, sabor, vitaminas);
        this.tipo_pasta = tipo_pasta;
        this.tipo_preparacion = tipo_preparacion;
        this.masa = masa;
    }
    
    @Override
    public void comer () {
    System.out.println("la pasta es un alimento que se come a veces");
    }
    
    @Override
    public void salud (){
    System.out.println("es un buen alimento rico pero muy sano");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda solo comer una porcion por dia");
    }

    @Override
    public void consumo_especifico() {
    System.out.println("se suele comer hervido con salsas");
    }

    @Override
    public void rapida() {
    System.out.println("es un alimento muy facil de preparar y rapido");
    }
    
    public void estilo() {
    System.out.println("tiene diversas formas y tamaños");
    }
}
