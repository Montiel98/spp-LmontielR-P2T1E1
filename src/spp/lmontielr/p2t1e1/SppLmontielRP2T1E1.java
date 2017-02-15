
package spp.lmontielr.p2t1e1;
import java.util.Scanner;

public class SppLmontielRP2T1E1 {

    public static void main(String[] args) {
    Scanner dato = new Scanner (System.in);
    int count;
    
        System.out.println("¿Cuántos salarios quiere calcular?");
        count = dato.nextInt();
        System.out.print("\n");
    
    while (count>0) {switch (pedirDatos("la categoría del trabajador (1-4)")) {
            case 1: 
                pago(30.00);
            break;
            
            case 2: 
                pago(38.00);
            break;
            
            case 3:
                pago(50.00);
            break;
            
            case 4:
                pago(70.00);
            break;
            
            default:
                System.out.println("Por favor ingrese un valor entre 1 y 4 \n");
                
            
        }
    count = count - 1;
    }
    }

static int pedirDatos(String data){
    Scanner dato = new Scanner (System.in);
    int d;
    
    System.out.print("Ingrese " + data + ": ");
    d = dato.nextInt();
        
    return d;
}
static void pago(double ex){
    double pay,he,sue;
     
    sue = pedirDatos("salario base");
    he = pedirDatos("horas extra");
            
    pay = sue + (he * ex);
    System.out.println("El pago es de : $" + pay + "\n");
        
}

}
