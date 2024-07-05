package Maximiliano.Practicas.EjerciciosClase1;

import java.util.Scanner;

/*Programa que pide por teclado la fecha de nacimiento de una persona (dia, mes, anio) y calcula su numero de la suerte.
El numero de la suerte se calcula sumando el dia, mes y anio de la fecha de nacimiento y a continuacion sumando las cifras obtenidas en la suma. Por ejemplo: Si la fecha de nacimiento es 12/07/1980
Calculamos el numero de la suerte asi: 12+7+1980 = 1999 1+9+9+9 = 28
Numero de la suerte: 28
*/
public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento");
        int dia = scanner.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        int mes = scanner.nextInt();
        System.out.println("Introduce tu anio de nacimiento");
        int anio = scanner.nextInt();
        int suma = (dia + mes + anio);
        int suma2 = 0;
        while (suma > 0) {
            suma2 = suma2 + (suma % 10);
            suma = suma / 10;
        }
        System.out.println("Tu numero de la suerte es " + suma2);
    }
}
