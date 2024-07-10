package Maximiliano.Practicas.EjerciciosClase2;

import java.util.Scanner;

/*Comprobar si dos numeros son amigos. Dos numeros enteros positivos A y B son numeros amigos si la suma de los divisores propios de A es igual a B y la suma de los divisores propios de B es igual a A.

Los divisores propios de un número incluyen la unidad pero no el propio numero.

Un ejemplo de numeros amigos son los numeros 220 y 284.

Los divisores propios de 220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110.

La suma de los divisores propios de 220 da como resultado 284

Los divisores propios de 284 son 1, 2, 4, 71 y 142.

La suma de los divisores propios de 284 da como resultado 220.

Por lo tanto 220 y 284 son amigos.

Otras parejas de numeros amigos son:
1184, 1210
2620, 2924
5020, 5564
6232, 6368
10744, 10856
12285, 14595
17296, 18416
*/
public class ejercicio2_clase2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Introduce un segundo numero");
        int num2 = scanner.nextInt();
        int suma1 = 0;
        int suma2 = 0;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma1 = suma1 + i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                suma2 = suma2 + i;
            }
        }
        if (suma1 == num2 && suma2 == num1) {
            System.out.println("Los numeros son amigos");
        }
        else {
            System.out.println("Los numeros no son amigos");
        }
    }
}
