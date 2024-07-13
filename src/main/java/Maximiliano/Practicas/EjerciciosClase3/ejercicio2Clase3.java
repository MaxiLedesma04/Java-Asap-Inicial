package Maximiliano.Practicas.EjerciciosClase3;

import java.util.Scanner;

//Programa que pide 10 numeros por teclado,
// los almacena en un array y que luego muestra el maximo valor,
// el minimo y las posiciones que ocupan en el array.
public class ejercicio2Clase3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int min = array[0];
        int maxPos = 0;
        int minPos = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] > max) {
                max = array[i];
                maxPos = i;
            }
            if (array[i] < min) {
                min = array[i];
                minPos = i;
            }
        }
        System.out.println("El maximo valor es: " + max);
        System.out.println("El minimo valor es: " + min);
        System.out.println("La posicion del maximo valor es: " + maxPos);
        System.out.println("La posicion del minimo valor es: " + minPos);
    }
}
