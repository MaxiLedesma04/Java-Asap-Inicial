package Maximiliano.Practicas.EjerciciosClase1;

import java.util.Scanner;

/*Programa que comprueba si un anio es bisiesto. Un anio es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.*/
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un anio");
        int anio = scanner.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El anio es bisiesto");
        }
        else {
            System.out.println("El anio no es bisiesto");
        }
    }
}
