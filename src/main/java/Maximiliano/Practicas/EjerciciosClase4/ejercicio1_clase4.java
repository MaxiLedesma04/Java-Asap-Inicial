package Maximiliano.Practicas.EjerciciosClase4;

import java.util.Scanner;

//Ejercicio01
//Programa que pide el ingreso de un numero e indica si es un numero primo o no.
public class ejercicio1_clase4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
        scanner.close();
    }
}
