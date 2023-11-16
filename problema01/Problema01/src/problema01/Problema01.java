/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int numero1;
        int numero2;
        int total;
        String operacion;

        System.out.println("Ingrese la operacion matematica requerida");
        operacion = sc.nextLine();
        System.out.println("Ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2 = sc.nextInt();
        operacion = operacion.toLowerCase();
        if (numero1 > numero2) {
            switch (operacion) {
                case "suma":
                    total = numero1 + numero2;
                    System.out.printf("La suma de los numeros es: %d\n",
                            total);
                    break;
                case "resta":
                    total = numero1 - numero2;
                    System.out.printf("La resta de los numeros es: %d\n",
                            total);
                    break;
                case "multiplicacion":
                    total = numero1 * numero2;
                    System.out.printf("La multiplicacion de los numeros es: %d\n",
                            total);
                    break;
                case "division":
                    total = numero1 / numero2;
                    System.out.printf("La division de los numeros es: %d\n",
                            total);
                    break;
            }
        } else {
            System.out.println("El primer numero ingresado debe ser mayor al segundo");
        }

    }

}
