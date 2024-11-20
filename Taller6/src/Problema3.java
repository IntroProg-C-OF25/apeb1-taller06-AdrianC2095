/***
 * Costo de envío de paquetes Un servicio de envío cobra diferentes tarifas 
 * según la región y el peso del paquete. Si el peso es menor de 5 kg y la región 
 * es "local", el costo es de $5. Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional". 
 * Para cualquier otro caso, el costo es de $15.
 */
import java.util.Scanner;
public class Problema3 {
    public static void main(String[] args) {
        double pesoPaquete, costo = 15;
        String region;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME EL PESO DEL PAQUETE EN KG: ");
        pesoPaquete = tcl.nextDouble();
        System.out.print("INGRESA TU REGION (local/nacional): ");
        region =  tcl.next().toLowerCase(); //Convierte el texto ingresado en minusculas
        switch (region) 
        {
            case "local":
                if (pesoPaquete < 5)
                    costo = 5;
                break;
            case "nacional":
                if (pesoPaquete >= 5 && pesoPaquete <= 10)
                    costo = 10;
                break;          
        }
        System.out.printf("COSTO DE ENVIO: $%.2f\n", costo);
    }
}
/***
 * run:
 * DAME EL PESO DEL PAQUETE EN KG: 4
 * INGRESA TU REGION (local/nacional): local
 * COSTO DE ENVIO: $5,00
 * BUILD SUCCESSFUL (total time: 5 seconds)
 * 
 * run:
 * DAME EL PESO DEL PAQUETE EN KG: 5
 * INGRESA TU REGION (local/nacional): NACIONAL
 * COSTO DE ENVIO: $10,00
 * BUILD SUCCESSFUL (total time: 9 seconds)
 * 
 * run:
 * DAME EL PESO DEL PAQUETE EN KG: 5
 * INGRESA TU REGION (local/nacional): local
 * COSTO DE ENVIO: $15,00
 * BUILD SUCCESSFUL (total time: 5 seconds)
 */