package Maximiliano.Practicas.EjerciciosClase2;

import java.util.Scanner;

/*Programa que muestra los N primeros numeros de la serie de Fibonacci. El valor de N se lee por teclado.

La serie de fibonacci la forman una serie de numeros tales que: El primer termino de la serie es el numero 1. El segundo termino de la serie es el numero 1. Los siguientes terminos de la serie de fibonacci se obtienen de la suma de los dos anteriores: 1, 1, 2, 3, 5, 8, 13…
*/
public class ejercicio1_clase2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i < num - 2; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
