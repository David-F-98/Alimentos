
package pack_alimentos;

public class Pescado extends ClaseG implements Interface_Alimentos, Interface_Grasas {
    public String tipo_pescado;
    public String animal;

    public Pescado(String tipo_pescado, String animal, String nivel_salud, String tipo_contextura, String textura, String sabor, String vitaminas) {
        super(nivel_salud, tipo_contextura, textura, sabor, vitaminas);
        this.tipo_pescado = tipo_pescado;
        this.animal = animal;
    }
    
    @Override
    public void comer () {
    System.out.println("se come frito o sudado");
    }
    
    @Override
    public void salud (){
    System.out.println("es un excelente alimento para aportar energia");
    }
    
    @Override
    public void cantidad (){
    System.out.println("se sugiere comer un pez o medio pez por semana");
    }
    
    @Override
    public void calorias() {
    System.out.println("posee entre 250 y 275 calorias");
    }

    @Override
    public void aporte() {
    System.out.println("aporta energia, fuerza y hierro");
    }

    @Override
    public void sugerir() {
    System.out.println("se sugiere comerse sudado o en plancha");
    }
    
    public void componer() {
    System.out.println("se debe descomponer y quitar espinas");
    }
}
