package Maximiliano.Practicas.EjerciciosClase1;

import java.util.Scanner;

/*Programa que lee 1 numero entero por teclado e indica si es multiplo de 2 o de 3.*/
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        if (num % 2 == 0 || num % 3 == 0) {
            System.out.println("El numero es multiplo de 2 o de 3");
        }
        else {
            System.out.println("El numero no es multiplo de 2 o de 3");
        }
    }
}
