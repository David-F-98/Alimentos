
package pack_alimentos;

public class main {
    
    public static void main(String[] args){
    //........................................FRUTAS Y VERDURAS.......................................................    
    Manzana m1 = new Manzana ("campera", "en rodajas", 10,
                              "roja", "fruta", "mayor", "semiredonda", 
                              "lisa", "dulce", "A, B2, B5 y B6");
    //................................................................................................................
    Aguacate a1 = new Aguacate ("criollo", "ensaladas o simple", 15,
                                "verde", "verdura","alto", "gota ovalada", 
                                "semilisa","simple", "C, B6 y E");
    //................................................................................................................
    Uva u1 = new Uva ("tempranillo", "completas", 2,
                              "morazul", "fruta", "mayor", "redonda", 
                              "lisa", "agridulce", "A, C, K");
    //................................................................................................................
    Tomate t1 = new Tomate ("camperino", "cocinado", 7,
                              "rojo", "verdura", "medio", "semiovalada", 
                              "lisa", "semiagrio", "A y C");
    
    //..............................................GRASAS............................................................
    Aceite a2 = new Aceite ("gourmet", "oliva",
                              "bajo", "liquida", "grasosa", "insipido", 
                              "A, D y K");
    //................................................................................................................
    Chocolate c1 = new Chocolate ("negro", "cacao",
                              "medio", "solida", "lisa", "dulce", 
                              "B1, B2 y B3");
    //................................................................................................................
    Queso q1 = new Queso ("crema", "vaca",
                              "alto", "solida", "blanda", "salado", 
                              "A y D");
    //................................................................................................................
    Pescado p1 = new Pescado ("sushi", "salmon",
                              "alto", "solido", "blando", "salado", 
                              "B1, B2 y B3");
    
    //...........................................CARBO HIDRATOS........................................................
    Papa p2 = new Papa ("pastusa", "hervida", "papera", "medio", 2, 
            "dura", "simple", "hierro y C");
    //................................................................................................................
    Pasta p3 = new Pasta ("espagetti", "hervida", "trigo", "medio", 1, 
            "blandita", "insipido", "H, E y B");
    //................................................................................................................
    Pan p4 = new Pan ("natural", "ninguna", "trigo", "medio", 2, 
            "esponjosa", "seco", "H, E y B");
    //................................................................................................................
    Arroz a3 = new Arroz ("natural", "hervido", "arrocera", "alto", 1, 
            "masosa", "simple", "hierro y C");
    //................................................................................................................
    
    System.out.println("=========================================================================================");
    System.out.println("|              DATOS DE LAS FRITAS Y VERDURAS, GRASAS Y CARBO HIDRATOS                  |");
    System.out.println("=========================================================================================");
    System.out.println("|                             LAS FRITAS Y VERDURAS                                     |");
    System.out.println("=========================================================================================");
    System.out.println("|                 |      MANZANA      |      AGUACATE      |     UVA     |    TOMATE    |");
    System.out.println("|.......................................................................................|");
    System.out.println(  "|tipo de alimento |"+m1.tipo_manzana+"            |"+a1.tipo_aguacate+"             |"+u1.tipo_uvas+"  |"+t1.tipo_tomate+"     |");
    System.out.println(  "|como se come     |"+m1.como_comerla+"         |"+a1.como_comerlo+"  |"+u1.como_comerla+"    |"+t1.como_comerlo+"      |");
    System.out.println(  "|figura           |"+m1.figura+"        |"+a1.figura+"        |"+u1.figura+"      |"+t1.figura+"   |");
    System.out.println(  "|textura          |"+m1.textura+"               |"+a1.textura+"            |"+u1.textura+"         |"+t1.textura+"          |");
    System.out.println(  "|sabor            |"+m1.sabor+"              |"+a1.sabor+"              |"+u1.sabor+"    |"+t1.sabor+"     |");
    System.out.println(  "|tamaño en cm     |"+m1.tamaño+"                 |"+a1.tamaño+"                  |"+u1.tamaño+"            |"+t1.tamaño+"             |");
    System.out.println(  "|color            |"+m1.color+"               |"+a1.color+"               |"+u1.color+"      |"+t1.color+"          |");
    System.out.println(  "|tipo de alimento |"+m1.tipo_alimento+"              |"+a1.tipo_alimento+"             |"+u1.tipo_alimento+"        |"+t1.tipo_alimento+"       |");
    System.out.println(  "|nivel de salud   |"+m1.nivel_salud+"              |"+a1.nivel_salud+"                |"+u1.nivel_salud+"        |"+t1.nivel_salud+"         |");
    System.out.println(  "|vitaminas        |"+m1.vitaminas+"     |"+a1.vitaminas+"           |"+u1.vitaminas+"      |"+t1.vitaminas+"         |");
    System.out.println("=========================================================================================");
    System.out.println("|                                      GRASAS                                           |");
    System.out.println("=========================================================================================");
    System.out.println("|                 |      ACEITE     |     CHOCOLATE     |     QUESO     |    PESCADO    |");
    System.out.println("|.......................................................................................|");
    System.out.println(  "|tipo de alimento |"+a2.tipo_aceite+"          |"+c1.tipo_chocolate+"              |"+q1.tipo_queso+"          |"+p1.tipo_pescado+"          |");
    System.out.println(  "|planta o animal  |"+a2.planta+"            |"+c1.planta+"              |"+q1.animal+"           |"+p1.animal+"         |");
    System.out.println(  "|tipo contextura  |"+a2.tipo_contextura+"          |"+c1.tipo_contextura+"             |"+q1.tipo_contextura+"         |"+p1.tipo_contextura+"         |");
    System.out.println(  "|textura          |"+a2.textura+"          |"+c1.textura+"               |"+q1.textura+"         |"+p1.textura+"         |");
    System.out.println(  "|sabor            |"+a2.sabor+"         |"+c1.sabor+"              |"+q1.sabor+"         |"+p1.sabor+"         |");
    System.out.println(  "|nivel de salud   |"+a2.nivel_salud+"             |"+c1.nivel_salud+"              |"+q1.nivel_salud+"           |"+p1.nivel_salud+"           |");
    System.out.println(  "|vitaminas        |"+a2.vitaminas+"         |"+c1.vitaminas+"        |"+q1.vitaminas+"          |"+p1.vitaminas+"    |");
    System.out.println("=========================================================================================");
    System.out.println("|                                   CARBO HIDRATOS                                      |");
    System.out.println("=========================================================================================");
    System.out.println("|                 |        PAPA      |      PASTA      |      PAN      |      ARROZ     |");
    System.out.println("|.......................................................................................|");
    System.out.println(  "|tipo de alimento |"+p2.tipo_papa+"           |"+p3.tipo_pasta+"        |"+p4.tipo_pan+"        |"+a3.tipo_arroz+"         |");
    System.out.println(  "|tipo preparacion |"+p2.tipo_preparacion+"           |"+p3.tipo_preparacion+"          |"+p4.tipo_preparacion+"        |"+a3.tipo_preparacion+"         |");
    System.out.println(  "|planta o masa    |"+p2.planta+"            |"+p3.masa+"            |"+p4.masa+"          |"+a3.planta+"        |");
    System.out.println(  "|cantidad         |"+p2.cantidad+"                 |"+p3.cantidad+"                |"+p4.cantidad+"              |"+a3.cantidad+"               |");
    System.out.println(  "|textura          |"+p2.textura+"              |"+p3.textura+"         |"+p4.textura+"      |"+a3.textura+"          |");
    System.out.println(  "|sabor            |"+p2.sabor+"            |"+p3.sabor+"         |"+p4.sabor+"           |"+a3.sabor+"          |");
    System.out.println(  "|nivel de salud   |"+p2.nivel_salud+"             |"+p3.nivel_salud+"            |"+p4.nivel_salud+"          |"+a3.nivel_salud+"            |");
    System.out.println(  "|vitaminas        |"+p2.vitaminas+"        |"+p3.vitaminas+"         |"+p4.vitaminas+"       |"+a3.vitaminas+"      |");
    System.out.println("|.......................................................................................|");
    //metodos de las clases
    System.out.println("=========================================================");
    System.out.println("                         MANZANA                         ");
    m1.comer();
    m1.salud();
    m1.cantidad();
    m1.variedad();
    m1.compartir();
    m1.aroma();
    m1.vida();
    System.out.println("=========================================================");
    System.out.println("                        AGUACATE                         ");
    a1.comer();
    a1.salud();
    a1.cantidad();
    a1.variedad();
    a1.compartir();
    a1.aroma();
    a1.uso();
    System.out.println("=========================================================");
    System.out.println("                          UVA                            ");
    u1.comer();
    u1.salud();
    u1.cantidad();
    u1.variedad();
    u1.compartir();
    u1.aroma();
    u1.merendar();
    System.out.println("=========================================================");
    System.out.println("                         TOMATE                          ");
    t1.comer();
    t1.salud();
    t1.cantidad();
    t1.variedad();
    t1.compartir();
    t1.aroma();
    t1.preferencia();
    System.out.println("=========================================================");
    System.out.println("                         ACEITE                          ");
    a2.comer();
    a2.salud();
    a2.cantidad();
    a2.calorias();
    a2.aporte();
    a2.sugerir();
    a2.cocina();
    System.out.println("=========================================================");
    System.out.println("                        CHOCOLATE                        ");
    c1.comer();
    c1.salud();
    c1.cantidad();
    c1.calorias();
    c1.aporte();
    c1.sugerir();
    System.out.println("=========================================================");
    System.out.println("                          QUESO                          ");
    q1.comer();
    q1.salud();
    q1.cantidad();
    q1.calorias();
    q1.aporte();
    q1.sugerir();
    System.out.println("=========================================================");
    System.out.println("                         PESCADO                         ");
    p1.comer();
    p1.salud();
    p1.cantidad();
    p1.calorias();
    p1.aporte();
    p1.sugerir();
    p1.componer();
    System.out.println("=========================================================");
    System.out.println("                          PAPA                           ");
    p2.comer();
    p2.salud();
    p2.cantidad();
    p2.consumo_especifico();
    p2.rapida();
    p2.preferida();
    System.out.println("=========================================================");
    System.out.println("                          PASTA                          ");
    p3.comer();
    p3.salud();
    p3.cantidad();
    p3.consumo_especifico();
    p3.rapida();
    p3.estilo();
    System.out.println("=========================================================");
    System.out.println("                           PAN                           ");
    p4.comer();
    p4.salud();
    p4.cantidad();
    p4.consumo_especifico();
    p4.rapida();
    p4.esponjosidad();
    System.out.println("=========================================================");
    System.out.println("                          ARROZ                          ");
    a3.comer();
    a3.salud();
    a3.cantidad();
    a3.consumo_especifico();
    a3.rapida();
    a3.estilos();
    }
    
    
    
}
