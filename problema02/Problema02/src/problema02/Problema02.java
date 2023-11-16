/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int tipoVehiculo;
        double valorVehiculo;
        double peaje;
        String propietario;
        System.out.println("Ingrese el nombre del propietario del Vehiculo");
        propietario = sc.nextLine();
        System.out.println("Ingrese el tipo de Vehiculo 1 - 4");
        tipoVehiculo = sc.nextInt();
        System.out.println("Ingrese el valor de su Vehiculo");
        valorVehiculo = sc.nextDouble();
        switch (tipoVehiculo) {
            case 1:
                peaje = (valorVehiculo * 0.0001) + 2;
                System.out.printf("Peaje: 'Buena via'\nPropietario: %s\n"
                        + "Tipo: Vehiculo liviano particular\nValor: %.2f\n"
                        + "Peaje: %.2f\n  ", propietario, valorVehiculo,
                        peaje);
                break;
            case 2:
                peaje = (valorVehiculo * 0.0002) + 2.5;
                System.out.printf("Peaje: 'Buena via'\nPropietario: %s\n"
                        + "Tipo: Vehiculo grande particular \nValor: %.2f\n"
                        + "Peaje: %.2f\n  ", propietario, valorVehiculo,
                        peaje);
                break;
            case 3:
                peaje = (valorVehiculo * 0.0004) + 1.5;
                System.out.printf("Peaje: 'Buena via'\nPropietario: %s\n"
                        + "Tipo: Taxi\nValor: %.2f\n"
                        + "Peaje: %.2f\n  ", propietario, valorVehiculo,
                        peaje);
                break;
            case 4:
                peaje = (valorVehiculo * 0.0005) + 2.2;
                System.out.printf("Peaje: 'Buena via'\nPropietario: %s\n"
                        + "Tipo: Bus urbano\nValor: %.2f\n"
                        + "Peaje: %.2f\n  ", propietario, valorVehiculo,
                        peaje);
                break;
        }
    }

}
