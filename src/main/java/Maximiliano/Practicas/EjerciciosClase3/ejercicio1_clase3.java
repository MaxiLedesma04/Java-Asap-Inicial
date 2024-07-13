package Maximiliano.Practicas.EjerciciosClase3;
//Ejercicio01
//Programa que lee la altura de N personas y calcula:
//La altura media.
//Cuantas personas tienen una altura superior a la media.
//Cuantas tienen una altura inferior a la media.
//
//El valor de N se pide por teclado y debe ser entero positivo.

import java.util.Scanner;

public class ejercicio1_clase3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de personas: ");
        int N = scanner.nextInt();
        double alturas[] = new double[N];
        double suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Introduce la altura de la persona " + (i + 1) + ": ");
            alturas[i] = scanner.nextDouble();
            suma = suma + alturas[i];
        }
        double media = suma / N;
        System.out.println("La altura media es: " + media);
        int personasAltas = 0;
        int personasBajas = 0;
        for (int i = 0; i < N; i++) {
            if (alturas[i] > media) {
                personasAltas++;
            } else {
                personasBajas++;
            }
        }
        System.out.println("Hay " + personasAltas + " personas con una altura superior a la media.");
        System.out.println("Hay " + personasBajas + " personas con una altura inferior a la media.");
        scanner.close();
    }
}
