/***
 * Clasificación de un triángulo Dado tres valores que representan 
 * las longitudes de los lados de un triángulo, determinar su tipo.
 */
import java.util.Scanner;
public class Problema2 {
    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAME LAS TRES LONGITUDES DEL TRIANGULO: ");
        lado1 = tcl.nextDouble();
        lado2 = tcl.nextDouble();
        lado3 = tcl.nextDouble();
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            System.out.println("LA FIGURA NO ES TRIANGULO");
        } else {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("LA FIGURA ES UN TRIANGULO EQUILATERO");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("LA FIGURA ES UN TRIANGULO ISOCELES");
            } else {
                System.out.println("LA FIGURA ES UN TRIANGULO ESCALENO");
            }
        }
    }
}
/***
 * run:
 * DAME LAS TRES LONGITUDES DEL TRIANGULO: 10 8 7
 * LA FIGURA ES UN TRIANGULO ESCALENO
 * BUILD SUCCESSFUL (total time: 10 seconds)
 */