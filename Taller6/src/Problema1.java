/***
 * Facturación de 2 productos: La empresa Amazon.com le contrata como desarrollador de
 * Sistemas Informáticos para programar su sistema de compras online, el cual calcule 
 * el precio total de la compra para un cliente
 */
import java.util.Scanner;
public class Problema1 {
    public static void main(String[] args) {
        double produc1, produc2, costoenvio, iva, subtotal, descuento = 0, costofinal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME 3 COSTOS: ");
        produc1 = tcl.nextDouble();
        produc2 = tcl.nextDouble();
        costoenvio = tcl.nextDouble();
        subtotal = (produc1 + produc2);
        iva = (subtotal) * 0.10;
        if (subtotal > 1000){
            descuento = subtotal *0.2;  //Descuento del 20% si el precio es superior a mil
        } else if (subtotal >= 1000) {
            descuento = subtotal *0.05;   //Descuento del 5% si es el precio es de al menos mil
        }
        if (subtotal > 5000) {
            costoenvio = 0;
        }
        costofinal = subtotal + iva - descuento + costoenvio;
        System.out.println("DETALLES DE LA COMPRA");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("IVA (10%%): $%.2f\n", iva);
        System.out.printf("Descuento: $%.2f\n ", descuento);
        System.out.printf("Costo del envío: $%.2f\n", costoenvio);
        System.out.printf("Total: $%.2f\n", costofinal);
    }
}
/***
 * DAME 3 COSTOS: 1000 950 75
 * DETALLES DE LA COMPRA
 * Subtotal: $1950,00
 * IVA (10%): $195,00
 * Descuento: $390,00
 * Costo del envío: $75,00
 * Total: $1830,00
 * BUILD SUCCESSFUL (total time: 8 seconds)
 */