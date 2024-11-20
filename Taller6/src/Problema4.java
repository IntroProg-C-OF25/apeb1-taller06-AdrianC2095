/***
 * Convertir un número de mes a nombre. Dado un número del 1 al 12, que representa 
 * un mes del año, muestra el nombre del mes correspondiente. Por ejemplo, 
 * si el usuario ingresa 1, debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero", y así sucesivamente.
 */
import java.util.Scanner;
public class Problema4 {
    public static void main(String[] args) {
        int numMes;
        Scanner tcl = new Scanner(System.in);
        System.out.print("DIME UN NUM. MES: ");
        numMes = tcl.nextInt();
        switch (numMes)
        {
            case 1: System.out.println("ENERO");
                break;
            case 2: System.out.println("FEBRERO");
                break;
            case 3: System.out.println("MARZO");
                break;
            case 4: System.out.println("ARBIL");
                break;
            case 5: System.out.println("MAYO");
                break;
            case 6: System.out.println("JUNIO");
                break;
            case 7: System.out.println("JULIO");
                break;
            case 8: System.out.println("AGOSTO");
                break;
            case 9: System.out.println("SEPTIEMBRE");
                break;
            case 10: System.out.println("OCTUBRE");
                break;
            case 11: System.out.println("NOVIEMBRE");
                break;
            case 12: System.out.println("DICIEMBRE");
                break;
            default: System.out.println("ERROR EN EL NUMERO");
        }
    }
}
/***
 * run:
 * DIME UN NUM. MES: 8
 * AGOSTO
 * BUILD SUCCESSFUL (total time: 2 seconds)
 */