package pedromgarridoev2poo;
import java.util.*;
public class PedroMGarridoEv2Poo {
    public static void main(String[] args) {
        ArrayList<trabajador> trabajadores = new ArrayList<trabajador>();//inicializar arraylist trabajadores
        //creacion trabajado 1 y 2
        trabajador trabajador_1 = new trabajador("Juan Perez", 30, 30000000, "Programador", "talca"); 
        trabajador trabajador_2 = new trabajador("Roberto to", 26, 33366654, "QA", "chiloe"); 
        //agregar trabajador 1 y 2 a trabajadores
        trabajadores.add(trabajador_1);
        trabajadores.add(trabajador_2);


    }
    
}
