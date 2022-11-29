
package pack_alimentos;

public class Queso extends ClaseG implements Interface_Alimentos, Interface_Grasas {
     public String tipo_queso;
     public String animal;

    public Queso(String tipo_queso, String animal, String nivel_salud, String tipo_contextura, String textura, String sabor, String vitaminas) {
        super(nivel_salud, tipo_contextura, textura, sabor, vitaminas);
        this.tipo_queso = tipo_queso;
        this.animal = animal;
    }

    
    @Override
    public void comer () {
    System.out.println("se puede comer al momento o acompañado");
    }
    
    @Override
    public void salud (){
    System.out.println("es bueno para la salud pero no tan seguido");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se recomienda comer 12 gramos por dia");
    }
    
    @Override
    public void calorias() {
    System.out.println("tiene entre 190 y 200 calorias");
    }

    @Override
    public void aporte() {
    System.out.println("aporta vitamina y calsio");
    }

    @Override
    public void sugerir() {
    System.out.println("se sugiere comer acompañado");
    }
    
}
