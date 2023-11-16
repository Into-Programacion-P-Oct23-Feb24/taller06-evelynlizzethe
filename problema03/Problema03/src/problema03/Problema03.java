/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String nombre;
        int tipoEmpleado;
        double sueldo;
        double aumento;
        double nuevoSueldo;
        System.out.println("Ingrese el nombre del empleado");
        nombre = sc.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipoEmpleado = sc.nextInt();
        System.out.println("Ingrese el sueldo que recibe");
        sueldo = sc.nextDouble();
        switch (tipoEmpleado) {
            case 0:
                System.out.println("Tipo de empleado incorrecto");
                break;
            case 1:
                aumento = (sueldo * 0.05);
                nuevoSueldo = (sueldo + aumento);
                System.out.printf("Nombre de empleado: %s\nTipo de empleado 1\n"
                        + "Anterior Sueldo: %.2f\nIncremento: "
                        + "%.2f\nNuevo Sueldo: %.2f\n",
                        nombre, sueldo, aumento, nuevoSueldo);
                break;
            case 2:
                aumento = (sueldo * 0.07);
                nuevoSueldo = (sueldo + aumento);
                System.out.printf("Nombre de empleado: %s\nTipo de empleado 2\n"
                        + "Anterior Sueldo: %.2f\nIncremento: "
                        + "%.2f\nNuevo Sueldo: %.2f\n",
                        nombre, sueldo, aumento, nuevoSueldo);
                break;
            case 3:
                aumento = (sueldo * 0.09);
                nuevoSueldo = (sueldo + aumento);
                System.out.printf("Nombre de empleado: %s\nTipo de empleado 3\n"
                        + "Anterior Sueldo: %.2f\nIncremento: "
                        + "%.2f\nNuevo Sueldo: %.2f\n",
                        nombre, sueldo, aumento, nuevoSueldo);
                break;
            case 4:
                aumento = (sueldo * 0.12);
                nuevoSueldo = (sueldo + aumento);
                System.out.printf("Nombre de empleado: %s\nTipo de empleado 4\n"
                        + "Anterior Sueldo: %.2f\nIncremento: "
                        + "%.2f\nNuevo Sueldo: %.2f\n",
                        nombre, sueldo, aumento, nuevoSueldo);
                break;
            default:
                aumento = (sueldo * 0.15);
                nuevoSueldo = (sueldo + aumento);
                System.out.printf("Nombre de empleado: %s\nTipo de empleado 5"
                        + " o superior\n" + "Anterior Sueldo: %.2f\nIncremento: "
                        + "%.2f\nNuevo Sueldo: %.2f\n",
                        nombre, sueldo, aumento, nuevoSueldo);
                break;

        }
    }

}
