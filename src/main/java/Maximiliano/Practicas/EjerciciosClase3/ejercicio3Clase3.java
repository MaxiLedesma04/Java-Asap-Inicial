package Maximiliano.Practicas.EjerciciosClase3;

import java.util.Scanner;

//Programa que pide 5 numeros enteros, los almacena en un array,
// e indica por pantalla si dicho array es capicua.
public class ejercicio3Clase3 {
    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un numero");
            array[i] = sacanner.nextInt();
        }
        boolean esCapicua = true;
        for (int i = 0; i < 5; i++) {
            if (array[i] != array[4 - i]) {
                esCapicua = false;
                break;
            }
        }
        if (esCapicua) {
            System.out.println("El array es capicua");
        } else {
            System.out.println("El array no es capicua");
        }
    }
}
