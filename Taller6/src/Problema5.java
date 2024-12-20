/***
 * Determinar el tipo de operación matemática. Dado un número del 1 al 4 
 * que representa una operación matemática básica (suma, resta, multiplicación, división), 
 * muestra el nombre de la operación correspondiente. Por ejemplo, si el usuario ingresa 1, 
 * debe mostrar "Suma"; si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 */
import java.util.Scanner;
public class Problema5 {
    public static void main(String[] args) {
        int numOperacion;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DAM NUM. OPERACION: ");
        numOperacion = tcl.nextInt();
        switch (numOperacion)
        {
            case 1: System.out.println("SUMA");
                break;
            case 2: System.out.println("RESTA");
                break;
            case 3: System.out.println("MULTIPLICACION");
                break;
            case 4: System.out.println("DIVISION");
                break;
            default: System.out.println("ERROR EN EL NUMERO");
        }
    }
}
/***
 * run:
 * DAM NUM. OPERACION: 3
 * MULTIPLICACION
 * BUILD SUCCESSFUL (total time: 3 seconds)
 */