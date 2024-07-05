package Maximiliano.Practicas.EjerciciosClase2;

import java.util.Scanner;

/*El programa leera por teclado un numero entero positivo y calculara la suma de sus cifras.
Por ejemplo, si se ingresa el numero 3601 el programa debera mostrar: "La suma de sus cifras es: 10".
*/
public class ejercicio3_clase2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = scanner.nextInt();
        int suma = 0;
        while (num > 0) {
            suma = suma + (num % 10);
            num = num / 10;
        }
        System.out.println("La suma de sus cifras es: " + suma);
    }
}
