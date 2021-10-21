package pedromgarridoev2poo;
import java.util.*;
public class PedroMGarridoEv2Poo {
    public static void main(String[] args) {
        boolean exit;
        Scanner scanner = new Scanner(System.in);
        ArrayList<trabajador> trabajadores = new ArrayList<trabajador>();//inicializar arraylist trabajadores
       

        do{
            System.out.println("Ingrese edad.");
            Integer edad = scanner.nextInt();
            System.out.println("Ingrese nombre.");
            String nombre = scanner.next();
            System.out.println("Ingrese ciudad.");
            String ciudad = scanner.next(); 
            System.out.println("Ingrese cargo.");
            String cargo = scanner.next(); 
            System.out.println("Ingrese sueldo.");
            Integer sueldo = scanner.nextInt(); 

            trabajador trabajador = new trabajador(nombre, edad, sueldo, cargo, ciudad);
            trabajadores.add(trabajador);
            System.out.println("============");
            
            String yn;
            while(true){
                System.out.println("desea agregar otro trabajador? [y/n]");
                yn = scanner.next();
                if(yn.equalsIgnoreCase("Y")){
                    exit=true;
                    break;
                }else if(yn.equalsIgnoreCase("N")){
                    exit = false;
                    break;
                }else{
                    System.out.println("Opcion invalida");
                }
            }
        }while(exit==true);

        
        do{
            System.out.println("Ingrese una opcion de filtrado:\n"+"1. Filtrar Programadores Residentes en Talca \n"+"2. Filtrar Trabajadores mayores de edad");
            int option = scanner.nextInt();
            switch(option){
                case 1:
                    for (trabajador trabajador : trabajadores) {
                        if(trabajador.getCiudad().equalsIgnoreCase("TALCA")&&   trabajador.getCargo().equalsIgnoreCase("PROGRAMADOR")){
                            System.out.println(trabajador.getNombre()+"Es residente en la ciudad de Talca y ocupa el cargo Programador");
                            System.out.println("======================");
                        }
                    }
                break;
                case 2:
                    for (trabajador trabajador : trabajadores) {
                        if(trabajador.getEdad()>=18){
                            System.out.println(trabajador.getNombre()+" Es mayor de edad, su edad es "+ trabajador.getEdad());
                        } 
                    }
                break;
            default:

                exit=true;
                System.out.println("Opcion invalida eeeeeeee");
                break;
            
            }
            if(option==1 || option==2){
                String yn;
                while(true){
                    System.out.println("desea realizar otro filtrado? [y/n]");
                    yn = scanner.nextLine();
                    yn = scanner.nextLine();
                    if(yn.equalsIgnoreCase("Y")){
                        exit=true;
                    break;
                    }else if(yn.equalsIgnoreCase("N")){
                        exit = false;
                    break;
                    }else{
                        System.out.println("Opcion invalida aaaaaaaa");
                    }
                } 
            }
        }while(exit==true);
        
       
       

        

       scanner.close();} 
    
}
